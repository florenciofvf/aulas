package br.com.turma_java.eleicao.impl;

import br.com.turma_java.eleicao.Candidato;
import br.com.turma_java.eleicao.Eleicao;
import br.com.turma_java.eleicao.util.Conteiner;
import br.com.turma_java.eleicao.util.ConteinerImpl;

public class EleicaoImpl implements Eleicao {
	private Conteiner conteiner;
	private String descricao;
	private String data;

	private boolean emEdicao;
	private boolean emVotacao;
	private boolean finalizada;
	
	public EleicaoImpl(String descricao, String data) {
		conteiner = new ConteinerImpl();
		setDescricao(descricao);
		this.data = data;
		iniciarEdicao();
	}

	@Override
	public String getData() {
		return data;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

	@Override
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public void adicionarCandidato(Candidato c) {
		if (c == null) {
			return;
		}
		
		if(!isEdicao()) {
			return;
		}
		
		if(!conteiner.contem(c)) {
			c.setElecao(this);
			conteiner.adicionar(c);
		}
	}

	@Override
	public void excluirCandidato(Candidato c) {
		if(!isEdicao()) {
			return;
		}

		if(conteiner.contem(c)) {
			c.setElecao(null);
			conteiner.excluir(c);
		}
	}

	@Override
	public int getTotalVotos() {
		int total = 0;
		
		for(Candidato c : getCandidatos()) {
			total += c.getVotos();
		}
		
		return total;
	}

	@Override
	public Candidato[] getCandidatos() {
		Candidato[] resposta = new Candidato[conteiner.getTamanho()];
		
		Object[] objetos = conteiner.getObjetos();
		
		System.arraycopy(objetos, 0, resposta, 0, objetos.length);
		
		return resposta;
	}

	@Override
	public Candidato getCandidato(int numero) {
		
		for(Candidato c : getCandidatos()) {
			if(c.getNumero() == numero) {
				return c;
			}
		}
		
		return null;
	}

	@Override
	public void fecharVotacao() {
		emEdicao = false;
		emVotacao = false;
		finalizada = true;
	}

	@Override
	public void iniciarEdicao() {
		emEdicao = true;
		emVotacao = false;
		finalizada = false;
	}

	@Override
	public void iniciarVotacao() {
		emEdicao = false;
		emVotacao = true;
		finalizada = false;
	}

	@Override
	public boolean isIniciadaVotacao() {
		return emVotacao;
	}

	@Override
	public boolean isFinalizada() {
		return finalizada;
	}

	@Override
	public boolean isEdicao() {
		return emEdicao;
	}
}
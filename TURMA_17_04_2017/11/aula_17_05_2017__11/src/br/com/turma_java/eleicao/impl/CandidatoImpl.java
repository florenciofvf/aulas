package br.com.turma_java.eleicao.impl;

import br.com.turma_java.eleicao.Candidato;
import br.com.turma_java.eleicao.Eleicao;

public class CandidatoImpl implements Candidato {
	private Eleicao eleicao;
	private String nome;
	private int numero;
	private int votos;
	
	@Override
	public int getNumero() {
		return numero;
	}

	@Override
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int getVotos() {
		return votos;
	}

	@Override
	public void somarVoto() {
		if(eleicao != null && eleicao.isIniciadaVotacao()) {
			votos++;
		}
	}

	@Override
	public Eleicao getEleicao() {
		return eleicao;
	}

	@Override
	public void setElecao(Eleicao e) {
		this.eleicao = e;
	}

	//1290 ------ 100%
	//  56 ------  ?
	@Override
	public double getPercentualVotos() {
		int totalVotos = eleicao.getTotalVotos();
		
		if(totalVotos == 0) {
			return 0;
		}
		
		return votos * 100 / totalVotos;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Candidato) {
			Candidato outro = (Candidato) obj;
			return getNumero() == outro.getNumero();
		}
		
		return false;
	}
	
	
}
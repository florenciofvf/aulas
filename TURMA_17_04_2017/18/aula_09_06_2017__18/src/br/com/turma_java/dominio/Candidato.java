package br.com.turma_java.dominio;

import br.com.turma_java.util.Util;

public class Candidato {
	private Integer id;
	private String nome;
	private Integer votos;
	private Eleicao eleicao;

	public Candidato() {
	}

	public Candidato(Integer id, String nome, Integer votos) {
		this.id = id;
		this.nome = nome;
		this.votos = votos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVotos() {
		if (Util.estaNulo(votos)) {
			votos = 0;
		}

		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

	public boolean somarVoto() {
		if(eleicao == null) {
			return false;
		}
		
		getVotos();

		if(eleicao.isIniciada() && !eleicao.isFinalizada()) {
			votos++;
			return true;
		}
		
		return false;
	}
	
	//   345 ----- 100%
	//    98 -----  ?
	public int getPorcentagemVotos() {
		if(eleicao == null) return 0;
		
		int totalVotos = eleicao.getTotalVotos();
		
		if(totalVotos == 0) return 0;
		
		return getVotos() * 100 / totalVotos;
	}

	public Eleicao getEleicao() {
		return eleicao;
	}

	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}
}
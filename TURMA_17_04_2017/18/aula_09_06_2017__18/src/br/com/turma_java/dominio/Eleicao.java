package br.com.turma_java.dominio;

import java.util.Date;
import java.util.List;

public class Eleicao {
	private Integer id;
	private String descricao;
	private Date dataIniciada;
	private Date dataFinalizada;
	private List<Candidato> candidatos;

	public Eleicao() {
	}

	public Eleicao(Integer id, String descricao, Date dataIniciada, Date dataFinalizada) {
		this.id = id;
		this.descricao = descricao;
		this.dataIniciada = dataIniciada;
		this.dataFinalizada = dataFinalizada;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataIniciada() {
		return dataIniciada;
	}

	public void setDataIniciada(Date dataIniciada) {
		this.dataIniciada = dataIniciada;
	}

	public Date getDataFinalizada() {
		return dataFinalizada;
	}

	public void setDataFinalizada(Date dataFinalizada) {
		this.dataFinalizada = dataFinalizada;
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public Candidato getCandidato(Integer numero) {
		for(Candidato c : candidatos) {
			if(c.getId().equals(numero)) {
				return c;
			}
		}
		
		return null;
	}
	
	public int getTotalVotos() {
		int total = 0;
		
		for(Candidato c : candidatos) {
			total += c.getVotos();
		}
		
		return total;
	}
	
	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
		
		for(Candidato c : candidatos) {
			c.setEleicao(this);
		}
	}
	
	public boolean isIniciada() {
		return dataIniciada != null;
	}
	
	public boolean isFinalizada() {
		return dataFinalizada != null;
	}
}
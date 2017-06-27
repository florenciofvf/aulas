package br.com.turma_java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="eleicao")
public class Eleicao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String descricao;
	
	@Column(name="data_iniciada")
	@Temporal(TemporalType.DATE)
	private Date iniciada;
	
	@Column(name="data_finalizada")
	@Temporal(TemporalType.DATE)
	private Date finalizada;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="eleicao")
	private List<Candidato> candidatos;
	
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

	public Date getIniciada() {
		return iniciada;
	}

	public void setIniciada(Date iniciada) {
		this.iniciada = iniciada;
	}

	public Date getFinalizada() {
		return finalizada;
	}

	public void setFinalizada(Date finalizada) {
		this.finalizada = finalizada;
	}

	public List<Candidato> getCandidatos() {
		if(candidatos == null) {
			candidatos = new ArrayList<>();
		}
		
		return candidatos;
	}
	
	public void adicionar(Candidato c) {
		c.setEleicao(this);
		getCandidatos().add(c);
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
}
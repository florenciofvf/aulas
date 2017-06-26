package br.com.turma_java;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="eleicao")
public class Eleicao {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String descricao;
	
	@Column(name="data_iniciada")
	@Temporal(TemporalType.DATE)
	private Date iniciada;
	
	@Column(name="data_finalizada")
	@Temporal(TemporalType.DATE)
	private Date finalizada;

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
}
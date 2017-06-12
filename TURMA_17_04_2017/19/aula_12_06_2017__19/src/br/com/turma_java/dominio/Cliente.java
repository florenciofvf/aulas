package br.com.turma_java.dominio;

import java.util.Date;

public class Cliente {
	private Integer id;    //PK INT AUTO
	private String cpf;    //NOT NULL unique
	private String nome;   //NOT NULL
	private String sexo;   //NOT NULL
	private String email;  //NULL
	private Date dataNasc; //NOT NULL
	private Boolean ativo; //NOT NULL
	
	public Cliente() {
	}

	public Cliente(Integer id, String cpf, String nome, String sexo,
					String email, Date dataNasc, Boolean ativo) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.dataNasc = dataNasc;
		this.ativo = ativo;
	}

	public boolean isNovo() {
		return id == null || id.intValue() == 0;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Boolean getAtivo() {
		if(ativo == null) {
			ativo = Boolean.TRUE;
		}
		
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}
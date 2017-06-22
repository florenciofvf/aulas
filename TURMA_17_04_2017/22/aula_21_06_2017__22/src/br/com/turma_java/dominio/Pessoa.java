package br.com.turma_java.dominio;

import anotacao.MinhaAnotacao;

//Meta-Programação: Reflexão >>> Introspecção | Instrumentação
public class Pessoa {
	private String nome;

	@MinhaAnotacao
	private Integer idade;

	@MinhaAnotacao
	public Pessoa() {
		System.out.println("Construtor padrão");
	}

	public Pessoa(String nome, Integer idade) {
		System.out.println("Construtor (nome,idade)");
		this.nome = nome;
		this.idade = idade;
	}

	public void imprimirNome() {
		System.out.println("NOME DA PESSOA: " + nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}
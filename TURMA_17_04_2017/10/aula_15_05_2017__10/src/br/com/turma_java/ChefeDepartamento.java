package br.com.turma_java;

public class ChefeDepartamento extends Funcionario {
	private String nomeDepartamento;
	
	public ChefeDepartamento(String nome, double salario, String nomeDepartamento) {
		super(nome, salario);
		this.nomeDepartamento = nomeDepartamento;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
}
package br.com.turma_java;

//Esta classe pode reutilizar o atributo nome
public class Funcionario extends Pessoa {
	private double salario;

	public Funcionario(String nome, double salario) {
		super(nome); //Invoca o construtor da super classe
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void imprimirNome() {
		System.out.println("FUNCIONÁRIO: " + getNome());
	}
}
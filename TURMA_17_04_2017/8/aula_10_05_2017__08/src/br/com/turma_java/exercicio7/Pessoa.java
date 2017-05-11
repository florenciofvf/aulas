package br.com.turma_java.exercicio7;

public class Pessoa {
	private int idade;
	private int idadeAnterior;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idadeAnterior = this.idade;
		this.idade = idade;
	}
	
	public void imprimirIdadeAnterior() {
		System.out.println(idadeAnterior);
	}
}
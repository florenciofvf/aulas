package br.com.turma_java.exercicio2;

public class Pessoa {
	private int idade;
	private double peso;
	private float altura;
	
	public Pessoa() {
	}
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	public Pessoa(float altura) {
		this.altura = altura;
	}

	public Pessoa(double peso) {
		this.peso = peso;
	}
	
	public Pessoa(double peso, float altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public Pessoa(float altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}
	
	public Pessoa(int idade, double peso, float altura) {
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}

}
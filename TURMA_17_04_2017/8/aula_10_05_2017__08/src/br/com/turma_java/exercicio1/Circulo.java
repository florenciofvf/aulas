package br.com.turma_java.exercicio1;

public class Circulo {
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return raio * raio * 3.141519;
	}
}
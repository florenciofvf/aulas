package br.com.turma_java.exercicio1;

public class Retangulo {
	private double largura;
	private double altura;

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
}







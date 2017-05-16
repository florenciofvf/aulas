package br.com.turma_java.geom;

public class Retangulo extends ObjetoGeometrico {
	private double largura;
	private double altura;
	
	@Override
	public double calcularArea() {
		return largura * altura;
	}

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
}
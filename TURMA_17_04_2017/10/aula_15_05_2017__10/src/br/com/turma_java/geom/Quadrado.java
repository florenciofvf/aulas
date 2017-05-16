package br.com.turma_java.geom;

public class Quadrado extends ObjetoGeometrico {
	private double lado;
	
	@Override
	public double calcularArea() {
		return lado * lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
}
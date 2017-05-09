package br.com.turma_java.exercicio;

public class Triangulo {
	private int a;
	private int b;
	private int c;
	
	public Triangulo(int ladoA, int ladoB, int ladoC) {
		this.a = ladoA;
		this.b = ladoB;
		this.c = ladoC;
	}

	public boolean podeFormarTriangulo() {
		return (a < b + c) && (b < a + c) && (c < a + b);
	}
	
	public boolean ehEquilatero() {
		return podeFormarTriangulo() && a == b && b == c;
	}
	
	public boolean ehEscaleno() {
		return podeFormarTriangulo() && a != b && b != c && c != a;
	}
	
	public boolean ehIsosceles() {
		return podeFormarTriangulo() && !ehEquilatero() && !ehEscaleno();
	}
	
	public String retornaTipoTriangulo() {
		if(ehEquilatero()) {
			return "Equilátero";
		}
		
		if(ehEscaleno()) {
			return "Escaleno";
		}
		
		if(ehIsosceles()) {
			return "Isósceles";
		}
		
		return "Não forma um triângulo";
	}
	
	public void imprimeTipoTriangulo() {
		System.out.println(  retornaTipoTriangulo()  );
	}
	
	
}

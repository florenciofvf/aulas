package br.com.turma_java;

import br.com.turma_java.exercicio.Triangulo;

public class TesteTriangulo {

	public static void main(String[] args) {
		
		Triangulo t = new Triangulo(100, 100, 100);
		
		System.out.println( t.podeFormarTriangulo());
		
		t.imprimeTipoTriangulo();
	}
	
}

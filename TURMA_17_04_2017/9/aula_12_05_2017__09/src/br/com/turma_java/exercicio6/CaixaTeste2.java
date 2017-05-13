package br.com.turma_java.exercicio6;

public class CaixaTeste2 {

	public static void main(String[] args) {
		int x = 5;
		
		System.out.println( x ); //5
		
		alterar(x);
		
		System.out.println( x ); //5
		
	}

	public static void alterar(int b) {
		b = 90;
	}
}

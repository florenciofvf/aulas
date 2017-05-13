package br.com.turma_java.exercicio6;

public class CaixaTeste {

	public static void main(String[] args) {
		Caixa x = new Caixa();
		x.valor = 5;
		
		System.out.println( x.valor );
		
		alterar(x);
		
		System.out.println( x.valor );
	}

	public static void alterar(Caixa b) {
		b.valor = 90;
	}
}

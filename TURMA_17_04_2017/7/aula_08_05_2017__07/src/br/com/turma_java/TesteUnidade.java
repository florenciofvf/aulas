package br.com.turma_java;

public class TesteUnidade {
	
	public static void main(String[] args) {
		Unidade a = new Unidade(8);
		System.out.println( a.retornarValorPorExtenso()  );
		
		a.alterarValor(9);
		System.out.println( a.retornarValorPorExtenso()  );
	}
	
}
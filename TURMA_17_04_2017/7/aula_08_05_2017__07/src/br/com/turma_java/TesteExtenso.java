package br.com.turma_java;

public class TesteExtenso {

	public static void main(String[] args) {
		Extenso e = new Extenso();
		
		System.out.println( e.retornarValorPorExtenso() );
		
		e.setValor(-87);
		System.out.println( e.retornarValorPorExtenso() );
		
		e.setValor(-1000);
		System.out.println( e.retornarValorPorExtenso() );
		
		e.setValor(789);
		System.out.println( e.retornarValorPorExtenso() );
	}

}

package br.com.turma_java;

public class TestePDezena {

	public static void main(String[] args) {
		PDezena p = new PDezena(8);

		System.out.println("VALOR POR EXTENSO DE: " + p.getValor());
		System.out.println( p.retornarValorPorExtenso() );
		
		p.setValor(17);
		System.out.println( p.retornarValorPorExtenso() );
		
		p.setValor(28);
		System.out.println( p.retornarValorPorExtenso() );
		
		for(int i=0; i<=27; i++) {
			p.setValor(i);
			System.out.println( p.retornarValorPorExtenso() );
		}
	}

}

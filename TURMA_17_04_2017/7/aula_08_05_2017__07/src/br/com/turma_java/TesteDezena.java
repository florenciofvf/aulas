package br.com.turma_java;

public class TesteDezena {

	public static void main(String[] args) {
		Dezena d = new Dezena(78);
		System.out.println( d.retornarValorPorExtenso() );

		for(int i=0; i<=102; i++) {
			d.setValor(i);
			System.out.println(i + "=" + d.retornarValorPorExtenso() );
		}
	}

}
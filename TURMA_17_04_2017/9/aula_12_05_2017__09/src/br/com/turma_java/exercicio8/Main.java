package br.com.turma_java.exercicio8;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();

		lista.adicionar(3);
		lista.adicionar(4);
		lista.adicionar(7);
		lista.adicionar(9);

		System.out.println("TOTAL=" + lista.somar());
		
	}

}
package br.com.turma_java.exercicio_J;

//ALTERE PARA QUE AS SAÍDAS SEJAM COMO ABAIXO
public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setIdade(35);
		System.out.println( p.getIdade() ); //35
		
		p.setIdade(50);
		System.out.println( p.getIdade() ); //50
		p.imprimirIdadeAnterior(); //35

		p.setIdade(12);
		System.out.println( p.getIdade() ); //12
		p.imprimirIdadeAnterior(); //50
	}

}
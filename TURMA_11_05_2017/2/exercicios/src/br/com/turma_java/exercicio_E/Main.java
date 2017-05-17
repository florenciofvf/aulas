package br.com.turma_java.exercicio_E;

//IMPLEMENTE OS MÉTODOS DA CLASSE Numero
public class Main {

	public static void main(String[] args) {
		Numero n = new Numero();
		n.setValor(100);

		n.imprimirDobroDoValor(); // 200
		n.imprimirTripoDoValor(); // 300
		n.imprimirSeEhParOuImpar(); // Par
		n.aumentar10PorCentoNoValorEImprimir(); // 110
		n.imprimirValorAtual(); // 110
	}

}
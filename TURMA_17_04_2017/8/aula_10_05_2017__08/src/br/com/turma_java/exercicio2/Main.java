package br.com.turma_java.exercicio2;

//IMPLEMENTE OS MÉTODOS DA CLASSE Numero
public class Main {

	public static void main(String[] args) {
		Numero n = new Numero();
		n.setValor(100);

		n.imprimirDobro(); // 200
		n.imprimirTripo(); // 300
		n.imprimirSeEhParOuImpar(); // Par
		n.aumentar10PorCentoEImprimir(); // 110
		n.imprimirValor(); // 110
	}

}
package br.com.turma_java;

public class Televisao {
	private int canal;

	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}

	public void descreverCanal() {
		switch (canal) {
		case 1:
			System.out.println("Você está assistindo a Globo");
			break;
		case 8:
			System.out.println("Você está assistindo a Record");
			break;
		case 51:
			System.out.println("Você está assistindo o Net Geo");
			break;
		default:
			System.out.println("Canal inexistente!");
		}
	}
}
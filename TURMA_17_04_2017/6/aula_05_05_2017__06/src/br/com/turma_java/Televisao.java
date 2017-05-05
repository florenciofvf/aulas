package br.com.turma_java;

public class Televisao {
	private int canal;
	private boolean ligado;

	public void mudarCanal(int novoCanal) {
		if(ligado == false) {
			return;
		}
		
		canal = novoCanal;
	}

	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
	public void descreverCanal() {
		if(ligado == false) {
			return;
		}
		
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
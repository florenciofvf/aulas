package br.com.turma_java;

public class ControleRemoto {
	private Televisao tvConfigurada;
	
	public void reconhecerTV(Televisao tv) {
		tvConfigurada = tv;
	}
	
	public void mudarCanal(int novoCanal) {
		tvConfigurada.mudarCanal(novoCanal);
	}
	
	public void descreverCanal() {
		tvConfigurada.descreverCanal();
	}
	
	public void ligar() {
		tvConfigurada.ligar();
	}
	
	public void desligar() {
		tvConfigurada.desligar();
	}	
}
package br.com.turma_java.exercicio6;

public class Carro {
	private int velocidade;
	
	public void acelerar() {
		if(velocidade < 300) {
			velocidade += 20;
		}
	}
	
	public void frear() {
		if(velocidade > 0) {
			velocidade -= 20;
		}
	}
	
	public void mostrarVelocidade() {
		System.out.println("VELOCIDADE: " + velocidade);
	}
}

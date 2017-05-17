package br.com.turma_java.exercicio_I;

public class Carro {
	private int velocidade;
	
	public void acelerar() {
		velocidade += 20;
	}
	
	public void frear() {
		velocidade -= 20;
	}
	
	public void mostrarVelocidade() {
		System.out.println("VELOCIDADE: " + velocidade);
	}
}

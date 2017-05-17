package br.com.turma_java.exercicio_I;

//LIMITE A VELOCIDADE DO CARRO A NO MÁXIMO 300 KILOMETROS POR HORA
//NÃO DEIXE A VELOCIDADE DO CARRO FICAR NEGATIVA
public class Main {

	public static void main(String[] args) {
		Carro c = new Carro();
		
		c.mostrarVelocidade();
		
		for(int i=1; i<=60; i++) {
			c.acelerar();
		}
		
		c.mostrarVelocidade();
		
		for(int i=1; i<=70; i++) {
			c.frear();
		}
		
		c.mostrarVelocidade();
	}

}
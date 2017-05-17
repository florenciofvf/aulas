package br.com.turma_java.exercicio_K;

//NÃO DEIXE O RELÓGIO FICAR INVÁLIDO
//IMPLEMENTE O MÉTODO incrementarSegundos()
public class Main {

	public static void main(String[] args) throws Exception {
		Relogio r = new Relogio();

		r.setHora(7);
		r.setMinuto(47);
		r.setSegundo(54);
		
		System.out.println( r.getHoraFormatada() );
		
		while(true) {
			r.incrementarSegundos();
			System.out.println( r.getHoraFormatada() );
			Thread.sleep(500);
		}
	}

}
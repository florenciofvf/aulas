package br.com.turma_java.exercicio8;

//NÃO DEIXE O RELÓGIO FICAR INVÁLIDO
//IMPLEMENTE O MÉTODO incrementarSegundos()
public class Main {

	public static void main(String[] args) throws Exception {
		Relogio r = new Relogio();

		System.out.println( System.currentTimeMillis() );
		
		r.setHora(21);
		r.setMinuto(38);
		r.setSegundo(54);
		
//		System.out.println( r.getHoraFormatada() );
		
		while(true) {
			r.incrementarSegundos();
			System.out.println( r.getHoraFormatada() );
			Thread.sleep(500);
		}
	}

}
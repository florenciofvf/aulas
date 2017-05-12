package br.com.turma_android;

public class Main02 {

	public static void main(String[] args) throws Exception {
		Relogio r = new Relogio();
		r.atualizarHora(22);
		r.atualizarMinuto(45);
		r.atualizarSegundo(57);

		while (true) {
			r.incrementarSegundos();
			r.mostrarHora();

			Thread.sleep(100);
		}
	}

}

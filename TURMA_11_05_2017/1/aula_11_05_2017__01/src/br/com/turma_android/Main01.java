package br.com.turma_android;

public class Main01 {

	public static void main(String[] args) {
		Relogio r = new Relogio();
		r.mostrarHora();

		r = new Relogio();
		r.atualizarMinuto(45);
		r.mostrarHora();

		System.out.println("fim");
	}

}

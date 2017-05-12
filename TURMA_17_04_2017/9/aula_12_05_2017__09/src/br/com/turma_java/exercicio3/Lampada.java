package br.com.turma_java.exercicio3;

//ALTERE O NOME DO ATRIBUTO DESTA CLASSE PARA UM NOME MAIS APROPRIADO
public class Lampada {
	private boolean _;

	public void acender() {
		_ = true;
	}

	public void apagar() {
		_ = false;
	}

	public void mostrarEstado() {
		System.out.println(_ ? "ACESA" : "APAGADA");
	}
}
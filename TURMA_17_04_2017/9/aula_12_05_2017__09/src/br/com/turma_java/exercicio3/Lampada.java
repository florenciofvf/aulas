package br.com.turma_java.exercicio3;

//ALTERE O NOME DO ATRIBUTO DESTA CLASSE PARA UM NOME MAIS APROPRIADO
public class Lampada {
	private boolean ligado;

	public void acender() {
		ligado = true;
	}

	public void apagar() {
		ligado = false;
	}

	public void mostrarEstado() {
		System.out.println(ligado ? "ACESA" : "APAGADA");
	}
}
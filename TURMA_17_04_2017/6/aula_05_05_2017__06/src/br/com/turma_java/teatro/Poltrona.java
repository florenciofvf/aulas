package br.com.turma_java.teatro;

public class Poltrona {
	private boolean ocupada;
	private int numero;
	
	public void ocupar() {
		ocupada = true;
	}
	
	public void setNumero(int i) {
		numero = i;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void desocupar() {
		ocupada = false;
	}
	
	public boolean estaOcupada() {
		return ocupada;
	}
	
	public void mostrar() {
		System.out.print(ocupada ? "[ x ]" : "[  ]");
	}
}
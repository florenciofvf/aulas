package br.com.turma_java.teatro;

public class Fila {
	private Poltrona[] poltronas;
	private int numero;
	
	public void definirQtdPoltronas(int q) {
		poltronas = new Poltrona[q];
		
		for(int i=0; i<poltronas.length; i++) {
			poltronas[i] = new Poltrona();
			poltronas[i].setNumero(i + 1);
		}
	}
	
	public void setNumero(int num) {
		numero = num;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void mostrar() {
		for(Poltrona p : poltronas) {
			p.mostrar();
		}
	}
	
	public Poltrona recuperarPoltrona(int numero) {
		for(Poltrona p : poltronas) {
			if(numero == p.getNumero()) {
				return p;
			}
		}
		
		return null;
	}
}
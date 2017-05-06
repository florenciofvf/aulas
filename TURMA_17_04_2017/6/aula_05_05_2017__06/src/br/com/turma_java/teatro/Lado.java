package br.com.turma_java.teatro;

public class Lado {
	private Fila[] filas;
	private char id;
	
	public void definirQtdFilas(int total) {
		filas = new Fila[total];
		
		for(int i=0; i<filas.length; i++) {
			filas[i] = new Fila();
			filas[i].setNumero(i + 1);
			filas[i].definirQtdPoltronas(10);
		}
	}
	
	public void setID(char letra) {
		id = letra;
	}
	
	public char getID() {
		return id;
	}
	
	public void mostrar(int numero) {
		Fila f = recuperarFila(numero);
		f.mostrar();
	}
	
	public void mostrar() {
		for(Fila f : filas) {
			f.mostrar();
			System.out.println();
		}
	}
	
	public Fila recuperarFila(int numero) {
		for(Fila f : filas) {
			if(numero == f.getNumero()) {
				return f;
			}
		}
		
		return null;
	}
	
}
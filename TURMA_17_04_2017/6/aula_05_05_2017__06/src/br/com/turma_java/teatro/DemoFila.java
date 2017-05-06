package br.com.turma_java.teatro;

public class DemoFila {

	public static void main(String[] args) {
		Fila f = new Fila();
		f.definirQtdPoltronas(15);

		Poltrona p = f.recuperarPoltrona(7);
		p.ocupar();
		
		f.mostrar();		
	}

}
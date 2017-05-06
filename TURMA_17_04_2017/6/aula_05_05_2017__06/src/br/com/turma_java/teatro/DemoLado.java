package br.com.turma_java.teatro;

public class DemoLado {

	public static void main(String[] args) {
		Lado L = new Lado();
		L.definirQtdFilas(15);

		L.mostrar();
		System.out.println("------------------------");
		
		L.recuperarFila(3).recuperarPoltrona(5).ocupar();
		
		L.mostrar();
		System.out.println("------------------------");
		
		Fila f = L.recuperarFila(1);
		Poltrona p = f.recuperarPoltrona(3);
		p.ocupar();
		L.mostrar();
	}

}

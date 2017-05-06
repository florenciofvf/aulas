package br.com.turma_java.teatro;

public class DemoTeatro {

	public static void main(String[] args) {
		Teatro t = new Teatro();
		t.inicializar();
		t.reservar('E', 4, 7);
		t.mostrar();
	}
	
}

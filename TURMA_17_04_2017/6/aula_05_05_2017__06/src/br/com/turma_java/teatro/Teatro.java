package br.com.turma_java.teatro;

public class Teatro {
	private Lado ladoE = new Lado();
	private Lado ladoD = new Lado();
	
	public void inicializar() {
		ladoE.definirQtdFilas(15);
		ladoE.setID('E');
		
		ladoD.definirQtdFilas(15);
		ladoD.setID('D');
	}
	
	public Lado recuperarLado(char letra) {
		if(letra == 'e' || letra == 'E') {
			return ladoE;
		}
		
		if(letra == 'd' || letra == 'D') {
			return ladoD;
		}
		
		return null;
	}
	
	public void reservar(char lado, int numeroFila, int numeroPoltrona) {
		Lado L = recuperarLado(lado);
		
		if(L == null) {
			System.out.println("Lado inexistente!");
			return;
		}
		
		Fila fila = L.recuperarFila(numeroFila);
		
		if(fila == null) {
			System.out.println("Fila inexistente!");
			return;
		}
		
		Poltrona poltrona = fila.recuperarPoltrona(numeroPoltrona);
		
		if(poltrona == null) {
			System.out.println("Poltrona inexistente!");
			return;
		}
		
		if(poltrona.estaOcupada()) {
			System.out.println("Local já reservado!");
		} else {
			poltrona.ocupar();
			System.out.println("Poltrona reservada.");
		}
	}
	
	public void mostrar() {
		for(int i=1; i<=15; i++) {
			ladoE.mostrar(i);
			System.out.print("      ");
			ladoD.mostrar(i);
			System.out.println();
		}
	}
}
package br.com.turma_java.exercicio_M;

public class Lista {
	private NO cabeca;
	private NO cauda;

	public void adicionar(int valor) {
		NO no = new NO(valor);

		if (cabeca == null) {
			cabeca = no;
		}

		if (cauda != null) {
			cauda.proximo = no;
		}

		cauda = no;
	}

	public int calcularTotal() {
		int total = 0;

		NO n = cabeca;

		while (n != null) {
			total += n.valor;
			n = n.proximo;
		}

		return total;
	}
	
	public void excluirPrimeiroNO() {
		
	}
	
	public void excluirUltimoNO() {
		
	}
	
	public int getComprimento() {
		return 0;
	}
}

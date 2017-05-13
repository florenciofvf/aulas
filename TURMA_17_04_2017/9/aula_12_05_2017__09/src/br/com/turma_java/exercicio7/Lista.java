package br.com.turma_java.exercicio7;

public class Lista {
	private NO cabeca;
	private NO cauda;
	private int comprimento;

	public void adicionar(int valor) {
		NO no = new NO(valor);

		if (cabeca == null) {
			cabeca = no;
		}

		if (cauda != null) {
			cauda.proximo = no;
		}

		cauda = no;
		comprimento++;
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
		if (cabeca != null) {
			cabeca = cabeca.proximo;
			comprimento--;
		}
	}

	public void imprimirValores() {
		NO ref = cabeca;

		while (ref != null) {
			System.out.print(ref.valor + ", ");
			ref = ref.proximo;
		}
	}
	
	public int getMaiorValor() {
		return 0;
	}

	public void excluirUltimoNO() {
		NO ref = cabeca;
		
		if(cabeca == null) {
			return;
		}
		
		if(cabeca.proximo == null) {
			cabeca = null;
			cauda = null;
			return;
		}
		
		while(ref.proximo != null) {
			if(ref.proximo.proximo == null) {
				break;
			}
			
			ref = ref.proximo;
		}
		
		ref.proximo = null;
	}

	public void excluirValor(int valor) {

	}

	public Lista criarSublista(int inicio, int termino) {
		return null;
	}

	public int getComprimento() {
		return comprimento;
	}
}

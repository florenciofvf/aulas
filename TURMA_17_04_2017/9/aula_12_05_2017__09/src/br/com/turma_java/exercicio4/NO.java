package br.com.turma_java.exercicio4;

public class NO {
	private NO proximo;

	public NO() {
	}
	
	public NO(NO proximo) {
		this.proximo = proximo;
	}

	public void imprimir(int i) {
		if (proximo != null) {
			proximo.imprimir(i + 1);
		} else {
			System.out.println(i);
		}
	}
}
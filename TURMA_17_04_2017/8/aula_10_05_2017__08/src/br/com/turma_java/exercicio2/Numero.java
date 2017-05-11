package br.com.turma_java.exercicio2;

//Use System.out.println();
public class Numero {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void imprimirDobro() {
		System.out.println( this.valor * 2 );
	}

	public void imprimirTripo() {
		System.out.println(  valor * 3  );
	}

	public void imprimirSeEhParOuImpar() {
		if(this.valor % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
	}

	public void aumentar10PorCentoEImprimir() {
		this.valor = (int) (this.valor * 1.10);
		System.out.println(this.valor);
	}

	public void imprimirValor() {
		System.out.println(valor);
	}
}
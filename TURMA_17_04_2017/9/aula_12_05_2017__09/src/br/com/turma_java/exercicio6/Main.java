package br.com.turma_java.exercicio6;

public class Main {

	public static void main(String[] args) {
		NO a = new NO(3);
		NO b = new NO(4);
		NO c = new NO(7);
		NO d = new NO(9);

		a.proximo = b;
		b.proximo = c;
		c.proximo = d;

		int total = calcularTotal(a);
		System.out.println("TOTAL=" + total);

		double media = calcularMedia(a);
		System.out.println("MÉDIA=" + media);
	}

	private static int calcularTotal(NO n) {
		int soma = n.valor;

		n = n.proximo;

		while (n != null) {
			soma += n.valor;
			n = n.proximo;
		}

		return soma;
	}

	// IMPLEMENTE ESTE MÉTODO
	private static double calcularMedia(NO a) {
		return 0;
	}
}
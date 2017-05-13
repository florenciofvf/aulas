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

	private static int calcularTotal(NO ref) {
		int soma = ref.valor; //3
		
		ref = ref.proximo;

		while (ref != null) {
			soma += ref.valor;
			ref = ref.proximo;
		}

		return soma;
	}

	// IMPLEMENTE ESTE MÉTODO
	static double calcularMedia(NO ref) {
		return calcularTotal(ref) / totalNO(ref);
	}
	
	static float totalNO(NO ref) {
		int total = 0;
		
		while(ref != null) {
			total++;
			ref = ref.proximo;
		}
		
		return total;
	}
}






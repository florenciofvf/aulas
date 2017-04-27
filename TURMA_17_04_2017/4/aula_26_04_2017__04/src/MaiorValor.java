import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		Scanner s = new Scanner( System.in );

		System.out.println("Digite a quantidade");
		int total = s.nextInt();
				
		if(total > 0) {
			int contador = 1;
			System.out.println("Digite o valor " + contador);
			int maior = s.nextInt();
			
			while(contador < total) {
				contador++;
				System.out.println("Digite o valor " + contador);
				int valor = s.nextInt();
				if(valor > maior) {
					maior = valor;
				}
			}
			
			System.out.println("MAIOR VALOR = " + maior);
		}

		System.out.println("Fim");
		s.close();
	}
	
}

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite um valor");
		int valor = s.nextInt();

		s.close();

		System.out.println("O dobro do valor digitado é:");
		System.out.println(valor * 2);
	}

}

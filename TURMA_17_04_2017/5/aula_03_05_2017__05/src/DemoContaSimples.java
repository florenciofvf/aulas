import java.util.Scanner;

public class DemoContaSimples {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ContaSimples cs = new ContaSimples();
		mostrarOpcoes();

		int opcao = s.nextInt();

		while (opcao != 4) {
			switch (opcao) {
			case 1:
				cs.mostrarDadosDaConta();
				break;
			case 2:
				System.out.println("Digite o valor do depósito");
				float valorDoDeposito = s.nextFloat();
				cs.depositar(valorDoDeposito);
				break;
			case 3:
				System.out.println("Digite o valor do saque");
				float valorDoSaque = s.nextFloat();
				float valorSacado = cs.sacar(valorDoSaque);
				System.out.printf("Valor recebido R$ %.2f \n", valorSacado);
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
			}

			mostrarOpcoes();
			opcao = s.nextInt();
		}

		System.out.println("Fim");
		s.close();
	}

	static void mostrarOpcoes() {
		System.out.println("====(OPÇÕES)====");
		System.out.println("1 - Mostrar dados da conta");
		System.out.println("2 - Depositar");
		System.out.println("3 - Sacar");
		System.out.println("4 - Sair");
	}
}

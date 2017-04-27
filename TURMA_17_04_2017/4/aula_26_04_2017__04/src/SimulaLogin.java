import java.util.Scanner;

public class SimulaLogin {// System.exit(0); break; variáveis; ifs; continue;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Digite a senha de acesso");

		int senha = s.nextInt(); // INICIALIZAÇÃO
		int tentativas = 1;

		byte MAXIMO_TENTATIVAS = 3;

		while (senha != 4567) { // VERIFICAÇÃO
			if (tentativas == MAXIMO_TENTATIVAS) {
				System.out.println("Tentativas excedidas");
				System.exit(0);
			}

			System.out.println("Senha inválida\n\n");

			System.out.println("Digite a senha de acesso");
			senha = s.nextInt();// ATUALIZAÇÃO
			tentativas++;
		}

		System.out.println("Lendo suas permissões...");
		s.close();
	}

}
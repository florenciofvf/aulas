package br.com.turma_java;

import java.util.Scanner;

public class DemoTelevisao {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Televisao tv = new Televisao();
		ControleRemoto x = new ControleRemoto();
		
		x.reconhecerTV(tv);
		
		mostrarOpcoes();

		int opcao = s.nextInt();

		while (opcao != 5) {
			switch (opcao) {
			case 1:
				System.out.println("Digite o número do canal");
				int numero = s.nextInt();
				x.mudarCanal(numero);
				break;
			case 2:
				x.descreverCanal();
				break;
			case 3:
				x.ligar();
				break;
			case 4:
				x.desligar();
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
		System.out.println("1 - Mudar de canal");
		System.out.println("2 - Descrever o canal");
		System.out.println("3 - Ligar");
		System.out.println("4 - Desligar");
		System.out.println("5 - Sair");
	}
}

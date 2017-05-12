package br.com.turma_android;

public class Relogio {
	private int hora;
	private int minuto;
	private int segundo;

	public void atualizarHora(int novaHora) {
		if (novaHora >= 0 & novaHora <= 23) {
			hora = novaHora;
		}
	}

	public void atualizarMinuto(int novoMinuto) {
		if (novoMinuto >= 0 & novoMinuto <= 59) {
			minuto = novoMinuto;
		}
	}

	public void atualizarSegundo(int novoSegundo) {
		if (novoSegundo >= 0 & novoSegundo <= 59) {
			segundo = novoSegundo;
		}
	}

	public void mostrarHora() {
		System.out.print(hora < 10 ? "0" + hora : hora);
		System.out.print(":");
		System.out.print(minuto < 10 ? "0" + minuto : minuto);
		System.out.print(":");
		System.out.print(segundo < 10 ? "0" + segundo : segundo);
		System.out.println();
	}

	public void incrementarSegundos() {
		segundo++;
		if (segundo > 59) {
			segundo = 0;
			incrementarMinuto();
		}
	}

	private void incrementarMinuto() {
		minuto++;
		if (minuto > 59) {
			minuto = 0;
			incrementarHora();
		}
	}

	private void incrementarHora() {
		hora++;
		if (hora > 23) {
			hora = 0;
		}
	}
}
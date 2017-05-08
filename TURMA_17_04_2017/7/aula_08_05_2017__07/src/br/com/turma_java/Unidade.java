package br.com.turma_java;

public class Unidade {
	private String[] unidades = { "Zero", "Um", "Dois", "Três", 
			"Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove" };

	private int valor;

	protected Unidade() {
		// valor = 0;
		// alterarValor(0);
		this(0);
	}

	public Unidade(int numero) {
		// valor = numero;
		alterarValor(numero);
	}

	public void alterarValor(int numero) {
		valor = numero;
	}

	public String retornarValorPorExtenso() {
		if (valor < 0 || valor > 9) {
			return "";
		}
		
		return unidades[valor];
	}
}






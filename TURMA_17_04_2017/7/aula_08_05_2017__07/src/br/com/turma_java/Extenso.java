package br.com.turma_java;

public class Extenso {
	private int valor;

	public Extenso() {
		this(0);
	}

	public Extenso(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String retornarValorPorExtenso() {
		if (valor > 999) {
			return "";
		}

		boolean negativo = valor < 0;

		if (negativo) {
			valor *= -1; // Transformar o valor negativo em positivo
			if (valor > 999) {
				return "";
			}
		}

		if (negativo) {
			return "Menos " + new Centena(valor).retornarValorPorExtenso();
		}

		return new Centena(valor).retornarValorPorExtenso();
	}
}

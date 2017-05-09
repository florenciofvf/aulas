package br.com.turma_java;

public class PDezena {//VO
	//DECLARAÇÃO DE 2 ATRIBUTOS
	//UM ARRAY DO TIPO String
	private String[] pDezenas = { "Dez", "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Dezesseis", "Dezessete",
			"Dezoito", "Dezenove" };

	//UM VALOR PRIMITIVO DO TIPO 32 bits (int)
	private int valor;

	//CONSTRUTOR QUE EXIGE UM VALOR INTEIRO
	public PDezena(int valor) {
		this.valor = valor;
	}

	//MÉTODO ACESSOR DO atributo
	//RETORNA O VALOR DO ATRIBUTO valor
	public int getValor() {
		return valor;
	}

	//MÉTODO MODIFICADOR
	//ALTERA O VALOR DO ATRIBUTO valor
	public void setValor(int valor) {
		this.valor = valor;
	}

	//MÉTODO DE NEGÓCIO
	public String retornarValorPorExtenso() {
		if (valor < 10) {
			Unidade u = new Unidade(valor);
			return u.retornarValorPorExtenso();
		}

		if (valor > 19) {
			return "";
		}

		return pDezenas[valor - 10];
	}
}






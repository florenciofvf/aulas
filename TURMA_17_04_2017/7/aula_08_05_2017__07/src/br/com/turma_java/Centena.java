package br.com.turma_java;

public class Centena {
	private String[] centenas = {"Cem", "Cento", "Duzentos", 
			"Trezentos", "Quatrocentos", "Quinhentos", 
			"Seiscentos", "Setecentos", "Oitocentos", "Novecentos"};
	
	private int valor;

	public Centena(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String retornarValorPorExtenso() {
		if(valor < 100) {
			return new Dezena(valor).retornarValorPorExtenso();
		}
		
		if(valor > 999) {
			return "";
		}
		
		if(valor == 100) {
			return centenas[0];
		}
		
		if(valor % 100 == 0) {
			return centenas[valor / 100];
		}
		
		return centenas[valor / 100] + " e " + 
					new Centena(valor % 100).retornarValorPorExtenso();
	}
}










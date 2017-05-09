package br.com.turma_java;

public class Dezena {
	private String[] dezenas = {"Vinte", "Trinta", "Quarenta", 
			"Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"};
	
	private int valor;

	public Dezena(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String retornarValorPorExtenso() {
		if(valor < 20) {
			return new PDezena(valor).retornarValorPorExtenso();
		}
		
		if(valor > 99) {
			return "";
		}
		
		if(valor % 10 == 0) {
			return dezenas[ valor / 10 - 2];
		}
		
		Unidade u = new Unidade(valor % 10);
		
		return dezenas[ valor / 10 - 2] + " e " + u.retornarValorPorExtenso();
	}
}





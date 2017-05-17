package br.com.turma_java.eleicao.util;

public class Teste {

	public static void main(String[] args) {
		Conteiner c = new ConteinerImpl();
		
		c.adicionar(true);
		c.adicionar(50);
		c.adicionar("Maria");
		c.adicionar(null);
		
		System.out.println("TAMANHO=" + c.getTamanho());
		
		System.out.println("Está vazio? " + c.isVazio());
		
		c.excluir(new Integer(50));
		System.out.println("TAMANHO=" + c.getTamanho());
	}

}

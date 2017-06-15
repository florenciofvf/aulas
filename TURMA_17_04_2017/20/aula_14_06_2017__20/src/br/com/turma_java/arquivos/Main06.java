package br.com.turma_java.arquivos;

import java.io.PrintWriter;

public class Main06 {

	public static void main(String[] args) throws Exception {
		String arquivo = "/users/florenciovieirafilho/Desktop/nomes.txt";
		
		PrintWriter pw = new PrintWriter(arquivo);
		pw.println("Maria da Silva");
		pw.println("Antonio de Oliveira");
		pw.println("José da Silva");
		pw.close();
		
		System.out.println("ok");
	}

}
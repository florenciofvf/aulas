package br.com.turma_java.arquivos;

import java.io.File;

public class Main01 {

	public static void main(String[] args) throws Exception {
		File arquivo = new File("/users/florenciovieirafilho/Desktop/nomes.txt");
		
		System.out.println("     Existe? >>> " 	+ arquivo.exists());
		System.out.println("  É arquivo? >>> " 	+ arquivo.isFile());
		System.out.println("É diretório? >>> " 	+ arquivo.isDirectory());
		System.out.println("     Tamanho >>> "  + arquivo.length());
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		System.out.println("--------------------");
		
		System.out.println("     Existe? >>> " 	+ arquivo.exists());
		System.out.println("  É arquivo? >>> " 	+ arquivo.isFile());
		System.out.println("É diretório? >>> " 	+ arquivo.isDirectory());
		System.out.println("     Tamanho >>> "  + arquivo.length());		
	}

}
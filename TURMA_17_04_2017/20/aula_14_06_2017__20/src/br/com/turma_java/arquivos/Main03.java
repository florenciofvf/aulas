package br.com.turma_java.arquivos;

import java.io.File;

public class Main03 {

	public static void main(String[] args) {
		File raiz = new File("/users/florenciovieirafilho/desktop/A");
		descrever("", raiz);
	}

	private static void descrever(String tabulacao, File arquivo) {
		System.out.println(tabulacao + arquivo.getName());
		
		if(arquivo.isDirectory()) {
			File[] files = arquivo.listFiles();
			
			if(files != null) {
				for(File f : files) {
					descrever(tabulacao + ".", f);
				}
			}
		}
	}
}
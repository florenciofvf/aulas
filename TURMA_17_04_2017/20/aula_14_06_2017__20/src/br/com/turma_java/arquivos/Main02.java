package br.com.turma_java.arquivos;

import java.io.File;

public class Main02 {
	public static void main(String[] args) {
		File arquivo = new File("/users/florenciovieirafilho/desktop/A");
		File[] files = arquivo.listFiles();
		
		if(files != null) {
			for(File f : files) {
				System.out.print(f.isFile() ? "  ARQUIVO: " : "DIRETÓRIO: ");
				System.out.println(f.getName());
			}
		}
	}
}
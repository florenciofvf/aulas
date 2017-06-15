package br.com.turma_java.arquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main07 {

	public static void main(String[] args) throws Exception {
		String arquivo = "/users/florenciovieirafilho/Desktop/nomes.txt";
		InputStream is = new FileInputStream(arquivo);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String linha = br.readLine();
		System.out.println(linha);
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}

}
package br.com.turma_java.arquivos;

import java.beans.XMLDecoder;
import java.io.FileInputStream;

public class Main09Decoder {

	public static void main(String[] args) throws Exception {
		String arquivo = "/users/florenciovieirafilho/desktop/objetos.xml";

		XMLDecoder decoder = new XMLDecoder(new FileInputStream(arquivo));
		
		Pessoa p = (Pessoa) decoder.readObject();
		System.out.println(p.getNome() + " - " + p.getEmail());
		
		p = (Pessoa) decoder.readObject();
		System.out.println(p.getNome() + " - " + p.getEmail());
		
		decoder.close();
	}

}
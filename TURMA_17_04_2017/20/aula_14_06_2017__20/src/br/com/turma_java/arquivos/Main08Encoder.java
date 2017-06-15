package br.com.turma_java.arquivos;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;

public class Main08Encoder {

	public static void main(String[] args) throws Exception {
		String arquivo = "/users/florenciovieirafilho/desktop/objetos.xml";
		
		XMLEncoder encoder = new XMLEncoder(new FileOutputStream(arquivo));
		
		encoder.writeObject(new Pessoa("Maria da Silva", "maria@maria.com"));
		encoder.writeObject(new Pessoa("Carla da Silva", "carla@carla.com"));
		
		encoder.close();
		
		System.out.println("Salvo!");
	}

}

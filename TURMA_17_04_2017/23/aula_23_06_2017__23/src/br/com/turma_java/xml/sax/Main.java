package br.com.turma_java.xml.sax;

import java.io.File;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		File arquivo = new File("/Users/florenciovieirafilho/Desktop/arquivo.xml");
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		SAXParser parser = factory.newSAXParser();
		
		Manipulador m = new Manipulador();
		parser.parse(arquivo, m);
		
		List<Pessoa> pessoas = m.getPessoas();
		imprimir(pessoas);
	}
	
	private static void imprimir(List<Pessoa> lista) {
		if(lista == null) {
			return;
		}
		
		for(Pessoa p : lista) {
			System.out.println("\n\n");
			p.imprimir();
		}
	}
}
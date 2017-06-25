package br.com.turma_java.xml.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		File arquivo = new File("/Users/florenciovieirafilho/Desktop/arquivo.xml");
		
		Document document = builder.parse(arquivo);
		
		imprimir(document);
	}
	
	private static void imprimir(Node documento) {
		NodeList lista = documento.getChildNodes();
		
		for(int i=0; i<lista.getLength(); i++) {
			Node node = lista.item(i);
			System.out.println(node.getNodeName() + "=" + node.getNodeValue());
			imprimir(node);
		}
	}
}
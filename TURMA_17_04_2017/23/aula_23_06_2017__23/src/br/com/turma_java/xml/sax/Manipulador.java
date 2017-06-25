package br.com.turma_java.xml.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Manipulador extends DefaultHandler {
	private List<Pessoa> listagem = new ArrayList<>();
	
	private final String TAG_PESSOA   = "pessoa";
	private final String TAG_TELEFONE = "telefone";
	
	private final String ATT_NOME   = "nome";
	private final String ATT_DATA   = "data_nasc";
	private final String ATT_NUMERO = "numero";
	private final String ATT_TIPO   = "tipo";

	private Pessoa selecionado;

	@Override
	public void startElement(String uri, String localName, String qName, 
									Attributes attributes) throws SAXException {
		if(TAG_PESSOA.equals(qName)) {
			selecionado = new Pessoa();
			selecionado.setNome(attributes.getValue(ATT_NOME));
			selecionado.setData(attributes.getValue(ATT_DATA));
			
			listagem.add(selecionado);
			
		} else if(TAG_TELEFONE.equals(qName)) {
			
			if(selecionado != null) {
				Telefone fone = new Telefone();
				fone.setNumero(attributes.getValue(ATT_NUMERO));
				fone.setTipo(attributes.getValue(ATT_TIPO));
				
				selecionado.getFones().add(fone);
			}
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(TAG_PESSOA.equals(qName)) {
			selecionado = null;
		}
	}
	
	public List<Pessoa> getPessoas() {
		return listagem;
	}
}
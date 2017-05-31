package br.com.turma_java.util;

import java.util.ResourceBundle;

public final class Mensagens {
	private static ResourceBundle bundle;
	
	private Mensagens() {
	}

	public static String getString(String chave) {
		if(!bundle.containsKey(chave)) {
			throw new IllegalArgumentException("Chave inexistente no arquivo de mensagens.");
		}
		
		return bundle.getString(chave);
	}
	
	static {
		bundle = ResourceBundle.getBundle("mensagens");
	}
}
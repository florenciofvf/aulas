package br.com.turma_java.util;

import java.util.ResourceBundle;

public final class Config {
	private static ResourceBundle bundle;

	private Config() {
	}

	public static String getString(String chave) {
		if (!bundle.containsKey(chave)) {
			throw new IllegalArgumentException("Chave inexistente no arquivo de configuração.");
		}

		return bundle.getString(chave);
	}

	static {
		bundle = ResourceBundle.getBundle("config");
	}
}
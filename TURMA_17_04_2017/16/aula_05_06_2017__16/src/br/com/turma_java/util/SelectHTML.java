package br.com.turma_java.util;

import java.util.ArrayList;
import java.util.List;

public class SelectHTML {
	private String nome;
	private boolean gerarDefault;
	private final List<OptionHTML> options;

	public SelectHTML(String nome) {
		this.nome = nome;
		options = new ArrayList<>();
	}

	public void addOption(OptionHTML option) {
		if (option == null) {
			return;
		}
		
		options.add(option);
	}
	
	public String gerarHTML() {
		StringBuilder sb = new StringBuilder("<select");
		sb.append(" name='" + nome + "'");
		sb.append(">");
		
		if(gerarDefault) {
			sb.append(new OptionHTML("NA", "-----selecione----").gerarHTML());
		}
		
		for(OptionHTML op : options) {
			sb.append(op.gerarHTML());
		}
		
		sb.append("</select>");
		return sb.toString();
	}
	
	public void limpar() {
		options.clear();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isGerarDefault() {
		return gerarDefault;
	}

	public void setGerarDefault(boolean gerarDefault) {
		this.gerarDefault = gerarDefault;
	}
}









package br.com.turma_java.util;

public class OptionHTML {
	private String value;
	private String descricao;
	private boolean selecionado;

	public OptionHTML(String value, String descricao) {
		this(value, descricao, false);
	}

	public OptionHTML(String value, String descricao, boolean selecionado) {
		this.value = value;
		this.descricao = descricao;
		this.selecionado = selecionado;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String gerarHTML() {
		if(selecionado) {
			return "<option value='" + value + "' selected='true'>" + descricao + "</option>\n";
		}
		
		return "<option value='" + value + "'>" + descricao + "</option>\n";
	}

	public boolean isSelecionado() {
		return selecionado;
	}

	public void setSelecionado(boolean selecionado) {
		this.selecionado = selecionado;
	}
	
}
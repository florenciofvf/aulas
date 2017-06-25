package br.com.turma_java.xml.sax;

public class Telefone {
	private String numero;
	private String tipo;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void imprimir() {
		System.out.println(numero + ": " + tipo);
	}
}
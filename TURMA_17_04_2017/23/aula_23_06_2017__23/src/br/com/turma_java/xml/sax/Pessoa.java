package br.com.turma_java.xml.sax;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private String data;
	private List<Telefone> fones;
	
	public Pessoa() {
		fones = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Telefone> getFones() {
		return fones;
	}

	public void setFones(List<Telefone> fones) {
		this.fones = fones;
	}
	
	public void imprimir() {
		System.out.println(data + ": " + nome);
		System.out.println("================");
		
		for(Telefone f : fones) {
			f.imprimir();
		}
	}
}
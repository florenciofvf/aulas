package br.com.turma_java.dominio;

public class Candidato {
	private Integer id;
	private String nome;
	private Integer votos;
	
	public Candidato() {
	}

	public Candidato(Integer id, String nome, Integer votos) {
		this.id = id;
		this.nome = nome;
		this.votos = votos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVotos() {
		if(votos == null) {
			votos = 0;
		}
		
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}
}
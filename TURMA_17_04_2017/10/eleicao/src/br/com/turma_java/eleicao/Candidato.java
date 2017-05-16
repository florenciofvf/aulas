package br.com.turma_java.eleicao;

public interface Candidato {

	public Short getNumero();
	
	public Partido getPartido();
	
	public String getNome();
	
	public Eleicao getEleicao();
	
	public Long getVotos();
	
	public Float getPercentualVotos();
	
}

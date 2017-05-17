package br.com.turma_java.eleicao;

public interface Candidato {
	public int getNumero();
	
	public void setNumero(int numero);
	
	public String getNome();
	
	public void setNome(String nome);
	
	public int getVotos();
	
	public void somarVoto();
	
	public Eleicao getEleicao();
	
	public void setElecao(Eleicao e);
	
	public double getPercentualVotos();
	
	public boolean equals(Object objeto);
}
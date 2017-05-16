package br.com.turma_java.eleicao;

public interface Partido {
	
	public void adicionarCandidato(Candidato c);
	
	public void excluirCandidato(Candidato c);
	
	public Candidato[] getCandidatos();
	
}

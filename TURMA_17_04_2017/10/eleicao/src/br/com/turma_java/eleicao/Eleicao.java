package br.com.turma_java.eleicao;

public interface Eleicao {
	
	public Long getTotalVotos();

	public Candidato[] getCandidatos();
	
	public void adicionarCandidato(Candidato c);
	
	public void excluirCandidato(Candidato c);
	
	public void iniciarVotacao();
	
	public void finalizarVotacao();
	
	public Candidato getCandidato(Short numero);
}
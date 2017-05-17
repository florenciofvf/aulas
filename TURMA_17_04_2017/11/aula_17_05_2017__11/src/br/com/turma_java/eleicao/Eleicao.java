package br.com.turma_java.eleicao;

public interface Eleicao {
	public String getData();
	public String getDescricao();
	public void setDescricao(String descricao);
	public void adicionarCandidato(Candidato c);
	public void excluirCandidato(Candidato c);
	public int getTotalVotos();
	public Candidato[] getCandidatos();
	public Candidato getCandidato(int numero);
	public void fecharVotacao();
	public void iniciarEdicao();
	public void iniciarVotacao();
	public boolean isIniciadaVotacao();
	public boolean isFinalizada();
	public boolean isEdicao();
}
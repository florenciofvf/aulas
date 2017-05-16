package br.com.turma_java.eleicao;

public interface Conteiner {
	
	public void adicionar(Object objeto);
	
	public void excluir(Object objeto);
	
	public boolean isVazio();
	
	public int getTamanho();
	
	public Object[] getObjetos();

}
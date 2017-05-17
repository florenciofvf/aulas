package br.com.turma_java.eleicao.util;

public interface Conteiner {
	
	public void adicionar(Object objeto);
	
	public void excluir(Object objeto);
	
	public boolean isVazio();
	
	public int getTamanho();
	
	public Object[] getObjetos();

	public int getPosicao(Object objeto);
}
package br.com.turma_java.eleicao.util;

//Um objeto que implementar esta interface aceitará o contrato de armazenamento 
//de vários objetos e de qualquer tipo.

//O objeto que implementar esta interface fica livre para armazenar os objetos
//usando qualquer meio disponível
public interface Conteiner {

	public void adicionar(Object objeto);

	public void excluir(Object objeto);

	public boolean isVazio();

	public int getTamanho();

	public Object[] getObjetos();

	public int getPosicao(Object objeto);
	
	public boolean contem(Object objeto);
}
package br.com.turma_java.eleicao.util;

public class ConteinerImpl implements Conteiner {
	private Object[] objetos;
	private int indice;
	
	public ConteinerImpl() {
		objetos = new Object[100];
	}
	
	@Override
	public void adicionar(Object objeto) {
		if(objeto == null) {
			return;
		}
		
		if(indice >= objetos.length) {
			incrementarArray(0.10);
		}
		
		objetos[indice] = objeto;
		indice++;
	}

	private void incrementarArray(double fator) {
		Object[] bkp = objetos;
		
		int novoTamanho = (int) (objetos.length + objetos.length * fator);
		objetos = new Object[novoTamanho];
		
		for(int i=0; i<bkp.length; i++) {
			objetos[i] = bkp[i];
		}
	}
	
	@Override
	public void excluir(Object objeto) {
		if(objeto == null) {
			return;
		}
		
		boolean excluido = false;
		
		for(int i=0; i<objetos.length; i++) {
			Object obj = objetos[i];
			
			if(obj == objeto || obj.equals(objeto)) {
				objetos[i] = null; //Anular a posição
				break;
			}
		}
		
		if(excluido) {
			indice--;
			normalizarArray();
		}
	}
	
	private void normalizarArray() {
		Object[] bkp = objetos;
		objetos = new Object[bkp.length];
		
		int j = 0;
		
		for(int i=0; i<bkp.length; i++) {
			if(bkp[i] != null) {
				objetos[i] = bkp[j];
				j++;
			}
		}
	}

	@Override
	public boolean isVazio() {
		return getTamanho() == 0;
	}

	@Override
	public int getTamanho() {
		return indice;
	}

	@Override
	public Object[] getObjetos() {
		Object[] resposta = new Object[indice];
		
		for(int i=0; i<indice; i++) {
			resposta[i] = objetos[i];
		}
		
		return resposta;
	}
	
	@Override
	public int getPosicao(Object objeto) {
		for(int i=0; i<objetos.length; i++) {
			Object obj = objetos[i];
			
			if(obj == objeto || obj.equals(objeto)) {
				return i;
			}
		}

		return -1;
	}
}
package br.com.turma_java.eleicao;

public class ConteinerImpl implements Conteiner {
	private Object[] objetos;
	private int indice;
	
	public ConteinerImpl() {
		objetos = new Object[10];
	}
	
	@Override
	public void adicionar(Object objeto) {
		if(indice >= objetos.length) {
			incrementarArray(0.10);
		}
		objetos[indice] = objeto;
		indice++;
	}

	private void incrementarArray(double fator) {
		Object[] bkp = objetos;
		objetos = new Object[(int) (objetos.length + objetos.length * fator)];
		
		for(int i=0; i<bkp.length; i++) {
			objetos[i] = bkp[i];
		}
	}
	
	@Override
	public void excluir(Object objeto) {
		boolean excluido = false;
		
		for(int i=0; i<objetos.length; i++) {
			if(objetos[i] == objeto) {
				objetos[i] = null;
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
		objetos = new Object[objetos.length];
		
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
}
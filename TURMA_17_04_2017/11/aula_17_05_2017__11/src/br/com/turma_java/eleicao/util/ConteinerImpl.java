package br.com.turma_java.eleicao.util;

//Um objeto do tipo ConteinerImpl aceita o contrato do Conteiner e armazenará 
//os objetos na memória utilizando um array de Object.

//O objeto documenta que não armazenará valores nulos.
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
			incrementarArray(1.99);
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
		
		//bkp = null;
		//System.gc();
		//System.arraycopy(bkp, 0, objetos, 0, bkp.length);
	}
	
	@Override
	public void excluir(Object objeto) {
		if(objeto == null) {
			return;
		}
		
		boolean excluido = false;
		
		int posicaoObjeto = getPosicao(objeto);
		
		if(posicaoObjeto >= 0) {
			objetos[posicaoObjeto] = null; //Anular a casa do objeto
			excluido = true;
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
				objetos[j] = bkp[i];
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
		Object[] resposta = new Object[getTamanho()];
		
		for(int i=0; i<getTamanho(); i++) {
			resposta[i] = objetos[i];
		}
		
		//System.arraycopy(objetos, 0, resposta, 0, getTamanho());
		
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
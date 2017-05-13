package br.com.turma_java.exercicio8;

public class Lista {
	private int[] valores;
	
	public Lista() {
		valores = new int[0];
	}
	
	public void adicionar(int valor) {
		//Referência ao objeto array
		int[] bkp = valores;
		
		//Criando um novo array com uma casa a mais.
		//valores agora aponta para um novo array
		//bkp ainda aponta para o array antigo
		valores = new int[bkp.length + 1];
		
		//Como o objeto array foi recriado precisamos retornar os valores que
		//estão no objeto antigo apontado pela referencia bkp
		System.arraycopy(bkp, 0, valores, 0, bkp.length);
		
		//Adicionando o valor na última casa do novo array
		valores[ valores.length - 1] = valor;
	}
	
	public int somar() {
		int total = 0;
		
		for(int i : valores) {
			total += i;
		}
		
		return total;
	}
}
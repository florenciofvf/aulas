package br.com.turma_java.arrays;


//Array: São estruturas capazes de armazenar vários valores do mesmo tipo ou
//instâncias que herdam de uma mesma classe ancestral. Para manipular um array
//é necessário uma referência e um índice de acesso
//Obs: Em java os arrays são objetos
public class Main01 {

	public static void main(String args[]) {
		//DECLARAÇÃO
		int numeros[];
		char[] vogais;
		boolean[] matriz[];
		
		//INICIALIZAÇÃO
		numeros = new int[67];
		vogais = new char[5];
		matriz = new boolean[5][3];
		
		//ESCRITA
		numeros[0] = 256;
		vogais[4] = 'U';
		matriz[2][2] = true;
		
		//LEITURA
		int valor = numeros[0];  // 256
		char letra = vogais[4];  // 'U'
		boolean b = matriz[0][0];// false
	}
	
}

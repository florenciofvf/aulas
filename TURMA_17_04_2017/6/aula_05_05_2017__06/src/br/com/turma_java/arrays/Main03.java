package br.com.turma_java.arrays;

public class Main03 {

	public static void main(String args[]) {
		char[] vogais = {'a', 'e', 'i', 'o', 'u'};
		String[] nomes = { "Maria", "José", "Francisco", "Carla"};
		
		nomes[2] = null;
		for(String s : nomes) {
			System.out.println(s);
		}
		
		for(int i=0; i<5; i++) {
			char c = vogais[i];
			System.out.println(c);
		}

		for(int i=0; i<vogais.length; i++) {
			char c = vogais[i];
			System.out.println(c);
		}

		for(int i=vogais.length -1; i>=0; i--) {
			char c = vogais[i];
			System.out.println(c);
		}
		
		for(char c : vogais) {
			System.out.println(c);
		}
	}
	
}
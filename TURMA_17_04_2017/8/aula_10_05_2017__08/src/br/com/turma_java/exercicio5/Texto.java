package br.com.turma_java.exercicio5;

public class Texto {
	private String[] strings = {"Zero", "Um", "Dois"};
	private int indice;
	
	public String getString() {
//		String s = strings[indice % 3];
//		indice++;
//		return s;
		
		if(indice == 0) {
			indice++;
			return strings[0];
		}
		
		if(indice == 1) {
			indice++;
			return strings[1];
		}

		if(indice == 2) {
			indice = 0;
			return strings[2];
		}
		
		return null;
	}
	
}
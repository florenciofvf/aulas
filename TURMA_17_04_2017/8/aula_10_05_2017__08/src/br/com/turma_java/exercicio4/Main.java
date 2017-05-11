package br.com.turma_java.exercicio4;

//FINALIZE A CLASSE DiaSemana
//ALTERE SOMENTE A CLASSE DiaSemana
public class Main {

	public static void main(String[] args) {
		DiaSemana ds = new DiaSemana(7);
		ds.imprimirDiaDaSemana();
		
		ds.setDia(0);
		ds.imprimirDiaDaSemana();
	}

}
package br.com.turma_java.exercicio3;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setIdade(45);
		
		p.imprimirFaixaEtaria();
		
//		DESCOMENTE E FAÇA FUNCIONAR
		p = new Pessoa(21);
		p.imprimirFaixaEtaria();
	}

}
package br.com.turma_java;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria");
		
		p.imprimirNome();
		
		Funcionario f = new Funcionario("Ana", 5000);
		f.imprimirNome();
		
		mostrarNome(p);
		mostrarNome(f);
	}

	public static void mostrarNome(Pessoa p) {
		p.imprimirNome();
	}
	
}
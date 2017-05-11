package br.com.turma_java.exercicio3;

/*
< 1 : INVÁLIDO
> 120: INVÁLIDO
1..13: criança
14..17: adolescente
18..65: adulto
66..120: idoso
*/
public class Pessoa {
	private int idade;
	
	public Pessoa() {
	}

	public Pessoa(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimirFaixaEtaria() {
		if (idade < 1 | idade > 120) {
			System.out.println("INVÁLIDO");

		} else if (idade < 14) {
			System.out.println("CRIANÇA");

		} else if (idade < 18) {
			System.out.println("ADOLESCENTE");

		} else if (idade < 66) {
			System.out.println("ADULTO");

		} else if (idade < 121) {
			System.out.println("IDOSO");
		}
	}
}
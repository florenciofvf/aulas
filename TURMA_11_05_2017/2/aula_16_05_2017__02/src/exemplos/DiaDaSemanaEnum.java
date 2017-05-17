package exemplos;

public enum DiaDaSemanaEnum {
	DOMINGO("Domingo"),
	SEGUNDA("Segunda-Feira"),
	TERCA("Terça-Feira"),
	QUARTA("Quarta-Feira"),
	QUINTA("Quinta-Feira"),
	SEXTA("Sexta-Feira"),
	SABADO("Sábado");
	
	private final String nome;

	DiaDaSemanaEnum(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}

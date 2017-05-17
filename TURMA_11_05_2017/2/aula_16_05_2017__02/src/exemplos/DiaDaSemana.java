package exemplos;

public class DiaDaSemana {
	public static final DiaDaSemana DOMINGO = new DiaDaSemana("Domingo");
	public static final DiaDaSemana SEGUNDA = new DiaDaSemana("Segunda-Feira");
	public static final DiaDaSemana TERCA = new DiaDaSemana("Terça-Feira");
	public static final DiaDaSemana QUARTA = new DiaDaSemana("Quarta-Feira");
	public static final DiaDaSemana QUINTA = new DiaDaSemana("Quinta-Feira");
	public static final DiaDaSemana SEXTA = new DiaDaSemana("Sexta-Feira");
	public static final DiaDaSemana SABADO = new DiaDaSemana("Sábado");
	
	private final String nome;

	private DiaDaSemana(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
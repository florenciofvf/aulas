package exemplos;

public class DiaDaSemanaTeste {

	public static void main(String[] args) {
		
		//imprimirDia(new DiaDaSemana("Teste")); //Nao podemos instanciar
		
		imprimirDia( DiaDaSemanaEnum.DOMINGO );

		//imprimirDia( null );
	}
	
	public static void imprimirDia(DiaDaSemanaEnum d) {
		System.out.println(d.getNome());
	}

	public static void imprimirDia(String d) {
		throw new IllegalArgumentException();
	}
	
}
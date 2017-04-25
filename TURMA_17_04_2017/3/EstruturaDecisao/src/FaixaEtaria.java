/*
     < 1 : INVÁLIDO
    > 120: INVÁLIDO
    1..13: criança
   14..17: adolescente
   18..65: adulto
  66..120: idoso
*/
public class FaixaEtaria {

	public static void main(String[] args) {
		short idade = Short.parseShort(args[0]);

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

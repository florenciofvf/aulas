
public class ExemploFOR_01 {

	public static void main(String[] args) {
//		for (   ;    ;   ) {
//			System.out.println("Java");
//			break;
//		}

//		for ( int i=1  ;  i<=3  ;  i++ ) {
//			System.out.println("Java");
//		}
		
		//1+2+3+4+5...99+100
		int soma = 0;
		
		for(int contador=1; contador<=100; contador++) {
			soma += contador;
		}
		
		System.out.println("TOTAL=" + soma);
		
		System.out.println("TOTAL=" + Declarativo.pa(100));
		
		new Matematica();
		System.out.println( Matematica.PI );
		
	}

}

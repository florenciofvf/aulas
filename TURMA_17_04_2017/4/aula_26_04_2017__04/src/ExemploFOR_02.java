
public class ExemploFOR_02 {

	public static void main(String[] args) {
		//1+2+3+4+5...99+100
		int soma = 0;
		
		for(int contador=1; contador<=100; contador++) {
			soma += contador;
		}
		
		System.out.println("TOTAL=" + soma);
		
		
		//===============================================
		//(1-2)+(3-4)+(5-6)+(7-8)...(99-100)
		int contImpar = 1;
		int contPar = 2;
		
		int total = 0;
		
		while(contImpar <= 99) {
			total += contImpar - contPar;
			contImpar += 2;
			contPar += 2;
		}
		
		System.out.println("TOTAL=" + total);
	}

}

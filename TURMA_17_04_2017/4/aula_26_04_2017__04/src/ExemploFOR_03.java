
public class ExemploFOR_03 {
	public static void main(String[] args) {
		
		//1-2+3-4+5-6+7-8...99-100
		int total = 0;
		
		for(int contImpar = 1, contPar = 2; contImpar <= 99; contImpar += 2, contPar += 2) {
			total += contImpar - contPar;
		}
		
		System.out.println("TOTAL=" + total);	
		
		int soma = 0;
		for(int cont=1; cont<=100; cont++) {
			if(cont % 2 == 0) {
				soma += -cont;
			} else {
				soma += cont;
			}
		}
		
		System.out.println("SOMA=" + soma);
	}
}

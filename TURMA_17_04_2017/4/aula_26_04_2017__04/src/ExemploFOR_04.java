
public class ExemploFOR_04 {

	public static void main(String[] args) {
		//1-2+3-4+5-6+7-8...99-100
		
		int soma = 0;
		
		for(int cont=1; cont<=100; cont++) {
			soma += (cont % 2 == 0) ? -cont : cont;
		}
		
		System.out.println("SOMA=" + soma);
	}

}
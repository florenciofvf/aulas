
public class ExemploFOR_05 {

	public static void main(String[] args) {
		// 28 * 27     27 * 26     26 * 25        2 * 1
		//--------- + --------- + --------- ... ---------
		//    1           2           3            27
		
		float soma = 0;
		
		for(int i=1; i<=27; i++) {
			soma += ((29 - i) * (28 - i)) / i;
		}
		
		System.out.println("SOMA=" + soma);
	}
	
}
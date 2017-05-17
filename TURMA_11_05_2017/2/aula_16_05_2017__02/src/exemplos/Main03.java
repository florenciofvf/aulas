package exemplos;

public class Main03 {
	transient int valor = 20;
	
	public static void main(String[] args) {

		boolean b = args instanceof String[];
		
		System.out.println( b );
		
	}
	
}

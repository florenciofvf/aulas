
public class OperadoresLogicos2 {

	// & && | || ^
	// Compara 2 operandos do tipo boolean e retorna um valor do tipo boolean
	public static void main(String[] args) {

		System.out.println("true  | false = " + (true | false)); // true
		System.out.println("true  |  true = " + (true | true)); // true
		System.out.println("false | false = " + (false | false));// false
		System.out.println("false |  true = " + (false | true)); // true

		System.out.println("===================");

		System.out.println("true || false = " + (true || false)); // true
		System.out.println("true || true = " + (true || true)); // true
		System.out.println("false || false = " + (false || false));// false
		System.out.println("false || true = " + (false || true)); // true

		System.out.println(true || teste());
	}

	static boolean teste() {
		System.out.println("TESTE");
		return false;
	}
}
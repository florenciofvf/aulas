
public class OperadoresLogicos {

	// & && | || ^
	// Compara 2 operandos do tipo boolean e retorna um valor do tipo boolean
	public static void main(String[] args) {

		System.out.println("true  & false = " + (true & false)); // false
		System.out.println("true  &  true = " + (true & true)); // true
		System.out.println("false & false = " + (false & false));// false
		System.out.println("false &  true = " + (false & true)); // false

		System.out.println("===================");

		System.out.println("true && false = " + (true && false)); // false
		System.out.println("true && true = " + (true && true)); // true
		System.out.println("false && false = " + (false && false));// false
		System.out.println("false && true = " + (false && true)); // false

		System.out.println(false && teste());
	}

	static boolean teste() {
		System.out.println("TESTE");
		return false;
	}
}
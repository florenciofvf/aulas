
public class OperadoresLogicos3 {

	// & && | || ^
	// Compara 2 operandos do tipo boolean e retorna um valor do tipo boolean
	public static void main(String[] args) {

		System.out.println("true  ^ false = " + (true ^ false)); // true
		System.out.println("true  ^  true = " + (true ^ true)); // false
		System.out.println("false ^ false = " + (false ^ false));// false
		System.out.println("false ^  true = " + (false ^ true)); // true

		int valor = 7 & 3;
		System.out.println(valor); // 3

		int teste = 7 | 3;
		System.out.println(teste); // 7

		int valor2 = 8 & 3;
		System.out.println(valor2);// 0

		int teste2 = 8 | 3;
		System.out.println(teste2);// 11
		
		int valor3 = 3 << 1;
		System.out.println(valor3); //6
		
		int valor4 = 8 >> 2;
		System.out.println(valor4); //2
	}
}

/*
 1=1
 2=10
 3=11
 4=100
 5=101
 6=110
 7=111
 8=1000
 9=1001
10=1010
11=1011
12=1100
13=1101
14=1110
15=1111
*/
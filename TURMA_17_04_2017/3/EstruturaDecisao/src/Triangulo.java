/*
 a=10 b=10 c=100 ERROR!
 
 a=10 b=100 c=100   OK! >>> ISÓSCELES dois lados iguais

 a=10 b=20 c=30  ERROR! 

 a=10 b=20 c=29     OK! >>> ESCALENO   tres lados diferentes
 
 a=10 b=10 c=10     OK! >>> EQUILÁTERO tres lados iguais
 
 PARA TRÊS VALORES FORMAREM UM TRIÂNGULO AMBOS OS LADOS DEVEM 
 //SER MENOR QUE A SOMA DOS OUTROS 2
*/
public class Triangulo {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if ((a < b + c) && (b < a + c) && (c < a + b)) {

			if (a == b && b == c) {
				System.out.println("EQUILÁTERO");
			} else if (a != b && b != c && c != a) {
				System.out.println("ESCALENO");
			} else {
				System.out.println("ISÓSCELES");
			}

		} else {
			System.out.println("Não forma");
		}
	}

}

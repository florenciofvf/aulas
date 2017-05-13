package br.com.turma_java.exercicio5;

public class Main {

	public static void main(String[] args) {
		String s = new String("Informática");

		char c = s.charAt(4);
		System.out.println(c); //r

		System.out.println( s.length() ); //11

		System.out.println(s.indexOf('o')); //3

		String t = s.substring(3, 7); //ormá
		System.out.println(t);
	}

}
package br.com.turma_java.exercicio5;

public class Main {

	public static void main(String[] args) {
		String s = new String("Informática");

		char c = s.charAt(4);
		System.out.println(c);

		System.out.println(s.length());

		System.out.println(s.indexOf('o'));

		String t = s.substring(3, 7);
		System.out.println(t);
	}

}
package br.com.turma_java;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		Funcionario f = new Funcionario("Maria", 5000);
		
		ChefeDepartamento c = new ChefeDepartamento("Ana", 8000, "DP");
		
		System.out.println( p instanceof Pessoa );            //true
		System.out.println( p instanceof Funcionario );       //false
		System.out.println( p instanceof ChefeDepartamento ); //false

		System.out.println( f instanceof Pessoa );            //true
		System.out.println( f instanceof Funcionario );       //true
		System.out.println( f instanceof ChefeDepartamento ); //false

		System.out.println( c instanceof Pessoa );			  //true
		System.out.println( c instanceof Funcionario );       //true
		System.out.println( c instanceof ChefeDepartamento ); //true
		
		System.out.println( c instanceof Object );            //true
		
	}
	
}

package reflexao;

import java.lang.reflect.Constructor;

import br.com.turma_java.dominio.Pessoa;

public class Main03 {

	public static void main(String[] args) throws Exception {
		Class classe = 
				Class.forName("br.com.turma_java.dominio.Pessoa");
		
		Object obj = classe.newInstance(); //Invoca o construtor padrão
		
		System.out.println( obj instanceof Pessoa );
		
		Constructor construtor = 
				classe.getConstructor(String.class, Integer.class);
		
		obj = construtor.newInstance("Maria", 34);
		System.out.println( obj instanceof Pessoa );		
	}

}

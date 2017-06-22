package reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main02 {

	public static void main(String[] args) throws Exception {
		Class classe = null;

		classe = Class.forName("br.com.turma_java.dominio.Pessoa");
		
		Field[] campos = classe.getDeclaredFields();
		System.out.println("ATRIBUTOS");
		for(Field f : campos) {
			System.out.println(f.getName());
		}
		
		Method[] metodos = classe.getDeclaredMethods();
		System.out.println("MÉTODOS");
		for(Method m : metodos) {
			System.out.println(m.getName());
		}
		
		Constructor[] construtores = classe.getConstructors();
		System.out.println("CONSTRUTORES");
		for(Constructor c : construtores) {
			System.out.println(c.getName() + " >> " + 
					c.getParameterCount());
		}
	}

}
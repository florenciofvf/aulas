package reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main04 {

	public static void main(String[] args) throws Exception {
		System.setSecurityManager(new SecurityManager());
		
		Class classe = Class.forName("br.com.turma_java.dominio.Pessoa");
		
		Constructor construtor = classe.getConstructor(String.class, Integer.class);
		
		Object ref = construtor.newInstance("Maria", 34);
		
		//Pessoa p = (Pessoa)ref;
		//p.imprimirNome();
		
		Method method = classe.getDeclaredMethod("imprimirNome");
		method.invoke(ref);
		
		Field campo = classe.getDeclaredField("nome");
		campo.setAccessible(true);
		campo.set(ref, "Francisco da Silva");
		method.invoke(ref);
	}

}

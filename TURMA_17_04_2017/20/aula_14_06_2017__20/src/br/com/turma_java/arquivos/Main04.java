package br.com.turma_java.arquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//InputStream
//OutputStream
public class Main04 {

	public static void main(String[] args) throws Exception {
		String arquivo = "/users/florenciovieirafilho/desktop/aviao.jpg";
		String copia = "/users/florenciovieirafilho/desktop/aviao-cópia.jpg";
		
		InputStream is = new FileInputStream(arquivo);
		OutputStream os = new FileOutputStream(copia);
		
		int valor = is.read();
		
		while(valor != -1) {
			os.write(valor);
			valor = is.read();
		}
		
		is.close();
		os.close();
		System.out.println("Copiado!");
	}

}

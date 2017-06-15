package br.com.turma_java.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ArquivoUtil {

	public static void copiar(String arquivoOrigem, String arquivoDestino) 
			throws Exception {
		copiar(new File(arquivoOrigem), new File(arquivoDestino));
	}
	
	public static void copiar(File origem, File destino) throws Exception {
		if(origem == null || destino == null) {
			return;
		}
		
		if(!origem.canRead()) {
			return;
		}
		
		InputStream is = new FileInputStream(origem);
		OutputStream os = new FileOutputStream(destino);
		byte[] buffer = new byte[4096];
		
		int lidos = is.read(buffer);
		
		while(lidos > 0) {
			os.write(buffer, 0, lidos);
			lidos = is.read(buffer);
		}
		
		is.close();
		os.close();
	}
}




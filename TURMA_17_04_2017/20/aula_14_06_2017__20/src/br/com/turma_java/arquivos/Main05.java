package br.com.turma_java.arquivos;

public class Main05 {

	public static void main(String[] args) throws Exception {
		String origem = "/users/florenciovieirafilho/desktop/aviao.jpg";
		String destino = "/users/florenciovieirafilho/desktop/aviao-2.jpg";
		
		ArquivoUtil.copiar(origem, destino);
		System.out.println("copiado");
	}
	
}
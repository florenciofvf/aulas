package reflexao;

import br.com.turma_java.dominio.Pessoa;

public class Main01 {

	public static void main(String[] args) throws Exception {
		Class classe = null;

		//1 - Apontando diretamente para a classe. Necessita
		//da importação
		classe = Pessoa.class;
		System.out.println(classe);
		
		//2 - Carregando o arquivo .classe e o refenciando
		//Use o método forName da Class
		classe = Class.forName("br.com.turma_java.dominio.Pessoa");
		System.out.println(classe);
		
		//3 - Obtendo a classe através do objeto/instância
		Pessoa p = new Pessoa();
		classe = p.getClass();
		System.out.println(classe);
	}

}
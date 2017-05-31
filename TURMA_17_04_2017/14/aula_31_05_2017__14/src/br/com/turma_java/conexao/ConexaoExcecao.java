package br.com.turma_java.conexao;

@SuppressWarnings("serial")
public class ConexaoExcecao extends Exception {

	public ConexaoExcecao(String erro) {
		super(erro);
	}

}
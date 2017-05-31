package br.com.turma_java.conexao;

import java.sql.Connection;

import br.com.turma_java.util.Config;

public final class FabricaConexao {
	private static Conexao conexaoMySQL = new Conexao(
				Config.getString("driver"), Config.getString("urlBanco"),
				Config.getString("usuario"), Config.getString("senha")
			);

	private FabricaConexao() {
	}
	
	public static Connection getConnectionMySQL() throws ConexaoExcecao {
		return conexaoMySQL.getConnection();
	}
}

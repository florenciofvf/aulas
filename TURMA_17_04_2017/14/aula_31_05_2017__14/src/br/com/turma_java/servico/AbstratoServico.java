package br.com.turma_java.servico;

import java.sql.Connection;

import br.com.turma_java.conexao.FabricaConexao;

public abstract class AbstratoServico {

	public Connection getConnection() {
		try {
			return FabricaConexao.getConnectionMySQL();
		} catch(Exception e) {
			throw new IllegalStateException( e.getMessage() );
		}
	}
	
	public void fecharConnection(Connection conn) {
		try {
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
package br.com.turma_java.conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoTeste {

	public static void main(String[] args) {
		
		try {
			
			Connection conn = FabricaConexao.getConnectionMySQL();
			System.out.println("Conectado!");
			conn.close();
			
		} catch(ConexaoExcecao ce) {
			System.out.println( ce.getMessage() );
			
		} catch(SQLException e) {
			System.out.println( e.getMessage() );
		}
		
	}
	
}
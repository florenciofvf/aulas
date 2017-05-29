package br.com.turma_java.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.turma_java.conexao.FabricaConexao;

public class MainSelect {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			conn = FabricaConexao.getConnectionMySQL();
		} catch(Exception e) {
			System.out.println( e.getMessage());
			return;
		}
		
		try {
			String sql = "SELECT nome, telefone FROM candidato";

			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				String nome = rs.getString("telefone");
				System.out.println(nome);
			}
			
			rs.close();
			st.close();
			conn.close();
		} catch(Exception e) {
			System.out.println( e.getMessage() );
		}
	}

}
package br.com.turma_java.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.turma_java.conexao.FabricaConexao;

public class MainInsert2 {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			conn = FabricaConexao.getConnectionMySQL();
		} catch(Exception e) {
			System.out.println( e.getMessage());
			return;
		}
		
		try {
			String sql = "INSERT INTO candidato(nome, telefone) VALUES(?,?)";

			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, "Maria");
			st.setString(2, "222-2222");
			
			int i = st.executeUpdate();
			
			System.out.println("Linhas afetadas: " + i);
			
			st.close();
			conn.close();
		} catch(Exception e) {
			System.out.println( e.getMessage() );
		}
	}

}
package br.com.turma_java.banco;

import java.sql.Connection;
import java.sql.Statement;

import br.com.turma_java.conexao.FabricaConexao;

public class MainInsert {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			conn = FabricaConexao.getConnectionMySQL();
		} catch(Exception e) {
			System.out.println( e.getMessage());
			return;
		}
		
		try {
			Statement st = conn.createStatement();
			
String sql = "INSERT INTO candidato(nome, telefone) VALUES('JOSE' , '1')";
			
			int i = st.executeUpdate(sql);
			
			System.out.println("Linhas afetadas: " + i);
			
			st.close();
			conn.close();
		} catch(Exception e) {
			System.out.println( e.getMessage() );
		}
	}

}
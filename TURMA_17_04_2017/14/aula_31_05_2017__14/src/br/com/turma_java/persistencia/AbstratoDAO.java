package br.com.turma_java.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class AbstratoDAO {
	protected Connection conn;        //CONEXÃO
	protected PreparedStatement psmt; //INSTRUÇÕES
	protected ResultSet rs;           //RESULTADOS
	
	public AbstratoDAO(Connection conn) {
		if(conn == null) {
		   throw new IllegalArgumentException("Conexão nula.");	
		}
		
		this.conn = conn;
	}
	
}
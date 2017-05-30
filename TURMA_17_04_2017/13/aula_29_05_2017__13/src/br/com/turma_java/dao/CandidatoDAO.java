package br.com.turma_java.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.turma_java.dominio.Candidato;

public class CandidatoDAO extends AbstratoDAO {
	private final String INSERIR = "INSERT INTO Candidato(nome, telefone)" +
                            " VALUES(?, ?)";
	
	private final String ATUALIZAR = "UPDATE Candidato SET nome=?, " +
	                        " telefone=?  WHERE id=?";
	
	private final String EXCLUIR = "DELETE FROM Candidato WHERE id=?";
	
	private final String PESQUISAR = "SELECT * FROM Candidato WHERE 1=1";

	public CandidatoDAO(Connection conn) {
		super(conn);
	}

	public void inserir(Candidato c) {
		try {
			psmt = conn.prepareStatement(INSERIR, 
					PreparedStatement.RETURN_GENERATED_KEYS);
			psmt.setString(1, c.getNome());
			psmt.setString(2, c.getTelefone());
			psmt.executeUpdate();
			
			rs = psmt.getGeneratedKeys();//ResultSet com o id auto incrementado
			rs.next(); //Avançar o ponteiro
			Integer id = rs.getInt(1); //Recuperar o id da primeira coluna
			
			c.setId(id);//Setar o novo id no objeto
			
			rs.close();
			psmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Candidato c) {
		try {
			psmt = conn.prepareStatement(ATUALIZAR);
			psmt.setString(1, c.getNome());
			psmt.setString(2, c.getTelefone());
			psmt.setInt(3, c.getId());
			psmt.executeUpdate();
			psmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(Candidato c) {
		excluir(c.getId());
	}
	
	public void excluir(Integer id) {
		try {
			psmt = conn.prepareStatement(EXCLUIR);
			psmt.setInt(1, id);
		    psmt.executeUpdate();	
		    psmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private String completarSQL(Candidato filtro) {
		StringBuilder sb = new StringBuilder();
		
		if(filtro.getId() != null) {
			sb.append("  AND id = " + filtro.getId());
		}
		
		if(filtro.getNome() != null) {
			sb.append("  AND nome LIKE '%" + filtro.getNome() + "%'");
		}
		
		if(filtro.getTelefone() != null) {
			sb.append("  AND telefone = '" + filtro.getTelefone() + "'");
		}
		
		return sb.toString();
	}
	
	public List<Candidato> pesquisar(Candidato filtro) {
		List<Candidato> resposta = new ArrayList<>();
	
		try {
			psmt = conn.prepareStatement(PESQUISAR + completarSQL(filtro));
			rs = psmt.executeQuery();
			
			//Avança o ponteiro interno e retorna true se tiver 
			//dados válidos naquela linha
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String nom = rs.getString("nome");
				String tel = rs.getString("telefone");
				
				Candidato c = new Candidato(id, nom, tel);
				resposta.add(c);
			}
			
			rs.close();
			psmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return resposta;
	}
	
	public Candidato buscar(Integer id) {
		Candidato filtro = new Candidato();
		filtro.setId(id);
		
		List<Candidato> lista = pesquisar(filtro);
		
		if(lista.isEmpty()) {
			return null;
		}
		
		return lista.get(0);
	}
}






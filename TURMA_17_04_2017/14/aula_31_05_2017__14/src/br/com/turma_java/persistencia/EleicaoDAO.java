package br.com.turma_java.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.turma_java.dominio.Eleicao;
import br.com.turma_java.util.Util;

public class EleicaoDAO extends AbstratoDAO {
	private final String INSERIR = 
			"INSERT INTO Eleicao(descricao, data_iniciada, data_finalizada)" +
                            " VALUES(?, ?, ?)";
	
	private final String ATUALIZAR = "UPDATE Eleicao SET descricao=?, " +
	                        " data_iniciada=?, data_finalizada=? WHERE id=?";
	
	private final String EXCLUIR = "DELETE FROM Eleicao WHERE id=?";
	
	private final String PESQUISAR = "SELECT * FROM Eleicao WHERE 1=1";

	public EleicaoDAO(Connection conn) {
		super(conn);
	}

	public void inserir(Eleicao c) {
		try {
			psmt = conn.prepareStatement(INSERIR, PreparedStatement.RETURN_GENERATED_KEYS);
			psmt.setString(1, c.getDescricao());
			psmt.setDate(2, Util.getDateSQL( c.getDataIniciada()    ));
			psmt.setDate(3, Util.getDateSQL( c.getDataFinalizada()  ));
			psmt.executeUpdate();
			
			rs = psmt.getGeneratedKeys();
			rs.next();
			Integer id = rs.getInt(1);
			
			c.setId(id);
			
			rs.close();
			psmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void atualizar(Eleicao c) {
		try {
			psmt = conn.prepareStatement(ATUALIZAR);
			psmt.setString(1, c.getDescricao());
			psmt.setDate(2, Util.getDateSQL( c.getDataIniciada()    ));
			psmt.setDate(3, Util.getDateSQL( c.getDataFinalizada()  ));
			psmt.setInt(4, c.getId());
			psmt.executeUpdate();
			psmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(Eleicao c) {
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
	
	private String completarSQL(Eleicao filtro) {
		StringBuilder sb = new StringBuilder();
		
		if(filtro.getId() != null) {
			sb.append("  AND id = " + filtro.getId());
		}
		
		if(filtro.getDescricao() != null) {
			sb.append("  AND descricao LIKE '%" + filtro.getDescricao() + "%'");
		}
		
		if(filtro.getDataIniciada() != null) {
			sb.append("  AND data_iniciada = ?");
		}

		if(filtro.getDataFinalizada() != null) {
			sb.append("  AND data_finalizada = ?");
		}
		
		return sb.toString();
	}
	
	public List<Eleicao> pesquisar(Eleicao filtro) {
		List<Eleicao> resposta = new ArrayList<>();
	
		try {
			psmt = conn.prepareStatement(PESQUISAR + completarSQL(filtro));
			
			if(filtro.getDataIniciada() != null) {
				psmt.setDate(1,  Util.getDateSQL( filtro.getDataIniciada() )  );
			}

			if(filtro.getDataFinalizada() != null) {
				psmt.setDate(2,  Util.getDateSQL( filtro.getDataFinalizada() ) );
			}
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String des = rs.getString("descricao");
				Date   ini = rs.getDate("data_iniciada");
				Date   fim = rs.getDate("data_finalizada");
				
				Eleicao c = new Eleicao(id, des, ini, fim);
				resposta.add(c);
			}
			
			rs.close();
			psmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return resposta;
	}
	
	public Eleicao buscar(Integer id) {
		Eleicao filtro = new Eleicao();
		filtro.setId(id);
		
		List<Eleicao> lista = pesquisar(filtro);
		
		if(lista.isEmpty()) {
			return null;
		}
		
		return lista.get(0);
	}
}






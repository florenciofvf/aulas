package br.com.turma_java.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import br.com.turma_java.dominio.Candidato;
import br.com.turma_java.dominio.Eleicao;

public class CandidatoDAO extends AbstratoDAO {
	private final String INSERIR = "INSERT INTO Candidato(nome, votos, eleicao_id)" + " VALUES(?, ?, ?)";

	private final String ATUALIZAR = "UPDATE Candidato SET nome=?, " + " votos=?, eleicao_id=? WHERE id=?";

	private final String EXCLUIR = "DELETE FROM Candidato WHERE id=?";

	private final String PESQUISAR = "SELECT * FROM Candidato WHERE 1=1";

	public CandidatoDAO(Connection conn) {
		super(conn);
	}

	public void inserir(Candidato c) {
		try {
			psmt = conn.prepareStatement(INSERIR, PreparedStatement.RETURN_GENERATED_KEYS);
			psmt.setString(1, c.getNome());
			psmt.setInt(2, c.getVotos());
			psmt.setInt(3, c.getEleicao().getId());
			psmt.executeUpdate();

			rs = psmt.getGeneratedKeys();
			rs.next();
			Integer id = rs.getInt(1);

			c.setId(id);

			rs.close();
			psmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Candidato c) {
		try {
			psmt = conn.prepareStatement(ATUALIZAR);
			psmt.setString(1, c.getNome());
			psmt.setInt(2, c.getVotos());
			psmt.setInt(3, c.getEleicao().getId());
			psmt.setInt(4, c.getId());
			psmt.executeUpdate();
			psmt.close();
		} catch (Exception e) {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String completarSQL(Candidato filtro) {
		StringBuilder sb = new StringBuilder();

		if (filtro.getId() != null) {
			sb.append("  AND id = " + filtro.getId());
		}

		if (filtro.getNome() != null) {
			sb.append("  AND nome LIKE '%" + filtro.getNome() + "%'");
		}
		
		if (filtro.getEleicao() != null) {
			sb.append("  AND eleicao_id = " + filtro.getEleicao().getId());
		}

		return sb.toString();
	}

	public List<Candidato> getCanditados(Eleicao eleicao) {
		Candidato filtro = new Candidato();
		filtro.setEleicao(eleicao);

		return pesquisar(filtro);
	}

	public List<Candidato> pesquisar(Candidato filtro) {
		List<Candidato> resposta = new ArrayList<>();

		try {
			psmt = conn.prepareStatement(PESQUISAR + completarSQL(filtro));
			rs = psmt.executeQuery();

			while (rs.next()) {
				Integer id = rs.getInt("id");
				String nom = rs.getString("nome");
				Integer vot = rs.getInt("votos");

				Candidato c = new Candidato(id, nom, vot);
				resposta.add(c);
			}

			rs.close();
			psmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return resposta;
	}

	public Candidato buscar(Integer id) {
		Candidato filtro = new Candidato();
		filtro.setId(id);

		List<Candidato> lista = pesquisar(filtro);

		if (lista.isEmpty()) {
			return null;
		}

		return lista.get(0);
	}
}

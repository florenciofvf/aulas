package br.com.turma_java.servico;

import java.sql.Connection;
import java.util.List;

import br.com.turma_java.dominio.Candidato;
import br.com.turma_java.dominio.Eleicao;
import br.com.turma_java.persistencia.CandidatoDAO;
import br.com.turma_java.util.Util;

public class CandidatoServico extends AbstratoServico {

	public List<Candidato> listar() {
		Connection conn = getConnection();
		CandidatoDAO dao = new CandidatoDAO(conn);
		List<Candidato> resposta = dao.pesquisar(new Candidato());
		fecharConnection(conn);
		return resposta;
	}

	public List<Candidato> listar(Eleicao eleicao) {
		Connection conn = getConnection();
		CandidatoDAO dao = new CandidatoDAO(conn);

		Candidato filtro = new Candidato();
		filtro.setEleicao(eleicao);

		List<Candidato> resposta = dao.pesquisar(filtro);
		fecharConnection(conn);
		return resposta;
	}

	public void salvar(Candidato candidato) {
		Connection conn = getConnection();
		CandidatoDAO dao = new CandidatoDAO(conn);

		if (Util.estaNulo(candidato.getId())) {
			dao.inserir(candidato);
		} else {
			dao.atualizar(candidato);
		}

		fecharConnection(conn);
	}

	public void excluir(Candidato candidato) {
		Connection conn = getConnection();
		CandidatoDAO dao = new CandidatoDAO(conn);
		dao.excluir(candidato);
		fecharConnection(conn);
	}

}
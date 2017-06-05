package br.com.turma_java.servico;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import br.com.turma_java.dominio.Candidato;
import br.com.turma_java.dominio.Eleicao;
import br.com.turma_java.persistencia.CandidatoDAO;
import br.com.turma_java.persistencia.EleicaoDAO;
import br.com.turma_java.util.Util;

public class EleicaoServico extends AbstratoServico {

	public List<Eleicao> listar() {
		Connection conn = getConnection();
		EleicaoDAO dao = new EleicaoDAO(conn);
		List<Eleicao> resposta = dao.pesquisar(new Eleicao());
		fecharConnection(conn);
		return resposta;
	}
	
	public List<Eleicao> getFinalizadasDataAtual() {
		Connection conn = getConnection();
		EleicaoDAO dao = new EleicaoDAO(conn);
		
		Eleicao filtro = new Eleicao();
		filtro.setDataFinalizada(new Date());
		List<Eleicao> resposta = dao.pesquisar(filtro);
		
		fecharConnection(conn);
		return resposta;
	}
	
	public Eleicao getEleicao(Integer id) {
		Connection conn = getConnection();
		EleicaoDAO dao = new EleicaoDAO(conn);
		Eleicao resposta = dao.buscar(id);
		fecharConnection(conn);
		return resposta;
	}

	public Eleicao getEleicaoCompleta(Integer id) {
		Connection conn = getConnection();
		EleicaoDAO dao = new EleicaoDAO(conn);
		Eleicao resposta = dao.buscar(id);

		CandidatoDAO candidatoDAO = new CandidatoDAO(conn);
		List<Candidato> candidatos = candidatoDAO.getCanditados(resposta);
		resposta.setCandidatos(candidatos);
		
		fecharConnection(conn);
		
		return resposta;
	}
	
	public void salvar(Eleicao eleicao) {
		Connection conn = getConnection();
		EleicaoDAO dao = new EleicaoDAO(conn);
		
		if(Util.estaNulo(eleicao.getId())) {
			dao.inserir(eleicao);
		} else {
			dao.atualizar(eleicao);
		}
		
		fecharConnection(conn);
	}
	
	public void excluir(Eleicao eleicao) {
		Connection conn = getConnection();
		EleicaoDAO dao = new EleicaoDAO(conn);
		dao.excluir(eleicao);
		fecharConnection(conn);
	}
}





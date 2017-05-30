package br.com.turma_java.dao;

import java.sql.Connection;
import java.util.List;

import br.com.turma_java.conexao.FabricaConexao;
import br.com.turma_java.dominio.Candidato;
import junit.framework.TestCase;

public class CandidatoDAOTest extends TestCase {
	private Connection conn;
	
	@Override
	protected void setUp() throws Exception {
		conn = FabricaConexao.getConnectionMySQL();
	}

	@Override
	protected void tearDown() throws Exception {
		conn.close();
	}

	public void testSelecionarRegistros() {
		CandidatoDAO dao = new CandidatoDAO(conn);
		
		List<Candidato> lista = dao.pesquisar(new Candidato());
		
		for(Candidato c : lista) {
			System.out.println("========================");
			System.out.println("  ID=" + c.getId());
			System.out.println("NOME=" + c.getNome());
			System.out.println("FONE=" + c.getTelefone());
		}
	}
	
//	public void testInserir() {
//		CandidatoDAO dao = new CandidatoDAO(conn);
//		Candidato c = new Candidato(null, "Antonio", "444");
//		dao.inserir(c);
//		System.out.println("ID=" + c.getId() );
//	}
	
//	public void testAtualizar() {
//		CandidatoDAO dao = new CandidatoDAO(conn);
//		
//		Candidato maria = dao.buscar(1);
//		maria.setNome("Maria da Silva");
//		dao.atualizar(maria);
//	}
}





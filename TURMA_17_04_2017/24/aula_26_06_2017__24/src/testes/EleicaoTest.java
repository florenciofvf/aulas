package testes;

import java.util.List;

import javax.persistence.Query;

import br.com.turma_java.Eleicao;

public class EleicaoTest extends AbstractTest {

	public void testExibirElecoes() {
		String jpaQL = "select obj from Eleicao obj";
		Query query = manager.createQuery(jpaQL);
		
		List<Eleicao> eleicoes = query.getResultList();
		
		for(Eleicao e : eleicoes) {
			System.out.println(e.getDescricao());
		}
	}
	
}
package testes;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.turma_java.Eleicao;

public class EleicaoTest extends AbstractTest {

	public void testExibirElecoes() {
		String jpaQL = "select obj from Eleicao obj";
		Query query = manager.createQuery(jpaQL);
		
		List<Eleicao> eleicoes = query.getResultList();
		
		for(Eleicao e : eleicoes) {
			System.out.println(e.getId() + ">>" + e.getDescricao());
		}
	}
	
	public void testAlteracao() {
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		Eleicao e = manager.find(Eleicao.class, 44);
		e.setDescricao("TESTE ALTERACAO 44");
		transaction.commit();
	}
	
	public void testExclusao() {
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		Eleicao e = manager.find(Eleicao.class, 44);
		manager.remove(e);
		transaction.commit();
	}
	
	public void testInclusao() {
		EntityTransaction transaction = manager.getTransaction();
		
		Eleicao e = new Eleicao();
		e.setDescricao("Eleição de teste (JPA)");
		
		transaction.begin();
		manager.persist(e);
		transaction.commit();
	}
	
}
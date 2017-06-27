package testes;

import javax.persistence.EntityTransaction;

import br.com.turma_java.Candidato;
import br.com.turma_java.Eleicao;

public class CandidatoTest extends AbstractTest {

//	public void testCandidatosDaEleicao() {
//		Eleicao e = manager.find(Eleicao.class, 1);
//
//		for(Candidato c : e.getCandidatos()) {
//			System.out.println(c.getNome());
//		}
//	}
	
	public void testInclusao() {
		Eleicao e = new Eleicao();
		e.setDescricao("Eleição 777");
		
		Candidato c1 = new Candidato();
		c1.setNome("C1");
		c1.setVotos(0);

		Candidato c2 = new Candidato();
		c2.setNome("C2");
		c2.setVotos(0);
		
		e.adicionar(c1);
		e.adicionar(c2);
		
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(e);
		transaction.commit();
	}

}
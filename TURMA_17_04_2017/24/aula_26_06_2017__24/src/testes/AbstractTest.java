package testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import junit.framework.TestCase;

public class AbstractTest extends TestCase {
	protected EntityManagerFactory factory;
	protected EntityManager manager;
	
	@Override
	protected void setUp() throws Exception {
		factory = Persistence.createEntityManagerFactory("eleicaoPU");
		manager = factory.createEntityManager();
	}
	
	@Override
	protected void tearDown() throws Exception {
		manager.close();
		factory.close();
	}
}
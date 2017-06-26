package br.com.turma_java;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main01 {

	public static void main(String[] args) {
		EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("eleicaoPU");

		EntityManager manager = factory.createEntityManager();
		
		String jpaQL = "select obj from Eleicao obj";
		Query query = manager.createQuery(jpaQL);
		
		List<Eleicao> eleicoes = query.getResultList();
		
		for(Eleicao e : eleicoes) {
			System.out.println(e.getDescricao());
		}
		
		manager.close();
		factory.close();
	}

}

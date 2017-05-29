package br.com.turma_java.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.turma_java.dominio.Candidato;

public class CandidatoDAO extends AbstratoDAO {

	public CandidatoDAO(Connection conn) {
		super(conn);
	}

	public void inserir(Candidato c) {
	}
	
	public void atualizar(Candidato c) {
	}
	
	public void excluir(Candidato c) {
		excluir(   c.getId()   );
	}
	
	public void excluir(Integer id) {
	}
	
	public List<Candidato> pesquisar(Candidato filtro) {
		List<Candidato> resposta = new ArrayList<>();
		
		
		return resposta;
	}
	
	public Candidato buscar(Integer id) {
		Candidato filtro = new Candidato();
		filtro.setId(id);
		
		List<Candidato> lista = pesquisar(filtro);
		
		if(lista.isEmpty()) {
			return null;
		}
		
		return lista.get(0);
	}
}






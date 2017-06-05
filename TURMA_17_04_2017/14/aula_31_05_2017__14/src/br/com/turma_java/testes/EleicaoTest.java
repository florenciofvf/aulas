package br.com.turma_java.testes;

import java.util.List;

import br.com.turma_java.dominio.Eleicao;
import br.com.turma_java.servico.EleicaoServico;
import junit.framework.TestCase;

public class EleicaoTest extends TestCase {

	public void testEleicao() {
		EleicaoServico servico = new EleicaoServico();
		
		Eleicao e = new Eleicao();
		e.setDescricao("Quem vai ganhar a copa do mundo de 2018?");
		
		servico.salvar(e);
		
		List<Eleicao> lista = servico.listar();
		imprimir(lista);
	}
	
	private void imprimir(List<Eleicao> lista) {
		for(Eleicao e : lista) {
			System.out.println(e.getId() + ": " + e.getDescricao());
		}
	}
}
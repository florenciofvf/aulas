package br.com.turma_java.testes;

import br.com.turma_java.dominio.Candidato;
import br.com.turma_java.dominio.Eleicao;
import br.com.turma_java.servico.CandidatoServico;
import br.com.turma_java.servico.EleicaoServico;
import junit.framework.TestCase;

public class CandidatoTest extends TestCase {

	public void testCandidato() {
		EleicaoServico eleicaoServico = new EleicaoServico();
		CandidatoServico candidatoServico = new CandidatoServico();
		
		Eleicao eleicao = eleicaoServico.getEleicao(1);
		
		Candidato c1 = new Candidato(null, "Brasil", null);
		Candidato c2 = new Candidato(null, "Portugal", null);
		
		c1.setEleicao(eleicao);
		c2.setEleicao(eleicao);
		
		candidatoServico.salvar(c1);
		candidatoServico.salvar(c2);
		
		c1.somarVoto();
		candidatoServico.salvar(c1);
	}
	
}

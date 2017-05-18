package br.com.turma_java.eleicao.teste;

import br.com.turma_java.eleicao.Candidato;
import br.com.turma_java.eleicao.Eleicao;
import br.com.turma_java.eleicao.impl.CandidatoImpl;
import br.com.turma_java.eleicao.impl.EleicaoImpl;

public class Main {

	public static void main(String[] args) {
		Eleicao e = new EleicaoImpl("Eleição de teste", "17/04/2017");
		
		Candidato c1 = new CandidatoImpl();
		c1.setNumero(245);
		e.adicionarCandidato(c1);

		Candidato c2 = new CandidatoImpl();
		c2.setNumero(789);
		e.adicionarCandidato(c2);	
		
		e.iniciarVotacao();
		c1.somarVoto();
		
		System.out.println(e.getTotalVotos()); 
	}
	
}
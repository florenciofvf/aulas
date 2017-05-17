package br.com.turma_java.eleicao.impl;

import br.com.turma_java.eleicao.Candidato;
import br.com.turma_java.eleicao.Eleicao;

public class EleicaoImpl implements Eleicao {

	@Override
	public String getData() {
		return null;
	}

	@Override
	public String getDescricao() {
		return null;
	}

	@Override
	public void setDescricao(String descricao) {
	}

	@Override
	public void adicionarCandidato(Candidato c) {
	}

	@Override
	public void excluirCandidato(Candidato c) {
	}

	@Override
	public int getTotalVotos() {
		return 0;
	}

	@Override
	public Candidato[] getCandidatos() {
		return null;
	}

	@Override
	public Candidato getCandidato(int numero) {
		return null;
	}

	@Override
	public void fecharVotacao() {
	}

	@Override
	public void iniciarEdicao() {
	}

	@Override
	public void iniciarVotacao() {
	}

	@Override
	public boolean isIniciadaVotacao() {
		return false;
	}

	@Override
	public boolean isFinalizada() {
		return false;
	}

	@Override
	public boolean isEdicao() {
		return false;
	}
}
package br.com.turma_java;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private int idade;
	private List<ObservadorCliente> observadores;
	private List<Memento> mementos;
	
	public Cliente() {
		observadores = new ArrayList<>();
		mementos = new ArrayList<>();
	}

	public void registrarObservador(ObservadorCliente observador) {
		if(observador != null) {
			observadores.add(observador);
		}
	}
	
	public void excluirObservador(ObservadorCliente observador) {
		observadores.remove(observador);
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		int bkp = this.idade;
		mementos.add(  new Memento(this.idade)  );
		this.idade = idade;
		notificarObservadores(bkp, this.idade);
	}

	private void notificarObservadores(int anterior, int nova) {
		for(ObservadorCliente obs : observadores) {
			obs.idadeAlterada(anterior, nova);
		}
	}
	
	public void desfazerAlteracaoIdade() {
		if(mementos.isEmpty()) {
			return;
		}
		
		Memento m = mementos.remove( mementos.size() - 1);
		m.restaurar();
	}
	
	private class Memento {
		int valor;
		
		Memento(int idade) {
			valor = idade;
		}
		
		void restaurar() {
			idade = valor;
		}
	}
}
package br.com.turma_java.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.turma_java.dominio.Cliente;

public class ManterClienteAction {
	private Cliente cliente;
	
	public Cliente getCliente() {
		if(cliente == null) {
			cliente = new Cliente();
		}
		
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String salvar() {
		try {
			//ClienteServico.salvarCliente(getCliente());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return "sucesso";
	}
	
	public String execute() {
		return "sucesso";
	}
	
	public List<String> getSexos() {
		return new ArrayList<String>( Arrays.asList("M", "F") );
	}
	
	public List<Cliente> getClientes() {
		List<Cliente> listagem = new ArrayList<>();
		return listagem;
		
//		try {
//			//return ClienteServico.pesquisarCliente(null);
//		} catch(Exception e) {
//			e.printStackTrace();
//			return new ArrayList<Cliente>();
//		}		
	}
	
}
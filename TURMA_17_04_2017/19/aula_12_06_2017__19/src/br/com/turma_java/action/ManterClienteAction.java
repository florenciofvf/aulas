package br.com.turma_java.action;

import java.util.ArrayList;
import java.util.List;

import br.com.turma_java.dominio.Cliente;

public class ManterClienteAction {
	private List<Cliente> clientes;
	              
	public String processar() {
		clientes = new ArrayList<>();
		
		clientes.add(new Cliente("Maria da Silva",     "maria@maria.com.br"    ));
		clientes.add(new Cliente("Carlos José",        "carlos@carlos.com.br"  ));
//		clientes.add(new Cliente("Francisco da Silva", "francisco@teste.com.br"));
//		clientes.add(new Cliente("Antonio Vieira",     "antonio@teste.com.br"  ));
//		clientes.add(new Cliente("Marta Oliveira",     "marta@marta.com.br"    ));
		
		return "sucesso";
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
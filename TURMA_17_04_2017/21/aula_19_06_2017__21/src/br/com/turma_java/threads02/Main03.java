package br.com.turma_java.threads02;

public class Main03 {

	public static void main(String[] args) throws Exception {
		Pessoa p = new Pessoa("Antonio da Silva");
		
		new Thread(new ManipularPessoa(p)).start();
		new Thread(new ManipularPessoa(p)).start();
		new Thread(new ManipularPessoa(p)).start();
		new Thread(new ManipularPessoa(p)).start();
		new Thread(new ManipularPessoa(p)).start();
		new Thread(new ManipularPessoa(p)).start();
		new Thread(new ManipularPessoa(p)).start();
		
		System.out.println("Fim");
		
		Thread.sleep(3000);

		synchronized(p) {
			p.notify();
		}
	}
}

class ManipularPessoa implements Runnable {
	Pessoa p;
	ManipularPessoa(Pessoa pessoa) { p = pessoa; }
	public void run() {
		p.imprimirNome();
	}
}

class Pessoa {
	String nome;
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
    synchronized void imprimirNome() {
    	try {
    		System.out.println("GUARDANDO: " + Thread.currentThread().getName());
			wait();
		} catch (InterruptedException e) { e.printStackTrace(); }
		System.out.println("FINALIZANDO: " + Thread.currentThread().getName());
    	System.out.println(nome);
	}
}





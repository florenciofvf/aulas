package br.com.turma_java.threads;

//Thread: Linha de execução em um processo.
//Escalonador de Threads: Gerenciador das Threads
public class Main02 {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Início");
		
		Thread.sleep(5000);
		
		System.out.println("Fim");
	}
	
}

package br.com.turma_java.threads;

//Thread: Thread t = new Thread();

//thread: 
public class Main01 {
	
	public static void main(String[] args) throws Exception {
		System.out.println("Início");
		 //Recupera a referência a thread que está executando o método
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		new Teste(); new Teste(); new Teste(); new Teste(); new Teste();
		System.gc();
		System.out.println("Fim");
	}
	
	static class Teste {
		
		@Override
		public void finalize() {
			Thread t = Thread.currentThread();
			System.out.println(t.getName());
		}
	}
}





package br.com.turma_java.threads02;

public class Main02 {

	public static void main(String[] args) {
		System.out.println("Início");
		
		new MinhaThread().start();
		new MinhaThread().start();
		new MinhaThread().start();
		new MinhaThread().start();
		new MinhaThread().start();
		new MinhaThread().start();
		new MinhaThread().start();
		new MinhaThread().start();
		new MinhaThread().start();
		
		System.out.println("Fim");
	}
	
	public static void executarLoop() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}












class MinhaThread extends Thread {
	@Override
	public void run() {
		Main02.executarLoop();
	}
}


package br.com.turma_java.threads02;

public class Main01 {

	public static void main(String[] args) {
		System.out.println("Início");
		
		Trabalho t = new Trabalho();

		new Thread(t, "T-1").start();
		new Thread(t, "T-2").start();
		new Thread(t, "T-3").start();
		new Thread(t, "T-4").start();
		new Thread(t, "T-5").start();
		new Thread(t, "T-6").start();
		new Thread(t, "T-7").start();
		new Thread(t, "T-8").start();
		
		Thread t9 = new Thread(t, "T-9");
		t9.setPriority(Thread.MAX_PRIORITY);
		t9.start();
		
		System.out.println("Fim");
	}
}












class Trabalho implements Runnable {
	
	@Override
	public void run() {
		for(int i=1; i<=1_000_000_000; i++) {
			if(i % 1_000_000 == 0) {
				System.out.println(i);
				System.out.println( Thread.currentThread().getName() );
			}
		}
	}
	
}






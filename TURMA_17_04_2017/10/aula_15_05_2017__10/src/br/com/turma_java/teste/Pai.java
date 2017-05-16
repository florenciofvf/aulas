package br.com.turma_java.teste;

public class Pai {

	public void msg1() {
		System.out.println("PAI");
	}
	
	public void msg2() {
		msg1();
	}
	
	public static void main(String[] args) {
		Pai p = new Pai();
		p.msg2(); //PAI     //pai
		p.msg1(); //PAI     //pai
		
		Pai q = new Filho();
		q.msg2(); //PAI     //filho
		q.msg1(); //PAI     //filho
		
		Filho f = new Filho();
		f.msg2(); //PAI    //filho
		f.msg1(); //FILHO  //filho
	}
}



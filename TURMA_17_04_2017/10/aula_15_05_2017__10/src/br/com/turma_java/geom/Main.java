package br.com.turma_java.geom;

public class Main {

	public static void main(String[] args) {

		Retangulo r = new Retangulo();
		r.setDescricao("Retângulo");
		r.setLargura(100);
		r.setAltura(50);
		
		imprimirArea(r);
		
		Quadrado q = new Quadrado();
		q.setDescricao("Quadrado");
		q.setLado(30);
		imprimirArea(q);
		
		//ObjetoGeometrico o = new Retangulo();
		
		imprimirArea(new ObjetoGeometrico());
	}
	
	public static void imprimirArea(ObjetoGeometrico og) {
		System.out.println(og.getDescricao() + " = " +  og.calcularArea()  );
	}
}
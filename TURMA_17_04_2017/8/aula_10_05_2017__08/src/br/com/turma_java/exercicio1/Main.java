package br.com.turma_java.exercicio1;

//FINALIZE A CLASSE RETÂNGULO
public class Main {

	public static void main(String[] args) {
		Circulo c = new Circulo();
		c.setRaio(17);

		System.out.println("Área do círculo: " + c.calcularArea());

		Retangulo r = new Retangulo();
		r.setLargura(100);
		r.setAltura(50);
		System.out.println("Área do retângulo: " + r.calcularArea());
	}

}
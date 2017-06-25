package parametro;

import javax.swing.JButton;

public class Main {

	public static void main(String[] args) {
		Teste<String, Double> t = new Teste<String, Double>("Maria", 65.0);
		
		t.setOutro(50.3);
		t.setValor("Escola");
		
		System.out.println(t.getValor());
	}

	interface Conteiner<O extends JButton> {
		public void adicionar(O o);
		
		public void excluir(O o);
		
		public int getTamanho();
	}
	
	class ConteinerImpl<O extends JButton> implements Conteiner<O> {
		@Override
		public void adicionar(O o) {
		}

		@Override
		public void excluir(O o) {
		}

		@Override
		public int getTamanho() {
			return 0;
		}		
	}
}
package br.com.turma_java.janelas;

public class SimulaGerenciaJanela {

	public static void main(String[] args) {
		
		Form[] janelas = {
				new Calc(), new Calendario(), 
				new Notepad(), new Calc() 
		};
		
		for(Form f : janelas) {
			f.desenhar();
		}
		
		Form f = janelas[0];
		f.desenhar();
		
		f = janelas[3];
		f.desenhar();
	}

}

public class DemoLampada {

	public static void main(String[] args) {
		Lâmpada x; //Declaranco uma variável para manipular o objeto "Referência"
		
		x = new Lâmpada(); //Recendo a referência ao objeto
		
		x.mostrarEstado(); //Invocando o comportamento mostrarEstado. Resposta: APAGADA
		
		x.acender(); //Invocando outra operação
		
		x.mostrarEstado(); //Resposta: ACESA
		
		Lâmpada y = x; //Outra declaração de variável
		
		y.mostrarEstado(); //Resposta: ACESA
		
		y.apagar();
		
		x.mostrarEstado(); //Resposta: APAGADA
		
		x = new Lâmpada();
		x.acender();
		y.mostrarEstado(); //Resposta: APAGADA
	}

}




public class DemoLampada {

	public static void main(String[] args) {
		Lampada x; //Declaranco uma variável para manipular o objeto "Referência"
		
		x = new Lampada(); //Recendo a referência ao objeto
		
		x.mostrarEstado(); //Invocando o comportamento mostrarEstado. Resposta: APAGADA
		
		x.acender(); //Invocando outra operação
		
		x.mostrarEstado(); //Resposta: ACESA
		
		Lampada y = x; //Outra declaração de variável
		
		y.mostrarEstado(); //Resposta: ACESA
		
		y.apagar();
		
		x.mostrarEstado(); //Resposta: APAGADA
		
		x = new Lampada();
		x.acender();
		y.mostrarEstado(); //Resposta: APAGADA
	}

}



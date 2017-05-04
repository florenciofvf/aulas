
public class ContaSimples {
	private float saldo;
	
	public void depositar(float valor) {
		if(valor > 0) {
			saldo += valor;
		}
	}

	public float sacar(float valor) {
		
		if(valor <= saldo) {
			saldo -= valor;
			return valor;
		}
		
		return 0;
	}
	
	public void mostrarDadosDaConta() {
		System.out.println("====(DADOS DA CONTA)====");
		System.out.printf("SALDO R$ %.2f \n", saldo);
	}
}
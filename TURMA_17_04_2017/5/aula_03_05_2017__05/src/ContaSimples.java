
public class ContaSimples {
	private float saldo;
	private float limite;
	
	public void depositar(float valor) {
		if(valor > 0) {
			saldo += valor;
		}
	}

	public void tornarEspecial() {
		limite = 1000;
	}
	
	public float sacar(float valor) {
		
		if(valor <= saldo + limite) {
			saldo -= valor;
			return valor;
		}
		
		return 0;
	}
	
	public void mostrarDadosDaConta() {
		System.out.println("====(DADOS DA CONTA)====");
		System.out.printf("SALDO R$ %.2f \n", saldo);
		if(limite > 0) {
			System.out.println("CONTA ESPECIAL");
			System.out.printf("LIMITE R$ %.2f \n", limite);
			System.out.printf("DISPONÍVEL PARA SAQUE R$ %.2f \n", saldo + limite);
		}
	}
}
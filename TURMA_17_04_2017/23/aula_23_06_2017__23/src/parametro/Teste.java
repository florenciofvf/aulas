package parametro;

public class Teste<X, Y> {
	private X valor;
	private Y outro;

	public Teste(X valor, Y outro) {
		this.valor = valor;
		this.outro = outro;
	}

	public X getValor() {
		return valor;
	}

	public void setValor(X valor) {
		this.valor = valor;
	}

	public Y getOutro() {
		return outro;
	}

	public void setOutro(Y outro) {
		this.outro = outro;
	}
}
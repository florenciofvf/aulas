package exemplo02;

public class CalcularAction {
	private Double valor1;
	private Double valor2;
	private Double valor3;
	private Double total;
	
	public String execute() {
		total = (valor1 + valor2 + valor3) / 3;
		
		return "sucesso";
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Double getValor3() {
		return valor3;
	}

	public void setValor3(Double valor3) {
		this.valor3 = valor3;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
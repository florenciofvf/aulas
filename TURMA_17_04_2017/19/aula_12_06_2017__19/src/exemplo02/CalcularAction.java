package exemplo02;

public class CalcularAction {
	private Integer valor1;
	private Integer valor2;
	private Integer total;
	
	public String execute() {
		total = valor1 + valor2;
		
		return "sucesso";
	}
	
	public Integer getTotal() {
		return total;
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}
	
}
package br.com.turma_java.exercicio8;

public class Relogio {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public void incrementarSegundos() {
		
	}
	
	public String getHoraFormatada() {
		return get(hora) + ":" + get(minuto) + ":" + get(segundo);
	}
	
	private String get(int i) {
		return i < 10 ? "0" + i : "" + i;
	}
}
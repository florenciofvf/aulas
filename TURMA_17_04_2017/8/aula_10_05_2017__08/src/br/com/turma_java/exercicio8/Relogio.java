package br.com.turma_java.exercicio8;

public class Relogio {
	private int hora;
	private int minuto;
	private int segundo;
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora >= 0 & hora <= 23) {
			this.hora = hora;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto >= 0 & minuto <= 59) {
			this.minuto = minuto;
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo >= 0 & segundo <= 59) {
			this.segundo = segundo;
		}
	}

	public void incrementarSegundos() {
		segundo++;
		
		if(segundo > 59) {
			segundo = 0;
			incrementarMinuto();
		}
	}
	
	private void incrementarMinuto() {
		minuto++;
		
		if(minuto > 59) {
			minuto = 0;
			incrementarHora();
		}
	}
	
	private void incrementarHora() {
		hora++;
		
		if(hora > 23) {
			hora = 0;
		}
	}
	
	public String getHoraFormatada() {
		return get(hora) + ":" + get(minuto) + ":" + get(segundo);
	}
	
	private String get(int i) {
		return i < 10 ? "0" + i : "" + i;
	}
	
}








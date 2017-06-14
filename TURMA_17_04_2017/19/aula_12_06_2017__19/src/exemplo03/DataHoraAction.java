package exemplo03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataHoraAction {

	public String execute() {
		System.out.println("execute()");
		return "sucesso";
	}
	
	public String getDataHora() {
		String mascara = "dd/MM/yyyy - HH:mm:ss";
		DateFormat formatador = new SimpleDateFormat(mascara);
		return formatador.format(new Date());
	}
	
}

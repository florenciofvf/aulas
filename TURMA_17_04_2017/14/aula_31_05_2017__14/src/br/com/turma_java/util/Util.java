package br.com.turma_java.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Util {
	private static DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	private Util() {
	}

	public static String formatar(Date date) {
		if(estaNulo(date)) {
			return "";
		}
		
		return format.format(date);
	}
	
	public static Date parseDate(String data) {
		if(estaVazio(data)) return null;
		
		try {
			Date d = format.parse(data);
			return d;
		} catch(Exception e) {
			throw new IllegalArgumentException(Mensagens.getString("data.invalida"));
		}
	}
	
	public static java.sql.Date getDateSQL(java.util.Date data) {
		if(estaNulo(data)) return null;
		
		return new java.sql.Date(  data.getTime()  );
	}
	
	public static boolean estaNulo(Object objeto) {
		return objeto == null;
	}
	
	public static boolean estaVazio(Object objeto) {
		if(estaNulo(objeto)) return true;
		
		if(objeto instanceof String) {
			return ((String)objeto).trim().length() == 0;
		}
		
		return objeto.toString().length() == 0;
	}
}
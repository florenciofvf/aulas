package br.com.turma_java.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Util {
	private DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	private Util() {
	}

	public static String formatar(Date date) {
		return null;
	}
	
	public static Date parseDate(String data) {
		return null;
	}
	
	public static java.sql.Date getDateSQL(java.util.Date data) {
		return null;
	}
	
	public static boolean ehNulo(Object objeto) {
		return false;
	}
	
	public static boolean ehVazio(Object objeto) {
		if(ehNulo(objeto)) return true;
		
		if(objeto instanceof String) {
			return ((String)objeto).trim().length() == 0;
		}
		
		return false;
	}
}
package br.com.turma_java.persistencia;

import java.lang.reflect.Field;

public class CrudDAO {

	public void salvar(Object objeto) {
		
	}
	
	public String gerarSQLInsert(Object objeto) throws Exception {
		Class<?> classe = objeto.getClass();
		
		Tabela tabela = classe.getAnnotation(Tabela.class);
		
		if(tabela == null) {
			return "";
		}
		
		StringBuilder sbInsert = new StringBuilder();
		StringBuilder sbValues = new StringBuilder();
		
		sbInsert.append("INSERT INTO ");
		sbInsert.append("".equals(tabela.nome()) ? 
				classe.getSimpleName() : tabela.nome());
		sbInsert.append("(");
		
		sbValues.append(" VALUES(");
		
		Field[] campos = classe.getDeclaredFields();
		int camposAnotados = 0;
		for(Field f : campos) {
			Campo campo = f.getDeclaredAnnotation(Campo.class);
			if(campo == null) {
				continue;
			}

			if(camposAnotados > 0) {
				sbInsert.append(", ");
				sbValues.append(", ");
			}
			
			sbInsert.append("".equals(campo.nome()) ? 
					f.getName() : campo.nome());
			sbValues.append("?");
			
			camposAnotados++;
		}
		
		if(camposAnotados == 0) {
			return "";
		}
		
		return sbInsert.append(") ").toString() +
				sbValues.append(")").toString();
	}
}
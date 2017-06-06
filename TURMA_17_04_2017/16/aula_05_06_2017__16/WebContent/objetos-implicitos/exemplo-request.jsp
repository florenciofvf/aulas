<%@page import="br.com.turma_java.util.TabelaHTML"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	</head>
	
	<body>

		<%
			String nome = request.getParameter("n");
		
			TabelaHTML tabela = new TabelaHTML();
			tabela.setBorda(1);
			tabela.setLargura(100);
			
			tabela.setQtdLinhas(1);
			tabela.setQtdColunas(1);
			
			String linhas = request.getParameter("qtdLinhas");
			if(linhas != null) {
				tabela.setQtdLinhas(Integer.parseInt(linhas));
			}

			String colunas = request.getParameter("qtdColunas");
			if(colunas != null) {
				tabela.setQtdColunas(Integer.parseInt(colunas));
			}
		%>	
	
		<%= tabela.gerarHtml() %>
	
		<%=  nome  %>
	
	</body>
</html>
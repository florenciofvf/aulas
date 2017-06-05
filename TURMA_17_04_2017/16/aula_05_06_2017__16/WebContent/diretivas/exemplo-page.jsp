<%@page import="br.com.turma_java.util.TabelaHTML"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	</head>

	<body>

		<%
			TabelaHTML tabela = new TabelaHTML();
			tabela.setBorda(1);
			tabela.setAlinhamento("right");
			tabela.setLargura(60);
			tabela.setQtdLinhas(39);
			tabela.setQtdColunas(5);
		%>
		
		<%= tabela.gerarHtml() %>
	
	</body>
</html>
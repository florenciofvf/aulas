
<%@page import="br.com.turma_java.contador.Contador"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	</head>
	
	<body>

		<%
			//pageContext, request, session, application
			
			Contador contador = (Contador)session.getAttribute("count");
		
			if(contador == null) {
				contador = new Contador(1);
				session.setAttribute("count", contador);
			} else {
				contador.incrementarValor();
			}
		%>
		
		TOTAL DE ACESSOS: <%= contador.getValor() %>

	</body>
</html>
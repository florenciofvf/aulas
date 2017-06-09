<%@page import="br.com.turma_java.dominio.Eleicao"%>
<%@page import="java.util.List"%>
<%@page import="br.com.turma_java.servico.EleicaoServico"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	</head>
	<body>
		<%
			EleicaoServico servico = new EleicaoServico();
			List<Eleicao> eleicoes = servico.listar();
		%>
		
		<table align="center" border="1" width="75%">
			<tr>
				<th>ID</th>
				<th>DESCRIÇÃO</th>
				<th>OPÇÕES</th>
			</tr>
			<% 
			   for(Eleicao e : eleicoes) {  
			      pageContext.setAttribute("obj", e);
			%>
			      <tr>
			           <td> ${obj.id}        						   </td>
			           <td> ${obj.descricao} 						   </td>
			           <td> <a href="votar.jsp?id=${obj.id}">Votar</a> </td>
				  </tr>
			<% } %>
		</table>
		
	
	</body>
</html>
<%@page import="br.com.turma_java.dominio.Eleicao"%>
<%@page import="br.com.turma_java.servico.EleicaoServico"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	</head>
	<body>
		<jsp:include page="/menu-principal.jsp" />
	
		<%
			EleicaoServico servico = new EleicaoServico();
			
			String id = request.getParameter("id");
			
			Eleicao eleicao = new Eleicao();
			eleicao.setId(Integer.parseInt(id));
			
			servico.excluir(eleicao);
		%>

	    Registro excluído com sucesso!
	
	</body>
</html>
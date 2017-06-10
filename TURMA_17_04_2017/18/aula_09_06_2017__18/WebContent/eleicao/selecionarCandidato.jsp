<%@page import="br.com.turma_java.dominio.Candidato"%>
<%@page import="br.com.turma_java.dominio.Eleicao"%>
<%@page import="br.com.turma_java.servico.EleicaoServico"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>

	<%
		EleicaoServico servico = new EleicaoServico();
		String id = request.getParameter("id");
		Eleicao e = servico.getEleicaoCompleta(Integer.parseInt(id));
		session.setAttribute("eleicaoSelecionada", e);
	%>

<form action="recebeVoto.jsp" method="post">
	<table border="1" width="100%">
		<tr>
			<th>CANDIDATO</th>
		</tr>
		<%
			for (Candidato c : e.getCandidatos()) {
				pageContext.setAttribute("c", c);
		%>
		<tr>
			<td>
				<input type="radio" name="opcao" value="${c.id}">${c.nome}
			</td>
		</tr>
		<%
			}
		%>
	</table>
	<input type="submit" value="Votar">
</form>

</body>
</html>
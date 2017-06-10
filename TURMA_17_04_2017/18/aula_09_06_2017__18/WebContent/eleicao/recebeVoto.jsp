<%@page import="br.com.turma_java.dominio.Candidato"%>
<%@page import="br.com.turma_java.dominio.Eleicao"%>
<%@page import="br.com.turma_java.servico.CandidatoServico"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>

	<%
		Eleicao e = (Eleicao) session.getAttribute("eleicaoSelecionada");
	
		CandidatoServico servico = new CandidatoServico();
		String idCandidato = request.getParameter("opcao");
		
		if(idCandidato != null && idCandidato.length() > 0) {
			Candidato c = e.getCandidato( Integer.parseInt(idCandidato) );
			
			if(c != null && c.somarVoto()) {
				servico.salvar(c);
			}
		}
	%>

	<table border="1" width="100%">
		<tr>
			<th>NOME</th>
			<th>GRÁFICO</th>
			<th>VOTOS</th>
			<th>PORCENTAGEM</th>
		</tr>
		<%
			for (Candidato c : e.getCandidatos()) {
				pageContext.setAttribute("c", c);
		%>
		<tr>
			<td>${c.nome}</td>
			<td>
				<hr align="left" size="10" color="blue" width="${c.porcentagemVotos}%">
			</td>
			<td width="15px">${c.votos}</td>
			<td width="15px">${c.porcentagemVotos}%</td>
		</tr>
		<%
			}
		%>
	</table>
    TOTAL DE VOTOS = <%= e.getTotalVotos() %>
</body>
</html>
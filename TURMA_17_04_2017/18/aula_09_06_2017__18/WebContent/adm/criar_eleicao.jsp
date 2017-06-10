<%@page import="java.util.Date"%>
<%@page import="br.com.turma_java.servico.CandidatoServico"%>
<%@page import="br.com.turma_java.dominio.Eleicao"%>
<%@page import="br.com.turma_java.dominio.Candidato"%>
<%@page import="br.com.turma_java.servico.EleicaoServico"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	</head>
	<body>
	
		<%
			EleicaoServico servico = new EleicaoServico();
			Eleicao eleicao = new Eleicao();
			eleicao.setDescricao("Qual a linguagem de programação mais fácil?");
			eleicao.setDataIniciada(new Date());
			servico.salvar(eleicao);
			
			CandidatoServico servicoCandidato = new CandidatoServico();
			Candidato candidato = null;
			
			candidato = new Candidato();
			candidato.setNome("C");
			candidato.setEleicao(eleicao);
			servicoCandidato.salvar(candidato);
			
			candidato = new Candidato();
			candidato.setNome("C++");
			candidato.setEleicao(eleicao);
			servicoCandidato.salvar(candidato);

			candidato = new Candidato();
			candidato.setNome("PHP");
			candidato.setEleicao(eleicao);
			servicoCandidato.salvar(candidato);

			candidato = new Candidato();
			candidato.setNome("JAVA");
			candidato.setEleicao(eleicao);
			servicoCandidato.salvar(candidato);
		%>
	
		Salvo com sucesso!
	</body>
</html>
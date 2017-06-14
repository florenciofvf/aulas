<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
	</head>
	<body>
	
    <s:a namespace="/exemplo01" action="OlaMundo">Mensagem</s:a>     <br>
	
    <s:a namespace="/exemplo02" action="Somar">Formulário</s:a>      <br>
				
    <s:a namespace="/exemplo03" action="DataHora">Interceptador</s:a> <br>

    <s:a namespace="/cliente" action="ManterCliente" method="processar">Cadastro</s:a> 
			
	</body>
</html>
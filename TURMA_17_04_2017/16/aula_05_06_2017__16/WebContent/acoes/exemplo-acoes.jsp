<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id="t" class="br.com.turma_java.util.TabelaHTML" />

<jsp:setProperty property="borda" name="t" value="1"/>
<jsp:setProperty property="largura" name="t" value="50"/>

<jsp:setProperty property="qtdLinhas" name="t" value="40"/> 
<jsp:setProperty property="qtdColunas" name="t" value="4"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	</head>
	<body>

		<jsp:getProperty property="html" name="t"/>
	
	</body>
</html>
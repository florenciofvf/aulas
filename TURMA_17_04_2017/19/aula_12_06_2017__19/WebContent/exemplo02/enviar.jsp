<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	</head>
	<body>
			
		<s:form method="post" namespace="/exemplo02" action="Calcular">
		
			<s:textfield name="valor1" label="Valor1" />
			<s:textfield name="valor2" label="Valor2" />
		
			<s:submit value="Somar" />
		</s:form>

	</body>
</html>
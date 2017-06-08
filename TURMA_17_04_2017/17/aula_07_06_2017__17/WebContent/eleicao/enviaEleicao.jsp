<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	</head>
	<body>
		<jsp:include page="/menu-principal.jsp" />
	
		<form action="cadastraEleicao.jsp" method="post">
		
			DESCRIÇÃO<input name="descricao"> <br>
		
			<input type="submit" value="Incluir">
		
		</form>
	
	
	</body>
</html>
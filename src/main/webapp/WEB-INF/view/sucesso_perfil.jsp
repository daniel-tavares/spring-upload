<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Upload sucesso</title>
</head>
<body>

		 Seu arquivo foi enviado com sucesso: <strong>${nomeArquivo}</strong>
		<br/><br/>
		<a href="<c:url value='/inicio' />">inico</a>	
</body>
</html>
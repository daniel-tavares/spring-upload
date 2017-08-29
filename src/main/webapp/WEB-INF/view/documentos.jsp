<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
</head>
<body> 

	<div class="form-container">
		<h1>Upload de documentos</h1>
		<form:form method="POST" modelAttribute="pessoa" enctype="multipart/form-data">
		
			<c:forEach var="doc" varStatus="status" items="${pessoa.documentos}">
				<form:input type="file" path="documentos[${status.index}].arquivo" id="documentos[${status.index}].arquivo"/></br>
				<form:errors path="documentos[${status.index}].arquivo" class="help-inline"/>
			</c:forEach>
			<br/>
			<input type="submit" value="Upload" class="btn btn-primary btn-sm">
		</form:form>
		
		<br/>
		<a href="<c:url value='pessoa/inicio' />">Inicio</a>
	</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value='/css/bootstrap/bootstrap.min.css' />"
	rel="stylesheet" type="text/css" />
<title>QtoRecebo - Calcular Salário</title>
</head>
<body>
	<div>
		<form method="post">
			<h2>Insira os dados abaixo:</h2><br />
			
			<label for="salarioBruto">Salário Bruto</label><br />
			<input type="text" class="form-control" id="salario" /><br /><br /> 
			<label for="numDesconto">Número Dependentes</label><br />
			<input type="text" class="form-control" id="numDependentes" /><br /><br /> 
			<input type="button" value="Calcular" styleClass="btn btn-primary" />
		</form>
	</div>
</body>
</html>
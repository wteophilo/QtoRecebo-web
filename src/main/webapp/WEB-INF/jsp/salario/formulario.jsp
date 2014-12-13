<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>QtoRecebo - Calcular Salário</title>

</head>
<body>
	<c:if test="${not empty mensagem}">
		<p class="mensagem">${mensagem}</p>
	</c:if>
	<div>
		<form method="post" action="${linkTo[SalarioController].calcula}">
			<div id="dados">
				<h2>Insira os dados abaixo:</h2><br /> 
				<label for="salarioBruto">Salário Bruto</label><br /> 
				<input  name = "salario.bruto" type="text" class="form-control" id="salario"  value="${salario.bruto}" /><br /><br/> 
				<input type="submit" value="Calcular"  styleClass="btn btn-primary" />
			</div>
			<div id="resultado">
				Salário Liquido: ${salario.liquido}
				
				<div id ="inss">
					Porcentagem Inss: ${inss.porcentagem}<br/>
					Valor Desconto Inss: ${inss.desconto}
				</div>
				
				<div id = "irrf">
					Porcentagem Irrf: ${irrf.porcentagem}<br/>
					Valor Desconto Irrf: ${irrf.desconto}
				</div>
			
			</div>
		</form>
	</div>
</body>
</html>
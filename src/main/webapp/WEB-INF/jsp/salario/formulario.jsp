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
	<section>
	<div class="jumbotron">
		<div id="erros">
			<ul>
				<c:forEach items="${errors}" var="error">
					<li>${error.category }-${error.message }</li>
				</c:forEach>
			</ul>
		</div>
		<div>
			<form method="post" action="${linkTo[SalarioController].calcula}">
				<div id="dados">
					<div class="form-group">
						<label for="salarioBruto">Salário Bruto</label>
						<div class="input-group">
							<span class="input-group-addon">R$</span> <input
								name="salario.bruto" type="text" class="form-control"
								id="salario" value="${salario.bruto}" /><br /> <br />
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<input type="submit" value="Calcular" class="btn btn-primary" />
						</div>
					</div>
				</div>


				<div id="resultado">

					<div class="row" id="resultSalarioLiquido">
						<div class="col-md-6 col-md-offset-3">
							<div class="panel panel-primary">
								<div class="panel-heading">
									<h3 class="panel-title">Salário Líquido</h3>
								</div>
								<div class="panel-body">
									<div class="input-group">
										<span class="input-group-addon">R$</span> <input
											name="salario.liquido" type="text" class="form-control"
											id="salarioLiquido" value="${salario.liquido}" />
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="row" id="resultInss">
						<br />
						<div class="col-sm-6 col-md-4">
							<div class="panel panel-default">
								<div class="panel-heading">
									<h3 class="panel-title">Inss</h3>
								</div>
								<div class="panel-body">
									<label for="salarioBruto">Porcentagem</label>
									<div class="input-group">
										<input name="inss.porcentagem" type="text"
											class="form-control" id="porcetangemInss"
											value="${inss.porcentagem}" /> <span
											class="input-group-addon">%</span>
									</div>
									<label for="salarioBruto">Valor Desconto</label>
									<div class="input-group">
										<span class="input-group-addon">R$</span> <input
											name="inss.desconto" type="text" class="form-control"
											id="descontoInss" value="${inss.desconto}" />
									</div>
								</div>
							</div>
						</div>

						<div class="col-sm-6 col-md-4">
							<div class="panel panel-default">
								<div class="panel-heading">
									<h3 class="panel-title">Irrf</h3>
								</div>
								<div class="panel-body">
									<label for="salarioBruto">Porcentagem</label>
									<div class="input-group">
										<input name="irrf.porcentagem" type="text"
											class="form-control" id="porcetangemIrrf"
											value="${irrf.porcentagem}" /> <span
											class="input-group-addon">%</span>
									</div>

									<label for="salarioBruto">Valor Desconto</label>
									<div class="input-group">
										<span class="input-group-addon">R$</span> <input
											name="irrf.desconto" type="text" class="form-control"
											id="descontoIrrf" value="${irrf.desconto}" />
									</div>
								</div>
							</div>
						</div>

					</div>

				</div>
			</form>
		</div>
	</div>
	
	</section>
</body>
</html>
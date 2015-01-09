<html>
<head>
<title>VRaptor Scaffold Project</title>
</head>
<body>
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/jquery-ui.js"></script>
	
	<div class="jumbotron">
			<div class="text-center">
				<img src="<c:url value="/images/emconstrucao.png"/>" />
			</div>
			<h2>Bem-vindo!</h2>
			<h4>Nossa aplicação ainda está em construção, mais você pode
				utilizar a versão de demonstração.</h4>
			<h4>Para isso apenas clique no botão abaixo e veja o valor de
				seu novo salário.</h4>
			<h4>Obrigado pelo acesso</h4><br/>
			
			
			<form method="get" action="<c:url value="/salario/formulario" />">
				<input type="submit"
					value="Calcular" class="btn btn-primary" />
			</form>
		</div>
</body>
</html>
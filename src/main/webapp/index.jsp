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
			<h4>Nossa aplica��o ainda est� em constru��o, mais voc� pode
				utilizar a vers�o de demonstra��o.</h4>
			<h4>Para isso apenas clique no bot�o abaixo e veja o valor de
				seu novo sal�rio.</h4>
			<h4>Obrigado pelo acesso</h4><br/>
			
			
			<form method="get" action="<c:url value="/salario/formulario" />">
				<input type="submit"
					value="Calcular" class="btn btn-primary" />
			</form>
		</div>
</body>
</html>
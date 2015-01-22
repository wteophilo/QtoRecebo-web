<title>QtoRecebo - Sobre</title>
<div class="row">
	<div class="col-sm-6 col-md-6">
		<div class="jumbotron">
			<div id="erros">
				<ul>
					<c:forEach items="${errors}" var="error">
						<li>${error.category }-${error.message }</li>
					</c:forEach>
				</ul>
			</div>
			<form method="post" action="${linkTo[SobreController].enviar}">
				<div id="email" class="form-group">
					<label for="nome">Nome</label>
					<input id = "nome" name = "remetente.nome"  value = "${remetente.nome}" class="form-control" placeholder="Insira o nome"/><br/> 
					<label for="assunto">Assunto</label>
					<input id = "assunto" name = "remetente.assunto" value = "${remetente.assunto}" class="form-control" placeholder="Insira o assunto"/><br /> 
					<label for="emailRemetente">Email</label>
					<input id = "emailRemetente" name = "remetente.emailRemetente" value = "${remetente.emailRemetente}" class="form-control" placeholder="Insira o email"/><br /> 
					<label for="mesagem">Mensagem</label>
					<textarea id = "mesagem" name="remetente.texto" value = "${remetente.texto}" rows="4" cols="50" class="form-control">
					</textarea>
				</div>
				<div class="text-right">
					<input type="submit" value="Enviar" class="btn btn-primary" />
				</div>
			</form>
		</div>
	</div>

	<div class="text-center">
		<h3>Tabela de impostos vigente 2014</h3>
		<br/><br />
		<a href = "http://www.receita.fazenda.gov.br/aliquotas/contribfont2012a2015.html"><label>Irrf:</label></a><br/>
		<a href = "http://www.previdencia.gov.br/inicial-central-de-servicos-ao-segurado-formas-de-contribuicao-empregado/"><label>Inss:</label></a>		
</div>
</div>

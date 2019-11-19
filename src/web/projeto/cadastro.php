<?php
session_start();
?>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="utf-8">
	<meta http-equiv = "X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="estilo.css">
	<title>Sistema de Cadastro</title>
</head>

<body>
	<nav class="navbar navbar-fixed-top navbar-inverse navbar-transparente">
      <div class="container">
        
        <!-- header -->
        <div class="navbar-header">
          
          <!-- botao toggle -->
          <button type="button" class="navbar-toggle collapsed"
                  data-toggle="collapse" data-target="#barra-navegacao">
            <span class="sr-only">alternar navegação</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>

          <a href="index.html" class="navbar-brand">
            <span class="img-logo">hostel</span>
          </a>

        </div>

        <!-- navbar -->
        <div class="collapse navbar-collapse" id="barra-navegacao">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="cadastro.html">Cadastro</a></li>
            <li class="divisor" role="separator"></li>
            <li><a href="reservas.html">Reservas</a></li>
            
          </ul>
        </div>
      </div><!-- /container -->
    </nav><!-- /nav -->



	<section class="hero is-success is-fullheight">
		<div class="hero-body">
			<div class="container has-text-centered">
				<h3 class="title has-text-grey">Sistema de Cadastro</h3>
				<h3 class="title has-text-grey"><a href=""></a></h3>
				<?php
				if($SESSION['status_cadastro']):
				?>
				<div>
					<p>Cadastro efetuado!</p>
				</div>
				<?php
				endif;
				unset($_SESSION['status_cadastro']);
				?>
				<?php
				if($SESSION['usuario_existe']):
				?>
				<div class="notification is-info">
					<p>O usuário escolhido já existe. Informe outro e tente novamente.</p>
				</div>
				<?php
				endif;
				unset($_SESSION['usuario_existe']);
				?>
				<div class="box">
					<from action="cadastrar.php" method="POST">
						<div class="field">
							<div class="control">
								<input name="name" type="text" class="input is-large" placeholder="Nome" autofocus>
							</div>
						</div>
				</div>
			</div>	
		</div>>
	</section>




	<footer id="rodape">
      <div class="container">
        <div class="row">
          
          <div class="col-md-2">
            <span class="img-logo">Hostel</span>
          </div>

          <div class="col-md-4">
            <ul class="nav">
              <li class="item-rede-social"><a href=""><img src="imagens/facebook.png"></a></li>
              <li class="item-rede-social"><a href=""><img src="imagens/twitter.png"></a></li>
              <li class="item-rede-social"><a href=""><img src="imagens/instagram.png"></a></li>
            </ul>
          </div>

        </div><!-- /row -->
      </div>
    </footer>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
  </body>
</html>
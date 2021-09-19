<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Curriculo</title>

<link rel="stylesheet" href="css/style.css">

</head>
<body>

	<div>
		<div id="container-login">
			<div id="container-left">
				<br>
				<br>
				<br>
				<br>
				<br>
				<div style="width: 100%; margin-bottom: 40px;">
					<p
						style="text-align: center; font-weight: bold; font-size: 40px; color: white; text-shadow: 1px 1px rgb(102, 255, 102);">WebCurriculo</p>
				</div>
				<div id="img_login" style="width: 100%; height: 50%;"></div>
			</div>
			<div class="container-right">
				<br> <br>
				<div style="width: 100%; margin-bottom: 70px;">
					<p
						style="text-align: center; font-weight: bold; font-size: 50px; color: rgb(102, 255, 102); text-shadow: 1px 1px yellow;">Bem
						vindo</p>
				</div>
				<form action="acao" method="post" id="form-login">
					<div class="full-box">
						<label>Usuário</label> <input type="text" name="login"
							placeholder="Digite o login" required="required">
					</div>
					<div class="full-box">
						<label>Senha</label> <input type="password" name="password"
							placeholder="Digite a senha" required="required">
					</div>
					<div class="full-box">
						<input type="submit" id="btn-logar" value="Entrar">
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="entities.*"%>
<%@page import="java.util.*"%>
<%@page import="dao.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página principal</title>
<link rel="stylesheet" href="css/style.css">
<script src="js/scripts.js"></script>
</head>
<body>
	<%
	String name = request.getParameter("name");
	%>

	<div id="header">
		<p>
			Bem vindo,
			<%=name%>
		<p>
	</div>
	<div id="center">
		<div id="container-painel">
			<div id="center-painel">
				<form action="#" method="post" id="form-cad">
					<table id="table-cad">
						<tr>
							<td><label>ID</label></td>
							<td><input type="text" readonly="readonly"></td>
						</tr>
						<tr>
							<td><label>Nome</label></td>
							<td><input type="text" name="name"
								placeholder="Digite o nome" required="required"></td>
						</tr>
						<tr>
							<td><label>E-mail</label></td>
							<td><input type="email" name="email"
								placeholder="Digite o e-mail" required="required"></td>
						</tr>
						<tr>
							<td><label>Telefone</label></td>
							<td><input type="tel" name="telefone"
								placeholder="Digite o telefone" required="required"></td>
						</tr>
						<tr>
							<td><label>Data de nascimento</label></td>
							<td><input type="date" name="data_nascimento"
								required="required"></td>
						</tr>
					</table>
					<div id="buttons-cad">
						<input type="submit" value="Salvar">
						<a href="page-main.jsp">Voltar</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
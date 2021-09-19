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
	String id = request.getParameter("id");
	ArrayList<pessoa> list = new ArrayList<>();
	if (id == "" || id == null) {
		pessoa pessoa = new pessoa();
		pessoa.setId(0);
		pessoa.setNome("");
		pessoa.setEmail("");
		pessoa.setTelefone("");
		pessoa.setData_nascimento(new Date());
		list.add(pessoa);
	} else {
		int id_numeric = Integer.parseInt(id);
		PessoaDAO pessoaDAO = new PessoaDAO();
		list = pessoaDAO.listFilter(id_numeric);
	}
	%>

	<div id="header">
		<p>
			Bem vindo
		<p>
	</div>
	<div id="center">
		<div id="container-painel">
			<div id="center-painel">
				<form action="acaoPessoa" method="post" id="form-cad">
					<table id="table-cad">
						<tr>
							<td><label>ID</label></td>
							<td><input type="text" readonly="readonly" name="id"
								value="<%=list.get(0).getId()%>"></td>
						</tr>
						<tr>
							<td><label>Nome</label></td>
							<td><input type="text" name="nome"
								placeholder="Digite o nome" required="required"
								value="<%=list.get(0).getNome()%>"></td>
						</tr>
						<tr>
							<td><label>E-mail</label></td>
							<td><input type="email" name="email"
								placeholder="Digite o e-mail" required="required"
								value="<%=list.get(0).getEmail()%>"></td>
						</tr>
						<tr>
							<td><label>Telefone</label></td>
							<td><input type="tel" name="telefone"
								placeholder="Digite o telefone" required="required"
								value="<%=list.get(0).getTelefone()%>"></td>
						</tr>
						<tr>
							<td><label>Data de nascimento</label></td>
							<td><input type="date" name="data_nascimento"
								required="required"
								value="<%=list.get(0).getData_nascimento()%>"></td>
						</tr>
					</table>
					<div id="buttons-cad">
						<input type="submit" value="Salvar"> <a
							href="page-main.jsp">Voltar</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
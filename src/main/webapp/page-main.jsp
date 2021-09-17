<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página principal</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div>
		<div id="header">
			<p>Bem vindo, Vanderson<p>
		</div>
		 <div id="center">
			<div id="container-painel">
					<div id="control-painel">
						<div id="search">
						   <div class="full-box-cad">
						   	  <label>Nome:</label>
						   	  <input type="text" name="nome_busca" placeholder="Digite o nome" required="required">
						   </div>
						</div>
						<div id="buttons">
						     <ul>
						  		<li><button style="background-color: blue;">Buscar</button></li>
						  		<li><button style="background-color: gray;">Limpar</button></li>
						  		<li><button style="background-color: green;">Cadastrar pessoa</button></li>   
						     </ul>
						</div>
					</div>
					<div id="table">
					   <table id="table-result">
					   			<tr>
					   				<th style="width: 30%;">Nome</th>
					   				<th style="width: 30%;">E-mail</th>
					   				<th style="width: 15%;">Telefone</th>
					   				<th style="width: 15%;">Data de nascimento</th>
					   				<th style="width: 5%;"></th>
					   			    <th style="width: 5%;"></th>
					   			</tr>
					   			
					   			<% 
					   				
					   				
					   			
					   			%>
					   			<tr>
					   				<td>Teste</td>
					   				<td>Teste</td>
					   				<td>Teste</td>
					   				<td>Teste</td>
					   				<td><button style="background-color: orange;">Editar</button></td>
					   				<td><button style="background-color: red;">Excluir</button></td>
					   			</tr>
					   			<%  %>   			   
					   </table>				
					</div>		
		    </div>
		</div>
	</div>		
</body>
</html>
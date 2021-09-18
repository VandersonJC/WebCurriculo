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
			<div id="control-painel">
				<div id="table">
					<table id="">

					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
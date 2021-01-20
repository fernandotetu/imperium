<%@page import="javax.servlet.jsp.jstl.tlv.PermittedTaglibsTLV"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listagem de usuarios</title>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<!--Import Google Icon Font-->

<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body>

	<c:forEach items="${usuariolist}" var="usu">
   	 	${usu.idUsuario } - ${usu.nome } 
   	 	<a href="editar?idUsuario=${usu.idUsuario }">[Editar]</a>
		<a href="remover?usuario.idUsuario=${usu.idUsuario }">[Remover]</a>

		<br>
	</c:forEach>
	<hr>
	

	<a href="novo" class="waves-effect waves-light btn"><i
		class="material-icons right">add</i>Criar novo usuário</a>
</body>
</html>
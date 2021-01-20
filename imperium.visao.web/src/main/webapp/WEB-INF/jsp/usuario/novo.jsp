<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Novo usuario</title>
</head>
<body>

	<form action="gravar" method="post">
		<input type="hidden" name="usu.idUsuario" value="${usuarioEdicao.idUsuario}">
		<input type="text" name="usu.nome" placeholder="nome:" value="${usuarioEdicao.nome}"  > <br>
		<input type="text" name="usu.login" placeholder="login" value="${usuarioEdicao.login}" > <br>
		<input type="text" name="usu.senha" placeholder="senha:" value="${usuarioEdicao.senha}" > <br>
		<input type="submit" value="Gravar usuário">
		
		
		
	</form>

</body>
</html>
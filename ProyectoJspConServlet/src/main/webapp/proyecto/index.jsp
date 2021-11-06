<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Indice</title>
<link rel="stylesheet" href="../css/estilo.css"  type="text/css"></link>

</head>
<body>
	<div id="divIndex">
	<p><h2>Bienvenido al carrito de la compra</h2></p>
	<p>Por favor, ingresa tu usuario:</p>
		<form action="/ProyectoJspConServlet/ServletComprobaryCatalogo" method ="get">
			<p>Usuario: <input type="text" name="user" value="Maria" id="user" required></p>
			<p>Password: <input type="text" name="pass" value="Maria" id="pass" required></p>
			<input type="submit" value="enviar">
			
		</form>
		<img src="../imagen/carrito.png" alt="carrit" width="170" height="170" id="image">
		
	</div>
</body>
</html>
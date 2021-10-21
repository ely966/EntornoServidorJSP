<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
</head>
<body>


<form action="anadirymostrar.jsp" method="GET">
<p>Nombre:</p>
<input type="text" name="nombre" required>
<br>
<p>Precio:</p>
<input type="number" name="precio" required>
<br>
<input type="submit" value="submit">
</form>

</body>
</html>
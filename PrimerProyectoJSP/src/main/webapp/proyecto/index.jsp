<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>
<jsp:useBean id = "garajee" class = "clases.Garaje" scope="session"> 
    <%// clases.Supermercado supermercadooo = new clases.Supermercado(); %>
    <jsp:setProperty name = "garajee" property = "nombre" value = "GarajeX"/>
    </jsp:useBean>
    <jsp:getProperty name="garajee" property="nombre"/>
    <div id="contenedor">
    	<div id="presentacion">
    	</div>
    	<div id="imagen">
    	<img alt="car" src="../imagen/car.png">
    	</div>
    </div>
<a href="formulario.jsp">Ir al formulario</a>
</body>
</html>
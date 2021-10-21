<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Añadir datos</title>
</head>
<body>
	<h3>Bienvenido al super</h3>
	<% 
	String nomb=request.getParameter("nombre"); 
	Integer preci=Integer.parseInt(request.getParameter("precio"));
	
	%>
	<jsp:useBean id = "supermercadoo" class = "clases.Supermercado"> 
    </jsp:useBean>
    
	<jsp:useBean id = "productoss" class = "clases.Producto"> 
    </jsp:useBean>
    <%
    
    clases.Supermercado supermercad = new clases.Supermercado(); 
    supermercad.setNombre("NewSupermercado");
    clases.Producto productoo = new clases.Producto(); 
    productoo.setNombre(nomb);
    productoo.setPrecio(preci);
    
    System.out.println(productoo.toString());
    supermercad.anadirProd(productoo);
    System.out.println(supermercad.toString());
    
    
    %>
   
 <a href="formulario.jsp">Volver añadir otro producto</a>	
	
</body>
</html>
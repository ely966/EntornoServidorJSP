package clases;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletResumen
 */
@WebServlet("/ServletResumen")
public class ServletResumen extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/** Session**/
	
    
    	
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   // TODO Auto-generated method stub
	   HttpSession sesion = request.getSession(false);
	   
       PrintWriter out = response.getWriter();
	   if(request.getSession() != null) {
		   //sesion.setMaxInactiveInterval(4);
			   
		   
		   /*Recogemos las variables*/
		   String numLeche =request.getParameter("leche");
		   String numPollo =request.getParameter("pollo");
		   String numCereales =request.getParameter("cereales");
		   String numZumo =request.getParameter("zumo");
		   /*Los convertimos en int para comprobar que no sean negativo y para comprobar precio del conjunto de cada uno*
		   */
		   int numLechee = Integer.parseInt (numLeche);
		   int numPolloo = Integer.parseInt (numPollo);
		   int numCerealess = Integer.parseInt (numCereales);
		   int numZumoo = Integer.parseInt (numZumo);
		   
		   /*COmprobamos si hay algun negativo*/
		   if (numLechee < 0 || numPolloo <0 || numCerealess < 0 || numZumoo <0) {
			   /*Exception por numero negativo*/
			   response.sendRedirect("/ProyectoJspConServlet/proyecto/numeroNegativo.jsp");  
			   
		   }else {/**La cantidad de cada producto es correcto**/
			   Productos p= new Productos();/**Creamos los productos**/
			   /**Modificamos la cantidad del producto **/
			   for (Producto prod : p.productos) 
			   { /**Recorremos ls usuarios**/
						if(prod.getNombre().equals("pollo")) {
							prod.setCantidad(numPolloo);
						}else if (prod.getNombre().equals("cereales")) {
							prod.setCantidad(numCerealess);
							}else if (prod.getNombre().equals("leche")) {
								prod.setCantidad(numLechee);
								}else {
									prod.setCantidad(numZumoo);
								}
				}
			   //**Anadir la cantidad de producto en la session**//
			   	sesion.setAttribute("numPolloo",numPollo);
			   	sesion.setAttribute("numZumoo", numZumoo);
			   	sesion.setAttribute("numCereales",numCerealess);
			   	sesion.setAttribute("numLeche",numLechee);
			   //****//
				
			   out.println ("<!DOCTYPE html>\n <head> <meta charset=\'UTF-8'> \n"
						+ "<link rel=\"stylesheet\" href=\"/ProyectoJspConServlet/css/estilo.css\" type=\"text/css\"></link></head> <body> <div id='divResumen'><h4>Mostraremos los productos y la cantidad</h4>\n"
						+ "<form action='/ProyectoJspConServlet/ServletFinal' id='form'"+
					   	"<p>Producto-Cantidad</p>");
			   /**Mostrar Producto y cantidad**/
			   for (Producto prod : p.productos) 
			   {
				out.println("<input id='nombre"+prod.getNombre()+"' value='" +prod.getNombre()+ "'readonly><input id='cantidad"+prod.getNombre()+"' value='"+prod.getCantidad()+"'readonly><br>");   
			   }
			   //**Opcion de envio**//
			   out.println("<p>---------------</p><h4>Opciones de envio</h4> " +
			   "<p><input type='radio' id='opcionenvio' name='opcionenvio' value='EnvioACasa' required>EnvioACasa</p><p><input type='radio' id='opcionenvio' name='opcionenvio' value='RecogidaEnTienda' required>RecogidaEnTienda</p>");
			   
			   out.println( "<input type='submit' value='Enviar'></form></div></body></html>"); 
			   
		   }/**Muestra pagina hasta aqui**/
			   
			   /****/
			   
	   
		   
	   }else {
		   /**Si session es null es que no existe**/
		   response.sendRedirect("/ProyectoJspConServlet/proyecto/sesionExpirada.jsp");  
	   }
    	}
    
	
	
	
	
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletResumen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

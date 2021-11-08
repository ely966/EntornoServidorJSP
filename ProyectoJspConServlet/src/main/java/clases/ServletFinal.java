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
 * Servlet implementation class ServletFinal
 */
@WebServlet("/ServletFinal")
public class ServletFinal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFinal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//**Recoge la session**//
		
		 HttpSession sesion = request.getSession();
	       PrintWriter out = response.getWriter();
		   if(request.getSession() != null) {
			   
				   /**Recogemos las variables**/
		      
				   /**Cantidades**/
		       int numLechee = Integer.parseInt (sesion.getAttribute("numLeche").toString());
			   int numPolloo = Integer.parseInt (sesion.getAttribute("numPolloo").toString());
			   int numCerealess = Integer.parseInt (sesion.getAttribute("numCereales").toString());
			   int numZumoo = Integer.parseInt (sesion.getAttribute("numZumoo").toString());
			  
			   	//**Recogemos la opcion de envio**//
			   String opcionEnvio=request.getParameter("opcionenvio");
			   
			   //** Precio del envio**//
			   int precioEnvio =0;
			   if(opcionEnvio.equals("EnvioACasa")) {
				   precioEnvio =20;
			   }
				   //Hacemos la suma del precio total
				   
				   //*Precio de cada uno*//
				   int pLeche=1;
				   int pCereales =3;
				   int pZumo=2;
				   int pPollo=4; 
				    
				   //Vamos calculando el precio de cada uno
				   int precioTotalLeche= numLechee*pLeche;
				   int precioTotalCereales=numCerealess*pCereales;
				   int precioTotalZumo=numZumoo*pZumo;
				   int precioTotalPollo=numPolloo*pPollo;
				   //Para la suma total
				   int precioTotal= precioTotalLeche + precioTotalCereales + precioTotalZumo + precioTotalPollo+  precioEnvio;
				   
				   //*Mostrar en la pagina*//
				   
				   out.println ("<!DOCTYPE html>\n <html><head> <meta charset='UTF-8'> \n"
							+ "<title>Factura</title>\n"
							+ "<link rel=\"stylesheet\" href=\"/ProyectoJspConServlet/css/estilo.css\" </head> <body> <div id='divFinal' ><h3>Mostraremos factura final</h3>\n"
							+ "<table id='tablaFinal' border='1'><tr><th>Producto</th><th>Cantidad</th> <th>Precio</th></tr>"
							+ "<tr><td>Leche</td><td>"+numLechee+"</td><td>"+precioTotalLeche+"</td></tr>"
							+ "<tr><td>Pollo</td><td>"+numPolloo+"</td><td>"+precioTotalPollo+"</td></tr>"
							+ "<tr><td>Zumo</td><td>"+numZumoo+"</td><td>"+precioTotalZumo+"</td></tr>"
							+ "<tr><td>Cereales</td><td>"+numCerealess+"</td><td>"+precioTotalCereales+"</td></tr>"
							+ "<tr><th>Extra</th><th>Opcion</th><th>Precio</th></tr><tr><td>Costes de envio: </td><td>"+opcionEnvio + " </td><td> " + precioEnvio+"</td></tr>"
							+ "<tr><td>Precio total:</td><td>--</td><td>"+precioTotal+"</td></tr></table><p>Volver al inicio: <a href='http://localhost:8080/ProyectoJspConServlet/proyecto/index.jsp'>Volver</a></p></div></body></html>");
				   
				   
				  //**AHora INvalidamos la session **// 
				   sesion.invalidate();
				   //**Hasta aqui la pagina**//
				 
		   }else { //**Si el servlet es null, que lo redirija**// 
			   response.sendRedirect("/ProyectoJspConServlet/proyecto/errorUserNoExiste.jsp");  		   }
		   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

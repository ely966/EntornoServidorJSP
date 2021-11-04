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
		
		 HttpSession sesion = request.getSession();
	       PrintWriter out = response.getWriter();
		   //if(request.getSession() != null) {
			   
			   /**Recogemos las variables**/
			  /** String nombreleche =request.getParameter("nombreleche");
			   String nombrecereales =request.getParameter("nombrecereales");
			   String nombrepollo =request.getParameter("nombrepollo");
			   String nombrezumo =request.getParameter("nombrezumo");
			   **/
			   /**Cantidades**/
			   
			   String cantidadLeche =request.getParameter("cantidadleche");
			   String cantidadCereales =request.getParameter("cantidadcereales");
			   String cantidadPollo =request.getParameter("cantidadpollo");
			   String cantidadZumo =request.getParameter("cantidadzumo");
		
			  
			   /**Convertir las cantidades en integer**/
			   int cantLeche =Integer.parseInt (cantidadLeche);
			   int cantPollo =Integer.parseInt (cantidadPollo);
			   int cantZumo =Integer.parseInt (cantidadZumo);
			   int cantCereales =Integer.parseInt (cantidadCereales);
			   
			   //Hacemos la suma del precio total
			   
			   //*Precio de cada uno*//
			   int pLeche=1;
			   int pCereales =3;
			   int pZumo=2;
			   int pPollo=4; 
			    
			   //Vamos calculando el precio de cada uno
			   int precioTotalLeche= cantLeche*pLeche;
			   int precioTotalCereales=cantCereales*pCereales;
			   int precioTotalZumo=cantZumo*pZumo;
			   int precioTotalPollo=cantPollo*pPollo;
			   //Para la suma total
			   int precioTotal= precioTotalLeche + precioTotalCereales + precioTotalZumo + precioTotalPollo;
			   
			   //*Mostrar en la pagina*//
			   
			   out.println ("<!DOCTYPE html>\n <head> <meta charset=\'UTF-8'> \n"
						+ "<title>Resumen</title>\n"
						+ "</head> <body> <h3>Mostraremos factura final</h3>\n"
						+ "<table border='1'><tr><td>Producto</td><td>Cantidad</td> <td>Precio</td></tr>"
						+ "<tr><td>Leche</td><td>"+cantLeche+"</td><td>"+pLeche+"</td></tr>"
						+ "<tr><td>Pollo</td><td>"+cantPollo+"</td><td>"+pPollo+"</td></tr>"
						+ "<tr><td>Zumo</td><td>"+cantZumo+"</td><td>"+pZumo+"</td></tr>"
						+ "<tr><td>Cereales/td><td>"+cantCereales+"</td><td>"+pCereales+"</td></tr>"
						+ "<tr><td>Precio total:</td><td>--</td><td>"+precioTotal+"</td></tr></table></body></html>");
			   
			   
			   
			   //}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

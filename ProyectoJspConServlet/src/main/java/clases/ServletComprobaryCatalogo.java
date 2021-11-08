package clases;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;  
import javax.servlet.ServletException;  
/**page errorPage = "errorNumeroNegativo.jsp
 * Servlet implementation class ServletComprobaryCatalogo
 */
@WebServlet("/ServletComprobaryCatalogo")
public class ServletComprobaryCatalogo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**Creamos o iniciamos el array de usuarios**/
		Usuarios users=new Usuarios();
		
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	*/
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			/** Recoger sessionSession**/
			HttpSession sesion = request.getSession();
		    //if(sesion.isNew()) {//**Si la session es nueva , que es este caso lo es**/
		    	sesion.setAttribute("usuarioo",request.getParameter("user"));
		    	
		   // }
			PrintWriter out = response.getWriter();
			
			//**Comprobamos si el usuario introducido existe en el array**//
			/**Recogemos l usuario ingresado en el login**/
			String usuarioIngresado =request.getParameter("user");/**Recogemos el usuario introducido**/
			String usuarioPass = request.getParameter("pass");
			//**comprobamos si el usuario existe**/
			if (users.comprobar(usuarioIngresado,usuarioPass)) { //**Si es true,significa que el usuario pertenece al array**//
		
				/**Empezamos a mostrar la pagina**/
				out.println ("<!DOCTYPE html><html>"
						+ "<head><meta charset=\"UTF-8\">"
						+ "<title>Catalogo</title>\n"
						+ "<link rel=\"stylesheet\" href=\"/ProyectoJspConServlet/css/estilo.css\"  type=\"text/css\"></link></head> <body>"
						+ "<div id='divcatalogo'><form action='/ProyectoJspConServlet/ServletResumen' method ='get'>\n"+
						"Bienvenido usuario  "+sesion.getAttribute("usuarioo")+"<p>Aqui está la lista de productos : </p>"
						+ "Leche: <input type='number' name='leche' value='0' id='leche' required><br>"
						+"Cereales: <input type='number' name='cereales' value='0' id='cereales' required ><br>"
						+"Pollo: <input type='number' name='pollo' value='0' id='pollo' required><br>"
						+"Zumo: <input type='number' name='zumo' value='0' id='zumo' required><br>"
						+"<input type='submit' value='Comprar'>\n"
						+ "	</form> "
						+ ""
						+ "</div>");
				
				
				out.println ("</body></html>"); /**Cerramos la pagina**/
			}else {  /**EN el caso que el usuario no existe en el array**/
				
				response.sendRedirect("/ProyectoJspConServlet/proyecto/errorUserNoExiste.jsp");  
				 
				} 
				
			
		}

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletComprobaryCatalogo() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

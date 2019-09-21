package servlet.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class primer_servlet
 */
@WebServlet("/menu_accion")
public class primer_servlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre=request.getParameter("nombre_1");
		String edad=request.getParameter("edad_1");
		if(nombre.contentEquals("damiel") && edad.contentEquals("23")) {
			response.sendRedirect("menu.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}
		
		String x=nombre;
		String y=edad;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

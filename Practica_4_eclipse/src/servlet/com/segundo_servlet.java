package servlet.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class segundo_servlet
 */
@WebServlet("/leer")
public class segundo_servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String valor=request.getParameter("menu_leer");
		if("pasado".equals(valor)) {
			response.sendRedirect("pasado.jsp");
		}else if("presente".equals(valor)) {
			response.sendRedirect("presente.jsp");
		}else if("futuro".equals(valor)) {
			response.sendRedirect("futuro.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

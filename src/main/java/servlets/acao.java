package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDAO;
import entities.usuario;

@WebServlet("/acao")
public class acao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public acao() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login").toString();
		String password = request.getParameter("password").toString();
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		boolean valid = false;
		try {
			valid = usuarioDAO.valid(login, password);
		} catch (SQLException e) {

			response.sendError(0);
		}

		if (valid == true) {
			response.sendRedirect("page-main.jsp?name="+login);
		} else {
			response.sendRedirect("index.jsp");
		}

	}

}

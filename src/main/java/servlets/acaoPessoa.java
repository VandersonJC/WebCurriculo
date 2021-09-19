package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entities.*;
import dao.*;
import java.util.*;


/**
 * Servlet implementation class acaoPessoa
 */
@WebServlet(urlPatterns = "/acaoPessoa")
public class acaoPessoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public acaoPessoa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		System.out.println("CHEGOU");
		String id = request.getParameter("id");
		String name = request.getParameter("nome");
		String email = request.getParameter("email");
		String tel = request.getParameter("telefone");
		String data_nascimento = request.getParameter("data_nascimento");
		
		int id_numeric = Integer.parseInt(id);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Date data_nascimento_parse = null;
		try {
			data_nascimento_parse = formato.parse(data_nascimento);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		pessoa pessoa;
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		pessoa = new pessoa();
		pessoa.setId(id_numeric);
		pessoa.setNome(name);
		pessoa.setEmail(email);
		pessoa.setTelefone(tel);
		pessoa.setData_nascimento(data_nascimento_parse);
	    try {
			pessoaDAO.save(pessoa);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		if(id_numeric > 0) {
			response.sendRedirect("cad-pessoa.jsp");
		}else {
			response.sendRedirect("page-main.jsp");
		}
		
		
		
		
		
	}

}

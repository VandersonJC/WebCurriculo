package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entities.*;
import dao.*;
import java.util.*;
import java.sql.*;
import java.util.Date;

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
		
	 String id	= request.getParameter("delPessoa");
     pessoa pessoa;
     PessoaDAO pessoaDAO = new PessoaDAO();
	 
	 if( id != ""|| id != null) {
		 
		 int id_delete = Integer.parseInt(id);
		 pessoa = new pessoa();
		 pessoa.setId(id_delete);
		 try {
			pessoaDAO.delete(pessoa);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 }
		
	 
	    response.sendRedirect("page-main.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("CHEGOU");
		String id = request.getParameter("id");
		String name = request.getParameter("nome");
		String email = request.getParameter("email");
		String tel = request.getParameter("telefone");
		String data_nascimento = request.getParameter("data_nascimento");
		
		System.out.println(id);
		System.out.println(data_nascimento);
		int id_numeric = Integer.parseInt(id);
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		

		Date date = null;
		try {
			date = (Date) formato.parse(data_nascimento);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(date);
		pessoa pessoa;
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		pessoa = new pessoa();
		pessoa.setId(id_numeric);
		pessoa.setNome(name);
		pessoa.setEmail(email);
		pessoa.setTelefone(tel);
		pessoa.setData_nascimento(date);
	    try {
			pessoaDAO.save(pessoa);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

		if(id_numeric > 0 || id_numeric != 0 ) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("cad-pessoa.jsp");
			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("page-main.jsp");
			dispatcher.forward(request, response);
		}
			
			
	}

}

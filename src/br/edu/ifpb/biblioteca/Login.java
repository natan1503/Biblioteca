package br.edu.ifpb.biblioteca;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
		if(nome.equals("admin")&&senha.equals("admin"))
			response.sendRedirect("Redirecionamento.jsp");
		else
			response.sendRedirect("index.html");
		
	
	}
}


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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pesquisa p = new Pesquisa();
		String name = request.getParameter("name");
		String senha = request.getParameter("senha");
        
		boolean caso = false;
		try {
			caso = p.PesquisaCadastro(name,senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        if(caso==true){
                System.out.println("\nVocê está logado!\n");
                RequestDispatcher rq = request.getRequestDispatcher(
    					"CadastroVolume.html");
    			rq.forward(request, response);
        } else 
        	System.out.println("\nErro, Conta inexistente\n");

		}
	}


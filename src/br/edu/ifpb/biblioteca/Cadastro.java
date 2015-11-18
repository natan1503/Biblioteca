package br.edu.ifpb.biblioteca;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/Cadastro.do")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor"); 
		String numPaginas = request.getParameter("numPaginas");
		String anoPublicacao = request.getParameter("anoPublicacao");
		String editora = request.getParameter("editora");
		
		// Campo select com os valores de gênero.
		String tipoVolume = request.getParameter("tipoVolume");
		
		// Entidade usuário.
		Volume volume = new Volume();
		volume.setTitulo(titulo);
		volume.setAutor(autor);
		volume.setNumPaginas(numPaginas);
		volume.setAnoPublicacao(anoPublicacao);
		volume.setEditora(editora);
		volume.setTipoVolume(tipoVolume);
		
	
		response.sendRedirect("sucesso.html");
	}

}

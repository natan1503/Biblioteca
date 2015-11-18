package br.edu.ifpb.biblioteca;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Remover
 * @param <PreparedStatement>
 */
@WebServlet("/Remover.do")
public class Remover<PreparedStatement> extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		public void Remover(Volume volume) {
		     try {
		         Object connection;
				PreparedStatement stmt = ((Object) connection)
		         .prepareStatement("delete from tb_volume where TITULO=?");
		         stmt.setLong(1, volume.getTitulo());
		         stmt.execute();
		         stmt.close();
		     } catch (SQLException e) {
		         throw new RuntimeException(e);
		     }
		}
}

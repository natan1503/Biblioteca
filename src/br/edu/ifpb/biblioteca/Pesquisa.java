package br.edu.ifpb.biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PesquisaServlet.do")
public class PesquisaServlet extends HttpServlet{
	private Connection connection;
	private int rs;
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
    
		 public boolean PesquisaVolume(String titulo)throws SQLException{
        		boolean valor=false;
        		PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("select * from tb_volume where TITULO = '"+titulo+"'");
              
        		ResultSet rs = stmt.executeQuery();
			 if(rs.next()){
                	valor= true;
        		}
              		stmt.close();
        		 rs.close();
              		return valor;
		 }
    		public boolean PesquisaCadastro(String nome,String senha) throws SQLException{
          
			boolean valor=false;
       			PreparedStatement stmt = (PreparedStatement) this.connection.prepareStatement("select * from tb_admin where NOME = '"+nome+"'and SENHA = "+senha);
              
              		ResultSet rs = stmt.executeQuery();
              
              		if(rs.next()){
                        	valor= true;
              		}
              		stmt.close();
              		rs.close();
              		return valor;
    		}
	}

}

package br.edu.ifpb.biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Pesquisa {
	private Connection connection;
    private int rs;
    
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

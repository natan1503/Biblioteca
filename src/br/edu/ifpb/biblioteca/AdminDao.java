package br.edu.ifpb.biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminDao {
	private Connection connection;

    public AdminDao() {
      this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Admin admin) {
               String sql = "insert into tb_admin" +
                       "(NOME,SENHA)" +
                       " values (?,?);";
               try {
                   // prepared statement para inserção
                   PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
                   
                   // seta os valores
                   stmt.setString(1,admin.getNome());
                   stmt.setString(2,admin.getSenha());
                   // executa
                   
                   stmt.execute();
                   stmt.close();
               } catch (SQLException e) {
                   throw new RuntimeException(e);
               }
           }

}

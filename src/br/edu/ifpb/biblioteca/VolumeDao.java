package br.edu.ifpb.biblioteca;

import java.sql.Connection;
import java.sql.SQLException;

public class VolumeDao {
	 private Connection connection;

     public VolumeDao() {
       this.connection = new ConnectionFactory().getConnection();
     }
    
     public void adiciona(Volume volume) {
                String sql = "insert into tb_volume " +
                        "(TITULO,AUTOR,TIPOVOLUME,NUMPAGINAS,ANOPUBLICACAO,EDITORA)" +
                        " values (?,?,?,?,?,?);";
                        
                try {
                    // prepared statement para inserção
                    java.sql.PreparedStatement stmt = (java.sql.PreparedStatement) connection.prepareStatement(sql);
                    // seta os valores
                    stmt.setString(1,volume.getTitulo());
                    stmt.setString(2,volume.getAutor());
                    stmt.setString(3,volume.getTipoVolume());
                    stmt.setString(4,volume.getNumPaginas());
                    stmt.setString(5,volume.getAnoPublicacao());
                    stmt.setString(6,volume.getEditora());

                   // executa
                    stmt.execute();
                    stmt.close();
                    
                    
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
	

}

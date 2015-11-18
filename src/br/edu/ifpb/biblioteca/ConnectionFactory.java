package br.edu.ifpb.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {
                public Connection getConnection() {
                     try {
                         return DriverManager.getConnection(
                 "jdbc:mysql://localhost/biblioteca", "root", "");
                     } catch (SQLException e) {
                         throw new RuntimeException(e);
                     }
                 }

                public static PreparedStatement prepareStatement(String string) {
                        // TODO Auto-generated method stub
                        return null;
                }
}
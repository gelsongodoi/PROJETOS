/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deserve.jdbc;

/**
 *
 * @author gelson
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando ao banco");
            return DriverManager.getConnection("jdbc:mysql://192.168.1.171:3306/sisad",
                    "sisad", "sisad");
        } catch (ClassNotFoundException e) {
            System.out.println("Não conectado");
            throw new SQLException(e.getMessage());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cec;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programación 2
 */
public class JavaPostgreSQL {
    public Connection getConnection() throws IOException{
        try {
            // We register the PostgreSQL driver
            // Registramos el driver de PostgresSQL
            try { 
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            Connection connection = null;
    
                // Database connect
                // Conectamos con la base de datos
                Web_Settings web = new Web_Settings();
         
            
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://"+web.getIp(),
                    web.getUser(),web.getPass());

            boolean valid = connection.isValid(50000);
           // System.out.println(valid ? "TEST OK" : "TEST FAIL");
            
            return connection;
           
            
            
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
            return null;
        }
        
    } 
    
    public void connectDatabase(String host, String port, String database,
            String user, String password) {
        String url = "";
        try {
            // We register the PostgreSQL driver
            // Registramos el driver de PostgresSQL
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            Connection connection = null;
            url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
            // Database connect
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(url,user, password);           
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) { 
            System.out.println("Error al conectar con la base de datos de PostgreSQL (" + url + "): " + sqle);
        }
    }
    
    
    
    
}

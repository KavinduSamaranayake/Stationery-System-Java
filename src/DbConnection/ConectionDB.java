/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DbConnection;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author ksama
 */
public class ConectionDB {
    
    private static final String URL = "jdbc:mysql://localhost/stationarysystem";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection con;
    
    
   public static Connection getCon() throws SQLException{
     
       
        try {
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            // Handle database connection error
            throw new SQLException("Failed to connect to the database: " + e.getMessage());
        }
        return con;
       
   }

    
    
    
   
}

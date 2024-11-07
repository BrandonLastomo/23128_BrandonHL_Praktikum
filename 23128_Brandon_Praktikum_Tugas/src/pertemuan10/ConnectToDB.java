/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author brand
 */
public class ConnectToDB {
    private static Connection connect; // variable for storing database connection infos
    
    // method untuk mengoneksikan dengan database
    public static Connection tryConnect() throws SQLException, ClassNotFoundException{
        try {
            if (connect == null){
                Class.forName("com.mysql.cj.jdbc.Driver"); // load driver to connect with database
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_informatika_3b", "root", ""); // storing infos about database connection
            }
            return connect;
        } catch (SQLException e){
            System.err.println("Error: connection failed " + e.getMessage());
            throw e;
        }
    }
}
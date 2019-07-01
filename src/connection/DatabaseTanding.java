/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author asus
 */
public class DatabaseTanding {
    private static Connection conn;
    
    
    public static Connection getConnection(){
        if(conn == null){
            String url = "jdbc:mysql://localhost:3306/tanding";
            String username = "root";
            String password = "";
            
            try{
                Driver driver = new Driver();
                DriverManager.registerDriver(driver);
                conn = DriverManager.getConnection(url,username,password);
                System.out.println("Connection Success");
            }catch(SQLException ex){
                System.out.println("Connection Failed");
                ex.getMessage();
            }
        }
        return conn;
    }
}

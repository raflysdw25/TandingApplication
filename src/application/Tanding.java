/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;



//import com.tanding.DatabaseTanding;
import java.sql.Connection;

/**
 *
 * @author asus
 */
public class Tanding {

    /**
     * @param args the command line arguments
     */
    private static Connection conn =null;
    public static void main(String[] args) {
        // TODO code application logic here
        new BerandaLoginNew().setVisible(true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanding;



import com.tanding.DatabaseTanding;
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
        System.out.println("Uji Coba Push");
        System.out.println("Uji coba commit by Firmansyah");
        System.out.println("Uji Coba Commit by Rafly");
        System.out.println("Uji Coba Commit dari Yoel");
        System.out.println("Rama");
        conn = DatabaseTanding.getConnection();
    }
    
}

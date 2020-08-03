package action;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author java1
 */
public class Dbcon {

    public static Connection getCon() throws ClassNotFoundException {
        Connection con = null;  
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/triage?serverTimezone=UTC", "root", "");
            System.out.println("Connection Established"+con);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}

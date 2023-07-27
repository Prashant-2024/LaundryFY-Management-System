
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.*;

/**
 *
 * @author sohit
 */
class DatabaseConnection{
        public static Connection getConnection()
    {
        String url = "jdbc:mysql://localhost:3306/Faculty_Record_Database";
        String user = "root";     
        String password = "";
        Connection con = null;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection(url,user,password);
           
          } catch(Exception ex){
            System.out.println(ex);
          }
           return con;
    }
}


class JavaLab{
	public static void main(String[] args){
		Connection con = DatabaseConnection.getConnection();
        PreparedStatement ps;
         try{
           ps = con.prepareStatement("SELECT * FROM Faculty_Information");;
           ResultSet rs =ps.executeQuery();        
           while(rs.next())
                {
                int Uid = rs.getInt("Unique_ID");
                String name = rs.getString("Name");
                String dept = rs.getString("Department");
                String rp = rs.getString("Research_Project");
                
                System.out.println(Uid+","+name+","+dept+","+rp);

                }
            } catch (SQLException ex) {
              // Logger.getLogger(JavaLab.class.getName()).log(Level.SEVERE, null, ex);
          }

	}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author psola
 */
public class database_connect {
        String url = "jdbc:mysql://127.0.0.1:3306/Faculty_Record_Database";
        String user = "root";     
        String password = "mysqlroot";
        Connection con = null;
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection(url,user,password);
           
          } 
        catch(Exception ex){
            System.out.println(ex);
          }
        return con;
    }

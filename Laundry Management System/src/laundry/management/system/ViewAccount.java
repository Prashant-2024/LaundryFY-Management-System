
package laundry.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class ViewAccount extends JFrame implements ActionListener{
    
    JButton back;
    
    ViewAccount(String empid){
        setBounds(450,180,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblempid=new JLabel("Employee ID");
        lblempid.setBounds(30,50,150,25);
        add(lblempid);
        
        JLabel auempid=new JLabel();
        auempid.setBounds(220,50,150,25);
        add(auempid);
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,110,150,25);
        add(lblname);
        
        JLabel auname=new JLabel();
        auname.setBounds(220,110,150,25);
        add(auname);
        
        JLabel lblemail=new JLabel("E-Mail");
        lblemail.setBounds(30,170,150,25);
        add(lblemail);
        
        JLabel auemail=new JLabel();
        auemail.setBounds(220,170,150,25);
        add(auemail);
        
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(30,230,150,25);
        add(lblpassword);
        
        JLabel aupassword=new JLabel();
        aupassword.setBounds(220,230,150,25);
        add(aupassword);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350,300,150,25 );
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(150,400,600,200);
        add(image);
        
        try{
            Conn c =new Conn();
            String query ="select * from signup where Emp_ID='"+empid+"'";
            ResultSet rs=c.s.executeQuery(query);
            
            while(rs.next()){
                auempid.setText(rs.getString("Emp_ID"));
                auname.setText(rs.getString("Name"));
                auemail.setText(rs.getString("Email"));
                aupassword.setText(rs.getString("Password"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
            
            
    public static void main(String args[]){
        new ViewAccount("0000");
    }
}

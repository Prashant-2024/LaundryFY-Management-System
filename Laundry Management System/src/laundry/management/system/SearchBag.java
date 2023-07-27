
package laundry.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class SearchBag extends JFrame implements ActionListener{
    
    JLabel auname, aueid, augender, auhostel, auemail, auphoneno;
    JTextField tfempid;
    JButton search, back;
    
    SearchBag(){
        setBounds(450,180,870,625);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        
        JLabel lblempid=new JLabel("Bag ID");
        lblempid.setBounds(30,50,150,25);
        add(lblempid);
        
        tfempid=new JTextField();
        tfempid.setBounds(220, 50, 150, 25);
        tfempid.setBorder(BorderFactory.createEmptyBorder());
        add(tfempid);
        
        search=new JButton("Search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
        search.setBounds(380,50,100,25);
        search.addActionListener(this);
        add(search);
        
        JLabel lblname=new JLabel("NAME");
        lblname.setBounds(30,110,150,25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblname);
        
        auname=new JLabel();
        auname.setBounds(220,110,150,25);
        add(auname);
        
        JLabel lbleid=new JLabel("ENROLLEMENT NO.");
        lbleid.setBounds(30,170,150,25);
        lbleid.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbleid);
        
        aueid=new JLabel();
        aueid.setBounds(220,170,150,25);
        add(aueid);
        
        JLabel lblgender=new JLabel("GENDER");
        lblgender.setBounds(30,230,150,25);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblgender);
        
        augender=new JLabel();
        augender.setBounds(220,230,150,25);
        add(augender);
        
        JLabel lblhostel=new JLabel("HOSTEL ROOM");
        lblhostel.setBounds(30,290,150,25);
        lblhostel.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblhostel);
        
        auhostel=new JLabel();
        auhostel.setBounds(220,290,150,25);
        add(auhostel);
        
        JLabel lblemail=new JLabel("E-MAIL");
        lblemail.setBounds(30,350,150,25);
        lblemail.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblemail);
        
        auemail=new JLabel();
        auemail.setBounds(220,350,150,25);
        add(auemail);
        
        JLabel lblphoneno=new JLabel("PHONE NO.");
        lblphoneno.setBounds(30,410,150,25);
        lblphoneno.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblphoneno);
        
        auphoneno=new JLabel();
        auphoneno.setBounds(220,410,150,25);
        add(auphoneno);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(400,500,150,25 );
        back.addActionListener(this);
        add(back);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==search){
            try{
                Conn c =new Conn();
                String query ="select * from laundrybag where Bag_ID='"+tfempid.getText()+"'";

                ResultSet rs=c.s.executeQuery(query);
                    while(rs.next()){
                        auname.setText(rs.getString("Name"));
                        aueid.setText(rs.getString("Enrollment_No"));
                        augender.setText(rs.getString("Gender"));
                        auhostel.setText(rs.getString("Hostel"));
                        auemail.setText(rs.getString("Email_ID"));
                        auphoneno.setText(rs.getString("Phone_No"));
                    }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
                setVisible(false);
                new Dashboard();
        }
    }
    
    public static void main(String args[]){
        new SearchBag();
    }
    
}

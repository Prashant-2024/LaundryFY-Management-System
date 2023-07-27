
package laundry.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class LaundryBag extends JFrame implements ActionListener{
    
    JLabel lblbagid, lblname, lbleid, lblgender, lblhostel, lblemail, lblphoneno;
    JTextField tfbagid, tfname, tfeid, tfhostel, tfemail, tfphoneno;
    JRadioButton r1,r2;
    JButton add, back;
    
    LaundryBag(){
        setBounds(450,200,850,550);
        setLayout(null);
        
        lblbagid=new JLabel("BAG_ID");
        lblbagid.setBounds(30,40,150,25);
        lblbagid.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblbagid);
        
        tfbagid=new JTextField();
        tfbagid.setBounds(220,40,150,25);
        tfbagid.setBorder(BorderFactory.createEmptyBorder());
        add(tfbagid);
        
        lblname=new JLabel("NAME");
        lblname.setBounds(30,80,150,25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(220,80,150,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        add(tfname);
        
        lbleid=new JLabel("ENROLLEMENT NO.");
        lbleid.setBounds(30,120,150,25);
        lbleid.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbleid);
        
        tfeid=new JTextField();
        tfeid.setBounds(220,120,150,25);
        tfeid.setBorder(BorderFactory.createEmptyBorder());
        add(tfeid);
        
        lblgender=new JLabel("GENDER");
        lblgender.setBounds(30,160,150,25);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblgender);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(220, 160, 70, 25);
        add(r1);
                
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(290, 160, 80, 25);
	add(r2);
        
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        lblhostel=new JLabel("HOSTEL ROOM");
        lblhostel.setBounds(30,200,150,25);
        lblhostel.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblhostel);
        
        tfhostel=new JTextField();
        tfhostel.setBounds(220,200,150,25);
        tfhostel.setBorder(BorderFactory.createEmptyBorder());
        add(tfhostel);
        
        lblemail=new JLabel("E-MAIL");
        lblemail.setBounds(30,240,150,25);
        lblemail.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(220,240,150,25);
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        add(tfemail);
        
        lblphoneno=new JLabel("PHONE NO.");
        lblphoneno.setBounds(30,280,150,25);
        lblphoneno.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblphoneno);
        
        tfphoneno=new JTextField();
        tfphoneno.setBounds(220,280,150,25);
        tfphoneno.setBorder(BorderFactory.createEmptyBorder());
        add(tfphoneno);
        
        add=new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(80,350,100,25);
        add.addActionListener(this);
        add(add);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/ic_laundry.png"));
        Image i2=i1.getImage().getScaledInstance(350,350, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(400,40,450,420);
        add(icon);
        
//        try{
//            
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==add){
            String bagid=tfbagid.getText();
            String name=tfname.getText();
            String eid=tfeid.getText();
            String gender=null;
            if(r1.isSelected()){
                gender="Male";
            }
            else{
                gender="Female";
            }
            String hostel=tfhostel.getText();
            String email=tfemail.getText();
            String phoneno=tfphoneno.getText();
            
            try{
                Conn c=new Conn();
                String query="insert into laundrybag values('"+bagid+"', '"+name+"', '"+eid+"', '"+gender+"', '"+hostel+"', '"+email+"', '"+phoneno+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "New Laundry Bag Issued Successfully");
                setVisible(false);
            }
            catch(Exception e){
                e.printStackTrace();
            }   
        }
        else{
            setVisible(false);
        }
    }
    
    public static void main(String args[]){
        new LaundryBag();
    }
    
}

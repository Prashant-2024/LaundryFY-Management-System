

package laundry.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LaundryTicket extends JFrame implements ActionListener{
    
    JLabel auname, aueid, augender, auhostel, auemail, auphoneno, lblkurta, lblpajama, lblshirt, lbltshirt, lblpant, lbllower, lblshorts, lblbedsheet, lblpillowcover, lbltowel, lblduppata, lbljacket;
    JTextField tfbagid, tfkurta, tfpajama, tfshirt, tftshirt, tfpant, tflower, tfshorts, tfbedsheet, tfpillowcover, tftowel, tfduppata, tfjacket;
    JButton validate, add, back;
    
    LaundryTicket(){
        setBounds(350,20,870,800);
//        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblempid=new JLabel("Bag ID");
        lblempid.setBounds(30,30,150,25);
        add(lblempid);
        
        tfbagid=new JTextField();
        tfbagid.setBounds(220, 30, 150, 25);
        tfbagid.setBorder(BorderFactory.createEmptyBorder());
        add(tfbagid);
        
        validate=new JButton("Validate");
        validate.setBackground(Color.GRAY);
        validate.setForeground(Color.WHITE);
        validate.setBounds(380,30,100,25);
        validate.addActionListener(this);
        add(validate);
        
        JLabel lblname=new JLabel("NAME");
        lblname.setBounds(30,90,150,25);
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblname);
        
        auname=new JLabel();
        auname.setBounds(220,90,150,25);
        add(auname);
        
        JLabel lbleid=new JLabel("ENROLLEMENT NO.");
        lbleid.setBounds(400,90,150,25);
        lbleid.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbleid);
        
        aueid=new JLabel();
        aueid.setBounds(570,90,150,25);
        add(aueid);
        
        JLabel lblgender=new JLabel("GENDER");
        lblgender.setBounds(30,140,150,25);
        lblgender.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblgender);
        
        augender=new JLabel();
        augender.setBounds(220,140,150,25);
        add(augender);
        
        JLabel lblhostel=new JLabel("HOSTEL ROOM");
        lblhostel.setBounds(400,140,150,25);
        lblhostel.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblhostel);
        
        auhostel=new JLabel();
        auhostel.setBounds(570,140,150,25);
        add(auhostel);
        
        JLabel lblemail=new JLabel("E-MAIL");
        lblemail.setBounds(30,190,150,25);
        lblemail.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblemail);
        
        auemail=new JLabel();
        auemail.setBounds(220,190,150,25);
        add(auemail);
        
        JLabel lblphoneno=new JLabel("PHONE NO.");
        lblphoneno.setBounds(400,190,150,25);
        lblphoneno.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblphoneno);
        
        auphoneno=new JLabel();
        auphoneno.setBounds(570,190,150,25);
        add(auphoneno);
        
        lblkurta=new JLabel("Kurta");
        lblkurta.setBounds(30,250,150,25);
        lblkurta.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblkurta);
        
        tfkurta=new JTextField();
        tfkurta.setBounds(120,250,150,25);
        tfkurta.setBorder(BorderFactory.createEmptyBorder());
        add(tfkurta);
        
        lblpajama=new JLabel("Pajama");
        lblpajama.setBounds(400,250,150,25);
        lblpajama.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblpajama);
        
        tfpajama=new JTextField();
        tfpajama.setBounds(490,250,150,25);
        tfpajama.setBorder(BorderFactory.createEmptyBorder());
        add(tfpajama);
        
        lblshirt=new JLabel("Shirt");
        lblshirt.setBounds(30,300,150,25);
        lblshirt.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblshirt);
        
        tfshirt=new JTextField();
        tfshirt.setBounds(120,300,150,25);
        tfshirt.setBorder(BorderFactory.createEmptyBorder());
        add(tfshirt);
        
        lbltshirt=new JLabel("T-Shirt");
        lbltshirt.setBounds(400,300,150,25);
        lbltshirt.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbltshirt);
        
        tftshirt=new JTextField();
        tftshirt.setBounds(490,300,150,25);
        tftshirt.setBorder(BorderFactory.createEmptyBorder());
        add(tftshirt);
        
        lblpant=new JLabel("Pant");
        lblpant.setBounds(30,350,150,25);
        lblpant.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblpant);
        
        tfpant=new JTextField();
        tfpant.setBounds(120,350,150,25);
        tfpant.setBorder(BorderFactory.createEmptyBorder());
        add(tfpant);
        
        lbllower=new JLabel("Lower");
        lbllower.setBounds(400,350,150,25);
        lbllower.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbllower);
        
        tflower=new JTextField();
        tflower.setBounds(490,350,150,25);
        tflower.setBorder(BorderFactory.createEmptyBorder());
        add(tflower);
        
        lblshorts=new JLabel("Shorts");
        lblshorts.setBounds(30,400,150,25);
        lblshorts.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblshorts);
        
        tfshorts=new JTextField();
        tfshorts.setBounds(120,400,150,25);
        tfshorts.setBorder(BorderFactory.createEmptyBorder());
        add(tfshorts);
        
        lblbedsheet=new JLabel("Bedsheets");
        lblbedsheet.setBounds(400,400,150,25);
        lblbedsheet.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblbedsheet);
        
        tfbedsheet=new JTextField();
        tfbedsheet.setBounds(490,400,150,25);
        tfbedsheet.setBorder(BorderFactory.createEmptyBorder());
        add(tfbedsheet);
        
        lblpillowcover=new JLabel("Pillow Cover");
        lblpillowcover.setBounds(30,450,150,25);
        lblpillowcover.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblpillowcover);
        
        tfpillowcover=new JTextField();
        tfpillowcover.setBounds(120,450,150,25);
        tfpillowcover.setBorder(BorderFactory.createEmptyBorder());
        add(tfpillowcover);
        
        lbltowel=new JLabel("Towel");
        lbltowel.setBounds(400,450,150,25);
        lbltowel.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbltowel);
        
        tftowel=new JTextField();
        tftowel.setBounds(490,450,150,25);
        tftowel.setBorder(BorderFactory.createEmptyBorder());
        add(tftowel);
        
        lblduppata=new JLabel("Duppata");
        lblduppata.setBounds(30,500,150,25);
        lblduppata.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lblduppata);
        
        tfduppata=new JTextField();
        tfduppata.setBounds(120,500,150,25);
        tfduppata.setBorder(BorderFactory.createEmptyBorder());
        add(tfduppata);
        
        lbljacket=new JLabel("Jacket");
        lbljacket.setBounds(400,500,150,25);
        lbljacket.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(lbljacket);
        
        tfjacket=new JTextField();
        tfjacket.setBounds(490,500,150,25);
        tfjacket.setBorder(BorderFactory.createEmptyBorder());
        add(tfjacket);
        
        add=new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(80,650,100,25);
        add.addActionListener(this);
        add(add);
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200,650,100,25);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            if (ae.getSource()==validate){
                Conn c =new Conn();
                String query ="select * from laundrybag where Bag_ID='"+tfbagid.getText()+"'";

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
            else if (ae.getSource()==add){
                String bagid=tfbagid.getText();
                String kurta=tfkurta.getText();
                String pajama=tfpajama.getText();
                String shirt=tfshirt.getText();
                String tshirt=tftshirt.getText();
                String pant=tfpant.getText();
                String lower=tflower.getText();
                String shorts=tfshorts.getText();
                String bedsheet=tfbedsheet.getText();
                String pillowcover=tfpillowcover.getText();
                String towel=tftowel.getText();
                String duppata=tfduppata.getText();
                String jacket=tfjacket.getText();
                
                try{
                Conn c=new Conn();
                String query="insert into laundrytkt values('"+bagid+"', '"+kurta+"', '"+pajama+"', '"+shirt+"', '"+tshirt+"', '"+pant+"', '"+lower+"', '"+shorts+"', '"+bedsheet+"', '"+pillowcover+"', '"+towel+"', '"+duppata+"', '"+jacket+"')";
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "New Laundry Ticket Issued Successfully");
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
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        new LaundryTicket();
    }
}

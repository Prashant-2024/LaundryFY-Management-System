
package laundry.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class About extends JFrame implements ActionListener{
    
    
    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel l1=new JLabel("ABOUT");
        l1.setBounds(200,10,100,40);
        l1.setBackground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(l1);
        
        String s = "                                    About Projects          \n  "
                + "\nThe objective of the Laundry Management System "
                + "project is to determine the number of clothes "
                + "collected, in relation to their owners, as this also "
                + "helps users to fix a date for the collection of their "
                + "clothes.\n\n"
                + "The system also helps laundry firms keep detailed records of "
                + "customer clothing, which is highly discouraging as customers are "
                + "filled with disappointmnets, arising from issues such as customer "
                + "clothes mix-ups and untimely retrieval of clothes. The customer's "
                + "information is secured, as a specific id is allocated per registration\n\n"
                + "to avoid contrasting information."
                
                ;
        
        TextArea area=new TextArea(s, 10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);
        
        JButton back=new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
        
                
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String args[]){
        new About();
    }
    
}

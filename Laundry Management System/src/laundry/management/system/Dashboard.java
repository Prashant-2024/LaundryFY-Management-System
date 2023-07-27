
package laundry.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener{
    
    JButton home, signup, login, viewac, laundrybag, bagsearch, laundrytkt, viewtkt, logout, about;
    
    Dashboard(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.GRAY);
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2=i1.getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading =new JLabel("DASHBOARD");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 33));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.GRAY);
        p2.setBounds(0,65,200,900);
        add(p2);
        
        home=new JButton("HOME");
        home.setBounds(0, 0, 300, 50);
        home.setBackground(new Color(0,0,102));
        home.setForeground(Color.WHITE);
        home.setFont(new Font("Tahoma", Font.PLAIN,20));
        home.setMargin(new Insets(0,0,0,200));
        home.addActionListener(this);
        p2.add(home);
        
        signup=new JButton("SIGN UP");
        signup.setBounds(0, 50, 300, 50);
        signup.setBackground(new Color(0,0,102));
        signup.setForeground(Color.WHITE);
        signup.setFont(new Font("Tahoma", Font.PLAIN,20));
        signup.setMargin(new Insets(0,0,0,180));
        signup.addActionListener(this);
        p2.add(signup);
        
        login=new JButton("LOGIN");
        login.setBounds(0, 100, 300, 50);
        login.setBackground(new Color(0,0,102));
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Tahoma", Font.PLAIN,20));
        login.setMargin(new Insets(0,0,0,195));
        login.addActionListener(this);
        p2.add(login);
        
        viewac=new JButton("VIEW ACCOUNT");
        viewac.setBounds(0, 150, 300, 50);
        viewac.setBackground(new Color(0,0,102));
        viewac.setForeground(Color.WHITE);
        viewac.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewac.setMargin(new Insets(0,0,0,110));
        viewac.addActionListener(this);
        p2.add(viewac);
        
        laundrybag=new JButton("LAUNDRY BAG");
        laundrybag.setBounds(0, 200, 300, 50);
        laundrybag.setBackground(new Color(0,0,102));
        laundrybag.setForeground(Color.WHITE);
        laundrybag.setFont(new Font("Tahoma", Font.PLAIN,20));
        laundrybag.setMargin(new Insets(0,0,0,125));
        laundrybag.addActionListener(this);
        p2.add(laundrybag);
        
        bagsearch=new JButton("SEARCH BAG");
        bagsearch.setBounds(0, 250, 300, 50);
        bagsearch.setBackground(new Color(0,0,102));
        bagsearch.setForeground(Color.WHITE);
        bagsearch.setFont(new Font("Tahoma", Font.PLAIN,20));
        bagsearch.setMargin(new Insets(0,0,0,150));
        bagsearch.addActionListener(this);
        p2.add(bagsearch);
        
        laundrytkt=new JButton("LAUNDRY TICKET");
        laundrytkt.setBounds(0, 300, 300, 50);
        laundrytkt.setBackground(new Color(0,0,102));
        laundrytkt.setForeground(Color.WHITE);
        laundrytkt.setFont(new Font("Tahoma", Font.PLAIN,20));
        laundrytkt.setMargin(new Insets(0,0,0,100));
        laundrytkt.addActionListener(this);
        p2.add(laundrytkt);
        
        viewtkt=new JButton("VIEW TICKETS");
        viewtkt.setBounds(0, 350, 300, 50);
        viewtkt.setBackground(new Color(0,0,102));
        viewtkt.setForeground(Color.WHITE);
        viewtkt.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewtkt.setMargin(new Insets(0,0,0,130));
        viewtkt.addActionListener(this);
        p2.add(viewtkt);
        
        logout=new JButton("LOGOUT");
        logout.setBounds(0, 400, 300, 50);
        logout.setBackground(new Color(0,0,102));
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma", Font.PLAIN,20));
        logout.setMargin(new Insets(0,0,0,180));
        logout.addActionListener(this);
        p2.add(logout);
        
        about=new JButton("ABOUT");
        about.setBounds(0, 450, 300, 50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,190));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
        Image i5=i4.getImage().getScaledInstance(1650,1000, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1650,1100);
        add(image);
        
        JLabel text=new JLabel("LaundryFY");
        text.setBounds(1260, 10, 300, 40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma", Font.BOLD, 50));
        p1.add(text);
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==home){
            setVisible(false);
            new Dashboard();
        }
        else if (ae.getSource()==signup){
            new Signup();
        }
        else if (ae.getSource()==login){
            new Login();
        }
        else if (ae.getSource()==viewac){
            new ViewAccount("0000");
        }
        else if (ae.getSource()==laundrybag){
            new LaundryBag();
        }
        else if (ae.getSource()==bagsearch){
            new SearchBag();
        }
        else if (ae.getSource()==laundrytkt){
            new LaundryTicket();
        }
        else if (ae.getSource()==viewtkt){
            
        }
        else if (ae.getSource()==logout){
            new Login();
        }
        else if (ae.getSource()==about){
            new About();
        }
    }
    
    
    public static void main(String args[]){
        new Dashboard();
    }
    
    
}

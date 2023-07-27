
package laundry.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread thread;
    Splash(){
        setSize(1280, 720);
        setLocation(200,200);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/LaundryFY Logo.png"));
        Image i2=i1.getImage().getScaledInstance(600, 600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        
        add(image);
                
        setVisible(true);
        thread =new Thread(this);
        thread.start();
       
    }
    
    public void run(){
        try{
            Thread.sleep(7000);
            new Login();
            setVisible(false);
        }
        catch (Exception e){
            
        }
        
    }
    public static void main(String[] arsg){
        
        
        new Splash();
    }
}

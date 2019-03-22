/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jarno
 */
public class Opnemen {
    public Opnemen(){
       JFrame frame = new JFrame("Bank");
            JButton button,button1, button2, button3, button4, buttoninfo;
            button = new JButton("20");
            button1 = new JButton("50");
            button2 = new JButton("100");
            button3 = new JButton(" 200");
            button4 = new JButton("500");
            buttoninfo = new JButton("Kies hier hoeveel geld uw wil pinnen");
            frame.add(buttoninfo);
            frame.add(button);
            frame.add(button1);
            frame.add(button2);
            frame.add(button3);
            frame.add(button4);
            
            frame.setLayout(new FlowLayout());
            frame.setSize(300,300);  
            frame.setVisible(true);
            button.addActionListener(new ActionListener() {
                
           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
  
        
            });
}
}

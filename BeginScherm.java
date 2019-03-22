/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.awt.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Jarno
 */
public class BeginScherm implements ActionListener {
    
        public BeginScherm(){
//                        
            JFrame frame = new JFrame("Bank");
            JButton button,button1, button2;
            button = new JButton("Scan alstublieft uw pas");
//            button1 = new JButton("Storten");
//            button2 = new JButton("Exit");
//		button3 = new JButton(" 4");
//		button4 = new JButton("button 5");
            frame.add(button);
            frame.setLayout(new FlowLayout());
            frame.setSize(300,300);  
            frame.setVisible(true);
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    InlogScherm a = new InlogScherm();
                        
                    
                }
            });
//		frame.add(button3);
//		frame.add(button4);
           
        }
        public void actionPerformed(ActionEvent e){
                
                
            
        }
        
}


    package project3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class InlogScherm implements ActionListener{
    
	public InlogScherm(){
            
		JFrame frame = new JFrame("Bank");
		JButton button,button1, button2, button3,button4;
		button = new JButton("Opnemen");
		button1 = new JButton("Storten");
		button2 = new JButton("Exit");
//		button3 = new JButton(" 4");
//		button4 = new JButton("button 5");
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
                button.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Opnemen o = new Opnemen();
                    }
            
        });
                button1.addActionListener(new ActionListener(){
                   
                    public void actionPerformed(ActionEvent a){
                        Storten s = new Storten();
                    }
                });
                button2.addActionListener(new ActionListener(){

                    public void actionPerformed(ActionEvent d) {

                        Exit e = new Exit();
                    }
                    
                });
                
//		frame.add(button3);
//		frame.add(button4);
		frame.setLayout(new FlowLayout());
		frame.setSize(300,300);  
		frame.setVisible(true);  
                
               
	}
	public static void main(String[] args) {
            
		new BeginScherm();
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
 
}
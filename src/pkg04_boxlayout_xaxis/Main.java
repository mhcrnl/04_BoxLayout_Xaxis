/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04_boxlayout_xaxis;

import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author mhcrnl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create and set up a frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("BoxLayout Example Filler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the panel to add buttons
        JPanel panel = new JPanel();
        
        //Set the BoxLayout to be Yaxis from top to down
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        panel.setLayout(boxlayout);
        
        // Set border for the panel
        panel.setBorder(new EmptyBorder(new Insets(200, 250, 200, 250)));
        
        JButton jb1 = new JButton("Button1");
        JButton jb2 = new JButton("Button2");
        JButton jb3 = new JButton("Button3");
        
        panel.add(jb1);
        panel.add(Box.createRigidArea(new Dimension(0, 80)));
        panel.add(jb2);
        panel.add(Box.createRigidArea(new Dimension(0, 80)));
        panel.add(jb3);
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}

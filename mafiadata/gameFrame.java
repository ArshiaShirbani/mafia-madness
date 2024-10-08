package mafiadata;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.util.*;

public class gameFrame extends JFrame {


JLabel label = new JLabel(); 
Border border = BorderFactory.createLineBorder(Color.RED,2)  ;




gameFrame(){

/*ImageIcon image = new ImageIcon()
    Tiah insert background image Here
    */
    label.setBackground(Color.gray);
    label.setForeground(new Color(0,0,0));
    label.setText("Looks like there was a murder today... It might be best to wait for everyone at the Town Hall");
    //label.setHorizontalTextPosition(JLabel.TOP);
    //label.setVerticalTextPosition(JLabel.TOP);
    label.setFont(new Font("Monospaced Bold", Font.PLAIN,30));
    label.setOpaque(true);
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.TOP);
    label.setHorizontalAlignment(JLabel.CENTER);
    /*label.setIcon();
    label.setIconTextGap();
    */

    

    this.setTitle("MafiaMadness");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setSize(1280, 960);
    this.setVisible(true);
    this.getContentPane().setBackground(Color.WHITE);
    this.add(label);
    /*   Tiah logo goes here
    ImageIcon logo = new ImageIcon("");
    this.setIconImage(logo.getImage());
    */

 

        }
        
   

    
}
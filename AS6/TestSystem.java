import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 
public class TestSystem
{
    public static void main(String[] args)
    {
          // initial interface
          ActionListener a = new MyActionListener(); 
          Frame f = new Frame("Java Applet");
          f.setVisible(true);
          f.setSize (110,110);
          
          //button for sports car
          Button b;
          f.add(b = new Button("SportsCar"), BorderLayout.NORTH); 
          b.setActionCommand("SportsCar"); 
          b.addActionListener(a);//add listener
          
          //button for Van
          Button c;
          f.add(c = new Button("Van"), BorderLayout.CENTER); 
          c.addActionListener(a); //add listener
          
          //edit button
          Button exit;
          f.add(exit = new Button("Exit"), BorderLayout.SOUTH); 
          exit.setActionCommand("Exit");
          exit.addActionListener(a);//add listener


    }

}
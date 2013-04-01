import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 
class MyActionListener implements ActionListener { 
  public void actionPerformed(ActionEvent ae){
      String s = ae.getActionCommand(); 
      double hp;
      double w;
      double ts;
      double cw;
      // checks for action called
      if (s.equals("Exit")) //exit button
      { 
          System.exit(0); 
      } 
      else if (s.equals("SportsCar")) { // sports button
         //user input
         hp = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Horse Power"));
         w = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Weight"));
         ts = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Top Speed"));
         //results
         SportsCar car1 = new SportsCar(hp, w, ts);
         JLabel label1 = new JLabel ("<html>Hp = " + hp +
         "<br>W = " + w +
         "<br>Ts = " + ts+
         "<br><br>Consumes "+car1.fuelConsumption() + " of fuel"+
         "<br>Acceleration = "+car1.acceleration()+ 
         
         
         "</html>");
         //frame for results
         JPanel panel = new JPanel ();
         JFrame frame2= new JFrame("Sports Car");
         frame2.setVisible(true);
         frame2.setSize (250,150);
         frame2.add (panel);
         panel.add(label1); 
      } 
      else { //van button
          //user input
          hp = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Horse Power"));
          w = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Weight"));
          cw = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Carry Weight"));
          Van lorry1= new Van (hp,w,cw);
          //results
          JLabel label1 = new JLabel ("<html>Hp = " + hp +
         "<br>W = " + w +
         "<br>Cw = " + cw+
         //"<br><br>Consumes "+lorry1.fuelConsumption() + " of fuel"+
         "<br>Acceleration = "+lorry1.acceleration()+ 
         
         
         "</html>");
         //frame for results
          JPanel panel = new JPanel ();
          JFrame frame2= new JFrame("Van");
          frame2.setVisible(true);
          frame2.setSize (250,100);
          frame2.add (panel);
          panel.add(label1);       
      } 
  } 
} 
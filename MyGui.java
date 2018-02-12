import java.awt.*;
import java.awt.event.*;

public class MyGui extends Frame implements ActionListener{
   public static void main(String[] args){
      MyGui test = new MyGui();
   }
   
   Frame frame = new Frame();
   
   Button plus = new Button("+");
   Button minus = new Button("-");
   Button multiply = new Button("*");
   Button divide = new Button("/");
   Button power = new Button("^");
   Button modulus = new Button("%");
   
   TextField textOne = new TextField();
   TextField textTwo = new TextField();
   TextField textThree = new TextField();
   
   //Colors
   Color frameBackground = Color.decode("#FF2A11");
   
   MyGui(){
      
      //Coloring Frame
      frame.setBackground(frameBackground);
      
      //Button Bounds (Top Row)
      plus.setBounds(56,150,80,80); plus.setBackground(Color.BLUE); plus.setForeground(Color.WHITE);
      minus.setBounds(192,150,80,80); minus.setBackground(Color.BLUE); minus.setForeground(Color.WHITE);
      multiply.setBounds(328,150,80,80); multiply.setBackground(Color.BLUE); multiply.setForeground(Color.WHITE);
      divide.setBounds(464,150,80,80); divide.setBackground(Color.BLUE); divide.setForeground(Color.WHITE);
      
      //Button Bounds (Middle Row)
      power.setBounds(56,260,80,80); power.setBackground(Color.BLUE); power.setForeground(Color.WHITE);
      modulus.setBounds(192,260,80,80); modulus.setBackground(Color.BLUE); modulus.setForeground(Color.WHITE);
      
      //Textfield Bounds
      textOne.setBounds(30,60,200,30);
      textTwo.setBounds(370,60,200,30);
      textThree.setBounds(200,500,200,30);
      
      plus.addActionListener(this);
      minus.addActionListener(this);
      multiply.addActionListener(this);
      divide.addActionListener(this);
      power.addActionListener(this);
      modulus.addActionListener(this);
      frame.add(plus);
      frame.add(minus);
      frame.add(multiply);
      frame.add(divide);
      frame.add(power);
      frame.add(modulus);
      frame.add(textOne);
      frame.add(textTwo);
      frame.add(textThree);
      frame.setSize(600,600);
      frame.setLayout(null);
      frame.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e){
      String s1 = textOne.getText();
      String s2 = textTwo.getText();
      double a = Double.parseDouble(s1);
      double b = Double.parseDouble(s2);
      double c = 0;
      if(e.getSource() == plus){
         c=a+b;
      }else if(e.getSource() == minus){
         c=a-b;
      }else if(e.getSource() == multiply){
         c=a*b;
      }else if(e.getSource() == divide){
         c=(double)a/b;
      }else if(e.getSource() == power){
         c=Math.pow(a,b);
      }else if(e.getSource() == modulus){
         c=a%b;
      }
      String result = String.valueOf(c);
      textThree.setText(result);
   }
   
}
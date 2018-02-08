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
   
   TextField textOne = new TextField();
   TextField textTwo = new TextField();
   TextField textThree = new TextField();
   
   MyGui(){
      //Button Bounds
      plus.setBounds(30,150,80,80); plus.setBackground(Color.BLUE); plus.setForeground(Color.WHITE);
      minus.setBounds(140,150,80,80); minus.setBackground(Color.BLUE); minus.setForeground(Color.WHITE);
      multiply.setBounds(250,150,80,80); multiply.setBackground(Color.BLUE); multiply.setForeground(Color.WHITE);
      divide.setBounds(360,150,80,80); divide.setBackground(Color.BLUE); divide.setForeground(Color.WHITE);
      
      //Textfield Bounds
      textOne.setBounds(30,60,200,30);
      textTwo.setBounds(370,60,200,30);
      textThree.setBounds(200,500,200,30);
      
      plus.addActionListener(this);
      minus.addActionListener(this);
      multiply.addActionListener(this);
      divide.addActionListener(this);
      frame.add(plus);
      frame.add(minus);
      frame.add(multiply);
      frame.add(divide);
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
      int a = Integer.parseInt(s1);
      int b = Integer.parseInt(s2);
      int c = 0;
      if(e.getSource() == plus){
         c=a+b;
      }else if(e.getSource() == minus){
         c=a-b;
      }else if(e.getSource() == multiply){
         c=a*b;
      }else if(e.getSource() == divide){
         c=a/b;
      }
      String result = String.valueOf(c);
      textThree.setText(result);
   }
   
}
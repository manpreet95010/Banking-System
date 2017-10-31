import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class newuser extends JFrame implements ActionListener{
 int a1=0;   
 JLabel l1,l2;
 JTextField t1;
 JPasswordField t2;
 JButton b1;
 Choice c1;
    private String b;
 newuser(){
     setSize(600,400);setLocation(500,200);
 l1=new JLabel("Username");
 l2=new JLabel("Password");
 t1=new JTextField(15);
 t2=new JPasswordField(15);
 b1=new JButton("Create");
 c1=new Choice();
 c1.add("admin");
 c1.add("user");
 setLayout(new FlowLayout());
  add(l1);add(t1);add(l2);add(t2);add(c1);
  add(b1);
  setBounds(600,300,200,200);
   b1.addActionListener(this);
 }
   public void actionPerformed(ActionEvent ae)
   {
   if((t1.getText()==""&&t2.getText()=="")||(t1.getText()==""||t2.getText()==""))
   {    JOptionPane.showMessageDialog(null,"New User cannot be created Please fill the username and password");
   a1=1;
   }else{a1=0;}
   try
   {
   if(a1==0){
      String b="insert into login values('"+t1.getText()+"','"+t2.getText()+"','"+c1.getSelectedItem()+"')";
   
   conn c1=new conn();
    c1.update(b);
    JOptionPane.showMessageDialog(null,"New User created");a1=0;
   }}
   catch(Exception e){e.printStackTrace();}
  
   }
}
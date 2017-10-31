import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class login extends JFrame implements ActionListener{
   JLabel l1,l2;
   JTextField t1;
   JPasswordField t2;
   JButton b1,b2;
   Image p;
   login()
   {
       setSize(600,600);
       setLocation(500,100);
    ImageIcon c1=new ImageIcon(ClassLoader.getSystemResource("adminlogo.jpg"));
    JLabel i1=new JLabel(c1);
    
   l1=new JLabel("username");
   l2=new JLabel("password");
   t1=new JTextField(15);
   t2=new JPasswordField(15);
   b1=new JButton("Login");
   setLayout(new FlowLayout());
   add(l1);
   add(t1);
   add(l2);
   add(t2);
   add(b1);
   add(i1);
   b1.addActionListener(this);
   }
   public void actionPerformed(ActionEvent ae)
   {
   String msg=ae.getActionCommand();
   try
   {
   conn c1=new conn();
   String u=t1.getText();
   String v=t2.getText();//depricated function
   String q="select * from login where username='"+u+"' and password='"+v+"'";
   ResultSet rs=c1.execute(q);
   if(rs.next())
   {
   if(msg.equals("Login"))
   {
   new project(1,u).setVisible(true);
   }
   
   
   else
   {
   JOptionPane.showMessageDialog(null,"invalid login");
   setVisible(false);
   
   }}
   }
   catch(Exception e){e.printStackTrace();}
   }
public static void main(String args[])
{
//login l1=new login();//
 login l1=new login();
        l1.setVisible(true);
        l1.setSize(950,300);
        l1.setLocation(100,200);
}
}

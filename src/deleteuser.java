import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class deleteuser extends JFrame implements ActionListener {
 Choice c1,c2;
 JLabel l1,l2,l3;
 JButton b1;
 JTextField t1;
 JPasswordField p1,p2;
deleteuser()
 {
     setSize(600,400);setLocation(500,200);
 l1=new JLabel("Username");
 l2=new JLabel("Password");

 p1=new JPasswordField(15);
 p2=new JPasswordField();
 c1=new Choice();
 try
 {
 conn c=new conn();
 ResultSet rs=c.execute("select * from login");
 while(rs.next())
 {
 c1.add(rs.getString("username"));
 }
 }catch(Exception e){e.printStackTrace();}
 setLayout(new FlowLayout());
 add(l1); add(c1);  add(l2);add(p1);
 b1=new JButton("Delete User");
 add(b1);
 b1.addActionListener(this);
 p1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
 String q="delete from login where username="+c1.getSelectedItem();
   try
    {
    String q1="select * from login where username"+c1.getSelectedItem();
    conn c1=new conn();
    ResultSet rs=c1.execute(q1);
    while(rs.next())
    {
    String a=rs.getString("passwword");
    while(p1.getText()!=a)
    {
    JOptionPane.showMessageDialog(null,"Invalid Password");
    }
    }
    
    }
    catch(Exception e){}

 try
 {
 conn c=new conn();
 c.update(q);

 }catch(Exception e){}
 JOptionPane.showMessageDialog(null,"Record updated");
 }   
 
}


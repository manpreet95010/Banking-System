import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class edituser extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JPasswordField p1,p2;
    Choice c1;
    edituser()
    {
        setSize(600,400);setLocation(500,200);
    l1=new JLabel("Username");
    l2=new JLabel("Old Password");
    t1=new JTextField();
    t2=new JTextField();
    p1=new JPasswordField();
    p2=new JPasswordField();
    c1=new Choice();
 try
 {
 conn c=new conn();
 ResultSet rs=c.execute("select * from bank");
 while(rs.next())
 {
 c1.add(rs.getString("accno"));
 }
 }catch(Exception e){e.printStackTrace();}

    
    
    }
     public void actionPerformed(ActionEvent ae)
 {
 String q="update bank set balance=balance+"+t1.getText()+" where accno="+c1.getSelectedItem();
 try
 {
 conn c=new conn();
 c.update(q);
 }catch(Exception e){}
 JOptionPane.showMessageDialog(null,"Record updated");
 }   
}

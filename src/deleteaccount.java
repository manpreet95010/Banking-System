import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class deleteaccount extends JFrame implements ActionListener {
 Choice c1,c2;
 JLabel l1,l2,l3;
 JButton b1;
 JTextField t1;
deleteaccount()
 {
     setSize(600,400);setLocation(500,200);
 l1=new JLabel("Account Number");
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
 setLayout(new FlowLayout());
 add(l1); add(c1);  
 b1=new JButton("delete account");
 add(b1);
 b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent ae)
 {
 String q="delete from bank where accno="+c1.getSelectedItem();
 try
 {
 conn c=new conn();
 c.update(q);

 }catch(Exception e){}
 JOptionPane.showMessageDialog(null,"Record updated");
 }   
 
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class deposit extends JFrame implements ActionListener {
 Choice c1,c2;
 JLabel l1,l2,l3;
 JButton b1;
 JTextField t1;
 deposit()
 {
     setSize(600,400);setLocation(500,200);
 l1=new JLabel("Account Number");
 l2=new JLabel("Deposit Amount");
 t1=new JTextField(20);
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
 add(l1); add(c1); add(l2); add(t1);
 b1=new JButton("deposit");
 add(b1);
 b1.addActionListener(this);
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

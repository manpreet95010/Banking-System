import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class newaccount extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7;
JTextField t1,t2,t3,t4,t5,t6,t7;
JButton b1;
Checkbox cb1,cb2;
CheckboxGroup cg;
newaccount()
{
setSize(280,400);
setLocation(100,100);
setLayout(new FlowLayout());
l1=new JLabel("Account Number");
l2=new JLabel("Name");
l3=new JLabel("Balance");
l4=new JLabel("Sex");
l5=new JLabel("Address");
l6=new JLabel("Phone NO");
l7=new JLabel("Email id");
cg=new CheckboxGroup();
cb1=new Checkbox("Male",cg,true);
cb2=new Checkbox("Female",cg,false);
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);

add(l1); add(t1); add(l2); add(t2); add(l3); add(t3);add(l4);add(cb1);add(cb2); 
add(l5);add(t4);add(l6);add(t5);add(l7);add(t6);

b1=new JButton("Submit");
add(b1);  b1.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
String q="insert into bank values("+t1.getText()+",'"+t2.getText()+"',"+t3.getText()+",'"+t4.getText()+"',"+t5.getText()+",'"+cg.getSelectedCheckbox().getLabel()+"','"+t6.getText()+"')";

try
{
conn c1=new conn();
c1.update(q);
JOptionPane.showMessageDialog(null,"Record inserted");
}catch(Exception e){e.printStackTrace();}
}
}

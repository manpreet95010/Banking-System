import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class tab extends JFrame implements ActionListener{
    JTable t1;
    JButton b3;    
 tab(String d[][],String h[])
 {
     setSize(300,300);setLocation(500,200);
b3=new JButton("print");b3.addActionListener(this);
 t1=new JTable(d,h);
JScrollPane js =new JScrollPane(t1);
add(js);add(b3,"South");

 }
 public void actionPerformed(ActionEvent ae)
 {
if(ae.getSource()==b3)
{
try{t1.print();}catch(Exception e){e.printStackTrace();}
}
 }
    
}

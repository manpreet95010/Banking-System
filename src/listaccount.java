import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class listaccount extends JFrame implements ActionListener{

    JTable j1;
    JButton b1;
    String h[]={"Account Number","Name","Balance"};
    String d[][]=new String[15][3];
    int i=0,j=0;
    listaccount()
    {
        setSize(600,400);setLocation(500,200);
    setTitle("view Customer Account");
    setSize(300,300);
    setLocation(180,180);
    try
    {
    String q="select * from bank";
    conn c1=new conn();
    ResultSet rs=c1.execute(q);
    while(rs.next())
    {
    d[i][j++]=rs.getString("accno");
    d[i][j++]=rs.getString("name");
    d[i][j]=rs.getString("balance");
    i++;
    j=0;
    }
    
    }
    catch(Exception e){}
    j1=new JTable(d,h);
    b1=new JButton("Print");
    add(b1,"South");
    JScrollPane s1=new JScrollPane(j1);
    add(s1);
    b1.addActionListener(this);
    
    }
public void actionPerformed(ActionEvent ae)
{
try
{j1.print();}catch(Exception e){}
}
  
}

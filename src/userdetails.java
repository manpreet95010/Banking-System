import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class userdetails extends JFrame implements ActionListener{
 JLabel l1;
  Choice c1;
 
  JButton b1;
  userdetails()
  {
  setSize(500,500);
      b1=new JButton("Check Details");b1.addActionListener(this);
     
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
 add(l1); add(c1);add(b1); 
    }
  public void actionPerformed(ActionEvent ae)
  {
   String q="select * from bank where accno="+c1.getSelectedItem();
if(ae.getSource()==b1){
   String h[]={"ACCOUNT NUMBER","Name","Sex","Address","Phone No","Email id"};
String d[][]=new String[100][6];

int i=0,j=0;
try{
    conn c2=new conn();

ResultSet rs=c2.execute(q);
while(rs.next())
{
d[i][j++]=rs.getString("accno");
d[i][j++]=rs.getString("name");
d[i][j++]=rs.getString("sex");
d[i][j++]=rs.getString("address");
d[i][j++]=rs.getString("phoneno");
d[i][j++]=rs.getString("email");
i++;j=0;
}
}catch(Exception e){}
new tab(d,h).setVisible(true);


}}
 
 

}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class statement extends JFrame implements ActionListener{
  JLabel l1;   
  Choice c1;
  JTable t1;
  JButton b1,b2;
    statement()
    {
      setSize(500,500);
      
    
      b1=new JButton("Statement");b1.addActionListener(this);
      b2=new JButton("print");b2.addActionListener(this);
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
 add(l1); add(c1);add(b1); add(b2,"South");  b2.setVisible(false); 
    }
  public void actionPerformed(ActionEvent ae)
  {
         String q="select * from bank where accno="+c1.getSelectedItem();

 if(ae.getSource()==b1)
 {
       
     String h[]={"",""};
String d[][]=new String[100][5];

int i=0,j=0;
try{
    conn c2=new conn();

ResultSet rs=c2.execute(q);
while(rs.next())
{
d[i][j++]="ACCOUNT NUMBER: "+rs.getString("accno");
d[i][j++]="Name: "+rs.getString("name");
d[1][0]="Balance: "+rs.getString("Balance");
d[1][1]="Branch: Sector 47,Chandigarh";
d[2][0]="Account Type: SBCHQGENPUBINDNONRURALINR";

i++;j=0;
}
new tab(d,h).setVisible(true);

}catch(Exception e){}
 
 }
  
  }

public static void main(String args[])
{
new statement().setVisible(true);
}
}

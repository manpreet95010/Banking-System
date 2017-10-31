import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class project extends JFrame implements ActionListener {
    project(int n,String u)
    {
    setSize(1000,1000);
    ImageIcon c1=new ImageIcon(ClassLoader.getSystemResource("projectlogo.jpg"));
    JLabel l1=new JLabel(c1);
    add(l1);
    
    JMenuBar mb=new JMenuBar();
    setJMenuBar(mb);
    JMenu first=new JMenu("Master");
    mb.add(first);
    JMenuItem t1=new JMenuItem("New Account");
    t1.setForeground(Color.blue);
    t1.setFont(new Font("Monospaced",Font.PLAIN,12));
    t1.setMnemonic('e');
    t1.setIcon(new ImageIcon(ClassLoader.getSystemResource("new.jpg")));
    t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
    
    JMenuItem t2=new JMenuItem("Deposit");
    JMenuItem t3=new JMenuItem("Withdraw");
    
    first.add(t1);first.add(t2);first.add(t3);
    t1.addActionListener(this);    t2.addActionListener(this);    t3.addActionListener(this);
    
    JMenuItem t4=new JMenuItem("List Account");
    first.add(t4);
    t4.addActionListener(this);
    
    JMenu second=new JMenu("Updation");
    JMenu third=new JMenu("Reports");
    JMenu fourth=new JMenu("Utilities");
    mb.add(second); mb.add(third); mb.add(fourth); 
    
    JMenuItem m1=new JMenuItem("New User");
    JMenuItem m2=new JMenuItem("Edit User");
    JMenuItem m3=new JMenuItem("Delete User");
    JMenuItem m4=new JMenuItem("Delete Account");
    
            
    second.add(m1); second.add(m2);  second.add(m3);second.add(m4);
    
    JMenuItem h1=new JMenuItem("User Details");
    JMenuItem h2=new JMenuItem("Statement");
    third.add(h1); third.add(h2);  
    
    JMenuItem s1=new JMenuItem("Notepad");
    JMenuItem s2=new JMenuItem("Calculator");
    JMenuItem s3=new JMenuItem("Browser");
    m1.addActionListener(this);
    m2.addActionListener(this);
    m3.addActionListener(this);
    m4.addActionListener(this);
    h1.addActionListener(this);
    h2.addActionListener(this);
    s1.addActionListener(this);
    s2.addActionListener(this);
    s3.addActionListener(this);
    fourth.add(s1); fourth.add(s2); fourth.add(s3);
    
    }
    public void actionPerformed(ActionEvent ae)
    {
        String msg=ae.getActionCommand();
        if(msg.equals("New Account"))
        {new newaccount().setVisible(true);}
    if(msg.equals("Deposit"))
    {new deposit().setVisible(true);}
    if(msg.equals("List Account"))
    {new listaccount().setVisible(true);}
    if(msg.equals("Withdraw"))
    {new withdraw().setVisible(true);}
    if(msg.equals("Delete User"))
    {new deleteuser().setVisible(true);}
     if(msg.equals("Delete Account"))
    {new deleteaccount().setVisible(true);}
    if(msg.equals("New User"))   
    {new newuser().setVisible(true);}  
    if(msg.equals("Statement"))   
    {new statement().setVisible(true);}  
    if(msg.equals("User Details"))   
    {new userdetails().setVisible(true);}  
    if(msg.equals("Notepad"))
    {
    Runtime r=Runtime.getRuntime();
    Process p=null;
    try
    {
    String s="notepad.exe";
    p=r.exec(s);
    
    }catch(Exception e){}
    }
    
    if(msg.equals("Calculator"))
    {
    Runtime ra=Runtime.getRuntime();
    Process pa=null;
    try
    {
    String sa="calc.exe";
    pa=ra.exec(sa);
    
    }catch(Exception e){}
    }
    
    if(msg.equals("Browser"))
    {
    Runtime rb=Runtime.getRuntime();
    Process pb=null;
    try
    {
    String sb="C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
    System.out.print(sb);
    pb=rb.exec(sb);
    
    }catch(Exception e){e.printStackTrace();}
    }
    }
}

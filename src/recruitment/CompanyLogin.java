package recruitment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import java.applet.*;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CompanyLogin  implements ActionListener
 {
    JFrame jf;
    Font f,f1;
	JButton b1,b2,b3;
	JLabel l1,l2,l3,l4;
	ImageIcon img1;
    JTextField t1;
   	JPasswordField pwd;
   


    public CompanyLogin()
     {
     	

     	jf=new JFrame();
		f = new Font("Times New Roman",Font.BOLD,20);//button
		f1 = new Font("Times New Roman",Font.BOLD,25);//label
		jf.setLayout(null);


		l4=new JLabel("COMPANY LOGIN FORM");
	    l4.setFont(new Font("Times New ROman",Font.BOLD,30));
	    l4.setForeground(Color.BLUE);
		l4.setBounds(200,0,500,30);
		jf.add(l4);

    	l2=new JLabel("Company user Name:");
		l2.setFont(f1);
		l2.setForeground(Color.YELLOW);
		l2.setBounds(40,180,340,30);
		jf.add(l2);

		t1 = new JTextField(20);
		t1.setBounds(370,180,200,30);
		jf.add(t1);

		l3=new JLabel("Company password:");
		l3.setFont(f1);
		l3.setForeground(Color.YELLOW);
		l3.setBounds(40,230,320,30);
		jf.add(l3);

		pwd=new JPasswordField(10);
		pwd.setFont(f1);
		pwd.setBounds(370,230,200,30);
		jf.add(pwd);

		b1=new JButton("LOGIN",new ImageIcon("ok.png"));
		b1.setFont(f);
		b1.setBounds(120,330,130,40);jf.add(b1);
		b1.addActionListener(this);

		b2=new JButton("SIGN UP");
		b2.setFont(f);
		b2.setBounds(280,330,130,40);jf.add(b2);
		b2.addActionListener(this);

		b3=new JButton("Cancel",new ImageIcon("cancel.png"));
		b3.setFont(f);
		b3.setBounds(440,330,130,40);jf.add(b3);
		b3.addActionListener(this);

        img1=new ImageIcon("clogin.png");
		l1=new JLabel(img1);
		l1.setBounds(0,0,750,480);
        jf.add(l1);

         jf.setTitle("COMPANY LOGIN");
	     jf.setSize(750,480);
		 jf.setLocation(250,100);
		 jf.setResizable(false);
	     jf.setVisible(true);

	    
    }

     public void actionPerformed(ActionEvent ae)
     {
     

  	   if(ae.getSource()==b1)
  		{
  		//fetch
             
  	     
  	   		if(((t1.getText()).equals(""))&&((pwd.getText()).equals("")))
  	        {
  		    JOptionPane.showMessageDialog(null,"Please enter user name and Password!!","Warning",JOptionPane.WARNING_MESSAGE);
  	        }	        
  	        else 
  	        {
  	       
  	        
  	        try
          	{
  	        	int flag=0;
  	        	FileReader f=new FileReader("company.txt");
  	        	BufferedReader br=new BufferedReader(f);
  	        	String s="";
  	        	while((s=br.readLine())!=null)
  	        	{
  	        		String data []=new String[9];
  	        		data=s.split(",");
  	        		
  	        		
  	        		if(t1.getText().equals(data[6]) && pwd.getText().contentEquals(data[7]))
  	        		{
  	        			JOptionPane.showMessageDialog(null,"login Succesfull");
  	        			new CompanyDashboard();
  	        			jf.setVisible(false);
  	        			flag=1;
  	        		}
  	        		
  	        	}
  	        	if(flag==0)
  	        	{
  	        	JOptionPane.showMessageDialog(null,"user name and password incorrect");
  	        	}
  	        	br.close();

  	       }
  	        catch(Exception e)
  	        {
  	        	
  	        }
  	       
      			//JOptionPane.showMessageDialog(null,"user name and password incorrect");
  	   
  	        }
  	   		
  		}
		else if(ae.getSource()==b2)
		{
			new CompanySignup();
			jf.setVisible(false);
		}
		else if(ae.getSource()==b3)
		{
           new Entery();
           	jf.setVisible(false);
		}
     }
    // public static void main(String args[])
    // {
	//	new CompanyLogin();
	// }
}
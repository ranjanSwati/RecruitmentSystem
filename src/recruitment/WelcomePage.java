package recruitment;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.applet.*;

public class WelcomePage extends JFrame implements ActionListener
{
    JFrame jf;
    Font f,f1;
	JButton b,b1;
	JLabel l1,l2,l3,l4;
	ImageIcon img1;
	JTextField t1;

	public WelcomePage()
	{
		jf=new JFrame();
		f = new Font("Times New Roman",Font.BOLD,20);//button
		f1 = new Font("Times New Roman",Font.BOLD,25);//label
		jf.setLayout(null);
		
	    l2=new JLabel("Welcome To campus Recruitment");
		l2.setFont(new Font("Times New Roman",Font.BOLD,40));
		l2.setForeground(Color.RED);
		l2.setBounds(180,100,900,30);
		jf.add(l2);

		l3=new JLabel("Recruitment System");
		l3.setFont(new Font("Times New Roman",Font.BOLD,30));
		l3.setForeground(Color.RED);
		l3.setBounds(300,170,600,30);
		jf.add(l3);

		l4=new JLabel("Press OK To Countinue");
		l4.setFont(f1);
		l4.setForeground(Color.YELLOW);
		l4.setBounds(120,370,680,30);
		jf.add(l4);

		b=new JButton("Ok",new ImageIcon("ok.png"));
		b.setFont(f);
	 	b.setBounds(200,550,130,40);
		jf.add(b);
		b.addActionListener(this);

		b1=new JButton("Exit",new ImageIcon("cancel.png"));
		b1.setFont(f);
		b1.setBounds(500,550,130,40);
		jf.add(b1);
		b1.addActionListener(this);

        img1=new ImageIcon("welcomepage.jpg");
		l1=new JLabel(img1);
		l1.setBounds(1,1,900,700);
        jf.add(l1);

		 jf.setTitle("WELCOME TO RECRUITMENT SYSTEM");
	     jf.setSize(900,700);
		 jf.setLocation(220,20);
		 jf.setResizable(false);
	     jf.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
	       	new Entery();
            jf.setVisible(false);
		}
		else if(ae.getSource()==b1)
		{
		
			System.exit(0);
		}
    }
	
}
package recruitment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Entery implements ActionListener{
	    JFrame jf;
	    Font f,f1;
		JButton b1,b2,b3;
		JLabel l1,l2,l3,l4;
		ImageIcon img1;
	    
	   	public Entery()
	   	{
	     	
	     	jf=new JFrame();
			f = new Font("Times New Roman",Font.BOLD,20);//button
			f1 = new Font("Times New Roman",Font.BOLD,25);//label
			jf.setLayout(null);

			l4=new JLabel("SELECT CATEGORY");
		    l4.setFont(new Font("Times New ROman",Font.BOLD,30));
		    l4.setForeground(Color.BLUE);
			l4.setBounds(250,2,500,30);
			jf.add(l4);

	    	l2=new JLabel("Student");
			l2.setFont(f1);
			l2.setForeground(Color.BLUE);
			l2.setBounds(120,250,320,30);
			jf.add(l2);


			l3=new JLabel("Company");
			l3.setFont(f1);
			l3.setForeground(Color.BLUE);
			l3.setBounds(820,250,320,30);
			jf.add(l3);


			b1=new JButton("Click here",new ImageIcon("ok.png"));
			b1.setFont(f);
			b1.setBounds(80,300,180,40);jf.add(b1);
			b1.addActionListener(this);

			b2=new JButton("click here",new ImageIcon("ok.png"));
			b2.setFont(f);
			b2.setBounds(800,300,180,40);jf.add(b2);
			b2.addActionListener(this);

			b3=new JButton("Cancel",new ImageIcon("cancel.png"));
			b3.setFont(f);
			b3.setBounds(440,480,130,40);jf.add(b3);
			b3.addActionListener(this);

	        img1=new ImageIcon("entery.png");
			l1=new JLabel(img1);
			l1.setBounds(0,0,1000,580);
	        jf.add(l1);

	         jf.setTitle("Entry");
		     jf.setSize(1000,580);
			 jf.setLocation(220,20);
			 jf.setResizable(false);
		     jf.setVisible(true);

	   	}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b1)
			{
				new StudentLogin();
				jf.setVisible(false);
			}
			if(e.getSource()==b2)
			{
				new CompanyLogin();
				jf.setVisible(false);
			}
			
			if(e.getSource()==b3)
			{
				new WelcomePage();
				jf.setVisible(false);
			}
			
		}
		//public static void main(String []args)
	//	{
		//	new Entery();
	//	}

}

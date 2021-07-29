package recruitment;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.*;

public class CompanySignup implements ActionListener {
	JFrame f=new JFrame();
	
	JLabel l1=new JLabel("Company Name");
	JLabel l2=new JLabel("Established");
	JLabel l3=new JLabel("Email");
	JLabel l4=new JLabel("Contact");
	JLabel l5=new JLabel("HR Name");
	JLabel l6=new JLabel("Your Id");
	JLabel l7=new JLabel("Username");
	JLabel l8=new JLabel("Password");
	JLabel l9=new JLabel("Confirm Password");
	JLabel l=new JLabel("Company Registration Form");
	
	ImageIcon img =new ImageIcon("companysign.jpg");
	JLabel l10=new JLabel(img);
			//l.setFont(new Font("Arial",Font.BOLD,40)));
	
	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JTextField t4=new JTextField();
	JTextField t5=new JTextField();
	JTextField t6=new JTextField();
	JTextField t7=new JTextField();
	JPasswordField t8=new JPasswordField();
	JPasswordField t9=new JPasswordField();

	JButton b=new JButton("Register");
	JButton b1=new JButton("cancel");
	
	public CompanySignup()
	{
		f.setLayout(null);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		l.setFont(new Font("Arial",Font.BOLD,22));
		l.setForeground(Color.BLUE);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(t5);
		f.add(t6);
		f.add(t7);
		f.add(t8);
		f.add(l);
		f.add(b);
		f.add(b1);
		
		f.add(t9);
		f.add(l9);
		f.add(l10);
		
		l.setBounds(50, 5, 400, 30);
		l1.setBounds(50, 50, 200, 30);
		l2.setBounds(50, 90, 200, 30);
		l3.setBounds(50, 130, 200, 30);
		l4.setBounds(50, 170, 200, 30);
		l5.setBounds(50, 210, 200, 30);
		l6.setBounds(50, 250, 200, 30);
		l7.setBounds(50,290, 200, 30);
		l8.setBounds(50,330, 200, 30);
		l9.setBounds(50,370, 200, 30);
		l10.setBounds(0,0,500,500);
		
		t1.setBounds(200,50,200,30);
		t2.setBounds(200,90,200,30);
		t3.setBounds(200,130,200,30);
		t4.setBounds(200,170,200,30);
		t5.setBounds(200,210,200,30);
		t6.setBounds(200,250,200,30);
		t7.setBounds(200,290,200,30);
		t8.setBounds(200,330,200,30);
		t9.setBounds(200,370,200,30);
		b.setBounds(100,420,100,30);
		b.addActionListener(this);
		b1.setBounds(280,420,100,30);
		b1.addActionListener(this);
		//l10.setBounds

		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(300, 100);
		f.setForeground(Color.CYAN);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals(""))||(t5.getText().equals(""))||(t6.getText().equals(""))||(t7.getText().equals(""))||(t8.getText().equals(""))||(t9.getText().equals("")))
			{
				JOptionPane.showMessageDialog(null,"All Field are compulsory please Fill");
			}
			else if(t8.getText().equals(t9.getText())){
			try
			{
				File file=new File("company.txt");
				PrintWriter pw=new PrintWriter(new FileOutputStream(file,true));
				
					pw.append(t1.getText()+","+t2.getText()+","+t3.getText()+","+t4.getText()+","+t5.getText()+","+t6.getText()+","+t7.getText()+","+t8.getText()+","+t9.getText()+"\n");
				pw.close();
				JOptionPane.showMessageDialog(null,"registration succesfull");
				new CompanyLogin();
				f.setVisible(false);
			}
			catch(Exception e1) {};
			}
			else
			{
				JOptionPane.showMessageDialog(null,"password are not matched!!");
			}
			
		}
		else if(e.getSource()==b1)
		{
			new CompanyLogin();
			f.setVisible(false);
		}
		
		// TODO Auto-generated method stub
		
	}

}

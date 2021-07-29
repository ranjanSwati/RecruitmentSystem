package recruitment;
import java.applet.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;


public class Vacancy extends JFrame implements ActionListener {
	JLabel l,l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b,b1;
	ImageIcon img1;
	public  Vacancy()
	{
		setLayout(null);
		l7=new JLabel("Post Vacancy");
		add(l7);
		l7.setBounds(150, 10, 300, 30);
		l7.setFont(new Font("Times New Roman",Font.BOLD,30));
		l7.setForeground(Color.green);
		t1=new JTextField(30);
		l1=new JLabel("Company Id");
		add(l1);
		l1.setBounds(50, 50, 100, 30);
		t1=new JTextField(30);
		add(t1);
		t1.setBounds(250, 50, 150, 30);
		l2=new JLabel("Job Profile");
		add(l2);
		l2.setBounds(50, 90, 100, 30);
		t2=new JTextField(30);
		add(t2);
		t2.setBounds(250, 90, 150, 30);
		l3=new JLabel("Salary");
		add(l3);
		l3.setBounds(50, 130, 100, 30);
		t3=new JTextField(30);
		add(t3);
		t3.setBounds(250, 130, 150, 30);
		l4=new JLabel("Eligibility Criteria");
		add(l4);
		l4.setBounds(50, 170, 200, 30);
		t4=new JTextField(30);
		add(t4);
		t4.setBounds(250, 170, 150, 30);
		l5=new JLabel("Bond(Leave blank if no bond)");
		add(l5);
		l5.setBounds(50, 210, 200, 30);
		t5=new JTextField(30);
		add(t5);
		t5.setBounds(250, 210, 150, 30);
		l6=new JLabel("Email");
		add(l6);
		l6.setBounds(50, 250, 100, 30);
		t6=new JTextField(30);
		add(t6);
		t6.setBounds(250, 250, 150, 30);
		
		b=new JButton("Post");
		add(b);
		b.setBounds(180,300 , 100, 30);
		b1=new JButton("cancel");
		add(b1);
		b1.setBounds(300,300 , 100, 30);

        img1=new ImageIcon("vacancy.jpg");
		l=new JLabel(img1);
		l.setBounds(1,1,500,400);
        add(l);
		
		//this.setSize(500, 500);
		setLocation(400, 200);
		setVisible(true);
		setSize(500, 400);
		//setBackground(Color.cyan);
		b.addActionListener(this);
		b1.addActionListener(this);
		
		
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{

			if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals(""))||(t6.getText().equals("")))
			{
				JOptionPane.showMessageDialog(null,"Something Missing");
			}
			else {
			try
			{
				File file=new File("vacancy.txt");
				PrintWriter pw=new PrintWriter(new FileOutputStream(file,true));
				
					pw.append(t1.getText()+","+t2.getText()+","+t3.getText()+","+t4.getText()+","+t5.getText()+","+t6.getText()+"\n");
				pw.close();
				JOptionPane.showMessageDialog(null,"vacancy post");
		
				this.setVisible(false);
			}
			catch(Exception e1) {};
			}
			
			
		}
		else if(e.getSource()==b1)
		{
	
			this.setVisible(false);
		}
		
		}
		// TODO Auto-generated method stub
		
	


}

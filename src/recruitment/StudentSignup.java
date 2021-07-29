package recruitment;
import javax.swing.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class StudentSignup implements ActionListener {

		Font F=new Font("Arial",Font.PLAIN,100);
	
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JLabel l1=new JLabel(" Student Registration Form");
		JLabel l2=new JLabel("All fields marked * are compulsory");
		JLabel l3=new JLabel("Full Name");
		JLabel l4=new JLabel("Gender");
		JLabel l5=new JLabel("Email");
		JLabel l6=new JLabel("contact No.");
		JLabel l7=new JLabel("City");
		JLabel l8=new JLabel("Address");
		JLabel l9=new JLabel("DOB");
		JLabel l10=new JLabel("Age");
		JLabel l11=new JLabel("School");
		JLabel l12=new JLabel("Year Of Passing");
		JLabel l13=new JLabel("University");
		JLabel l14=new JLabel("Aggregate");
		JLabel l15=new JLabel("HSC");
		JLabel l16=new JLabel("Year Of Passing");
		JLabel l17=new JLabel("University");
		JLabel l18=new JLabel("Aggregate");
		
		JLabel l20=new JLabel("Extra Curricular");
		JLabel l21=new JLabel("Other Qualifications");
		JLabel l22=new JLabel("Username");
		JLabel l23=new JLabel("Password");
		JLabel l24=new JLabel("Confirm Password");

		JButton b1=new JButton("Register");

		JButton b2=new JButton("cancel");
		
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		JTextField t4=new JTextField();
		JTextField t5=new JTextField();
		JTextField t6=new JTextField();
		JTextField t7=new JTextField();
		JTextField t8=new JTextField();
		JTextField t9=new JTextField();
		JTextField t10=new JTextField();
		JTextField t11=new JTextField();
		JTextField t12=new JTextField();
		JTextField t13=new JTextField();
		JTextField t14=new JTextField();
		JTextField t15=new JTextField();
		JTextField t16=new JTextField();
		JTextField t17=new JTextField();
		JTextField t18=new JTextField();
		JTextField t19=new JTextField();
		JPasswordField t20=new JPasswordField();
		JPasswordField t21=new JPasswordField();
		//JScrollPane sc1=new JScrollPane(p,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		public StudentSignup()
		{
			ImageIcon img=new ImageIcon("studentsign.jpg");
			JLabel l=new JLabel(img);
			JScrollPane scp=new JScrollPane(l,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scp.setBounds(0,0,600,600);
			f.add(scp);
		
		l.add(p);
		l.add(l1);
		l.add(l2);
		l.add(l3);
		l.add(l4);
		l.add(l5);
		l.add(l6);
		l.add(l7);
		l.add(l8);
		l.add(l9);
		l.add(l10);
		l.add(l11);
		l.add(l12);
		l.add(l13);
		l.add(l14);
		l.add(l15);
		l.add(l16);
		l.add(l17);
		l.add(l18);
		l.add(l20);
		l.add(l21);
		l.add(l22);
		l.add(l23);
		l.add(l24);
		
		l.add(t1);
		l.add(t2);
		l.add(t3);
		l.add(t4);
		l.add(t5);
		l.add(t6);
		l.add(t7);
		l.add(t8);
		l.add(t9);
		l.add(t10);
		l.add(t11);
		l.add(t12);
		l.add(t13);
		l.add(t14);
		l.add(t15);
		l.add(t16);
		l.add(t17);
		l.add(t18);
		l.add(t19);
		l.add(t20);
		l.add(t21);
	
		
		
		l1.setBounds(50,0, 500, 100);
		l2.setBounds(50,50, 400, 100);
		l3.setBounds(50,100, 200, 100);
		l4.setBounds(50,140, 200, 100);
		l5.setBounds(50,180, 200, 100);
		l6.setBounds(50,220, 200, 100);
		l7.setBounds(50,260, 200, 100);
		l8.setBounds(50,300, 200, 100);
		l9.setBounds(50,340, 200, 100);
		l10.setBounds(50,380, 200, 100);
		l11.setBounds(50,420, 200, 100);
		l12.setBounds(50,460, 200, 100);
		l13.setBounds(50,500, 200, 100);
		l14.setBounds(50,540, 200, 100);
		l15.setBounds(50,580, 200, 100);
		l16.setBounds(50,620, 200, 100);
		l17.setBounds(50,660, 200, 100);
		l18.setBounds(50,700, 200, 100);
		l20.setBounds(50,740, 200, 100);
		l21.setBounds(50,780, 200, 100);
		l22.setBounds(50,820, 200, 100);
		l23.setBounds(50,860, 200, 100);
		l24.setBounds(50,900, 200, 100);
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setForeground(Color.RED);
		
		t1.setBounds(250,130, 200, 30);
		t2.setBounds(250,170, 200, 30);
		t3.setBounds(250,210, 200, 30);
		t4.setBounds(250,250, 200, 30);
		t5.setBounds(250,290, 200, 30);
		t6.setBounds(250,330, 200, 30);
		t7.setBounds(250,370, 200, 30);
		t8.setBounds(250,410, 200, 30);
		t9.setBounds(250,450, 200, 30);
		t10.setBounds(250,490, 200, 30);
		t11.setBounds(250,530, 200, 30);
		t12.setBounds(250,570, 200, 30);
		t13.setBounds(250,610, 200, 30);
		t14.setBounds(250,650, 200, 30);
		t15.setBounds(250,690, 200, 30);
		t16.setBounds(250,730, 200, 30);
		t17.setBounds(250,770, 200, 30);
		t18.setBounds(250,810, 200, 30);
		t19.setBounds(250,850, 200, 30);
		t20.setBounds(250,890, 200, 30);
		t21.setBounds(250,930, 200, 30);
		
		l.add(b1);
		b1.setBounds(150, 1000, 200, 40);
		b1.addActionListener(this);
		
		l.add(b2);
		b2.setBounds(180, 1050, 100, 40);
		b2.addActionListener(this);
		
		f.setTitle("STUDENT REGISTRATION FORM");
		f.setLayout(null);
		f.setSize(604,603);
		f.setVisible(true);
		f.setResizable(false);
		f.setLocation(400,60);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b1)
			{
				if((t1.getText().equals(""))||(t2.getText().equals(""))||(t3.getText().equals(""))||(t4.getText().equals(""))||(t5.getText().equals(""))||(t6.getText().equals(""))||(t7.getText().equals(""))||(t8.getText().equals(""))||(t9.getText().equals(""))||(t10.getText().equals(""))||(t11.getText().equals(""))||(t12.getText().equals(""))||(t13.getText().equals(""))||(t14.getText().equals(""))||(t15.getText().equals(""))||(t16.getText().equals(""))||(t17.getText().equals(""))||(t18.getText().equals(""))||(t19.getText().equals(""))||(t20.getText().equals(""))||(t21.getText().equals("")))
				{
					JOptionPane.showMessageDialog(null,"All Field are compulsory please Fill");
				}
				else if(t20.getText().equals(t21.getText())){
				try
				{
					File file=new File("student.txt");
					PrintWriter pw=new PrintWriter(new FileOutputStream(file,true));
					
						pw.append(t1.getText()+","+t2.getText()+","+t3.getText()+","+t4.getText()+","+t5.getText()+","+t6.getText()+","+t7.getText()+","+t8.getText()+","+t9.getText()+","+t10.getText()+","+t11.getText()+","+t12.getText()+","+t13.getText()+","+t14.getText()+","+t15.getText()+","+t16.getText()+","+t17.getText()+","+t18.getText()+","+t19.getText()+","+t20.getText()+","+t21.getText()+"\n");
					pw.close();
					JOptionPane.showMessageDialog(null,"registration succesfull");
					new StudentLogin();
					f.setVisible(false);
				}
				catch(Exception e1) {};
				}
				else
				{
					JOptionPane.showMessageDialog(null,"password are not matched!!");
				}
				
			}
			else if(e.getSource()==b2)
			{
				new StudentLogin();
				f.setVisible(false);
			}
			
		}
}


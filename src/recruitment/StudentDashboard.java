 package recruitment;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class StudentDashboard implements ActionListener {
	JLabel l,l1,l2,l3,l4,l5,l6;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3;
	JPanel p;
	JFrame jf;
	JScrollPane js;
	JTable jt;
	ImageIcon img1;
	DefaultTableCellRenderer cellRenderer;
	
	public StudentDashboard() {


		jf=new JFrame();
		jf.setLayout(null);
		
	
		  
		l1=new JLabel("Student DashBoard");
		l1.setFont(new Font("Arial",Font.BOLD,40));
		l1.setForeground(Color.ORANGE);
		jf.add(l1);
		l1.setBounds(400,10,600,30);
		
	
		l2=new JLabel("MENU");
		l2.setFont(new Font("Arial",Font.BOLD,25));
		jf.add(l2);
		l2.setForeground(Color.red);
		l2.setBounds(40,80,150,30);
		
		b1=new JButton("Vacancy");
		jf.add(b1);b1.addActionListener(this);
		b1.setBounds(30, 140, 120, 30);
		b2=new JButton("All company");
		jf.add(b2);
		b2.addActionListener(this);
		b2.setBounds(30, 190, 120, 30);
		b3=new JButton("Logout");
		jf.add(b3);
		b3.setBounds(30, 240, 80, 30);
		b3.addActionListener(this);
		
		img1=new ImageIcon("studentdash.jpg");
		l=new JLabel(img1);
		l.setBounds(1,1,1200,700);
        jf.add(l);
    
		jf.setVisible(true);
		jf.setLocation(50,20);
		jf.setTitle("Compnay DashBoard");
		jf.setSize(1200,700);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2)
		{
			
			l3=new JLabel("Job profile:-");
			l.add(l3);
			l3.setFont(new Font("Arial",Font.BOLD,18));
			l3.setForeground(Color.red);
			l3.setBounds(400, 50, 120, 30);
			l4=new JLabel("Salary:-");
			l.add(l4);
			l4.setFont(new Font("Arial",Font.BOLD,18));
			l4.setForeground(Color.red);
			l4.setBounds(400, 100, 100, 30);
			
			l5=new JLabel("--");
			l.add(l5);
			l5.setFont(new Font("Arial",Font.BOLD,20));
			l5.setForeground(Color.red);
			l5.setBounds(650, 100, 30, 30);
			t1=new JTextField();
			jf.add(t1);
			t1.setBounds(550, 50, 100, 30);
			t2=new JTextField();
			jf.add(t2);
			t2.setBounds(550, 100, 100, 30);
			t3=new JTextField();
			jf.add(t3);
			t3.setBounds(670,100, 100, 30);
			
	        b4=new JButton("Search");
	        jf.add(b4);
	        b4.setBounds(500,150,100,30);
			 try
	        	{
		        	int flag=0;
		        	FileReader f=new FileReader("company.txt");
		        	BufferedReader br=new BufferedReader(f);
		        	String s="";
		        	
		        	jt=new JTable();
	        		Object col[]= {"S.N0","Company Name","Establish","Email","contact No","HR Name","ID"};
	        	
	        		DefaultTableModel model= new DefaultTableModel();
	        		model.setColumnIdentifiers(col);
	        		
	        		jt.setModel(model);
	        	
	        	
	        	 cellRenderer = new DefaultTableCellRenderer();
	             cellRenderer.setHorizontalAlignment(JLabel.CENTER);
	             jt.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
	             jt.getColumnModel().getColumn(0).setPreferredWidth(5);
	        		 
		        	while((s=br.readLine())!=null)
		        	{
		        		String data []=new String[9];
		        		data=s.split(",");
		        		flag++;
		     		model.addRow(new Object[]{flag,data[0],data[1],data[2],data[3],data[4],data[5],data[6]});
		        		
		        		
		        	}
		        	jt.setRowHeight(40);
	
		        	
	        	}
			 
			 catch(Exception ae) {};
			 
			JScrollPane scp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scp.setBounds(2,280,1180,200);
			jf.add(scp);
		}
		else if(e.getSource()==b1)
		{

	       
			 try
	        	{
		        	int flag=0;
		        	FileReader f=new FileReader("vacancy.txt");
		        	BufferedReader br=new BufferedReader(f);
		        	String s="";
		        	
		        	jt=new JTable();
	        		Object col[]= {"S.N0","Company ID","JOb Profile","Sallery","Elegibility criteria","Email"};
	        	
	        		DefaultTableModel model= new DefaultTableModel();
	        		model.setColumnIdentifiers(col);
	        		
	        		jt.setModel(model);
	        	
	        	
	        	 cellRenderer = new DefaultTableCellRenderer();
	             cellRenderer.setHorizontalAlignment(JLabel.CENTER);
	             jt.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
	             jt.getColumnModel().getColumn(0).setPreferredWidth(5);
	        		 
		        	while((s=br.readLine())!=null)
		        	{
		        		String data []=new String[6];
		        		data=s.split(",");
		        		flag++;
		     		model.addRow(new Object[]{flag,data[0],data[1],data[2],data[3],data[5]});
		        		
		        		
		        	}
		        	jt.setRowHeight(40);
	
		        	
	        	}
			 
			 catch(Exception ae) {};
			 
			JScrollPane scp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scp.setBounds(2,280,1180,200);
			jf.add(scp);
		}
		else if(e.getSource()==b3)
			
		{
			new StudentLogin();
			jf.setVisible(false);
		}
		
		// TODO Auto-generated method stub
		
	}

}


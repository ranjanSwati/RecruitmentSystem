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
import javax.swing.table.TableColumnModel;

public class CompanyDashboard implements ActionListener{
	JLabel l,l1,l2,l3;
	JButton b1,b2,b3;
	JPanel p;
	JFrame jf;
	JScrollPane js;
	JTable jt;
	ImageIcon img1;
	DefaultTableCellRenderer cellRenderer;
	
	public CompanyDashboard() {


		jf=new JFrame();
		jf.setLayout(null);
		
        
		  
		l1=new JLabel("Company DashBoard");
		l1.setFont(new Font("Arial",Font.BOLD,40));
		l1.setForeground(Color.ORANGE);
		jf.add(l1);
		l1.setBounds(400,10,600,30);
		
	
		l2=new JLabel("MENU");
		l2.setFont(new Font("Arial",Font.BOLD,25));
		jf.add(l2);
		l2.setForeground(Color.red);
		l2.setBounds(40,30,150,30);
		
		b1=new JButton("View Student Detail");
		jf.add(b1);b1.addActionListener(this);
		b1.setBounds(30, 80, 150, 30);
		b2=new JButton("Post vacancy");
		jf.add(b2);
		b2.addActionListener(this);
		b2.setBounds(30, 120, 120, 30);
		b3=new JButton("Logout");
		jf.add(b3);
		b3.setBounds(30, 160, 80, 30);
		b3.addActionListener(this);
		
		img1=new ImageIcon("companydash.png");
		l=new JLabel(img1);
		l.setBounds(1,1,1200,700);
        jf.add(l);
    
		jf.setVisible(true);
		jf.setLocation(50,20);
		jf.setTitle("Company DashBoard");
		jf.setSize(1200,700);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			JLabel jl1=new JLabel("Hsc Agregate:-");
			l.add(jl1);
			
			jl1.setBounds(370,50,100,30);
			JTextField jt1=new JTextField();
			
			l.add(jt1);
			jt1.setBounds(500,50,100,30);

		
			JLabel jl2=new JLabel("College Aggregate:-");
			l.add(jl2);
			jl2.setBounds(370,90,130,30); 
			
			JTextField jt2=new JTextField();
			l.add(jt2);
			jt2.setBounds(500,90,100,30);
			 
			
			JButton jb=new JButton("search");
			l.add(jb);
			jb.setBounds(450,130,100,30);
			jb.addActionListener(this);
			
			
			
			
			 try
	        	{
		        	int flag=0;
		        	FileReader f=new FileReader("student.txt");
		        	BufferedReader br=new BufferedReader(f);
		        	String s="";
		        	
		        	jt=new JTable();
	        		Object col[]= {"S.N0","Full Name","Gender","Email","contact No","city","HSC Aggregrate","Address","age"};
	        	
	        		DefaultTableModel model= new DefaultTableModel();
	        		model.setColumnIdentifiers(col);
	        		
	        		jt.setModel(model);
	        	
	        	
	        	 cellRenderer = new DefaultTableCellRenderer();
	             cellRenderer.setHorizontalAlignment(JLabel.CENTER);
	             jt.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
	             jt.getColumnModel().getColumn(8).setCellRenderer(cellRenderer);
	             jt.getColumnModel().getColumn(0).setPreferredWidth(5);
	             jt.getColumnModel().getColumn(8).setPreferredWidth(5);
		        	while((s=br.readLine())!=null)
		        	{
		        		String data []=new String[21];
		        		data=s.split(",");
		        		flag++;
		     		model.addRow(new Object[]{flag,data[0],data[1],data[2],data[3],data[4],data[15],data[5],data[7]});
		        		
		        		
		        	}
		        	jt.setRowHeight(40);
	
		        	
	        	}
			 
			 catch(Exception ae) {};
			 
			JScrollPane scp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scp.setBounds(2,200,1180,200);
			jf.add(scp);
			
		}
		
		else if(e.getSource()==b2)
		{
			new Vacancy();
		
			//jf.setVisible(false);
		}
		
		else if(e.getSource()==b3)
			
		{
			new Entery();
			jf.setVisible(false);
		}
		
		// TODO Auto-generated method stub
		
	}

}

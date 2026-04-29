package blood;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import blood.*;


public class Chattagram  extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor,mycolor1;
	JButton b1Btn, b2Btn, b3Btn, b4Btn, b5Btn, b6Btn, b7Btn,b8Btn,b9Btn,b10Btn,b11Btn,b12Btn,backButton;
	

	public Chattagram()
	{
		super("Select Your District");
		this.setSize(1200, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
				
		b1Btn = new JButton("CHATTAGRAM");
		b1Btn.setBounds(200,100,250,50);
		b1Btn.setBackground(Color.YELLOW);
		b1Btn.addActionListener(this);
		panel.add(b1Btn);
		
		b2Btn = new JButton("CUMILLA");
		b2Btn.setBounds(200,200,250,50);
		b2Btn.setBackground(Color.YELLOW);
		b2Btn.addActionListener(this);
		panel.add(b2Btn);
		
		b3Btn = new JButton("COX'S BAZAR");
		b3Btn.setBounds(200,300,250,50);
		b3Btn.setBackground(Color.YELLOW);
		b3Btn.addActionListener(this);
		panel.add(b3Btn);
		
		b4Btn = new JButton("FENI");
		b4Btn.setBounds(200,400,250,50);
		b4Btn.setBackground(Color.YELLOW);
		b4Btn.addActionListener(this);
		panel.add(b4Btn);
		
		b5Btn = new JButton("RANGAMATI");
		b5Btn.setBounds(200,500,250,50);
		b5Btn.setBackground(Color.YELLOW);
		b5Btn.addActionListener(this);
		panel.add(b5Btn);
		
		b6Btn = new JButton("KHAGRACHARI");
		b6Btn.setBounds(200,600,250,50);
		b6Btn.setBackground(Color.YELLOW);
		b6Btn.addActionListener(this);
		panel.add(b6Btn);
		
		b7Btn = new JButton("BANDARBAN");
		b7Btn.setBounds(700, 100, 250, 50);
		b7Btn.setBackground(Color.YELLOW);
		b7Btn.addActionListener(this);
		panel.add(b7Btn);
		
		b8Btn = new JButton("LAKSHMIPUR");
		b8Btn.setBounds(700, 200, 250, 50);
		b8Btn.setBackground(Color.YELLOW);
		b8Btn.addActionListener(this);
		panel.add(b8Btn);
		
		b9Btn = new JButton("NOAKHALI");
		b9Btn.setBounds(700, 300, 250, 50);
		b9Btn.setBackground(Color.YELLOW);
		b9Btn.addActionListener(this);
		panel.add(b9Btn);
		
		b10Btn = new JButton("CHANDPUR");
		b10Btn.setBounds(700, 400, 250, 50);
		b10Btn.setBackground(Color.YELLOW);
		b10Btn.addActionListener(this);
		panel.add(b10Btn);
		
		b11Btn = new JButton("NETROKONA");
		b11Btn.setBounds(700, 500, 250, 50);
		b11Btn.setBackground(Color.YELLOW);
        b11Btn.addActionListener(this);
		panel.add(b11Btn);
		
		b12Btn = new JButton("BRAHMANBARIAR");
		b12Btn.setBounds(700, 600, 250, 50);
		b12Btn.setBackground(Color.YELLOW);
		b12Btn.addActionListener(this);
		panel.add(b12Btn);
		
		backButton = new JButton("BACK");
		backButton.setBounds(50,50,40,40);
		backButton.addActionListener(this);
		panel.add(backButton);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == backButton) 
		{
           blood f1 = new blood();
           f1.setVisible(true);
       	   this.setVisible(false);   
        }
		
		else if(ae.getSource()==b1Btn)
		{
			Group_of_blood c1=new Group_of_blood();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(ae.getSource()==b2Btn)
		{
			Group_of_blood m1=new Group_of_blood();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b3Btn)
		{
			Group_of_blood d1=new Group_of_blood();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b4Btn)
		{
			Group_of_blood q1=new Group_of_blood();
			q1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b5Btn)
		{
			Group_of_blood w1=new Group_of_blood();
			w1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b6Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b7Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b8Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b9Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b10Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b11Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b12Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
	}
}
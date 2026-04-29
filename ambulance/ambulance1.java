package ambulance;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ambulance.*;

public class ambulance1 extends JFrame
{
	JPanel panel;
	JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9;
	
	public ambulance1()
	{
		super("Ambulance");
		this.setSize(1200,800);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
		
		a1=new JLabel("Dhaka Ambulance Service");
		a1.setBounds(100,100,500,20);
		a1.setBackground(Color.YELLOW);
		panel.add(a1);
		
		a2=new JLabel("Phone number: 01925849855");
		a2.setBounds(100,120,500,20);
		a2.setBackground(Color.YELLOW);
		panel.add(a2);
		
		a3=new JLabel("Car No:- Dhaka Metro tha: 12-5664");
		a3.setBounds(100,140,500,20);
		a3.setBackground(Color.YELLOW);
		panel.add(a3);
		
		a4=new JLabel("Shoishob Ambulance Service");
		a4.setBounds(100,180,500,20);
		a4.setBackground(Color.YELLOW);
		panel.add(a4);
		
		a5=new JLabel("Phone number: 01925849855");
		a5.setBounds(100,200,500,20);
		a5.setBackground(Color.YELLOW);
		panel.add(a5);
		
		a6=new JLabel("Car No:- Dhaka Metro tha: 12-5664");
		a6.setBounds(100,220,500,20);
		a6.setBackground(Color.YELLOW);
		panel.add(a6);
		
		a7=new JLabel("Bikash Ambulance Service");
		a7.setBounds(100,280,500,20);
		a7.setBackground(Color.YELLOW);
		panel.add(a7);
		
		a8=new JLabel("Phone number: 01925849855");
		a8.setBounds(100,300,500,20);
		a8.setBackground(Color.YELLOW);
		panel.add(a8);
		
		a9=new JLabel("Car No:- Dhaka Metro tha: 12-5664");
		a9.setBounds(100,320,500,20);
		a9.setBackground(Color.YELLOW);
		panel.add(a9);
		
		this.add(panel);
	}
}
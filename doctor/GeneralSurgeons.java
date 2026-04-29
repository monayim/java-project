package doctor;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;


public class GeneralSurgeons extends JFrame
{
	JPanel panel;

	JLabel a1,a2,a3,a4,a5,a6;
	
	public GeneralSurgeons()
	{
		super("GeneralSurgeons");
		this.setSize(1200,800);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));	

		
		a1=new JLabel("Dr. Jasim Uddin");
		a1.setBounds(100,100,500,20);
		panel.add(a1);
		
		a2=new JLabel("MBBS");
		a2.setBounds(100,120,500,20);
		panel.add(a2);
		
		a3=new JLabel("Phone no: 019828504588");
		a3.setBounds(100,140,500,20);
		panel.add(a3);
		
		a4=new JLabel("Dr. Bikash Kumar");
		a4.setBounds(100,180,500,20);
		panel.add(a4);
		
		a5=new JLabel("M.B.B.S");
		a5.setBounds(100,200,500,20);
		panel.add(a5);
		
		a6=new JLabel("Phone no: 019828504588");
		a6.setBounds(100,220,500,20);
		panel.add(a6);
		
		this.add(panel);
	}
	
}
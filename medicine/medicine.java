package medicine;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import medicine.*;



public class medicine extends JFrame 
{
	JPanel panel;
	JButton srcBtn,backBtn;
	JLabel search;
	JTextField searchfield;
	JLabel a1,a2,a3,a4,a5,a6;
	Color mycolor,mycolor1;
	Font myfont;
	
	public medicine()
	{
		super("Medicine");
		this.setSize(1200,800);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
		
		searchfield=new JTextField();
		searchfield.setBounds(250,100,500,100);
		panel.add(searchfield);
		
		
		srcBtn=new JButton("Search Here");
		srcBtn.setBounds(200,100,150,100);
		srcBtn.setBackground(Color.YELLOW);
		srcBtn.setFont(myfont);
		srcBtn.setBackground(Color.PINK);
		panel.add(srcBtn);
		
		backBtn=new JButton("Back");
		backBtn.setBounds(200,250,100,50);
		panel.add(backBtn);
		
		
		
		a1=new JLabel("Paracetamol");
		a1.setBounds(200,400,500,20);
		a1.setFont(myfont);
		panel.add(a1);
		
		a2=new JLabel("Ciprofloxacin");
		a2.setBounds(200,450,500,20);
		a2.setFont(myfont);
		panel.add(a2);
		
		a3=new JLabel("Omeprazole");
		a3.setBounds(200,500,500,20);
		a3.setFont(myfont);
		panel.add(a3);
		
		a4=new JLabel("Aspirin");
		a4.setBounds(400,400,500,20);
		a4.setFont(myfont);
		panel.add(a4);
		
		a5=new JLabel("Amlodipine");
		a5.setBounds(400,450,500,20);
		a5.setFont(myfont);
		panel.add(a5);
		
		a6=new JLabel("Amoxicillin");
		a6.setBounds(400,500,500,20);
		a6.setFont(myfont);
		panel.add(a6);
		
		
		
		this.add(panel);
	}
	
}
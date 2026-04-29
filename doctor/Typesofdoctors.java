package doctor;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;



public class Typesofdoctors extends JFrame implements ActionListener
{
	JPanel panel;
	JButton a1Btn,a2Btn,a3Btn,a4Btn,a5Btn,a6Btn;
	Color mycolor,mycolor1;
	Font myfont;
	
	public Typesofdoctors()
	{
		super("Doctors: ");
		this.setSize(1200,800);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
		
		a1Btn=new JButton("Cardiologist");
		a1Btn.setBounds(400,100,250,80);
		a1Btn.setBackground(Color.YELLOW);
		a1Btn.addActionListener(this);
		panel.add(a1Btn);
		
		a2Btn=new JButton("Medicine Specialist");
		a2Btn.setBounds(400,200,250,80);
		a2Btn.setBackground(Color.YELLOW);
		a2Btn.addActionListener(this);
		panel.add(a2Btn);
		
		a3Btn=new JButton("Dermatologist");
		a3Btn.setBounds(400,300,250,80);
		a3Btn.setBackground(Color.YELLOW);
		a3Btn.addActionListener(this);
		panel.add(a3Btn);
		
		a4Btn=new JButton("Dentist");
		a4Btn.setBounds(400,400,250,80);
		a4Btn.setBackground(Color.YELLOW);
		a4Btn.addActionListener(this);
		panel.add(a4Btn);
		
		a5Btn=new JButton("M.B.B.S");
		a5Btn.setBounds(400,500,250,80);
		a5Btn.setBackground(Color.YELLOW);
		a5Btn.addActionListener(this);
		panel.add(a5Btn);
		
		a6Btn=new JButton("General Surgeons");
		a6Btn.setBounds(400,600,250,80);
		a6Btn.setBackground(Color.YELLOW);
		a6Btn.addActionListener(this);
		panel.add(a6Btn);
		
		
		this.add(panel);		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==a1Btn)
		{
			Cardiologists c1=new Cardiologists();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		else if(ae.getSource()==a2Btn)
		{
			MedicineSpecialist m1=new MedicineSpecialist();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a3Btn)
		{
			Dermatologist d1=new Dermatologist();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a4Btn)
		{
			Dentist q1=new Dentist();
			q1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a5Btn)
		{
			MBBS w1=new MBBS();
			w1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a6Btn)
		{
			GeneralSurgeons t1=new GeneralSurgeons();
			t1.setVisible(true);
			this.setVisible(false);
		}
	}
	
}
package blood;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import blood.*;

public class bpositive extends JFrame
{
	JPanel panel;
	Color mycolor;
	Font myfont;
	public bpositive()
	{
		super("Blood donor");
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
        
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
		
		JLabel usernameLabel1 = new JLabel("Name :Zobayer");
		usernameLabel1.setBounds(200, 100, 500, 20);
		usernameLabel1.setForeground(Color.black);
		usernameLabel1.setFont(myfont);
		add(usernameLabel1);
		
	
		JLabel usernameLabel2 = new JLabel("Contact: 013245585255");
		usernameLabel2.setBounds(200, 120, 500, 20);
		usernameLabel2.setForeground(Color.black);
		usernameLabel2.setFont(myfont);
		add(usernameLabel2);
		
        JLabel usernameLabel3 = new JLabel("Email: bdiushfsf@gmail.com");
		usernameLabel3.setBounds(200, 140, 500, 20);
		usernameLabel3.setForeground(Color.black);
		usernameLabel3.setFont(myfont);
		add(usernameLabel3);
		
				
		JLabel usernameLabel4 = new JLabel("Name :Shakib");
		usernameLabel4.setBounds(200, 200, 500, 20);
		usernameLabel4.setForeground(Color.black);
		usernameLabel4.setFont(myfont);
		add(usernameLabel4);
		
	
		JLabel usernameLabel5 = new JLabel("Contact: 013245585255");
		usernameLabel5.setBounds(200, 220, 500, 20);
		usernameLabel5.setForeground(Color.black);
		usernameLabel5.setFont(myfont);
		add(usernameLabel5);
		
        JLabel usernameLabel6 = new JLabel("Email: bdiushfsf@gmail.com");
		usernameLabel6.setBounds(200, 240, 500, 20);
		usernameLabel6.setForeground(Color.black);
		usernameLabel6.setFont(myfont);
		add(usernameLabel6);
		
		
        
		
		this.add(panel);
	}
}
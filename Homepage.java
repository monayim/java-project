import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;
import ambulance.*;
import blood.*;
import medicine.*;


public class Homepage extends JFrame implements ActionListener
{
	JPanel panel;
	LoginFrame f1;
	JButton backButton,docButton,ambuButton,bloodButton,medButton;

	public Homepage(String s1,LoginFrame f1)
	{
		super("HomePage");
		this.setSize(1200,800);
		setLocationRelativeTo(null);
        setContentPane(new JLabel(new ImageIcon("Homepage.jpg")));
        setLayout(null);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		docButton = new JButton();
		docButton.setBounds(300, 200, 100, 100);
        docButton.setIcon(new ImageIcon("Doctor.jpg"));
		docButton.addActionListener(this);
		add(docButton);
		
		
		ambuButton = new JButton();
		ambuButton.setBounds(500, 350, 100, 100);
		ambuButton.setIcon(new ImageIcon("Ambulance.jpg"));
		ambuButton.addActionListener(this);
		add(ambuButton);
		
		
		bloodButton = new JButton();
		bloodButton.setBounds(700, 350, 100, 100);
		bloodButton.setIcon(new ImageIcon("Blood.jpg"));
		bloodButton.addActionListener(this);
		add(bloodButton);
		
		medButton = new JButton();
		medButton.setBounds(500, 200, 100, 100);
		medButton.setIcon(new ImageIcon("Medicine.jpg"));
		medButton.addActionListener(this);
		add(medButton);
		
		
		backButton = new JButton();
		backButton.setBounds(50,50,40,40);
		backButton.setIcon(new ImageIcon("Back.png"));
		backButton.addActionListener(this);
		add(backButton);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae) {
    

    if (ae.getSource() == backButton) {
        
		
        LoginFrame f1 = new LoginFrame();
        f1.setVisible(true);
       	this.setVisible(false);
		   
    } else if (ae.getSource() == docButton) {
        
        Division d1 = new Division();
        d1.setVisible(true);
        this.setVisible(false);
		
    } else if (ae.getSource() == ambuButton) {
        
        amb d1 = new amb();
        d1.setVisible(true);
        this.setVisible(false);
		
    } else if (ae.getSource() == bloodButton) {
        
        blood d1 = new blood();
        d1.setVisible(true);
        this.setVisible(false);
		
    } else if (ae.getSource() == medButton) {
        
        medicine d1 = new medicine();
        d1.setVisible(true);
        this.setVisible(false);
    }
}
}
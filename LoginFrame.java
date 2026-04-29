import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginFrame extends JFrame implements MouseListener, ActionListener 
{
	 JPanel panel;
     JButton loginButton, createButton,deleteButton;
	 JLabel usernameLabel, passwordLabel;
	 JTextField usernameField;
	 JPasswordField passwordField;
	 
   
    public LoginFrame()
{
        setTitle("Login Page");
        setSize(1200,800);
		
		panel=new JPanel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(new JLabel(new ImageIcon("Login Page.jpg")));
        setLayout(null);

        usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(100, 250, 100, 25);
		usernameLabel.setForeground(Color.white);
		add(usernameLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(200, 245, 150, 35);
		add(usernameField);
		  
        passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(100, 300, 100, 25);
		passwordLabel.setForeground(Color.white);
		add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 295, 150, 35);
		passwordField.setEchoChar('*');
		add(passwordField);
		  
        loginButton = new JButton("Login");
		loginButton.setBounds(150, 400, 80, 25);
		loginButton.addMouseListener(this);
		loginButton.addActionListener(this);
		add(loginButton);
		
		createButton = new JButton("Create New Account");
		createButton.setBounds(110, 450, 150, 25);
		createButton.addMouseListener(this);
		createButton.addActionListener(this);
		add(createButton);
		
		deleteButton = new JButton("Delete Account");
        deleteButton.setBounds(120, 500, 130, 25);
        deleteButton.addMouseListener(this);
        deleteButton.addActionListener(this);
        add(deleteButton);
		
		this.add(panel);
}

    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==loginButton)
		{
			loginButton.setBackground(Color.blue);
		    loginButton.setForeground(Color.black);
		}
		else if(me.getSource()==createButton)
		{
			createButton.setBackground(Color.green);
			createButton.setForeground(Color.black);
		}
	}
         public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==loginButton)
		{
			loginButton.setBackground(Color.pink);
			loginButton.setForeground(Color.black);
		}
		
		else if(me.getSource()==createButton)
		{
			createButton.setBackground(Color.white);
			createButton.setForeground(Color.black);
		}
	}   
	
    public void actionPerformed(ActionEvent ae) 
    {
		if(ae.getSource()==createButton)
		{
			Create c1=new Create();
			c1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==loginButton)
		{
			String usernameLabel=usernameField.getText();
			String passwordLabel=passwordField.getText();
			
			Accounts acc = new Accounts();
			
			if(acc.getAccount(usernameLabel,passwordLabel)==true)
			{
			
			JOptionPane.showMessageDialog(null,"Valid Information !!!");
			
			Homepage h1=new Homepage(usernameLabel,this);
			h1.setVisible(true);
			this.setVisible(false);
		   }
		   
		   else{
			   JOptionPane.showMessageDialog(null,"Invalid Information !!!");
		   }
            
        }
		
		else if (ae.getSource() == deleteButton) 
		{
           Delete f1=new Delete();
		   f1.setVisible(true);
		   this.setVisible(false);
        }
     

    }
 }

    
	

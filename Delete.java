import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;


public class Delete extends JFrame implements ActionListener {

    

    public Delete() 
	{
		 super("Delete Account");
        this.setSize(1200, 800);
        setLocationRelativeTo(null);
		
		JPanel panel;
        JLabel username, password;
        JTextField userfield;
        JPasswordField passfield;
        JButton delbtn, backbtn;
	
       

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        username = new JLabel("Name :");
        username.setBounds(250, 150, 75, 50);
        username.setForeground(Color.white);
        panel.add(username);

        userfield = new JTextField();
        userfield.setBounds(400, 165, 150, 25);
        panel.add(userfield);

        password = new JLabel("Password :");
        password.setBounds(250, 280, 75, 50);
        password.setForeground(Color.white);
        panel.add(password);

        passfield = new JPasswordField();
        passfield.setBounds(400, 295, 150, 25);
        panel.add(passfield);

        delbtn = new JButton("Delete");
        delbtn.setBounds(280, 410, 100, 25);
        delbtn.addActionListener(this);
        panel.add(delbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(400, 410, 100, 25);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        setContentPane(panel);
    }
    public void actionPerformed(ActionEvent e) {
        
        File f1 = new File("./Accounts.txt");

        
        if (f1.exists()) {
           
            boolean delete = f1.delete();

            if (delete) {
                JOptionPane.showMessageDialog(null, "User data deleted successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete user data");
            }
        } else {
            JOptionPane.showMessageDialog(null, "User data file not found");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("");

        JButton delbtn = new JButton("Delete");
        Delete listener = new Delete();
        delbtn.addActionListener(listener);

        frame.getContentPane().add(delbtn);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Create extends JFrame implements ActionListener {
    JPanel panel;
    JLabel username, password;
    JTextField userfield;
    JPasswordField passfield;
    JButton regbtn, backbtn;

    public Create() {
        super("Create Account");
        this.setSize(1200, 800);
        setLocationRelativeTo(null);

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

        regbtn = new JButton("Sign up");
        regbtn.setBounds(280, 410, 100, 25);
        regbtn.addActionListener(this);
        panel.add(regbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(400, 410, 100, 25);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        setContentPane(panel);
    }
	
	public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == regbtn) {
            
			String name = userfield.getText();
            String pass = new String(passfield.getPassword());

            if (name.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill All Options !!!");
            } else {
               
                SwingUtilities.invokeLater(() -> {
                    Accounts acc = new Accounts(name, pass);
                    acc.addaccount();

                    JOptionPane.showMessageDialog(null, "Successfully Registered !!!");

                    userfield.setText("");
                    passfield.setText("");

                    LoginFrame f1 = new LoginFrame();
                    f1.setVisible(true);
                    Create.this.setVisible(false);
                });
            }
        } else if (ae.getSource() == backbtn) {
            SwingUtilities.invokeLater(() -> {
                LoginFrame f1 = new LoginFrame();
                f1.setVisible(true);
                Create.this.setVisible(false);
            });
        }
    }
}
	
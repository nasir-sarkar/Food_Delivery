package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;

public class OnlineRegistration extends JFrame implements ActionListener 
{
	
	JLabel titleLB;
    JLabel nameLB;
    JLabel unameLB;
	JLabel phoneLB;
	JLabel passLB;
	JLabel cpassLB;
	JLabel n;
	JLabel u;
	JLabel e;
	JLabel p;
	JLabel c;
	
	JLabel backgroundLB;
	ImageIcon  imageICN;
	ImageIcon  logoICN;
	
    JTextField nameTF; 
    JTextField unameTF; 
	JTextField phoneTF;
	
    JPasswordField passPF;
	JPasswordField cpassPF;
	
    JButton signupButton;
	JButton resetButton;
	JButton backButton;
	JButton hide1;
	JButton hide2;
	JButton hide3;
	JButton hide4;


    public OnlineRegistration() 
    {	
		imageICN = new ImageIcon("image/Registration1.jpg");
		logoICN = new ImageIcon("image/logo.png");
	
        backgroundLB = new JLabel("", imageICN, JLabel.CENTER);
	    backgroundLB.setSize(850,550);
		getContentPane().add(backgroundLB);
			
		
	    titleLB = new JLabel("ONLINE REGISTRATION FORM");
		titleLB.setFont(new Font("Arial", Font.PLAIN, 22));
		
        nameLB = new JLabel("Full Name:");
		nameLB.setFont(new Font("Arial", Font.PLAIN, 15));
		
        unameLB = new JLabel("Username:");
		unameLB.setFont(new Font("Arial", Font.PLAIN, 15));
		
        phoneLB = new JLabel("Phone:");
		phoneLB.setFont(new Font("Arial", Font.PLAIN, 15));
		
        passLB = new JLabel("Password:");
		passLB.setFont(new Font("Arial", Font.PLAIN, 15));
		
        cpassLB = new JLabel("Confirm Password:");
		cpassLB.setFont(new Font("Arial", Font.PLAIN, 15));
		
		signupButton = new JButton("Sign up");
		signupButton.setFont(new Font("Arial", Font.PLAIN, 12));
		
        resetButton = new JButton("Reset");
		resetButton.setFont(new Font("Arial", Font.PLAIN, 12));
		
		backButton = new JButton("Back");
		backButton.setFont(new Font("Arial", Font.PLAIN, 12));
		
		n = new JLabel("____________________________________");
		u = new JLabel("____________________________________");
		e = new JLabel("____________________________________");
		p = new JLabel("____________________________________");
		c = new JLabel("____________________________________");
		

        nameTF = new JTextField();
		unameTF = new JTextField();
        phoneTF = new JTextField();
		
		
        passPF = new JPasswordField();
        cpassPF = new JPasswordField();

		
		getContentPane().setBackground(Color.black);


        titleLB.setForeground(Color.white);
        nameLB.setForeground(Color.white);
        unameLB.setForeground(Color.white);
        phoneLB.setForeground(Color.white);
        passLB.setForeground(Color.white);
        cpassLB.setForeground(Color.white);
		
        n.setForeground(Color.white);
        u.setForeground(Color.white);
        e.setForeground(Color.white);
        p.setForeground(Color.white);
        c.setForeground(Color.white);
		
		signupButton.setForeground(Color.black);
	    resetButton.setForeground(Color.black);
		
		
		nameTF.setForeground(Color.white);
		unameTF.setForeground(Color.white);
		phoneTF.setForeground(Color.white);
		passPF.setForeground(Color.white);
		cpassPF.setForeground(Color.white);
	    
		
		nameTF.setBackground(Color.black);
		unameTF.setBackground(Color.black);
		phoneTF.setBackground(Color.black);
		passPF.setBackground(Color.black);
		cpassPF.setBackground(Color.black);
		
		
		signupButton.setBackground(Color.green);
		resetButton.setBackground(Color.white);
		backButton.setBackground(Color.red);
		
		
	
        titleLB.setBounds(450, 30, 500, 30);
        nameLB.setBounds(450, 100, 250, 30);
		unameLB.setBounds(450, 160, 250, 30);
        phoneLB.setBounds(450, 220, 250, 30);
        passLB.setBounds(450, 280, 250, 30);
        cpassLB.setBounds(450, 340, 250, 30);
		

        nameTF.setBounds(450, 125, 200, 20);
		n.setBounds(450, 135, 400, 15);
		unameTF.setBounds(450, 185, 200, 20);
		u.setBounds(450, 195, 400, 15);
        phoneTF.setBounds(450, 245, 200, 20);
		e.setBounds(450, 255, 400, 15);
		
		
        passPF.setBounds(450, 305, 200, 20);
		p.setBounds(450, 315, 400, 15);
        cpassPF.setBounds(450, 365, 200, 20);
		c.setBounds(450, 375, 400, 15);


        signupButton.setBounds(450, 420, 80, 30);
        resetButton.setBounds(550, 420, 80, 30);
        backButton.setBounds(650, 420, 80, 30);
        
	
		nameTF.setBorder(null);
		nameTF.setBorder(null);
		unameTF.setBorder(null);
        phoneTF.setBorder(null);
		
		
	    passPF.setBorder(null);
        cpassPF.setBorder(null);

		
        signupButton.setBorder(null);
	    resetButton.setBorder(null);
	    backButton.setBorder(null);
	   
	    signupButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    resetButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
	 

	    hide1 = new JButton();
        hide1.setIcon(new ImageIcon("image/icon2.png"));  
        hide1.setBounds(690, 300, 20, 30);
        hide1.setForeground(Color.white);
        hide1.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        hide1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hide1.setFocusPainted(false);
        hide1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        hide1.setContentAreaFilled(false);


        hide2 = new JButton();
        hide2.setIcon(new ImageIcon("image/icon3.png"));
        hide2.setBounds(690, 300, 20, 30);
        hide2.setForeground(Color.white);
        hide2.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        hide2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hide2.setFocusPainted(false);
        hide2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        hide2.setContentAreaFilled(false);
        hide2.setVisible(false);
		
		
		hide3 = new JButton();
        hide3.setIcon(new ImageIcon("image/icon2.png"));
        hide3.setBounds(690, 360, 20, 30);
        hide3.setForeground(Color.white);
        hide3.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        hide3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hide3.setFocusPainted(false);
        hide3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        hide3.setContentAreaFilled(false);


        hide4 = new JButton();
        hide4.setIcon(new ImageIcon("image/icon3.png"));
        hide4.setBounds(690, 360, 20, 30);
        hide4.setForeground(Color.white);
        hide4.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        hide4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hide4.setFocusPainted(false);
        hide4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        hide4.setContentAreaFilled(false);
        hide4.setVisible(false);


        add (hide1);
		add (hide2);
		add (hide3);
		add (hide4);


        add(titleLB);
        add(nameLB);
        add(unameLB);
        add(phoneLB);
        add(passLB);
        add(cpassLB);
        add(n);
        add(u);
        add(e);
        add(p);
        add(c);


        add(nameTF);
        add(unameTF);
        add(phoneTF);
		
		
        add(passPF);
        add(cpassPF);


        add(signupButton);
        add(resetButton);
        add(backButton);
   
        add(backgroundLB);


        signupButton.addActionListener(this);
        resetButton.addActionListener(this);
        backButton.addActionListener(this);
		hide1.addActionListener(this);
		hide2.addActionListener(this);
		hide3.addActionListener(this);
		hide4.addActionListener(this);


        setIconImage(logoICN.getImage());
        setResizable(false);  	
        setTitle("Registration");
		setSize(850,550); 
		setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent a) 
	{
		
        if (a.getSource() == signupButton) 
		{
			
            String name = nameTF.getText();
            String username = unameTF.getText();
            String phone = phoneTF.getText();
			
            String password = new String(passPF.getPassword());
            String confirmPassword = new String(cpassPF.getPassword());


            if (name.isEmpty() || username.isEmpty() || phone.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) 
		    {
            JOptionPane.showMessageDialog(this, "Please give all the information!");	
            } 
			
			else if (phone.length() != 11 || !phone.matches("\\d{11}")) 
            {
            JOptionPane.showMessageDialog(this, "Phone number must contain exactly 11 digits!");
            }
			
			else if (password.length() < 6) 
            {
            JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long!");
            }
	  	
	   	    else if(!password.equals(confirmPassword)) 
	        {
            JOptionPane.showMessageDialog(this, "Confirm password and password must be same!");
            }
			
			
	        else
	        {							
				try
				{
					File txt = new File (".\\Data\\registration.txt");
				    if (!txt.exists())  
				    {
                       txt.createNewFile();
                    }
					
					
					FileWriter type = new FileWriter (txt, true);
					
					BufferedWriter bw = new BufferedWriter(type);
                    PrintWriter pw = new PrintWriter(bw);
					
					
					pw.println(" __________________________________");
					pw.println("Full Name: " + name + "\n");
					pw.println("Username: " + username + "\n");
					pw.println("phone: " + phone + "\n");
					pw.println("Password: " + password + "\n");
					pw.println(" __________________________________");
					
					
					
					pw.close();
					
					
					JOptionPane.showMessageDialog (this, "Registration Successfully Completed!");
					new Login();
	                this.setVisible(false);
				}
				 
				catch (IOException ex)
				{
					
					JOptionPane.showMessageDialog (this, "Can not create file!");
					ex.printStackTrace();
				}	
				
			}
		}
		

        else if (a.getSource() == resetButton) 
		{
            nameTF.setText("");
			unameTF.setText("");
            phoneTF.setText("");
            passPF.setText("");
            cpassPF.setText("");
        }
		
		
	    else 
		{
			
	   
		if (a.getSource() == backButton)
		{
		new Login();
	    this.setVisible(false);
		}
		
		
		else if (a.getSource() == hide1) 
		{
            if (passPF.getEchoChar() != '\u0000') 
			{
                passPF.setEchoChar('\u0000');
                hide1.setVisible(false);
                hide2.setVisible(true);
            }
        }
		
		
		else if (a.getSource() == hide2) 
		{
            passPF.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            hide2.setVisible(false);
            hide1.setVisible(true);
        } 
		
		
		else if (a.getSource() == hide3) 
		{
            if (cpassPF.getEchoChar() != '\u0000') 
			{
                cpassPF.setEchoChar('\u0000');
                hide3.setVisible(false);
                hide4.setVisible(true);
            }
        }
		
		
		else if (a.getSource() == hide4) 
		{
            cpassPF.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            hide4.setVisible(false);
            hide3.setVisible(true);
        }
			
		}   
	}  
}

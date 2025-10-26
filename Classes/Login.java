package Classes;
import java.awt.*;
import java.awt.event.*; 
import javax.swing.ImageIcon;
import javax.swing.*; 
import javax.imageio.*; 
import java.awt.Font;
import javax.swing.JButton;
import java.io.*;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class Login extends JFrame implements ActionListener  
{

    JLabel title,name,password; 
    JLabel pass,l1,l2,l3,l4; 
	JTextField tname;	
    JPasswordField tpass;
    JButton login,reg,b1,b2;
	private FileReader reader;	
	JLabel backgroundl;
	ImageIcon image;
    ImageIcon i1;
	
	
    public Login() 
    {  	  
	    title = new JLabel("Login");
	  	name = new JLabel("Username");
	    pass = new JLabel("Password");
	    l2 = new JLabel("________________________________________________________");
		l1 = new JLabel("______________________________________________________");
		l3 = new JLabel(" Don't have an account?");
		l4 = new JLabel(" Hungry! Login and oder fast");
		
		tname = new JTextField();
		tpass = new JPasswordField();
		login = new JButton("Login");
		reg = new JButton("Sign Up");
	
	
	
	    image = new ImageIcon("image/ads.jpg");
		i1 = new ImageIcon("image/logo.png");
		
        backgroundl = new JLabel("", image, JLabel.CENTER);
	    
		
	    b1 = new JButton();
        b1.setIcon(new ImageIcon("image/icon2.png")); 
        b1.setBounds(740, 240, 20, 30);
        b1.setForeground(Color.black);
			
		
		
        b1.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);

        b2 = new JButton();
        b2.setIcon(new ImageIcon("image/icon3.png"));
        b2.setBounds(740, 240, 20, 30);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);
        b2.setVisible(false);

	
	    setTitle("Login");
		
		title.setSize(300, 30);
		title.setBounds(620, 40, 600, 50);
		title.setFont(new Font("Arial", Font.PLAIN, 35));
		
		
		l4.setBounds(590, 70, 600, 50);	
		backgroundl.setBounds(0,0,500,700);	
		name.setBounds(550, 153, 202, 30);	
		tname.setBounds(550, 175, 200, 30);
		l1.setBounds(550, 185, 200, 30);

        pass.setBounds(550, 215, 200, 30);
        tpass.setBounds(550, 240, 190, 30);
        
		l2.setBounds(550, 250, 200, 30);    
        l3.setBounds(550, 330, 200, 30);
	    
        reg.setBounds(690, 335, 200, 30);
        login.setBounds(550, 290, 200, 30);
	
	 
		login.setSize(100, 20);	  
		reg.setSize(120, 20);	 	 


        login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        reg.setCursor(new Cursor(Cursor.HAND_CURSOR));
      	
		
		name.setFont(new Font("Arial", Font.BOLD, 15));	
		pass.setFont(new Font("Arial", Font.BOLD, 15));	

		
        add (b1);
		add (b2);
	    getContentPane().add(backgroundl);
		getContentPane().setBackground(Color.lightGray);			
	 
	 
		login.setBackground (Color.white);
		reg.setBackground(Color.lightGray);
		tname.setBackground(Color.lightGray);
		tpass.setBackground(Color.lightGray);
		
		title.setForeground(Color.white);
		name.setForeground(Color.blue);
        pass.setForeground(Color.blue);
        l1.setForeground(Color.blue);
        l2.setForeground(Color.blue);
       	
	  
		reg.setBorder(null);	  
		tname.setBorder(null);	  
		tpass.setBorder(null);	  

	 
	    add(name);
	    add(pass);
	    add(tname);
	    add(tpass);
	    add(login);
	    add(reg);
	    add(title);
		
		
	    add(backgroundl);
		add (l1);
		add (l2);
		add (l3);
		add (l4);
	
	
	    setIconImage(i1.getImage());	 
	    setResizable(false);  	  
        setLayout(null);  
        setVisible(true); 
	
	
	    login.setSize(200, 30);
	    reg.setSize(70, 20);
		
		
		login.addActionListener(this);
		reg.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		setSize(850,550); 
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	 
	 
	 
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource() == reg)
		{
		  new OnlineRegistration();
		  this.setVisible(false);	
		}	
		
		
		if (e.getSource() == b1) 
		{
            if (tpass.getEchoChar() != '\u0000') 
		    {
                tpass.setEchoChar('\u0000');
                b1.setVisible(false);
                b2.setVisible(true);
            }
        }
		
		if (e.getSource() == b2) 
		{
            tpass.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
            b2.setVisible(false);
            b1.setVisible(true);
        }
		
		
		
	    if (e.getSource() == login) 
		{
           
		    String username = tname.getText();
            String password = new String(tpass.getPassword());
            String fileData = "";
            boolean validCredentials = false;
          
		    if (username.equals("admin") && password.equals("admin")) 
		    {
			    new AdminPanel() ; 
			    this.setVisible(false);
		    }
			
			
		else if(username.isEmpty() || password.isEmpty() ) 
		{
            JOptionPane.showMessageDialog(this, "Please give all the information!");	
		}
			
			
			
	    else
		{
            try 
			{      
                File file = new File(".\\Data\\registration.txt");
                Scanner scanner = new Scanner(file);
				
            while (scanner.hasNextLine()) 
			{
                fileData += scanner.nextLine() + "\n";
            }

            scanner.close();

       
            if (fileData.contains("Username: " + username) && fileData.contains("Password: " + password)) 
			{
                validCredentials = true;
				
				new DashBoard();
				this.setVisible(false);
			}
		
			else  
			{	
				JOptionPane.showMessageDialog(this, "Invalid username or password!");	
			}	       
        }
			catch (FileNotFoundException ex) {
            System.out.println("File not found: " + ex.getMessage());
        }	
			
		}
        
	}
}}		
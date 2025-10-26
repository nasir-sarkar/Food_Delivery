package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AddUser extends JFrame 
{
    private Container container;
    private JLabel fullName, name, email, pass, background;
    private JTextField f_name, n_field, n_email;
    private Font fo;
    private JPasswordField pass_fi;
    private JButton add_button, back;
    private ImageIcon i1;

    public AddUser() 
	{
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Add User");
        this.setBounds(300, 300, 900, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        container = this.getContentPane();

        fo = new Font("Courier", Font.BOLD, 20);
        i1 = new ImageIcon("image/logo.png");
        setIconImage(i1.getImage());

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.PLAIN, 18));
        back.setBounds(590, 350, 100, 30);
        back.setForeground(Color.black);
        back.setBackground(Color.red);
        back.setBorder(null);
        container.add(back);

        fullName = new JLabel("Enter Full Name : ");
        fullName.setBounds(180, 50, 200, 90);
        fullName.setFont(fo);
        fullName.setForeground(Color.white);
        container.add(fullName);

        name = new JLabel("Enter Username : ");
        name.setBounds(180, 120, 200, 90);
        name.setFont(fo);
        name.setForeground(Color.white);
        container.add(name);

        email = new JLabel("Enter Phone : ");
        email.setBounds(180, 190, 200, 90);
        email.setFont(fo);
        email.setForeground(Color.white);
        container.add(email);

        pass = new JLabel("Enter Password : ");
        pass.setBounds(180, 260, 200, 90);
        pass.setFont(fo);
        pass.setForeground(Color.white);
        container.add(pass);
		
        f_name = new JTextField();
        f_name.setBounds(390, 80, 300, 40);
        container.add(f_name);
        f_name.setBorder(null);

        n_field = new JTextField();
        n_field.setBounds(390, 150, 300, 40);
        container.add(n_field);
        n_field.setBorder(null);

        n_email = new JTextField();
        n_email.setBounds(390, 217, 300, 40);
        container.add(n_email);
        n_email.setBorder(null);

        pass_fi = new JPasswordField();
        pass_fi.setBounds(390, 284, 300, 40);
        container.add(pass_fi);
        pass_fi.setBorder(null);

        add_button = new JButton("Add");
        add_button.setFont(new Font("Arial", Font.PLAIN, 18));
        add_button.setBounds(460, 350, 100, 30);
        add_button.setForeground(Color.black);
        add_button.setBackground(Color.green);
        add_button.setBorder(null);
        container.add(add_button);
		
        JLabel intro1 = new JLabel("ADD USER");
        intro1.setFont(new Font("Arial", Font.PLAIN, 35));
        intro1.setBounds(340, 20, 400, 50);
        intro1.setForeground(Color.white);
        add(intro1);

        back.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                if (e.getSource() == back) 
				{
                    new AdminPanel();
                    setVisible(false);
                }
            }
        });


        add_button.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                String fullName = f_name.getText().trim();
                String name = n_field.getText().trim();
                String phone = n_email.getText().trim();
                String password = new String(pass_fi.getPassword()).trim();

               
                if (fullName.isEmpty() || name.isEmpty() || phone.isEmpty() || password.isEmpty())  
                {
                    JOptionPane.showMessageDialog(null, "Please give all the information!");
                } 
                else if (phone.length() != 11 || !phone.matches("\\d{11}")) 
                {
                    JOptionPane.showMessageDialog(null, "Phone number must contain exactly 11 digits!");
                }
                else if (password.length() < 6) 
                {
                    JOptionPane.showMessageDialog(null, "Password must be at least 6 characters long!");
                }
				
                else 
                {
                    
                    try 
                    {
                        File text = new File(".\\Data\\registration.txt");
						
                        if (!text.exists()) 
                        {
                            text.createNewFile();
                        }
						
                        FileWriter type = new FileWriter(text, true);
                        BufferedWriter bw = new BufferedWriter(type);
                        PrintWriter pw = new PrintWriter(bw);
                        pw.println("------------------------------");
                        pw.println("Full Name: " + fullName + "\n");
                        pw.println("Username: " + name + "\n");
                        pw.println("User Phone : " + phone + "\n");
                        pw.println("Password: " + password + "\n");
                        pw.println("---------------------------------");
                        pw.close();
                        JOptionPane.showMessageDialog(null, "User Added Successfully!");
						
                        
                        f_name.setText("");
                        n_email.setText("");
                        n_field.setText("");
                        pass_fi.setText("");
						
                    } 
                    catch (Exception ex) 
                    {
                        System.out.println(ex);
                    }
                }
            }
        });

        getContentPane().setBackground(Color.black);
        this.setVisible(true);
    }
}

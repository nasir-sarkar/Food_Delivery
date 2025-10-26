package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeleteUser extends JFrame 
{
    private Container container;
    private JTextField usernameField;
    private Font fo;
    private JButton del, back;
    private ImageIcon i1;

    public DeleteUser() 
	{
        i1 = new ImageIcon("image/logo.png");
        setIconImage(i1.getImage());

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Delete User");
        this.setBounds(300, 300, 900, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        container = this.getContentPane();

        fo = new Font("Courier", Font.BOLD, 20);

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.PLAIN, 22));
        back.setBounds(515, 220, 115, 30);
        back.setForeground(Color.black);
        back.setBackground(Color.red);
        container.add(back);

        del = new JButton("Delete");
        del.setFont(new Font("Arial", Font.PLAIN, 22));
        del.setBounds(380, 220, 115, 30);
        del.setForeground(Color.black);
        del.setBackground(Color.white);
        container.add(del);

        JLabel usernameLabel = new JLabel("Enter Username:");
        usernameLabel.setFont(fo);
        usernameLabel.setBounds(200, 170, 200, 40);
        usernameLabel.setForeground(Color.white);
        container.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(380, 176, 250, 30);
        container.add(usernameField);
        usernameField.setBorder(null);

        getContentPane().setBackground(Color.black);
        this.setVisible(true);

        back.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                new AdminPanel();
                setVisible(false);
            }
        });

        del.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                String usernameToDelete = usernameField.getText().trim();

                if (usernameToDelete.isEmpty()) 
				{
                    JOptionPane.showMessageDialog(null, "Please enter a username to delete.");
                    return;
                }

                try 
				{
                    File inputFile = new File(".\\Data\\registration.txt");
                    File tempFile = new File(".\\Data\\temp.txt");

                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                    PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

                    List<String> lines = new ArrayList<>();
                    String line;
                    boolean found = false;
                    int deleteIndex = -1;

                   
                    while ((line = reader.readLine()) != null) 
					{
                        lines.add(line);
                    }
                    reader.close();


                    for (int i = 0; i < lines.size(); i++) {
                        if (lines.get(i).trim().equalsIgnoreCase("Username: " + usernameToDelete)) {
                            found = true;
                            deleteIndex = i - 2; 
                            break;
                        }
                    }

                  
                    for (int i = 0; i < lines.size(); i++) {
                        if (found && i >= deleteIndex && i < deleteIndex + 10) 
						{
                            continue;
                        }
                        writer.println(lines.get(i));
                    }

                    writer.close();

                   
                    if (found) 
					{
                        inputFile.delete();
                        tempFile.renameTo(inputFile);
                        JOptionPane.showMessageDialog(null, "User deleted successfully.");
                        usernameField.setText("");
                    } 
					else 
					{
                        tempFile.delete();
                        JOptionPane.showMessageDialog(null, "Username not found.");
                    }
                } 
				catch (Exception x) 
				{
                    JOptionPane.showMessageDialog(null, "Error: " + x.getMessage());
                }
            }
        });
    }
}

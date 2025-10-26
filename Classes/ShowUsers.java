package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ShowUsers extends JFrame 
{
    private Container container;
    private JTextArea area;
    private Font fo;
    private JButton del, back;
    ImageIcon i1;

    public ShowUsers() 
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Show Users");
        this.setBounds(300, 300, 900, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        container = this.getContentPane();

        fo = new Font("Courier", Font.BOLD, 20);

        i1 = new ImageIcon("image/logo.png");
        setIconImage(i1.getImage());

        back = new JButton("Back");
        back.setFont(new Font("Arial", Font.PLAIN, 20));
        back.setBounds(465, 420, 120, 25);
        back.setForeground(Color.black);
        back.setBackground(Color.red);
        back.setBorder(null);
        container.add(back);

        del = new JButton("Show All");
        del.setFont(new Font("Arial", Font.PLAIN, 20));
        del.setBounds(335, 420, 120, 25);
        del.setForeground(Color.black);
        del.setBackground(Color.white);
        del.setBorder(null);
        container.add(del);

        area = new JTextArea();
        area.setFont(new Font("Arial", Font.PLAIN, 15));
        area.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setBounds(280, 55, 340, 340);
        container.add(scrollPane);
        
        JLabel intro1 = new JLabel("SEE ALL USERS");
        intro1.setFont(new Font("Arial", Font.PLAIN, 25));
        intro1.setBounds(360, 7, 450, 50);
        intro1.setForeground(Color.white);
        add(intro1);

        getContentPane().setBackground(Color.black);
        this.setVisible(true);

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

        del.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String fileData = "";
                try 
                {
                    FileReader file = new FileReader(".\\Data\\registration.txt");
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) 
                    {
                        fileData += scanner.nextLine() + "\n";
                    }
                    area.setText(fileData);
                    scanner.close();
                } 
                catch (FileNotFoundException x) 
                {
                    System.out.println(x);
                }
            }
        });
    }
}

package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.event.*;
import java.sql.*;

public class Panel extends JFrame 
{
    private Container container;
    private JButton insert, show, delete, lout;
    private JLabel background;
    private Font font;
    ImageIcon i1;
    ImageIcon imageICN;

    public Panel() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Panel");
        this.setBounds(300, 300, 900, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        container = this.getContentPane();

        i1 = new ImageIcon("image/logo.png");
        setIconImage(i1.getImage());

        font = new Font("Courier", Font.BOLD, 20);

        insert = new JButton("Insert");
        insert.setBounds(230, 230, 200, 40);
        insert.setBorderPainted(false);
        insert.setBackground(Color.BLACK);
        insert.setForeground(Color.white);
        insert.setFont(font);
        container.add(insert);

        show = new JButton("Show Users");
        show.setBounds(440, 230, 200, 40);
        show.setBorderPainted(false);
        show.setBackground(Color.BLACK);
        show.setForeground(Color.white);
        show.setFont(font);
        container.add(show);
        
        delete = new JButton("Delete");
        delete.setBounds(335, 280, 200, 40);
        delete.setBorderPainted(false);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.white);
        delete.setFont(font);
        container.add(delete);

        lout = new JButton("Logout");
        lout.setBounds(750, 15, 75, 20);
        lout.setForeground(Color.white);
        lout.setBackground(Color.black);
        lout.setBorder(null);
        container.add(lout);

        JLabel intro1 = new JLabel("Welcome, Admin!");
        intro1.setFont(new Font("Arial", Font.PLAIN, 35));
        intro1.setBounds(300, 100, 400, 50);
        intro1.setForeground(Color.black);
        add(intro1);
    
        getContentPane().setBackground(Color.white);
        
        this.setVisible(true);
    
        insert.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                new Insert();
                setVisible(false);
            }
        });

        show.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                new Show();
                setVisible(false);
            }
        });

        delete.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                new Delete();
                setVisible(false);
            }
        });

        lout.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                new Loogin();
                setVisible(false);
            }
        });
    }
}

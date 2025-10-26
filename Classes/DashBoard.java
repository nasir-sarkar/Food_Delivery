package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.event.*;
import java.sql.*;

public class DashBoard extends JFrame
{
    private Container container;
    private JLabel title, toast, toast1, toast2, backgroundLabel;
    private Font font, font2;
    private ImageIcon imageIcon;
    private JButton brk, lunch, dinner, lout, cart;


    public DashBoard()
	{
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("DashBoard");
        setSize(850,550); 
        this.setResizable(false);
        container = this.getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(null);
        this.setLocationRelativeTo(null);
       
	   
        font = new Font("Arial", Font.BOLD, 20);
        font2 = new Font("Arial", Font.BOLD, 17);


        title = new JLabel("Our Food Menu");
        title.setBounds(260, 20, 500, 40);
        title.setForeground(Color.black);
		title.setFont(new Font("Arial", Font.PLAIN, 45));
        container.add(title);
        
        
        toast = new JLabel("Breakfast");
        toast.setBounds(80, 150, 150, 30);
        toast.setFont(font);
        container.add(toast);


        toast1 = new JLabel("Lunch");
        toast1.setBounds(385, 150, 150, 30);
        toast1.setFont(font);
        container.add(toast1);


        toast2 = new JLabel("Dinner");
        toast2.setBounds(670, 150, 150, 30);
        toast2.setFont(font);
        container.add(toast2);
     
	 
        brk = new JButton();
        brk.setIcon(new ImageIcon("image/NaanBread.jpg"));
        brk.setBounds(30, 200, 200, 180);
        brk.setBorder(null);
        container.add(brk);
        
		
        lunch = new JButton();
        lunch.setIcon(new ImageIcon("image/MorogPolao.jpg"));
        lunch.setBounds(320, 200, 200, 180);
        lunch.setBorder(null);
        container.add(lunch);


        dinner = new JButton();
        dinner.setIcon(new ImageIcon("image/cFriedRice.jpg"));
        dinner.setBounds(600, 200, 200, 180);
        dinner.setBorder(null);
        container.add(dinner);


        lout = new JButton("Logout");
        lout.setBounds(720, 20, 75, 30);
        lout.setForeground(Color.white);
        lout.setBackground(Color.black);
        lout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lout.setBorder(null);
        container.add(lout);


        getContentPane().setBackground (Color.white);
		
		
        lout.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                new Login();
                setVisible(false);
            }
        }); 


        brk.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                new Breakfast();
                setVisible(false);
            }
        });


        lunch.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                new Lunch();
                setVisible(false);
            }
        });
        
		
        dinner.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{
                new Dinner();
                setVisible(false);
            }
        });
		
    }
}

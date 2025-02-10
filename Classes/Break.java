package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.event.*;
import java.sql.*;

public class Break extends JFrame
{
	private Container container;
	private JLabel title, background ,toast ,t_toast,t_price,waffle_text,wffle_pic,waffle_price,muesli_text,muesli_pic,muesli_price,eggs_text ,egg_image,egg_price ,dosa_text,dosa_pic,dosa_price,huevos_text,huevos_pic,huevos_price;
	private JButton toast_button , waffle_button , muesli_button, egg_button , dosa_button,huevos_button,back;
	private Font  fo1, b_fo;  
	ImageIcon i1;
	

	public Break()
    {
		title = new JLabel("BREAKFAST ITEMS");
		title.setFont(new Font("Arial", Font.PLAIN, 27));
		title.setBounds(270, 03, 400, 40);	
		add(title);
		title.setForeground(Color.RED);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("BreakFast");
		this.setBounds(300 , 300 , 800 , 620);
		this.setResizable(false);
		
		
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		container= this.getContentPane();
		
		
		fo1 =  new Font("Sherif", Font.BOLD, 13);
		b_fo =  new Font("Sherif", Font.BOLD, 12);
		
		
		i1 = new ImageIcon("image/logo.png");
		
		
		setIconImage(i1.getImage());
	
		
		back = new JButton("Back");
		back.setFont(new Font("Arial", Font.PLAIN, 22));
		back.setBounds(610, 535, 120, 25);
		add(back); 
		back.setForeground   (Color.white);
		back.setBackground   (Color.red);
	
		
		
		//toast
		t_toast = new JLabel("French Toast");
		t_toast.setBounds(90 , 45 , 100 , 40);
		t_toast.setFont(fo1);
		t_toast.setForeground(Color.BLACK);
		t_toast.setBackground(new Color(100, 20, 70));
		container.add(t_toast);
		
		
		ImageIcon img1 =  new ImageIcon("image/pic1.jpg");
		toast = new JLabel("", img1 , JLabel.CENTER);
		toast.setBounds(50 , 86 , 150 , 140);
		container.add(toast);
	

		t_price = new JLabel("BDT 500");
		t_price.setBounds(105 , 215 , 100 , 40);

		t_price.setFont(fo1);
		t_price.setForeground(Color.BLACK);
		container.add(t_price);
		
		
		toast_button = new JButton("Oder now");
		toast_button.setBounds(60 , 245 , 120 , 25);
		toast_button.setFont(b_fo);
		toast_button.setBackground(Color.BLUE);
		toast_button.setForeground(Color.WHITE);
		toast_button.setBorderPainted(false);
		container.add(toast_button);	
		
		
		
		//waffle
		waffle_text = new JLabel("Waffle");
		waffle_text.setBounds(375 , 45 , 200 , 40);
		waffle_text.setFont(fo1);
		waffle_text.setForeground(Color.BLACK);
		waffle_text.setBackground(new Color(100, 20, 70));
		container.add(waffle_text);
		
		
		ImageIcon img2 =  new ImageIcon("image/pic2.jpg");
		wffle_pic = new JLabel("", img2 , JLabel.CENTER);
		wffle_pic.setBounds(320, 86 , 150 , 140);
		container.add(wffle_pic);
		
		
		waffle_price = new JLabel("BDT 100");
		waffle_price.setBounds(380, 215 , 100 , 40);
		
		waffle_price.setFont(fo1);
		waffle_price.setForeground(Color.BLACK);
		container.add(waffle_price);
		
	
		waffle_button = new JButton("Oder now");
		waffle_button.setBounds(335 , 245 , 120 , 25);
		waffle_button.setFont(b_fo);
		waffle_button.setBackground(Color.BLUE);
		waffle_button.setForeground(Color.WHITE);
		waffle_button.setBorderPainted(false);
		container.add(waffle_button);
		
	
		
		//muesli
		muesli_text = new JLabel("Muesli");
		muesli_text.setBounds(650 , 45 , 100 , 40);
		muesli_text.setFont(fo1);
		muesli_text.setForeground(Color.BLACK);
		muesli_text.setBackground(new Color(100, 20, 70));
		container.add(muesli_text);
		
		ImageIcon img3 =  new ImageIcon("image/pic3.jpg");
		muesli_pic = new JLabel("", img3 , JLabel.CENTER);
		muesli_pic.setBounds(595, 86 , 150 , 140);
		container.add(muesli_pic);
		
		muesli_price = new JLabel("BDT 300");
		muesli_price.setBounds(650, 215 , 100 , 40);
		
		muesli_price.setFont(fo1);
		muesli_price.setForeground(Color.BLACK);
		container.add(muesli_price);
		
	 
		muesli_button = new JButton("Oder now");
		muesli_button.setBounds(610 , 245 , 120 , 25);
		muesli_button.setFont(b_fo);
		muesli_button.setBackground(Color.BLUE);
		muesli_button.setForeground(Color.WHITE);
		muesli_button.setBorderPainted(false);
		container.add(muesli_button);
	
		
		
		//eggs benidict 
		eggs_text = new JLabel("Eggs Benedict");
		eggs_text.setBounds(80 , 300, 100 , 20);
		eggs_text.setFont(fo1);
		eggs_text.setForeground(Color.BLACK);
		eggs_text.setBackground(new Color(100, 20, 70));
		container.add(eggs_text);
		
		ImageIcon img4 =  new ImageIcon("image/pic4.jpg");
		egg_image = new JLabel("", img4 , JLabel.CENTER);
		egg_image.setBounds(50 , 323 , 150 , 140);
		container.add(egg_image);
		
		egg_price = new JLabel("BDT 500");
		egg_price.setBounds(105 , 455 , 100 , 40);
	 
		egg_price.setFont(fo1);
		egg_price.setForeground(Color.BLACK);
		container.add(egg_price);
		
		egg_button = new JButton("Oder now");
		egg_button.setBounds(60 , 485 , 120 , 25);
		egg_button.setFont(b_fo);
		egg_button.setBackground(Color.BLUE);
		egg_button.setForeground(Color.WHITE);
		egg_button.setBorderPainted(false);
		container.add(egg_button);
		
		
		
		
		//dosa
		dosa_text = new JLabel("Dosa");
		dosa_text.setBounds(380 , 300 , 200 , 20);
		dosa_text.setFont(fo1);
		dosa_text.setForeground(Color.BLACK);
		dosa_text.setBackground(new Color(100, 20, 70));
		container.add(dosa_text);
		
		ImageIcon img5 =  new ImageIcon("image/pic5.jpg");
		dosa_pic = new JLabel("", img5 , JLabel.CENTER);
		dosa_pic.setBounds(320, 323 , 150 , 140);
		container.add(dosa_pic);
		
		dosa_price = new JLabel("BDT 90");
		dosa_price.setBounds(380, 455 , 100 , 40);
		
		dosa_price.setFont(fo1);
		dosa_price.setForeground(Color.BLACK);
		container.add(dosa_price);
		
		dosa_button = new JButton("Oder now");
		dosa_button.setBounds(335 , 485 , 120 , 25);
		dosa_button.setFont(b_fo);
		dosa_button.setBackground(Color.BLUE);
		dosa_button.setForeground(Color.WHITE);
		dosa_button.setBorderPainted(false);
		container.add(dosa_button);
	
		
		
		
		//huevos start
		huevos_text = new JLabel("Huevos");
		huevos_text.setBounds(650 , 300 , 200 , 20);
		huevos_text.setFont(fo1);
		huevos_text.setForeground(Color.BLACK);
		huevos_text.setBackground(new Color(100, 20, 70));
		container.add(huevos_text);
		
		ImageIcon img6 =  new ImageIcon("image/pic6.jpg");
		huevos_pic = new JLabel("", img6 , JLabel.CENTER);
		huevos_pic.setBounds(595, 323 , 150 , 140);
		container.add(huevos_pic);
		
		huevos_price = new JLabel("BDT 300");
		huevos_price.setBounds(655, 455 , 100 , 40);
		
		huevos_price.setFont(fo1);
		huevos_price.setForeground(Color.BLACK);
		container.add(huevos_price);
		
		huevos_button = new JButton("Oder now");
		huevos_button.setBounds(610 , 485 , 120 , 25);
		huevos_button.setFont(b_fo);
		huevos_button.setBackground(Color.BLUE);
		huevos_button.setForeground(Color.WHITE);
		huevos_button.setBorderPainted(false);
		container.add(huevos_button);
		
		
	 
		back.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == back) 
				{
					
		           new DashBoard();
                   setVisible(false);
					
                }
            }
        });  
		
		
		
		toast_button.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == toast_button) 
				{
					
		           new CardPayment();
                   setVisible(false);
					
                }
            }
        });  
		
		
		
		waffle_button.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == waffle_button) 
				{
					
		           new CardPayment();
                   setVisible(false);
					
                }
            }
        });  
		
		
		
		muesli_button.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() == muesli_button) 
				{
					
		           new CardPayment();
                   setVisible(false);
					
                }
            }
        });  
		
		
		
		egg_button.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
		    {

                if (e.getSource() ==  egg_button) 
				{
					
		           new CardPayment();
                   setVisible(false);
					
                }
            }
        });  
		
		
		
		dosa_button.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) 
			{

                if (e.getSource() ==  dosa_button) 
				{
					
		           new CardPayment();
                   setVisible(false);
					
                }
            }
        });  
		
		
		
		huevos_button.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == huevos_button) {
					
		           new CardPayment();
                   setVisible(false);
					
                }
            }
        });  
		
		
		this.setVisible(true);
		
	}
 
	/*public static void main(String[] args)
	{
	Break frame = new Break();
	}*/
}
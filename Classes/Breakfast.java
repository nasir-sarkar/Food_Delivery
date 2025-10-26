package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.event.*;
import java.sql.*;

public class Breakfast extends JFrame implements ActionListener 
{
	JLabel 
	background, title,
	t_toast, toast, t_price,
	waffle_text, wffle_pic, waffle_price,
	muesli_text, muesli_pic, muesli_price,
	eggs_text, egg_image, egg_price,
	dosa_text, dosa_pic, dosa_price,
	huevos_text, huevos_pic, huevos_price;
	
	JButton 
	toast_button, waffle_button, muesli_button, 
	egg_button, dosa_button, huevos_button, back;
	
	Font  
	fo1, b_fo;
	
	ImageIcon i1;
	
	
	public Breakfast()
	{
		
		
		title = new JLabel("<html><u>BREAKFAST ITEMS</u></html>");
		title.setFont(new Font("Arial", Font.BOLD, 27));
		title.setBounds(270, 03, 400, 40);	
		add(title);
		title.setForeground(Color.BLACK);
		
		
		back = new JButton("Back");
		back.setFont(new Font("Arial", Font.PLAIN, 22));
		back.setBounds(610, 535, 120, 25);
		add(back); 
		back.setForeground(Color.white);
		back.setBackground(Color.red);
		back.addActionListener(this);
		
		
		fo1 =  new Font("Sherif", Font.BOLD, 13);
		b_fo =  new Font("Sherif", Font.BOLD, 12);
		
		
		i1 = new ImageIcon("image/logo.png");
		
		
		
		
		
		//French Toast
		t_toast = new JLabel("French Toast");
		t_toast.setBounds(90, 45, 100, 40);
		t_toast.setFont(fo1);
		t_toast.setForeground(Color.BLACK);
		add(t_toast);
		
		
		ImageIcon img1 =  new ImageIcon("image/pic1.jpg");
		toast = new JLabel("", img1, JLabel.CENTER);
		toast.setBounds(50, 86, 150, 140);
		add(toast);
		
		
		t_price = new JLabel("500TK");
		t_price.setBounds(105, 215, 100, 40);	 
		t_price.setFont(fo1);
		t_price.setForeground(Color.BLACK);
		add(t_price);
		
		
		toast_button = new JButton("Oder now");
		toast_button.setBounds(60, 245, 120, 25);
		toast_button.setFont(b_fo);
		toast_button.setBackground(Color.BLUE);
		toast_button.setForeground(Color.WHITE);
		toast_button.setBorderPainted(false);
		add(toast_button);
		
		
		
		
		
		//Waffle
		waffle_text = new JLabel("Waffle");
		waffle_text.setBounds(375, 45, 200, 40);
		waffle_text.setFont(fo1);
		waffle_text.setForeground(Color.BLACK);
		add(waffle_text);
		
		
		ImageIcon img2 =  new ImageIcon("image/pic2.jpg");
		wffle_pic = new JLabel("", img2, JLabel.CENTER);
		wffle_pic.setBounds(320, 86, 150, 140);
		add(wffle_pic);
		
		
		waffle_price = new JLabel("100TK");
		waffle_price.setBounds(380, 215, 100, 40);	 
		waffle_price.setFont(fo1);
		waffle_price.setForeground(Color.BLACK);
		add(waffle_price);
		
		
		waffle_button = new JButton("Oder now");
		waffle_button.setBounds(335, 245, 120, 25);
		waffle_button.setFont(b_fo);
		waffle_button.setBackground(Color.BLUE);
		waffle_button.setForeground(Color.WHITE);
		waffle_button.setBorderPainted(false);
		add(waffle_button);
		
		
		
		
		
		//Muesli
		muesli_text = new JLabel("Muesli");
		muesli_text.setBounds(650, 45, 100, 40);
		muesli_text.setFont(fo1);
		muesli_text.setForeground(Color.BLACK);
		add(muesli_text);
		
		
		ImageIcon img3 =  new ImageIcon("image/pic3.jpg");
		muesli_pic = new JLabel("", img3, JLabel.CENTER);
		muesli_pic.setBounds(595, 86, 150, 140);
		add(muesli_pic);
		
		
		muesli_price = new JLabel("300TK");
		muesli_price.setBounds(650, 215, 100, 40);	 
		muesli_price.setFont(fo1);
		muesli_price.setForeground(Color.BLACK);
		add(muesli_price);
		
		
		muesli_button = new JButton("Oder now");
		muesli_button.setBounds(610, 245, 120, 25);
		muesli_button.setFont(b_fo);
		muesli_button.setBackground(Color.BLUE);
		muesli_button.setForeground(Color.WHITE);
		muesli_button.setBorderPainted(false);
		add(muesli_button);
		
		
		
		
		
		//Eggs Benedict
		eggs_text = new JLabel("Eggs Benedict");
		eggs_text.setBounds(80, 300, 100, 20);
		eggs_text.setFont(fo1);
		eggs_text.setForeground(Color.BLACK);
		add(eggs_text);
		
		
		ImageIcon img4 =  new ImageIcon("image/pic4.jpg");
		egg_image = new JLabel("", img4, JLabel.CENTER);
		egg_image.setBounds(50, 323, 150, 140);
		add(egg_image);
		
		
		egg_price = new JLabel("430TK");
		egg_price.setBounds(105, 455, 100, 40);	 
		egg_price.setFont(fo1);
		egg_price.setForeground(Color.BLACK);
		add(egg_price);
		
		
		egg_button = new JButton("Oder now");
		egg_button.setBounds(60, 485, 120, 25);
		egg_button.setFont(b_fo);
		egg_button.setBackground(Color.BLUE);
		egg_button.setForeground(Color.WHITE);
		egg_button.setBorderPainted(false);
		add(egg_button);
		
		
		
		
		
		//Dosa
		dosa_text = new JLabel("Dosa");
		dosa_text.setBounds(380, 300, 200, 20);
		dosa_text.setFont(fo1);
		dosa_text.setForeground(Color.BLACK);
		add(dosa_text);
		
		
		ImageIcon img5 =  new ImageIcon("image/pic5.jpg");
		dosa_pic = new JLabel("", img5, JLabel.CENTER);
		dosa_pic.setBounds(320, 323, 150, 140);
		add(dosa_pic);
		
		
		dosa_price = new JLabel("90TK");
		dosa_price.setBounds(380, 455, 100, 40);	 
		dosa_price.setFont(fo1);
		dosa_price.setForeground(Color.BLACK);
		add(dosa_price);
		
		
		dosa_button = new JButton("Oder now");
		dosa_button.setBounds(335, 485, 120, 25);
		dosa_button.setFont(b_fo);
		dosa_button.setBackground(Color.BLUE);
		dosa_button.setForeground(Color.WHITE);
		dosa_button.setBorderPainted(false);
		add(dosa_button);
		
		
		
		
		
		//Huevos
		huevos_text = new JLabel("Huevos");
		huevos_text.setBounds(650, 300, 200, 20);
		huevos_text.setFont(fo1);
		huevos_text.setForeground(Color.BLACK);
		add(huevos_text);
		
		
		ImageIcon img6 =  new ImageIcon("image/pic6.jpg");
		huevos_pic = new JLabel("", img6, JLabel.CENTER);
		huevos_pic.setBounds(595, 323, 150, 140);
		add(huevos_pic);
		
		
		huevos_price = new JLabel("350TK");
		huevos_price.setBounds(655, 455, 100, 40);
		huevos_price.setFont(fo1);
		huevos_price.setForeground(Color.BLACK);
		add(huevos_price);
		
		
		huevos_button = new JButton("Oder now");
		huevos_button.setBounds(610, 485, 120, 25);
		huevos_button.setFont(b_fo);
		huevos_button.setBackground(Color.BLUE);
		huevos_button.setForeground(Color.WHITE);
		huevos_button.setBorderPainted(false);
		add(huevos_button);
		
		
		
		toast_button.addActionListener(this);
		waffle_button.addActionListener(this);
		muesli_button.addActionListener(this);
		egg_button.addActionListener(this);
		dosa_button.addActionListener(this);
		huevos_button.addActionListener(this);
		
		
		setIconImage(i1.getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Breakfast");
		setBounds(300, 300, 800, 620);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	
	
	public void actionPerformed(ActionEvent a)
	{
	
	
		if (a.getSource() == back)
		{
	        new DashBoard();
		    this.setVisible(false);
		}
		
		
		if (a.getSource() == toast_button)
		{
		    new CardPayment();
		    this.setVisible(false);
		} 
		
		if (a.getSource() == waffle_button)
		{
		    new CardPayment();
		    this.setVisible(false);
		} 
		
		if (a.getSource() == muesli_button)
		{
			new CardPayment();
			this.setVisible(false);
		} 
		
		if (a.getSource() == egg_button)
		{
			new CardPayment();
			this.setVisible(false);
		} 
		
		if (a.getSource() == dosa_button)
		{
			new CardPayment();
			this.setVisible(false);
		} 
		
		if (a.getSource() == huevos_button)
		{
			new CardPayment();
			this.setVisible(false);
		} 
		
	}
}

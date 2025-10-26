package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.event.*;
import java.sql.*; 
 
public class Lunch extends JFrame implements ActionListener  
{
	
	JLabel 
	background, title,
	cTehari_text, cTehari_pic, cTehari_price,  
	bTehari_text, bTehari_pic, bTehari_price,  
	morogPolao_text, morogPolao_pic, morogPolao_price,
	muttonKacchi_text, muttonKacchi_image, muttonKacchi_price,
	Khichuri_text, Khichuri_pic, Khichuri_price,
	chickenTikka_text, chickenTikka_pic, chickenTikka_price;  
	
	JButton 
	cTehari_text_button, bTehari_button, morogPolao_button, 
	muttonKacchi_button , Khichuri_button, chickenTikka_button, back;
		
	Font  
	fo1, b_fo;
	
    ImageIcon i1;
	
	
	
	public Lunch()
	{
		
	
		title = new JLabel("<html><u>LUNCH ITEMS</u></html>");
		title.setFont(new Font("Arial", Font.BOLD, 27));
		title.setBounds(300, 03, 400, 40);	
		add(title);
		title.setForeground (Color.black);
		
		
		back = new JButton("Back");
		back.setFont(new Font("Arial", Font.PLAIN, 22));
		back.setBounds(610, 535, 120, 25);
		add(back);
		back.setForeground  (Color.white);
		back.setBackground  (Color.red);
		back.addActionListener(this);
		
		
		fo1 =  new Font("Sherif", Font.BOLD, 13);
		b_fo =  new Font("Sherif", Font.BOLD, 12);
	 
	
		i1 = new ImageIcon("image/logo.png");
		
		
		
		
		
        //Chicken Tehari
		cTehari_text = new JLabel("Chicken Tehari");
		cTehari_text.setBounds(80, 45, 100, 40);
		cTehari_text.setFont(fo1);
		cTehari_text.setForeground(Color.BLACK);
		cTehari_text.setBackground(new Color(100, 20, 70));
		add(cTehari_text); 
		
	
		ImageIcon img1 =  new ImageIcon("image/ChickenTehari.jpg");
		cTehari_pic = new JLabel("", img1, JLabel.CENTER);
		cTehari_pic.setBounds(50, 86, 150, 140);
		add(cTehari_pic);
		
		
		cTehari_price = new JLabel("200TK");
		cTehari_price.setBounds(105, 215, 100, 40);	 
		cTehari_price.setFont(fo1);
		cTehari_price.setForeground(Color.BLACK);
		add(cTehari_price);
		
		
		cTehari_text_button = new JButton("Oder now");
		cTehari_text_button.setBounds(60, 245, 120, 25);
		cTehari_text_button.setFont(b_fo);
		cTehari_text_button.setBackground(Color.BLUE);
		cTehari_text_button.setForeground(Color.WHITE);
		cTehari_text_button.setBorderPainted(false);
		add(cTehari_text_button);
		
		
		
		
		
		//Beef Tehari
		bTehari_text = new JLabel("Beef Tehari");
		bTehari_text.setBounds(360, 45, 100, 40);
		bTehari_text.setFont(fo1);
		bTehari_text.setForeground(Color.BLACK);
		bTehari_text.setBackground(new Color(100, 20, 70));
		add(bTehari_text);
		
		
		ImageIcon img2 =  new ImageIcon("image/BeefTehari.jpg");
		bTehari_pic = new JLabel("", img2, JLabel.CENTER);
		bTehari_pic.setBounds(320, 86, 150, 140);
		add(bTehari_pic);
		
		
		bTehari_price = new JLabel("260TK");
		bTehari_price.setBounds(380, 215, 100 ,40);
		bTehari_price.setFont(fo1);
		bTehari_price.setForeground(Color.BLACK);
		add(bTehari_price); 
		
		
		bTehari_button = new JButton("Oder now");
		bTehari_button.setBounds(335, 245, 120, 25);
		bTehari_button.setFont(b_fo);
		bTehari_button.setBackground(Color.BLUE);
		bTehari_button.setForeground(Color.WHITE);
		bTehari_button.setBorderPainted(false);
		add(bTehari_button);
		
		
		
		
		
		
		//Morog Polao
		morogPolao_text = new JLabel("Morog Polao");
		morogPolao_text.setBounds(640, 45, 100, 40);
		morogPolao_text.setFont(fo1);
		morogPolao_text.setForeground(Color.BLACK);
		morogPolao_text.setBackground(new Color(100, 20, 70));
		add(morogPolao_text);
		
		
		ImageIcon img3 =  new ImageIcon("image/MorogPolao.jpg");
		morogPolao_pic = new JLabel("", img3, JLabel.CENTER);
		morogPolao_pic.setBounds(595, 86, 150, 140);
		add(morogPolao_pic);
		
		
		morogPolao_price = new JLabel("280TK");
		morogPolao_price.setBounds(655, 215, 100, 40);	 
		morogPolao_price.setFont(fo1);
		morogPolao_price.setForeground(Color.BLACK);
		add(morogPolao_price);	 
		
		
		morogPolao_button = new JButton("Oder now");
		morogPolao_button.setBounds(610, 245, 120, 25);
		morogPolao_button.setFont(b_fo);
		morogPolao_button.setBackground(Color.BLUE);
		morogPolao_button.setForeground(Color.WHITE);
		morogPolao_button.setBorderPainted(false);
		add(morogPolao_button);
		
		
		
		
		
		//Mutton Kacchi
		muttonKacchi_text = new JLabel("Mutton Kacchi");
		muttonKacchi_text.setBounds(80, 300, 100, 20);
		muttonKacchi_text.setFont(fo1);
		muttonKacchi_text.setForeground(Color.BLACK);
		muttonKacchi_text.setBackground(new Color(100, 20, 70));
		add(muttonKacchi_text);
		
		
	
		ImageIcon img4 =  new ImageIcon("image/MuttonKacchi.jpg");
		muttonKacchi_image = new JLabel("", img4, JLabel.CENTER);
		muttonKacchi_image.setBounds(50, 323, 150, 140);
		add(muttonKacchi_image);
		
		
		muttonKacchi_price = new JLabel("300TK");
		muttonKacchi_price.setBounds(105, 455, 100, 40); 
		muttonKacchi_price.setFont(fo1);
		muttonKacchi_price.setForeground(Color.BLACK);
		add(muttonKacchi_price);		 
		
		
		muttonKacchi_button = new JButton("Oder now");
		muttonKacchi_button.setBounds(60, 485, 120, 25);
		muttonKacchi_button.setFont(b_fo);
		muttonKacchi_button.setBackground(Color.BLUE);
		muttonKacchi_button.setForeground(Color.WHITE);
		muttonKacchi_button.setBorderPainted(false);
		add(muttonKacchi_button);
		
		
		
		
 
		//Khichuri
		Khichuri_text = new JLabel("Khichuri");
		Khichuri_text.setBounds(365, 300, 300, 20);
		Khichuri_text.setFont(fo1);
		Khichuri_text.setForeground(Color.BLACK);
		Khichuri_text.setBackground(new Color(100, 20, 70));
		add(Khichuri_text);
		
		
		ImageIcon img5 =  new ImageIcon("image/Khichuri.jpg");
		Khichuri_pic = new JLabel("", img5, JLabel.CENTER);
		Khichuri_pic.setBounds(320, 323, 150, 140);
		add(Khichuri_pic);
		
		
		Khichuri_price = new JLabel("150TK");
		Khichuri_price.setBounds(380, 455, 100, 40); 
		Khichuri_price.setFont(fo1);
		Khichuri_price.setForeground(Color.BLACK);
		add(Khichuri_price);
		
		
		Khichuri_button = new JButton("Oder now");
		Khichuri_button.setBounds(335, 485, 120, 25);
		Khichuri_button.setFont(b_fo);
		Khichuri_button.setBackground(Color.BLUE);
		Khichuri_button.setForeground(Color.WHITE);
		Khichuri_button.setBorderPainted(false);
		add(Khichuri_button);
		
		
		
		
		
		//Chicken Tikka
		chickenTikka_text = new JLabel("Chicken Tikka Biriyani");
		chickenTikka_text.setBounds(600, 300, 200, 20);
		chickenTikka_text.setFont(fo1);
		chickenTikka_text.setForeground(Color.BLACK);
		chickenTikka_text.setBackground(new Color(100, 20, 70));
		add(chickenTikka_text);
		
		
		ImageIcon img6 =  new ImageIcon("image/ChickenTikkaBiriyani.jpg");
		chickenTikka_pic = new JLabel("", img6, JLabel.CENTER);
		chickenTikka_pic.setBounds(595, 323, 150, 140);
		add(chickenTikka_pic);
		
		
		chickenTikka_price = new JLabel("250TK");
		chickenTikka_price.setBounds(655, 455, 100, 40);
		chickenTikka_price.setFont(fo1);
		chickenTikka_price.setForeground(Color.BLACK);
		add(chickenTikka_price);
		
		
		chickenTikka_button = new JButton("Oder now");
		chickenTikka_button.setBounds(610, 485, 120, 25);
		chickenTikka_button.setFont(b_fo);
		chickenTikka_button.setBackground(Color.BLUE);
		chickenTikka_button.setForeground(Color.WHITE);
		chickenTikka_button.setBorderPainted(false);
		add(chickenTikka_button);
		
		
		
		
		cTehari_text_button.addActionListener(this); 
		bTehari_button.addActionListener(this); 
		morogPolao_button.addActionListener(this); 
	    muttonKacchi_button .addActionListener(this); 
	    Khichuri_button.addActionListener(this); 
	    chickenTikka_button.addActionListener(this);
		
		setIconImage(i1.getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Lunch");
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
		
		
		if (a.getSource() == cTehari_text_button)
		{
            new CardPayment();
	        this.setVisible(false);
		} 
	 
	
		if (a.getSource() == bTehari_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 
	   
		
		if (a.getSource() == morogPolao_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 
	
	  
		if (a.getSource() ==  muttonKacchi_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 
	  
	
		if (a.getSource() == Khichuri_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 
	  
	 
		if (a.getSource() ==  chickenTikka_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		}   	
	}   	
}
	

package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.event.*;
import java.sql.*;
 
public class Dinner extends JFrame implements ActionListener 
{
 
	JLabel 
	background, title,
	NaanBread_text, NaanBread_pic, NaanBread_price,  
	vFriedRice_text, vFriedRice_pic, vFriedRice_price,  
	cFriedRice_text, cFriedRice_pic, cFriedRice_price,
	Noodles_text, Noodles_image, Noodles_price,
	ChickenSoup_text, ChickenSoup_pic, ChickenSoup_price,
	ChickenPasta_text, ChickenPasta_pic, ChickenPasta_price;  
	
	JButton 
	NaanBread_text_button, vFriedRice_button, cFriedRice_button, 
	Noodles_button , ChickenSoup_button, ChickenPasta_button, back;
	
	Font  
	fo1, b_fo;
 
	ImageIcon i1;
	
	
	public Dinner()
	{
		
		
		title = new JLabel("<html><u>DINNER ITEMS</u></html>");
		title.setFont(new Font("Arial", Font.BOLD, 27));
		title.setBounds(300, 03, 400, 40);	
		add(title);
		title.setForeground(Color.BLACK);
	 
		
		back = new JButton("Back");
		back.setFont(new Font("Arial", Font.PLAIN, 22));
		back.setBounds(610, 535, 120, 25);
		add(back); 
		back.setForeground   (Color.white);
		back.setBackground   (Color.red);
		back.addActionListener(this);	
		
		
		fo1 =  new Font("Sherif", Font.BOLD, 13);
		b_fo =  new Font("Sherif", Font.BOLD, 12);
		
	
		i1 = new ImageIcon("image/logo.png");
	
		
	 
	
	
		//Naan Bread
		NaanBread_text = new JLabel("Naan Bread");
		NaanBread_text.setBounds(80, 45, 100, 40);
		NaanBread_text.setFont(fo1);
		NaanBread_text.setForeground(Color.BLACK);
		NaanBread_text.setBackground(new Color(100, 20, 70));
		add(NaanBread_text); 
		
		
		ImageIcon img1 =  new ImageIcon("image/NaanBread.jpg");
		NaanBread_pic = new JLabel("", img1, JLabel.CENTER);
		NaanBread_pic.setBounds(50, 86, 150, 140);
		add(NaanBread_pic);
		
		
		NaanBread_price = new JLabel("100TK");
		NaanBread_price.setBounds(105, 215, 100, 40);	 
		NaanBread_price.setFont(fo1);
		NaanBread_price.setForeground(Color.BLACK);
		add(NaanBread_price);
		
		
		NaanBread_text_button = new JButton("Oder now");
		NaanBread_text_button.setBounds(60, 245, 120, 25);
		NaanBread_text_button.setFont(b_fo);
		NaanBread_text_button.setBackground(Color.BLUE);
		NaanBread_text_button.setForeground(Color.WHITE);
		NaanBread_text_button.setBorderPainted(false);
		add(NaanBread_text_button);
		
	
	 	
	
		
	    //Vegetable Fried Rice
		vFriedRice_text = new JLabel("Vegetable Fried Rice");
		vFriedRice_text.setBounds(335, 45, 200, 40);
		vFriedRice_text.setFont(fo1);
		vFriedRice_text.setForeground(Color.BLACK);
		vFriedRice_text.setBackground(new Color(100, 20, 70));
		add(vFriedRice_text);
		
		
		ImageIcon img2 =  new ImageIcon("image/vFriedRice.jpg");
		vFriedRice_pic = new JLabel("", img2, JLabel.CENTER);
		vFriedRice_pic.setBounds(320, 86, 150, 140);
		add(vFriedRice_pic);
		
		
		vFriedRice_price = new JLabel("150TK");
		vFriedRice_price.setBounds(380, 215, 100, 40);
		vFriedRice_price.setFont(fo1);
		vFriedRice_price.setForeground(Color.BLACK);
		add(vFriedRice_price); 
		
	
		vFriedRice_button = new JButton("Oder now");
		vFriedRice_button.setBounds(335, 245, 120, 25);
		vFriedRice_button.setFont(b_fo);
		vFriedRice_button.setBackground(Color.BLUE);
		vFriedRice_button.setForeground(Color.WHITE);
		vFriedRice_button.setBorderPainted(false);
		add(vFriedRice_button);
		
		
	    
		
		
		
		//Chicken Fried Rice
		cFriedRice_text = new JLabel("Chicken Fried Rice");
		cFriedRice_text.setBounds(615, 45, 200, 40);
		cFriedRice_text.setFont(fo1);
		cFriedRice_text.setForeground(Color.BLACK);
		cFriedRice_text.setBackground(new Color(100, 20, 70));
		add(cFriedRice_text);
		
		
		ImageIcon img3 =  new ImageIcon("image/cFriedRice.jpg");
		cFriedRice_pic = new JLabel("", img3, JLabel.CENTER);
		cFriedRice_pic.setBounds(595, 86, 150, 140);
		add(cFriedRice_pic);
		
		
		cFriedRice_price = new JLabel("180TK");
		cFriedRice_price.setBounds(650, 215, 100, 40);	 
		cFriedRice_price.setFont(fo1);
		cFriedRice_price.setForeground(Color.BLACK);
		add(cFriedRice_price);	 
		
		
		cFriedRice_button = new JButton("Oder now");
		cFriedRice_button.setBounds(610, 245, 120, 25);
		cFriedRice_button.setFont(b_fo);
		cFriedRice_button.setBackground(Color.BLUE);
		cFriedRice_button.setForeground(Color.WHITE);
		cFriedRice_button.setBorderPainted(false);
		add(cFriedRice_button);
	
		
		
		
		
		//Chinese Noodles
		Noodles_text = new JLabel("Chinese Noodles");
		Noodles_text.setBounds(75, 300, 200 ,20);
		Noodles_text.setFont(fo1);
		Noodles_text.setForeground(Color.BLACK);
		Noodles_text.setBackground(new Color(100, 20, 70));
		add(Noodles_text);
		
		
		ImageIcon img4 =  new ImageIcon("image/Noodles.jpg");
		Noodles_image = new JLabel("", img4, JLabel.CENTER);
		Noodles_image.setBounds(50, 323, 150, 140);
		add(Noodles_image);
		
		
		Noodles_price = new JLabel("200TK");
		Noodles_price.setBounds(105, 455, 100, 40); 
		Noodles_price.setFont(fo1);
		Noodles_price.setForeground(Color.BLACK);
		add(Noodles_price);		 
		
		
		Noodles_button = new JButton("Oder now");
		Noodles_button.setBounds(60, 485, 120, 25);
		Noodles_button.setFont(b_fo);
		Noodles_button.setBackground(Color.BLUE);
		Noodles_button.setForeground(Color.WHITE);
		Noodles_button.setBorderPainted(false);
		add(Noodles_button);
		
		
		
		
		
		
		//Chicken Soup
		ChickenSoup_text = new JLabel("Chicken Soup");
		ChickenSoup_text.setBounds(350, 300, 200, 20);
		ChickenSoup_text.setFont(fo1);
		ChickenSoup_text.setForeground(Color.BLACK);
		ChickenSoup_text.setBackground(new Color(100, 20, 70));
		add(ChickenSoup_text);
		
	
		ImageIcon img5 =  new ImageIcon("image/ChickenSoup.jpg");
		ChickenSoup_pic = new JLabel("", img5, JLabel.CENTER);
		ChickenSoup_pic.setBounds(320, 323, 150, 140);
		add(ChickenSoup_pic);
		
		
		ChickenSoup_price = new JLabel("280TK");
		ChickenSoup_price.setBounds(380, 455, 100, 40); 
		ChickenSoup_price.setFont(fo1);
		ChickenSoup_price.setForeground(Color.BLACK);
		add(ChickenSoup_price);
		
		
		ChickenSoup_button = new JButton("Oder now");
		ChickenSoup_button.setBounds(335, 485, 120, 25);
		ChickenSoup_button.setFont(b_fo);
		ChickenSoup_button.setBackground(Color.BLUE);
		ChickenSoup_button.setForeground(Color.WHITE);
		ChickenSoup_button.setBorderPainted(false);
		add(ChickenSoup_button);
		
		
		
		
		
		//Chicken Pasta
		ChickenPasta_text = new JLabel("Chicken Pasta");
		ChickenPasta_text.setBounds(630, 300, 200, 20);
		ChickenPasta_text.setFont(fo1);
		ChickenPasta_text.setForeground(Color.BLACK);
		ChickenPasta_text.setBackground(new Color(100, 20, 70));
		add(ChickenPasta_text);
		
	 
		ImageIcon img6 =  new ImageIcon("image/ChickenPasta.jpg");
		ChickenPasta_pic = new JLabel("", img6, JLabel.CENTER);
		ChickenPasta_pic.setBounds(595, 323, 150, 140);
		add(ChickenPasta_pic);
		
	
		ChickenPasta_price = new JLabel("250TK");
		ChickenPasta_price.setBounds(655, 455, 100, 40);
		ChickenPasta_price.setFont(fo1);
		ChickenPasta_price.setForeground(Color.BLACK);
		add(ChickenPasta_price);
		
		
		ChickenPasta_button = new JButton("Oder now");
		ChickenPasta_button.setBounds(610, 485, 120, 25);
		ChickenPasta_button.setFont(b_fo);
		ChickenPasta_button.setBackground(Color.BLUE);
		ChickenPasta_button.setForeground(Color.WHITE);
		ChickenPasta_button.setBorderPainted(false);
		add(ChickenPasta_button);
		
		


        NaanBread_text_button.addActionListener(this); 
        vFriedRice_button.addActionListener(this); 
        cFriedRice_button.addActionListener(this); 
	    Noodles_button .addActionListener(this);
	    ChickenSoup_button.addActionListener(this); 
	    ChickenPasta_button.addActionListener(this); 

		
		
		setIconImage(i1.getImage());
	 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dinner");
		setBounds(300, 300, 800 ,620);
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
	   
	 
		if (a.getSource() ==  NaanBread_text_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 
	  
	  
		if (a.getSource() == vFriedRice_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 
	 
		if (a.getSource() == cFriedRice_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 
  
		if (a.getSource() == Noodles_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 
	  
	  
		if (a.getSource() ==ChickenSoup_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 
	  
		if (a.getSource() == ChickenPasta_button)
		{
		    new CardPayment();
	        this.setVisible(false);
		} 		
    }		
}
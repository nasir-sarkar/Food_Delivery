package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardPayment extends JFrame 
{
    private JLabel title, nameLabel, cardNoLabel, expDateLabel, cvvLabel, paymentMethodLabel, backgroundLabel;
    private JTextField nameField, cardNoField, expDateField, cvvField;
    private JButton payButton, backButton;
    private ImageIcon logoIcon;
    
    public CardPayment() 
	{
        setTitle("Secure Payment");
        setSize(850, 550);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
      
        logoIcon = new ImageIcon("image/logo.png");
        setIconImage(logoIcon.getImage());
        
       
        title = new JLabel("Secure Payment");
        title.setBounds(550, 30, 300, 50);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        add(title);
        
        
        paymentMethodLabel = new JLabel(new ImageIcon("image/payment_mathod.png"));
        paymentMethodLabel.setBounds(550, 120, paymentMethodLabel.getPreferredSize().width, paymentMethodLabel.getPreferredSize().height);
        add(paymentMethodLabel);
        
       
        cardNoLabel = new JLabel("*Card Number");
        nameLabel = new JLabel("*Name on Card");
        expDateLabel = new JLabel("*Expiration Date");
        cvvLabel = new JLabel("*CVV");
        
        cardNoLabel.setBounds(550, 180, 200, 30);
        nameLabel.setBounds(550, 230, 200, 30);
        expDateLabel.setBounds(550, 290, 200, 25);
        cvvLabel.setBounds(700, 290, 100, 25);
        
        add(cardNoLabel);
        add(nameLabel);
        add(expDateLabel);
        add(cvvLabel);
        
        
        cardNoField = new JTextField();
        nameField = new JTextField();
        expDateField = new JTextField();
        cvvField = new JTextField();
        
        cardNoField.setBounds(550, 205, 250, 25);
        nameField.setBounds(550, 260, 250, 25);
        expDateField.setBounds(550, 320, 100, 25);
        cvvField.setBounds(700, 320, 100, 25);
        
        add(cardNoField);
        add(nameField);
        add(expDateField);
        add(cvvField);
        
        
        payButton = new JButton("Pay");
        backButton = new JButton("Back");
        
        payButton.setBounds(550, 380, 250, 25);
        payButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        payButton.setBackground(Color.ORANGE);
        payButton.setForeground(Color.BLACK);
        add(payButton);
        
        backButton.setBounds(550, 415, 250, 25);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.BLACK);
        add(backButton);
        
        
        backgroundLabel = new JLabel(new ImageIcon("image/pay1.jpg"));
        backgroundLabel.setBounds(0, 0, 500, 700);
        add(backgroundLabel);
        
        
        payButton.addActionListener(new ActionListener() 
		{
            @Override
            public void actionPerformed(ActionEvent e) 
			{
                handlePayment();
            }
        });
        
        backButton.addActionListener(new ActionListener() 
		{
            @Override
            public void actionPerformed(ActionEvent e) 
			{
                handleBack();
            }
        });
        
        setVisible(true);
    }
    
    private void handlePayment() 
	{
        String cardNo = cardNoField.getText().trim();
        String name = nameField.getText().trim();
        String expDate = expDateField.getText().trim();
        String cvv = cvvField.getText().trim();
        
        if (cardNo.isEmpty() || name.isEmpty() || expDate.isEmpty() || cvv.isEmpty()) 
		{
            JOptionPane.showMessageDialog(this, "Please provide all the required information!", "Error", JOptionPane.ERROR_MESSAGE);
        } 
		else 
		{
            JOptionPane.showMessageDialog(this, "Payment Successfully Done!", "Success", JOptionPane.INFORMATION_MESSAGE);
            new DashBoard();
            dispose();
        }
    }
    
    private void handleBack() 
	{
        new DashBoard();
        dispose();
    }
}

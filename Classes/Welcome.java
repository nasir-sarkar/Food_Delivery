package Classes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Welcome extends JFrame implements ActionListener 
{
    JLabel welcomeLB, l2, l3;
    JButton continueBTN;
    JLabel backgroundLabel;
    ImageIcon imageIcon;
    ImageIcon i1;

    public Welcome() 
	{
        welcomeLB = new JLabel("Welcome");
        l2 = new JLabel("To");
        l3 = new JLabel("Khuda Lagche");
        welcomeLB.setFont(new Font("Arial", Font.PLAIN, 45));
        l2.setFont(new Font("Arial", Font.PLAIN, 45));
        l3.setFont(new Font("Arial", Font.PLAIN, 45));

        continueBTN = new JButton("Tap to continue");
        continueBTN.setFont(new Font("Arial", Font.PLAIN, 25));

        imageIcon = new ImageIcon("image/abc.jpg");
        backgroundLabel = new JLabel("", imageIcon, JLabel.CENTER);
        backgroundLabel.setBounds(0, 0, 900, 500);

        i1 = new ImageIcon("image/logo.png");

        welcomeLB.setBounds(632, 120, 600, 50);
        l2.setBounds(760, 180, 600, 50);
        l3.setBounds(530, 240, 600, 50);
        continueBTN.setBounds(520, 330, 300, 50);

        getContentPane().setBackground(Color.black);
        getContentPane().add(backgroundLabel);

        welcomeLB.setForeground(Color.white);
        l2.setForeground(Color.white);
        l3.setForeground(Color.white);
        continueBTN.setForeground(Color.white);
        continueBTN.setBackground(Color.red);
        continueBTN.setCursor(new Cursor(Cursor.HAND_CURSOR));
        continueBTN.setBorder(null);

        add(welcomeLB);
        add(l2);
        add(l3);
        add(continueBTN);
        add(backgroundLabel);

        continueBTN.addActionListener(this);

        setIconImage(i1.getImage());
        setResizable(false);
        setTitle("Welcome");
        setSize(850, 550);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent a) 
	{
        if (a.getSource() == continueBTN) 
		{
            new Login();
            this.setVisible(false);
        }
    }
}

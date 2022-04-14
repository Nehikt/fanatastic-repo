import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - Code for Interview");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(350, 200, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            //ImageIcon i1=new ImageIcon("C:\\Users\\pallavi kumari\\eclipse-workspace\\JAVA WORKING PROJECT\\icons\\logo.PNG");
            ImageIcon i1=new ImageIcon("C:\\Users\\pallavi kumari\\OneDrive\\Pictures\\Saved Pictures\\logo.JPG");
            Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 200, 200);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v5.1");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : 1.Pallavi Kumari 2.Meenakshi Sharma ");
            l6.setForeground(new Color(102,0,102));
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l11=new JLabel("3.Jahnavi Yadav 4. Nehal Mittal");
            l11.setForeground(new Color(102,0,102));
            l11.setFont(new Font("Trebuchet MS",Font.BOLD,15));
            l11.setBounds(187,220,600,35);
            contentPane.add(l11);
            
            JLabel l12=new JLabel("5. Neha 6.Lakshita");
            l12.setForeground(new Color(102,0,102));
            l12.setFont(new Font("Trebuchet MS",Font.BOLD,15));
            l12.setBounds(187,240,600,30);
            contentPane.add(l12);
            
            
            JLabel l7 = new JLabel("Contact Us :pallavikumariryz1@gmail.com or ms3619696@gmail.com or jahnavii.net@gmail.com or lakshitabeniwalm143@gmail.com or nehathakur35628@gmail.com");
            l7.setForeground(new Color(255,0,0));
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Follow us on instagram: rainy_mittal_10 and jahnavi9112");
            l8.setForeground(new Color(128,0,0));
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Follow us on Instagram : Mishi Jain");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("**Dive Into The Ocean Of KNOWLEDGE**");
            l10.setForeground(new Color(51,204,204));
            l10.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
            JLabel l13 = new JLabel("New label");
            //ImageIcon i1=new ImageIcon("C:\\Users\\pallavi kumari\\eclipse-workspace\\JAVA WORKING PROJECT\\icons\\logo.PNG");
            ImageIcon i5=new ImageIcon("C:\\Users\\pallavi kumari\\OneDrive\\Pictures\\Saved Pictures\\power_of_books.JPG");
            Image i6 = i5.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
            ImageIcon i7 = new ImageIcon(i6);
            l13 = new JLabel(i7);
            l13.setBounds(500, 340,100,100);
            contentPane.add(l13);
                
            contentPane.setBackground(Color.WHITE);
	}
        

}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class readme extends JFrame{
private JPanel P1;

	public static void main(String[] args) {
       new readme().setVisible(true);
	}
   public readme() {
	   super("ReadMe");
	   setBackground(new Color(173,216,230));
	   setBounds(350,200,700,500);
	   P1 =new JPanel();
	   setContentPane(P1);
	   P1.setLayout(null);
	   JLabel l1=new JLabel("New label");
	   ImageIcon i1=new ImageIcon("C:\\Users\\pallavi kumari\\eclipse-workspace\\JAVA WORKING PROJECT\\icons\\logo.PNG");
	   Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
	   ImageIcon i3=new ImageIcon(i2);
	   l1=new JLabel(i3);
	   l1.setBounds(500,40,100,100);
	   P1.add(l1);
	   JLabel l2=new JLabel("Library");
	   l2.setForeground(new Color(0,250,154));
	   l2.setFont(new Font("Trebuchet MS",Font.BOLD|Font.ITALIC,34));
	   l2.setBounds(160,40,150,55);
	   P1.add(l2);
	   
	   JLabel l3=new JLabel("Mangement System");
	   l3.setForeground(new Color(127,255,0));
	   l3.setFont(new Font("Trebuchet MS",Font.BOLD|Font.ITALIC,34));
	   l3.setBounds(70,90,405,40);
	   P1.add(l3);
	   
	   JLabel l4=new JLabel("SIGN UP-To create the account");
	   l4.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l4.setBounds(70,198,800,20);
	   P1.add(l4);
	   
	   JLabel l5=new JLabel("FORGOT PASSWORD-To get account details for login if user forgets password");
	   l5.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l5.setBounds(70,228,800,20);
	   P1.add(l5);
	   
	   JLabel l6=new JLabel("LOGIN-To enter the HOME Page");
	   l6.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l6.setBounds(70,258,800,20);
	   P1.add(l6);
	   
	   JLabel l7=new JLabel("Add Books-For the librarian to add books");
	   l7.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l7.setBounds(70,288,800,20);
	   P1.add(l7);
	   
	   JLabel l8=new JLabel("Add Students-For the librarian to add students ");
	   l8.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l8.setBounds(70,318,800,20);
	   P1.add(l8);
	   
	   JLabel l9=new JLabel("STATISTICS-To check the status of issued and returned books by the students");
	   l9.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l9.setBounds(70,348,800,20);
	   P1.add(l9);
	   
	   JLabel l10=new JLabel("IssueBook-For the students to issue books");
	   l10.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l10.setBounds(70,378,800,20);
	   P1.add(l10);
	   
	   JLabel l11=new JLabel("Return Books-For the students to return the books");
	   l11.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l11.setBounds(70,408,800,20);
	   P1.add(l11);
	   
	   JLabel l12=new JLabel("About Us-For the info of Students who made this project very sincerely");
	   l12.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l12.setBounds(70,438,800,20);
	   P1.add(l12);
	   
	   JLabel l13=new JLabel("In HOME PAGE menu bar there are three options:-> EXIT,HELP,RECORD");
	   l13.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l13.setBounds(70,478,800,20);
	   P1.add(l13);
	   
	   JLabel l14=new JLabel("EXIT=>To logout or exit from the project");
	   l14.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l14.setBounds(70,508,800,20);
	   P1.add(l14);
	   
	   JLabel l15=new JLabel("HELP=>Read me for project info and About us for project creator's info");
	   l15.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l15.setBounds(70,538,800,20);
	   P1.add(l15);
	   
	   JLabel l16=new JLabel("RECORD=>Book details to check number of books added and Student details for number of students added");
	   l16.setFont(new Font("Trebuchet MS",Font.BOLD,16));
	   l16.setBounds(70,578,800,20);
	   P1.add(l16);
	   
	   JLabel l17=new JLabel("THANK YOU!!!!!");
	   l17.setForeground(new Color(51,204,204));
	   l17.setFont( new Font("SERIF",Font.ITALIC,20));
	   l17.setBounds(70,608,800,20);
	   P1.add(l17);
       P1.setBackground(Color.white);	   
   }
}

package management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Employee_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Login frame = new Employee_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the 
	 */
	public Employee_Login() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 626, 656);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setBounds(280, 294, 121, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		passwordField.setBounds(280, 387, 121, 28);
		getContentPane().add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Employee_Login.class.getResource("/images/login (1).png")));
		label.setBounds(0, 11, 128, 128);
		contentPane.add(label);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE ATLANTIS");
		lblWelcomeToThe.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblWelcomeToThe.setForeground(new Color(255, 215, 0));
		lblWelcomeToThe.setBounds(162, 54, 342, 36);
		contentPane.add(lblWelcomeToThe);
		
		JLabel label_1 = new JLabel("------------------------------------------------");
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		label_1.setForeground(new Color(255, 215, 0));
		label_1.setBounds(162, 88, 342, 7);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("------------------------------------------------");
		label_3.setForeground(new Color(255, 215, 0));
		label_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		label_3.setBounds(162, 54, 378, 7);
		contentPane.add(label_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(new Color(255, 204, 51));
		label_2.setBounds(115, 150, 366, 385);
		label_2.setOpaque(true);
		
		JLabel lblUserLogin = new JLabel("USER LOGIN");
		lblUserLogin.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblUserLogin.setBounds(232, 211, 121, 14);
		contentPane.add(lblUserLogin);
		
		JLabel lblLoginHere = new JLabel("  LOGIN HERE");
		lblLoginHere.setForeground(new Color(255, 255, 255));
		lblLoginHere.setBackground(new Color(0, 0, 0));
		lblLoginHere.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblLoginHere.setBounds(196, 178, 170, 28);
		lblLoginHere.setOpaque(true);
		contentPane.add(lblLoginHere);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Employee_Login.class.getResource("/images/user.png")));
		label_4.setBounds(179, 275, 74, 64);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(Employee_Login.class.getResource("/images/password.png")));
		label_5.setBounds(179, 369, 74, 64);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e1) {
				 try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
						PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from lodging_emp where username=? and pass=?");
							st.setString(1, textField.getText());
			                 st.setString(2,passwordField.getText());
			               
	                 ResultSet rs=st.executeQuery();
						if(rs.next()) {
							dispose();
							User.main(null);
							
						}
						else {
							JOptionPane.showMessageDialog(null,"invalid username or password");
							
						}
						
			}
	    
	                catch(Exception e)
				 {
					 e.printStackTrace();
				}
				 
				
			}
		});
		label_6.setIcon(new ImageIcon(Employee_Login.class.getResource("/images/login (2).png")));
		label_6.setBounds(334, 474, 120, 36);
		contentPane.add(label_6);
		
		
		contentPane.add(label_2);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 Main_Page1.main(null);
			}
		});
		label_7.setIcon(new ImageIcon(Employee_Login.class.getResource("/images/home-black-building-symbol (1).png")));
		label_7.setBounds(528, 41, 72, 66);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 Main_Page1.main(null);
			}
		});
		label_8.setIcon(new ImageIcon(Employee_Login.class.getResource("/images/back.png")));
		label_8.setBounds(36, 578, 74, 67);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label_9.setIcon(new ImageIcon(Employee_Login.class.getResource("/images/logout.png")));
		label_9.setBounds(543, 578, 62, 67);
		contentPane.add(label_9);
		
		
		
		
		
		
		
		
	}
}

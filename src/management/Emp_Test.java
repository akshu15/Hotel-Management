package management;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DropMode;

public class Emp_Test extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textname;
	private JTextField textage;
	private JTextField textadd;
	private JTextField textcont;
	private JTextField textdesig;
	private JTextField textsal;
	private JTextField textuname;
	private JPasswordField passwordField;
	private JTextField textname1;
	private JTextField textage1;
	private JTextField textaddress;
	private JTextField textcont1;
	private JTextField textdesig1;
	private JTextField textsal1;
	private JTextField textField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp_Test frame = new Emp_Test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Emp_Test() {
		setUndecorated(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 806, 722);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDetails = new JLabel("EMPLOYEE DETAILS");
		lblDetails.setForeground(new Color(255, 215, 0));
		lblDetails.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblDetails.setBounds(252, 51, 283, 37);
		getContentPane().add(lblDetails);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(141, 109, 607, 485);
		getContentPane().add(tabbedPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 51));
		tabbedPane.addTab("Restaurant Employee", null, panel, null);
		panel.setLayout(null);

		JLabel name = new JLabel("Name                 :");
		name.setFont(new Font("Times New Roman", Font.BOLD, 20));
		name.setBounds(10, 11, 175, 31);
		panel.add(name);

		JLabel age = new JLabel("Age                    :");
		age.setFont(new Font("Times New Roman", Font.BOLD, 20));
		age.setBounds(10, 53, 175, 31);
		panel.add(age);

		textname = new JTextField();
		textname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textname.setColumns(10);
		textname.setBounds(189, 11, 305, 31);
		panel.add(textname);

		textage = new JTextField();
		textage.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textage.setColumns(10);
		textage.setBounds(189, 53, 65, 31);
		panel.add(textage);

		JLabel address = new JLabel("Address             :");
		address.setFont(new Font("Times New Roman", Font.BOLD, 20));
		address.setBounds(10, 95, 175, 30);
		panel.add(address);

		textadd = new JTextField();
		textadd.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textadd.setColumns(10);
		textadd.setBounds(189, 103, 305, 81);
		panel.add(textadd);

		JLabel contact = new JLabel("Contact Number:");
		contact.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contact.setBounds(10, 199, 156, 23);
		panel.add(contact);

		textcont = new JTextField();
		textcont.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textcont.setColumns(10);
		textcont.setBounds(189, 195, 230, 31);
		panel.add(textcont);

		JLabel designation = new JLabel("Designation         :");
		designation.setFont(new Font("Times New Roman", Font.BOLD, 20));
		designation.setBounds(10, 245, 175, 26);
		panel.add(designation);

		textdesig = new JTextField();
		textdesig.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textdesig.setColumns(10);
		textdesig.setBounds(189, 248, 230, 31);
		panel.add(textdesig);

		JLabel salary = new JLabel("Salary                  :");
		salary.setFont(new Font("Times New Roman", Font.BOLD, 20));
		salary.setBounds(10, 288, 175, 23);
		panel.add(salary);

		textsal = new JTextField();
		textsal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textsal.setColumns(10);
		textsal.setBounds(189, 288, 97, 31);
		panel.add(textsal);

		JLabel lblEmployeeNumber = new JLabel("Employee Number :");
		lblEmployeeNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEmployeeNumber.setBounds(10, 333, 175, 23);
		panel.add(lblEmployeeNumber);

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setBounds(189, 337, 97, 31);
		textField.setText("100");
		panel.add(textField);
		
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!textname.getText().isEmpty() && !textage.getText().isEmpty() && !textadd.getText().isEmpty() && !textcont.getText().isEmpty() && !textdesig.getText().isEmpty() && !textsal.getText().isEmpty() && !textField.getText().isEmpty())
				{
					String name1=textname.getText();
					int age1=Integer.parseInt(textage.getText());

					String address=textadd.getText();
					long cont1=Long.parseLong(textcont.getText());
					String desig1=textdesig.getText();
					int sal1=Integer.parseInt(textsal.getText());
					int emp_no=Integer.parseInt(textField.getText());
					
					if(textcont.getText().length()!=10)
					 {
						 JOptionPane.showMessageDialog(null,"***PLEASE INPUT THE CORRECT PHONE NUMBER***");
					 }
					
					else if(textField.getText().length()<=3)
					{
						JOptionPane.showMessageDialog(null,"***PLEASE ENTER THE EMPLOYEE NUMBER***");
						
					}
					
					
					else if((Integer.parseInt(textage.getText()))<18)
					{
						JOptionPane.showMessageDialog(null,"***YOU ARE TOO YOUNG TO BE AN EMPLOYEE***");
					}
					
					/*if((Integer.parseInt(textage.getText()))<60)
					 {
						 JOptionPane.showMessageDialog(null,"***YOU ARE TOO OLD TO BE AN EMPLOYEE***");
					 }*/
//					 
//					 if(textField.getText().length()>4)
//					 {
//						 JOptionPane.showMessageDialog(null,"***EMPLOYEE NUMBER SHOULD BE LESS THAN 5 DIGITS***");
//					 }
					
					//dispose();
					//call the class of another
					else
					{
					
					String dbName="employeedb";
					String driverName="com.mysql.jdbc.Driver";
					String url="jdbc:mysql://localhost:3306/";
					try{
						Class.forName(driverName);
						String query="insert into restro_emp values(?,?,?,?,?,?,?)";
						Connection con=(Connection) DriverManager.getConnection(url+dbName,"root","root");
						java.sql.PreparedStatement st=con.prepareStatement(query);
						st.setString(1, textname.getText());
						st.setString(2, textage.getText()); 
						st.setString(3, textadd.getText());
						st.setString(4, textcont.getText());
						st.setString(5, textdesig.getText()); 
						st.setString(6, textsal.getText());
						st.setString(7, textField.getText());

						st.execute();
						JOptionPane.showMessageDialog(null,"WELCOME TO THE ATLANTIS");
						dispose();
						Main_Page1.main(null);

					}

					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					}
					

				}
				else
				{
					JOptionPane.showMessageDialog(null,"All data has not been entered");
				}

			}
		});
		label_1.setBounds(514, 366, 78, 74);
		panel.add(label_1);
		label_1.setIcon(new ImageIcon(Emp_Test.class.getResource("/images/next.png")));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 51));
		tabbedPane.addTab("Lodging Employee", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel name1 = new JLabel("Name                   :");
		name1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		name1.setBounds(10, 11, 169, 31);
		panel_1.add(name1);

		JLabel age1 = new JLabel("Age                    :");
		age1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		age1.setBounds(20, 56, 159, 31);
		panel_1.add(age1);

		JLabel address1 = new JLabel("Address               :");
		address1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		address1.setBounds(10, 113, 169, 30);
		panel_1.add(address1);

		JLabel contact1 = new JLabel("Contact Number  :");
		contact1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contact1.setBounds(10, 204, 169, 23);
		panel_1.add(contact1);

		JLabel username = new JLabel("Username           :");
		username.setFont(new Font("Times New Roman", Font.BOLD, 20));
		username.setBounds(10, 321, 156, 29);
		panel_1.add(username);

		textuname = new JTextField();
		textuname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textuname.setColumns(10);
		textuname.setBounds(189, 320, 123, 31);
		textuname.setText("200");
		panel_1.add(textuname);

		JLabel password = new JLabel("Password            : ");
		password.setFont(new Font("Times New Roman", Font.BOLD, 20));
		password.setBounds(10, 368, 156, 24);
		panel_1.add(password);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		passwordField.setBounds(189, 360, 123, 31);
		panel_1.add(passwordField);

		JLabel designation1 = new JLabel("Designation         :");
		designation1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		designation1.setBounds(10, 244, 169, 26);
		panel_1.add(designation1);

		JLabel salary1 = new JLabel("Salary                  :");
		salary1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		salary1.setBounds(10, 281, 156, 29);
		panel_1.add(salary1);

		textname1 = new JTextField();
		textname1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textname1.setColumns(10);
		textname1.setBounds(189, 17, 305, 31);
		panel_1.add(textname1);

		textage1 = new JTextField();
		//textage1.setDropMode(DropMode.ON);
		textage1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textage1.setColumns(10);
		textage1.setBounds(189, 59, 97, 31);
		panel_1.add(textage1);

		textaddress = new JTextField();
		textaddress.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textaddress.setColumns(10);
		textaddress.setBounds(189, 101, 305, 81);
		panel_1.add(textaddress);

		textcont1 = new JTextField();
		textcont1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textcont1.setColumns(10);
		textcont1.setBounds(189, 200, 305, 31);
		panel_1.add(textcont1);

		textdesig1 = new JTextField();
		textdesig1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textdesig1.setColumns(10);
		textdesig1.setBounds(189, 246, 305, 26);
		panel_1.add(textdesig1);

		textsal1 = new JTextField();
		textsal1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textsal1.setColumns(10);
		textsal1.setBounds(189, 286, 97, 23);
		panel_1.add(textsal1);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!textname1.getText().isEmpty() && !textage1.getText().isEmpty() && !textaddress.getText().isEmpty() && !textcont1.getText().isEmpty() && !textdesig1.getText().isEmpty() && !textsal1.getText().isEmpty() && !textuname.getText().isEmpty() && !passwordField.getText().isEmpty())
				{
					String name=textname1.getText();
					int age=Integer.parseInt(textage1.getText());
					String add=textaddress.getText();
					long cont=Long.parseLong(textcont1.getText());
					String desig=textdesig1.getText();
					int sal=Integer.parseInt(textsal1.getText());
					String uname=textuname.getText();
					String pass=passwordField.getText();
					
					if(textcont1.getText().length()!=10)
					 {
						 JOptionPane.showMessageDialog(null,"***PLEASE INPUT THE CORRECT PHONE NUMBER***");
					 }
					
					else if(textuname.getText().length()<=3)
					{
						JOptionPane.showMessageDialog(null,"***PLEASE ENTER EMPLOYEE NUMBER\n STARTING WITH 200***");
					}
					else if((Integer.parseInt(textage1.getText()))<18)
					{
						JOptionPane.showMessageDialog(null,"***YOU ARE TOO YOUNG TO BE AN EMPLOYEE***");
					}
					
					
					
					 /*if((Integer.parseInt(textage1.getText()))<60)
					 {
						 JOptionPane.showMessageDialog(null,"***YOU ARE TOO OLD TO BE AN EMPLOYEE***");
					 }
					 
					 if(textuname.getText().length()>4)
					 {
						 JOptionPane.showMessageDialog(null,"***EMPLOYEE NUMBER SHOULD BE LESS THAN 5 DIGITS***");
					 }*/
					//dispose();
					//call the class of another
					else
					{
					String dbName="employeedb";
					String driverName="com.mysql.jdbc.Driver";
					String url="jdbc:mysql://localhost:3306/";
					try{
						Class.forName(driverName);
						String query="insert into lodging_emp values(?,?,?,?,?,?,?,?)";
						Connection con=(Connection) DriverManager.getConnection(url+dbName,"root","root");
						java.sql.PreparedStatement st=con.prepareStatement(query);
						st.setString(1, textname1.getText());
						st.setString(2, textage1.getText()); 
						st.setString(3, textaddress.getText());
						st.setString(4, textcont1.getText());
						st.setString(5, textdesig1.getText()); 
						st.setString(6, textsal1.getText());
						st.setString(7, textuname.getText());
						st.setString(8, passwordField.getText());
						st.execute();

						JOptionPane.showMessageDialog(null,"WELCOME TO THE ATLANTIS");
						dispose();
						 Main_Page1.main(null);

					}

					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					
				}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"All data has not been entered");
				}
			}
		});
		label_3.setIcon(new ImageIcon(Emp_Test.class.getResource("/images/next.png")));
		label_3.setBounds(528, 381, 64, 70);
		panel_1.add(label_3);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Emp_Info.main(null);
			}
		});
		label.setIcon(new ImageIcon(Emp_Test.class.getResource("/images/back.png")));
		label.setBounds(10, 598, 74, 74);
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label_2.setIcon(new ImageIcon(Emp_Test.class.getResource("/images/logout.png")));
		label_2.setBounds(706, 609, 74, 74);
		contentPane.add(label_2);
		
		JLabel label_4 = new JLabel("---------------------------------------------");
		label_4.setForeground(new Color(255, 215, 0));
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_4.setBounds(240, 80, 276, 8);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("---------------------------------------------");
		label_5.setForeground(new Color(255, 215, 0));
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_5.setBounds(240, 39, 276, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(Emp_Test.class.getResource("/images/newsletter.png")));
		label_6.setBounds(0, 0, 128, 138);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main_Page1.main(null);
			}
		});
		label_7.setIcon(new ImageIcon(Emp_Test.class.getResource("/images/home-black-building-symbol (1).png")));
		label_7.setBounds(687, 21, 74, 77);
		contentPane.add(label_7);

	}

}

package management;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;


public class Delete_Emp2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Emp2 frame = new Delete_Emp2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Delete_Emp2() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 551, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteEmployee = new JLabel("DELETE EMPLOYEE");
		lblDeleteEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblDeleteEmployee.setForeground(new Color(255, 215, 0));
		lblDeleteEmployee.setBounds(175, 46, 205, 33);
		contentPane.add(lblDeleteEmployee);
		
		JLabel label_1 = new JLabel("-----------------------------");
		label_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		label_1.setForeground(new Color(255, 215, 0));
		label_1.setBounds(175, 70, 205, 9);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("----------------------------------");
		label_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		label_2.setForeground(new Color(255, 215, 0));
		label_2.setBounds(173, 41, 207, 9);
		contentPane.add(label_2);
		
		JLabel lblEnterEmployeeNumber = new JLabel("ENTER EMPLOYEE NUMBER TO BE DELETED");
		lblEnterEmployeeNumber.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblEnterEmployeeNumber.setBounds(66, 228, 392, 42);
		getContentPane().add(lblEnterEmployeeNumber);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setBounds(221, 293, 82, 40);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Delete_Emp2.class.getResource("/images/user (1).png")));
		label.setBounds(10, 0, 133, 128);
		contentPane.add(label);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(412, 40, 46, 14);
		contentPane.add(label_3);
		
		JLabel lblLodging = new JLabel("    RESTAURANT EMPLOYEE");
		lblLodging.setBackground(new Color(0, 0, 0));
		lblLodging.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblLodging.setForeground(Color.WHITE);
		lblLodging.setBounds(107, 164, 310, 42);
		lblLodging.setOpaque(true);
		contentPane.add(lblLodging);
		
		JLabel label_31 = new JLabel("");
		label_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose(); 
				Main_Page1.main(null);
			}
		});
		label_31.setIcon(new ImageIcon(Delete_Emp.class.getResource("/images/home-black-building-symbol (1).png")));
		label_31.setBounds(466, 15, 75, 64);
		contentPane.add(label_31);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Delete_option.main(null);
			}
		});
		label_4.setIcon(new ImageIcon(Delete_Emp.class.getResource("/images/back.png")));
		label_4.setBounds(10, 485, 64, 73);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBackground(new Color(255, 204, 51));
		label_5.setBounds(66, 163, 393, 290);
		label_5.setOpaque(true);
		JLabel label_6 = new JLabel("-----------------------------------------------------------------");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_6.setBounds(66, 256, 393, 14);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
						PreparedStatement p=(PreparedStatement)c.prepareStatement("select * from restro_emp where emp_no=?");
						p.setString(1, textField.getText());
						ResultSet rs=p.executeQuery();
						if(rs.next())
						{
							PreparedStatement p1=(PreparedStatement)c.prepareStatement("delete from restro_emp where emp_no=?");
							p1.setString(1,textField.getText());
							boolean b=p1.execute();
							JOptionPane.showMessageDialog(null, "Employee details deleted");
							Main_Page1.main(null);
						}
					
						else
						{
							JOptionPane.showMessageDialog(null, "ERROR : Employee no does not exists");
						}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				finally
				{
					dispose(); 
				}
				
			}
		});
		label_7.setBackground(new Color(0, 0, 0));
		label_7.setIcon(new ImageIcon(Delete_Emp2.class.getResource("/images/delete (1).png")));
		label_7.setBounds(239, 347, 64, 83);
		//label_7.setOpaque(true);
		contentPane.add(label_7);
		
		contentPane.add(label_5);
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label_8.setIcon(new ImageIcon(Delete_Emp.class.getResource("/images/logout.png")));
		label_8.setBounds(452, 485, 64, 73);
		contentPane.add(label_8);
		
	}
}

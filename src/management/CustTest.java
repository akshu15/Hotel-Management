package management;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.toedter.calendar.JDateChooser;

import java.awt.SystemColor;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;


public class CustTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JDateChooser dateChooser;
	static String rno="";

	/**
	 * Launch the application.
	 */
	public static void main(String args) {
		rno=args;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustTest frame = new CustTest();
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
	public CustTest() {
		setUndecorated(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 736, 749);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCustomerInformation = new JLabel("");
		lblCustomerInformation.setIcon(new ImageIcon(CustTest.class.getResource("/images/CUST.png")));
		lblCustomerInformation.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblCustomerInformation.setBounds(129, 31, 488, 68);

		getContentPane().add(lblCustomerInformation);

		JLabel lblName = new JLabel("NAME                                :   ");
		lblName.setForeground(new Color(0, 255, 255));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblName.setBounds(48, 151, 297, 37);
		getContentPane().add(lblName);

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField.setBounds(328, 151, 363, 37);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNationality = new JLabel("NATIONALITY                 :  ");
		lblNationality.setForeground(new Color(0, 255, 255));
		lblNationality.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNationality.setBounds(48, 211, 297, 29);
		getContentPane().add(lblNationality);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_1.setBounds(328, 211, 269, 37);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblPermanentAddress = new JLabel("PERMANENT ADDRESS  : ");
		lblPermanentAddress.setForeground(new Color(0, 255, 255));
		lblPermanentAddress.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblPermanentAddress.setBounds(48, 270, 353, 29);
		getContentPane().add(lblPermanentAddress);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_2.setBounds(328, 270, 382, 68);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblPhoneNumber = new JLabel("PHONE NUMBER                    : ");
		lblPhoneNumber.setForeground(new Color(0, 255, 255));
		lblPhoneNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPhoneNumber.setBounds(48, 368, 289, 29);
		getContentPane().add(lblPhoneNumber);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_4.setBounds(328, 363, 289, 37);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);

		JButton button = new JButton("");
		button.setIcon(new ImageIcon(CustTest.class.getResource("/images/back.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Room.main(null);
			}
		});
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);

		button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button.setBounds(10, 628, 97, 68);
		getContentPane().add(button);
		/*
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(183, 58, 100, 22);
		getContentPane().add(dateChooser);*/

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(290, 588, 145, 22);
		contentPane.add(dateChooser);

		JButton btnNext = new JButton("");
		btnNext.setIcon(new ImageIcon(CustTest.class.getResource("/images/back-ConvertImage.png")));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(textField.getText().compareTo("")!=0 && textField_1.getText().compareTo("")!=0 && textField_2.getText().compareTo("")!=0 && textField_3.getText().compareTo("")!=0 && textField_4.getText().compareTo("")!=0 && textField_5.getText().compareTo("")!=0)
				{
					String name=(textField.getText());
					String nationality=(textField_1.getText());
					String address=(textField_2.getText());
					int adults=Integer.parseInt(textField_3.getText());
					long phone_number=Long.parseLong(textField_4.getText());
					int kids=Integer.parseInt(textField_5.getText());
					//int room_number=Integer.parseInt(textField_6.getText());
					if(textField_4.getText().length()!=10)
					{
						JOptionPane.showMessageDialog(null,"***PLEASE INPUT THE CORRECT PHONE NUMBER***");
					}

					if((Integer.parseInt(textField_3.getText()))>2)
					{
						JOptionPane.showMessageDialog(null,"***ONLY 2 ADULTS CAN SHARE A ROOM***");
					}

					if((Integer.parseInt(textField_5.getText()))>2)
					{
						JOptionPane.showMessageDialog(null,"***ONLY 2 KIDS CAN SHARE A ROOM***");
					}
					
					else
					{
						dispose();
						String dbName="employeedb";
						String driverName="com.mysql.jdbc.Driver";
						String url="jdbc:mysql://localhost:3306/";
						try{
							Class.forName(driverName);
							String query="update customer set Name=?,Nationality=?,address=?,adults=?,phone_no=?,kids=?,date=? where roomno=?";
							Connection con=(Connection) DriverManager.getConnection(url+dbName,"root","root");
							java.sql.PreparedStatement st=con.prepareStatement(query);
							st.setString(1, name);
							st.setString(2, nationality); 
							st.setString(3, address);
							st.setInt(4, adults);
							st.setLong(5, phone_number); 
							st.setInt(6, kids);
							/*SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
						        String date=sdf.format(dateChooser.getDate());*/
							SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
							String date = dateFormat.format(dateChooser.getDate());
							st.setString(7, date);
							st.setString(8, rno);

							st.execute(); 

							/* if(name==null && nationality==null || address==null && adults==null && phone_number==null)
			                 {

			                 }*/

							String dbName1="employeedb";
							String driverName1="com.mysql.jdbc.Driver";
							String url1="jdbc:mysql://localhost:3306/";
							
								Class.forName(driverName1);
								String query1="update customer_store set Name=?,Nationality=?,address=?,adults=?,phone_no=?,kids=?,date=?,checkout_date=? where roomno=?";
								Connection con1=(Connection) DriverManager.getConnection(url1+dbName1,"root","root");
								java.sql.PreparedStatement st1=con1.prepareStatement(query1);
								st1.setString(1, name);
								st1.setString(2, nationality); 
								st1.setString(3, address);
								st1.setInt(4, adults);
								st1.setLong(5, phone_number); 
								st1.setInt(6, kids);
								SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
							        String date1=sdf.format(dateChooser.getDate());
								SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
								String date11 = dateFormat1.format(dateChooser.getDate());
								st1.setString(7, date11);
								st1.setString(8, "0000-00-00");
								st1.setString(9, rno);
								

								st1.execute(); 

							JOptionPane.showMessageDialog(null,"*****Room is booked*****\n");
							Main_Page1.main(null);

						}

						catch(Exception e)
						{
							e.printStackTrace();
						}

					}

				}

				else
				{
					JOptionPane.showMessageDialog(null,"All data has not been entered");
				}
			}

		});

		btnNext.setOpaque(false);
		btnNext.setContentAreaFilled(false);
		btnNext.setBorderPainted(false);

		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNext.setBounds(543, 628, 107, 68);
		getContentPane().add(btnNext);

		JLabel lblNumberOfAdults = new JLabel("NUMBER OF ADULTS            :    ");
		lblNumberOfAdults.setForeground(new Color(0, 255, 255));
		lblNumberOfAdults.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNumberOfAdults.setBounds(48, 423, 295, 37);
		contentPane.add(lblNumberOfAdults);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_3.setBounds(328, 422, 87, 37);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNumberOfKids = new JLabel("NUMBER OF KIDS                  :  ");
		lblNumberOfKids.setForeground(new Color(0, 255, 255));
		lblNumberOfKids.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNumberOfKids.setBounds(48, 486, 289, 29);
		contentPane.add(lblNumberOfKids);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		textField_5.setBounds(328, 481, 87, 37);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblCheckInDate = new JLabel("CHECK IN DATE  ");
		lblCheckInDate.setForeground(new Color(0, 255, 255));
		lblCheckInDate.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblCheckInDate.setBounds(280, 529, 208, 48);
		contentPane.add(lblCheckInDate);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(CustTest.class.getResource("/images/home-black-building-symbol (1).png")));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				Main_Page1.main(null);
			}
		});
		label_1.setBounds(640, 31, 70, 68);
		contentPane.add(label_1);

		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label.setIcon(new ImageIcon(CustTest.class.getResource("/images/logout.png")));
		label.setBounds(636, 628, 74, 74);
		contentPane.add(label);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(CustTest.class.getResource("/images/businessman.png")));
		label_2.setBounds(0, 0, 132, 126);
		contentPane.add(label_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 204, 51));
		lblNewLabel.setBounds(10, 137, 700, 442);
		contentPane.add(lblNewLabel);




	}
}

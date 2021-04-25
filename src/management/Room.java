package management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Room extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Room frame = new Room();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public Room() throws ClassNotFoundException, SQLException {
		setUndecorated(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100,  735, 788);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main_Page1.main(null);
				dispose();
			}
		});
		label_1.setIcon(new ImageIcon(Room.class.getResource("/images/home-black-building-symbol (1).png")));
		label_1.setBounds(652, 0, 83, 83);
		contentPane.add(label_1);

		Class.forName("com.mysql.jdbc.Driver");
		Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");

		PreparedStatement st1=(PreparedStatement)c.prepareStatement("delete from customer where address=?");
		st1.setString(1, "0");
		boolean b=st1.execute();

		Class.forName("com.mysql.jdbc.Driver");
		Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");

		PreparedStatement st11=(PreparedStatement)c1.prepareStatement("delete from customer_store where address=?");
		st11.setString(1, "0");
		boolean b1=st11.execute();

		JLabel lblRooms = new JLabel("ROOMS");
		lblRooms.setIcon(new ImageIcon(Room.class.getResource("/images/trial.jpg")));
		lblRooms.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblRooms.setBounds(0, 0, 730, 337);
		
		JLabel lblRoom = new JLabel("      ROOM");
		lblRoom.setForeground(new Color(255, 215, 0));
		lblRoom.setBackground(Color.BLACK);
		lblRoom.setOpaque(true);
		lblRoom.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblRoom.setBounds(302, 0, 159, 47);
		contentPane.add(lblRoom);
		
		getContentPane().add(lblRooms);

		JButton button = new JButton("101");
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(169, 169, 169));
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try
				{


					textField.setText("101");

					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());


					ResultSet rs1=st1.executeQuery();

					PreparedStatement st=(PreparedStatement)c1.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					
					

					if(rs.next()) {
						button.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");

						textField.setText("0");
					}
					else {

						JOptionPane.showMessageDialog(null,"Room 101\nCapacity: 2 Adults 2 kid\nINR RS.3000 per night\nType: Standard AC\n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");


					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


				//JOptionPane.showMessageDialog(null,"Room 101\nCapacity: 2 Adults 1 kid\nINR RS.1250 per night\nType: Standard NON-AC\n24 hrs Room Service"
				//	+ "\nIntercom Service\nLCD Cable TV");


			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button.setBounds(196, 348, 89, 68);
		getContentPane().add(button);


		JButton button_1 = new JButton("102");
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(new Color(169, 169, 169));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("102");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_1.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {


						JOptionPane.showMessageDialog(null,"Room 102\nCapacity: 2 Adults 1 Kid\nINR RS.3000 per night\nType: Deluxe AC\n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


				/*JOptionPane.showMessageDialog(null,"Room 102\nCapacity: 2 Adults\nINR RS.1750 per night\nType: Standard AC\n24 hrs Room Service"
						+ "\nIntercom Service\nLCD Cable TV");*/

			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_1.setBounds(302, 348, 89, 68);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("103");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(new Color(169, 169, 169));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{

					textField.setText("103");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_2.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {


						JOptionPane.showMessageDialog(null,"Room 103\nCapacity: 2 Adults 1 kid \nINR RS.3000 per night\nType: Standard AC\n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_2.setBounds(408, 348, 89, 68);
		getContentPane().add(button_2);

		JButton button_3 = new JButton("104");
		button_3.setForeground(Color.BLACK);
		button_3.setBackground(new Color(169, 169, 169));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("104");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_3.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {


						JOptionPane.showMessageDialog(null,"Room 104\nCapacity: 2 Adults 2 Kids\nINR RS.3000 per night\nType: Standard AC\n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}

			}
		});
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_3.setBounds(515, 348, 89, 68);
		getContentPane().add(button_3);

		JButton button_4 = new JButton("201");
		button_4.setForeground(Color.BLACK);
		button_4.setBackground(new Color(169, 169, 169));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("201");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_4.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");

						textField.setText("0");
					}
					else 
					{
						JOptionPane.showMessageDialog(null,"Room 201\nCapacity: 2 Adults 1 Kid\nINR RS.3000 per night\nType: Deluxe AC\n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}



			}
		});
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_4.setBounds(196, 427, 89, 68);
		getContentPane().add(button_4);

		JButton button_5 = new JButton("202");
		button_5.setForeground(Color.BLACK);
		button_5.setBackground(new Color(169, 169, 169));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("202");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_5.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {


						JOptionPane.showMessageDialog(null,"Room 202\nCapacity: 2 Adults 2 Kids\nINR RS.3000 per night\nType: Standard AC\n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


			}
		});
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_5.setBounds(302, 427, 89, 68);
		getContentPane().add(button_5);

		JButton button_6 = new JButton("203");
		button_6.setForeground(Color.BLACK);
		button_6.setBackground(new Color(169, 169, 169));
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("203");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_6.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {


						JOptionPane.showMessageDialog(null,"Room 203\nCapacity: 2 Adults 2 Kids\nINR RS.3000 per night\nType: Deluxe AC\n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


			}
		});
		button_6.setBounds(408, 427, 89, 68);
		getContentPane().add(button_6);

		JButton button_7 = new JButton("204");
		button_7.setForeground(Color.BLACK);
		button_7.setBackground(new Color(169, 169, 169));
		button_7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("204");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_7.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {
						JOptionPane.showMessageDialog(null,"Room 204\nCapacity: 2 Adults 2 Kids\nINR RS.3000 per night\nType: Deluxe AC\n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


			}
		});
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_7.setBounds(515, 427, 89, 68);
		getContentPane().add(button_7);


		JButton button_8 = new JButton("301");
		button_8.setForeground(Color.BLACK);
		button_8.setBackground(new Color(169, 169, 169));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("301");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_8.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {


						JOptionPane.showMessageDialog(null,"Room 301\nCapacity: 2 Adults \nINR RS.3000 per night\nType: Executive AC + Bath tub\n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}



			}
		});
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_8.setBounds(196, 506, 89, 68);
		getContentPane().add(button_8);


		JButton button_11 = new JButton("302");
		button_11.setForeground(Color.BLACK);
		button_11.setBackground(new Color(169, 169, 169));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("302");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_11.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {
						JOptionPane.showMessageDialog(null,"Room 302\nCapacity: 2 Adults 1 Kid \nINR RS.3000 per night\nType: Executive AC \n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


			}
		});
		button_11.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_11.setBounds(302, 506, 89, 68);
		getContentPane().add(button_11);

		JButton button_10 = new JButton("303");
		button_10.setForeground(Color.BLACK);
		button_10.setBackground(new Color(169, 169, 169));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try
				{
					textField.setText("303");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_10.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {
						JOptionPane.showMessageDialog(null,"Room 303\nCapacity: 2 Adults 1 Kid \nINR RS.3000 per night\nType: Executive AC \n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}
			}
		});

		button_10.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_10.setBounds(408, 506, 89, 68);
		getContentPane().add(button_10);

		JButton button_9 = new JButton("304");
		button_9.setForeground(Color.BLACK);
		button_9.setBackground(new Color(169, 169, 169));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("304");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_9.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {
						JOptionPane.showMessageDialog(null,"Room 304\nCapacity: 2 Adults 2 Kids \nINR RS.3000 per night\nType: Executive AC \n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


			}
		});
		button_9.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_9.setBounds(515, 506, 89, 68);
		getContentPane().add(button_9);


		JButton button_12 = new JButton("401");
		button_12.setForeground(Color.BLACK);
		button_12.setBackground(new Color(169, 169, 169));
		button_12.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("401");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_12.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {
						JOptionPane.showMessageDialog(null,"Room 401\nCapacity: 2 Adults \nINR RS.3000 per night\nType: ROYAL SUITE (AC) \n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}

			}
		});
		button_12.setBounds(196, 585, 89, 68);
		getContentPane().add(button_12);

		JButton button_13 = new JButton("402");
		button_13.setForeground(Color.BLACK);
		button_13.setBackground(new Color(169, 169, 169));
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("402");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_13.setBackground(new Color(255, 215, 0));

						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {
						JOptionPane.showMessageDialog(null,"Room 402\nCapacity: 2 Adults 1 Kid \nINR RS.3000 per night\nType: ROYAL SUITE (AC) \n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


			}
		});
		button_13.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_13.setBounds(302, 585, 89, 68);
		getContentPane().add(button_13);

		JButton button_14 = new JButton("403");
		button_14.setForeground(Color.BLACK);
		button_14.setBackground(new Color(169, 169, 169));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					textField.setText("403");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_14.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {
						JOptionPane.showMessageDialog(null,"Room 403\nCapacity: 2 Adults 1 Kid \nINR RS.3000 per night\nType: ROYAL SUITE (AC) \n 24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}

			}
		});
		button_14.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_14.setBounds(408, 585, 89, 68);
		getContentPane().add(button_14);

		JButton button_15 = new JButton("404");
		button_15.setForeground(Color.BLACK);
		button_15.setBackground(new Color(169, 169, 169));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try 
				{
					textField.setText("404");
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st1=(PreparedStatement)c1.prepareStatement("Select * from customer_store where roomno=?");
					st1.setString(1, textField.getText());
					ResultSet rs1=st1.executeQuery();
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
					PreparedStatement st=(PreparedStatement)c.prepareStatement("Select * from customer where roomno=?");
					st.setString(1, textField.getText());


					ResultSet rs=st.executeQuery();
					if(rs.next()) {
						button_15.setBackground(new Color(255, 215, 0));
						JOptionPane.showMessageDialog(null,"Room is booked");
						textField.setText("0");
					}
					else {
						JOptionPane.showMessageDialog(null,"Room 404\nCapacity: 2 Adults 2 Kids\nINR RS.3000 per night\nType: ROYAL SUITE (AC ) \n24 hrs Room Service"
								+ "\nIntercom Service\nLCD Cable TV");
					}

				}

				catch(Exception ep)
				{
					ep.printStackTrace();
				}


			}
		});

		button_15.setFont(new Font("Times New Roman", Font.BOLD, 22));
		button_15.setBounds(515, 585, 89, 68);
		getContentPane().add(button_15);

		JLabel lblFloor = new JLabel("FLOOR 1");
		lblFloor.setForeground(new Color(255, 255, 255));
		lblFloor.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFloor.setBounds(44, 368, 105, 30);
		getContentPane().add(lblFloor);

		JLabel lblFloor_1 = new JLabel("FLOOR 2");
		lblFloor_1.setForeground(new Color(255, 255, 255));
		lblFloor_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFloor_1.setBounds(42, 442, 107, 41);
		getContentPane().add(lblFloor_1);

		JLabel lblFloor_2 = new JLabel("FLOOR 3");
		lblFloor_2.setForeground(new Color(255, 255, 255));
		lblFloor_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFloor_2.setBounds(44, 521, 107, 41);
		getContentPane().add(lblFloor_2);

		JLabel lblFloor_3 = new JLabel("FLOOR 4");
		lblFloor_3.setForeground(new Color(255, 255, 255));
		lblFloor_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFloor_3.setBounds(44, 602, 89, 36);
		getContentPane().add(lblFloor_3);

		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setBounds(413, 692, 89, 31);
		contentPane.add(textField);
		textField.setText("0");
		textField.setColumns(10);

		JLabel lblSelectedRoom = new JLabel("Selected Room");
		lblSelectedRoom.setForeground(new Color(255, 255, 255));
		lblSelectedRoom.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSelectedRoom.setBounds(241, 684, 146, 41);
		contentPane.add(lblSelectedRoom);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Customer_Info.main(null);
				dispose();
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Room.class.getResource("/images/play1.png")));
		lblNewLabel.setBounds(71, 672, 83, 62);
		contentPane.add(lblNewLabel);

		JLabel label = new JLabel("Next");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if((Integer.parseInt(textField.getText()))==0)
				{
					JOptionPane.showMessageDialog(null,"***No room Selected***");
				}

				else
				{
				String dbName="employeedb";
				String driverName="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/";
				try{
					Class.forName(driverName);
					String query="insert into customer values(?,?,?,?,?,?,?,?)";
					Connection con=(Connection) DriverManager.getConnection(url+dbName,"root","root");
					java.sql.PreparedStatement st=con.prepareStatement(query);
					st.setString(1, "0" );
					st.setString(2,"0");
					st.setString(3,"0");
					st.setString(4,"0");
					st.setString(5,"0");
					st.setString(6,"0");
					st.setString(7, "0000-00-00");
					st.setString(8,textField.getText());

					st.execute();

					String dbName1="employeedb";
					String driverName1="com.mysql.jdbc.Driver";
					String url1="jdbc:mysql://localhost:3306/";
				
					
					
						Class.forName(driverName1);
						String query1="insert into customer_store values(?,?,?,?,?,?,?,?,?)";
						Connection con1=(Connection) DriverManager.getConnection(url1+dbName1,"root","root");
						java.sql.PreparedStatement st1=con.prepareStatement(query1);
						st1.setString(1, "0" );
						st1.setString(2,"0");
						st1.setString(3,"0");
						st1.setString(4,"0");
						st1.setString(5,"0");
						st1.setString(6,"0");
						st1.setString(7, "0000-00-00");
						st1.setString(8,textField.getText());
						st1.setString(9, "0000-00-00");

						st1.execute();


					dispose();
					CustTest.main(textField.getText());

				}

				catch(Exception ec)
				{
					ec.printStackTrace();
				}
				
				}
			}
		});
		label.setIcon(new ImageIcon(Room.class.getResource("/images/play.png")));
		label.setBounds(613, 672, 83, 62);
		
		contentPane.add(label);
		
		

	}
}

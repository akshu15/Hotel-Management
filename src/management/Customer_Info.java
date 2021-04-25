package management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Customer_Info extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Info frame = new Customer_Info();
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
	public Customer_Info() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 702);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerDetails = new JLabel("");
		lblCustomerDetails.setForeground(new Color(255, 255, 255));
		lblCustomerDetails.setIcon(new ImageIcon(Customer_Info.class.getResource("/images/user-customer.png")));
		lblCustomerDetails.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblCustomerDetails.setBounds(15, 16, 139, 118);
		contentPane.add(lblCustomerDetails);
		
		table = new JTable();
		
		
		
		
		String customer[][]=new String[16][6];
		for(int i=0;i<16;i++)
		{
			for(int j=0;j<6;j++)
			{
				customer[i][j]=" ";
			}
		}
		int i=0;
		int j=0;
		String head[]= {"NAME","NATIONALITY","CONTACT_NUMBER","KIDS","ADULTS","ROOM_NUMBER"};
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			PreparedStatement st1=(PreparedStatement)c.prepareStatement("delete from customer where address=?");
	        st1.setString(1, "0");
	        boolean b=st1.execute();
			PreparedStatement p=(PreparedStatement)c.prepareStatement("select * from customer");
			ResultSet rs=p.executeQuery();
			
			while(rs.next()) 
			{
				j=0;
				customer[i][j]=rs.getString(1);
				j=1;
				customer[i][j]=rs.getString(2);
				j=2;
				customer[i][j]=Long.toString(rs.getLong(5));
				j=3;
				customer[i][j]=Integer.toString(rs.getInt(6));
				j=4;
				customer[i][j]=Integer.toString(rs.getInt(4));
				j=5;
				customer[i][j]=Integer.toString(rs.getInt(8));
				j=6;
				i++;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		table_1 = new JTable(customer,head);
		table_1.setBackground(Color.WHITE);
		/*table.setBounds(47, 115, 538, 445);*/
		/*contentPane.add(table);*/
		table_1.setBounds(15, 185, 809, 256);
		contentPane.add(table_1);

		table_1.getColumnModel().getColumn(1).setPreferredWidth(200);
		table_1.getColumnModel().getColumn(1).setMinWidth(110);
		table_1.getColumnModel().getColumn(1).setMaxWidth(50);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(11);
		table_1.getColumnModel().getColumn(2).setMinWidth(62);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(10);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(10);
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				dispose();
				
			}
		});
		label.setIcon(new ImageIcon(Customer_Info.class.getResource("/images/logout.png")));
		label.setBounds(745, 543, 74, 68);
		contentPane.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("CUSTOMER INFORMATION");
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setBounds(235, 28, 381, 77);
		contentPane.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 215, 0));
		lblNewLabel.setBounds(223, 28, 402, 77);
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Main_Page1.main(null);
				dispose();
				
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(Customer_Info.class.getResource("/images/home-black-building-symbol (1).png")));
		lblNewLabel_3.setBounds(745, 16, 69, 65);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblName = new JLabel("   NAME              NATIONALITY     PHONE NUMBER          KIDS               ADULTS             ROOM NO");
		lblName.setFont(new Font("Maiandra GD", Font.BOLD, 15));
		lblName.setBackground(new Color(255, 228, 196));
		lblName.setBounds(15, 145, 804, 29);
		lblName.setOpaque(true);
		contentPane.add(lblName);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Room.main(null);
			}
		});
		label_1.setBackground(new Color(255, 204, 51));
		label_1.setIcon(new ImageIcon(Customer_Info.class.getResource("/images/room-key.png")));
		label_1.setBounds(360, 469, 139, 142);
		//label_1.setOpaque(true);
		contentPane.add(label_1);
		
		JLabel lblBookARoom = new JLabel("BOOK A ROOM");
		lblBookARoom.setForeground(new Color(255, 215, 0));
		lblBookARoom.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblBookARoom.setBackground(new Color(128, 0, 0));
		lblBookARoom.setBounds(360, 611, 139, 20);
		//label_2.setOpaque(true);
		contentPane.add(lblBookARoom);
		
		

		
	}
}

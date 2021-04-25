package management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Customers_Store extends JFrame {

	private JPanel contentPane;
	private JTable table_1;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customers_Store frame = new Customers_Store();
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
	public Customers_Store() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 715);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerDetails = new JLabel("");
		lblCustomerDetails.setForeground(new Color(255, 255, 255));
		lblCustomerDetails.setIcon(new ImageIcon(Customer_Info.class.getResource("/images/user-customer.png")));
		lblCustomerDetails.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblCustomerDetails.setBounds(62, 16, 139, 118);
		contentPane.add(lblCustomerDetails);
		
		
		String customer[][]=new String[100][8];
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<8;j++)
			{
				customer[i][j]=" ";
			}
		}
		int i=0;
		int j=0;
		String head[]= {"NAME","NATIONALITY","CONTACT_NUMBER","KIDS","ADULTS","ROOM_NUMBER","CHECK-IN","CHECK-OUT"};
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			PreparedStatement st1=(PreparedStatement)c.prepareStatement("delete from customer_store where address=?");
	        st1.setString(1, "0");
	        boolean b=st1.execute();
			PreparedStatement p=(PreparedStatement)c.prepareStatement("select * from customer_store");
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
				customer[i][j]=rs.getString(7);
				j=7;
				customer[i][j]=rs.getString(9);
				j=8;
				i++;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		table_1 = new JTable(customer,head);
		table_1.setBackground(Color.WHITE);
		table_1.setBounds(10, -106, 1054, 1637);
		contentPane.add(table_1);

		table_1.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(1).setMinWidth(100);
		table_1.getColumnModel().getColumn(1).setMaxWidth(10);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(11);
		table_1.getColumnModel().getColumn(2).setMinWidth(62);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(10);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(10);
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		
		JLabel lblNewLabel_2 = new JLabel("CUSTOMER INFORMATION");
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setBounds(373, 28, 381, 77);
		contentPane.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 215, 0));
		lblNewLabel.setBounds(352, 28, 402, 77);
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
		lblNewLabel_3.setBounds(913, 11, 69, 65);
		contentPane.add(lblNewLabel_3);
		int container = 0;
		JScrollBar jsp = new JScrollBar(container);
		table_1.add(jsp);
		
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(0, 241, 1073, 450);
		contentPane.add(scrollPane);
	}
}

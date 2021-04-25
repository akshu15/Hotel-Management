package management;

import java.awt.EventQueue;
import java.io.FileWriter; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Billing1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField textField_5;
	private JLabel lblNewLabel_8;
	String a="",b="",d="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing1 frame = new Billing1();
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
	public Billing1() throws ClassNotFoundException, SQLException {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 714);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Class.forName("com.mysql.jdbc.Driver");
		Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
		
		txtA = new JTextField();
		txtA.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtA.setBounds(268, 214, 266, 31);
		contentPane.add(txtA);
		txtA.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		textField_5.setBounds(268, 499, 126, 34);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Check - in Date");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(71, 268, 169, 34);
		contentPane.add(lblNewLabel_2);

		txtB = new JTextField();
		txtB.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtB.setBounds(268, 270, 266, 31);
		contentPane.add(txtB);
		txtB.setColumns(10);

		JLabel lblNewLabel = new JLabel("Room no");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setBounds(107, 151, 112, 34);
		contentPane.add(lblNewLabel);

		String rooms[]={"101", "102", "103", "104", "201", "202", "203", "204", "301", "302", "303", "304", "401", "402", "403", "404"};

		JComboBox comboBox = new JComboBox(rooms);
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(Color.BLACK);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					int i=comboBox.getSelectedIndex();
					String s=rooms[i];
					PreparedStatement st1=(PreparedStatement)c.prepareStatement("delete from customer where roomno=?");
					st1.setString(1, "0");
					boolean b2=st1.execute();
					st1=(PreparedStatement)c.prepareStatement("select * from customer where roomno=?");
					st1.setString(1, s);
					ResultSet rs=st1.executeQuery();
					if(rs.next())
					{
						
						a=rs.getString(1);
						b=rs.getString(7);
						d=rs.getString(8);
								
						txtA.setText(a);
						txtB.setText(b);

					}
					else
					{
						JOptionPane.showMessageDialog(null,"Room is not booked");
					}

				} 
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}


			}
		});
		comboBox.setBounds(273, 151, 121, 34);
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"101", "102", "103", "104", "201", "202", "203", "204", "301", "302", "303", "304", "401", "402", "403", "404"}));
		contentPane.add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("Customer Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(71, 212, 169, 34);
		contentPane.add(lblNewLabel_1);



		JLabel lblNewLabel_3 = new JLabel("Checkout Date");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel_3.setBounds(71, 346, 169, 24);
		contentPane.add(lblNewLabel_3);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(268, 346, 126, 34);
		contentPane.add(dateChooser);

		JLabel lblNewLabel_7 = new JLabel("Pay Amount");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		/*lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(daysBetween);
			}
		});*/
		lblNewLabel_7.setBounds(71, 499, 169, 34);
		contentPane.add(lblNewLabel_7);

		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=comboBox.getSelectedIndex();
				String s=rooms[i];
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String date = dateFormat.format(dateChooser.getDate());
				
				
				
				 SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");  
				 try {
					 Date date1=formatter1.parse(b);
					Date date2=formatter1.parse(date);
					long diff=date2.getTime() - date1.getTime();
					long days=TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
					
					
					float bill=days*3000;//MAKE CHANGES HERE FOR DIFFERENT VALUES OF ROOMS - temporarily set to 3000 rupees
					float g= (float) (0.18 * bill);
					float gst=bill+g;
					
					textField_5.setText(Float.toString(gst));
					JTextField f = textField_5;
					
					String dbName1="employeedb";
					String driverName1="com.mysql.jdbc.Driver";
					String url1="jdbc:mysql://localhost:3306/";
					
						Class.forName(driverName1);
						String query1="update customer_store set checkout_date=? where roomno=?";
						Connection con1=(Connection) DriverManager.getConnection(url1+dbName1,"root","root");
						java.sql.PreparedStatement st1=con1.prepareStatement(query1);
						
						st1.setString(1, date);
						st1.setString(2, s);
						st1.execute();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
			}
		});
		label_1.setIcon(new ImageIcon(Billing1.class.getResource("/images/calculator.png")));
		label_1.setBounds(254, 397, 64, 78);
		contentPane.add(label_1);
		


		JButton btnNewButton = new JButton("Pay");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to proceed with payment?", "WARNING",
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				    // yes option
					
					
					if(txtA.getText().compareTo("")!=0 && txtB.getText().compareTo("")!=0 && textField_5.getText().compareTo("")!=0)
					{
					try
					{
						System.out.println();
				    	String str="\n\t\t  HOTEL ATLANTIS" + "\t\t\t\t\t\tHappiness Gauranteed" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t"  +"ROOM NO : " + d + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + "NAME OF CUSTOMER :" + a+ "\t\t\t\t\t\t\t\t\t\t\t\t\t       " + "CHECK IN DATE : " + b +"\t\t\t\t\t" + "\t\t\t\t\t\t\t\t\t\t\t\t\t       " + "CHECK OUT DATE : " + dateChooser.getDate() + "\t\t\t\t  " +"AMOUNT PAYABLE : "+ textField_5.getText();
				    	
				        // attach a file to FileWriter 
				        FileWriter fw=new FileWriter("C:\\Users\\Asmita\\Desktop\\HM2\\bill.txt"); 
				  
				        // read character wise from string and write 
				        // into FileWriter 
				        for (int i = 0; i < str.length(); i++) 
				            fw.write(str.charAt(i)); 
				  
				        //close the file 
				        fw.close(); 
						
						int i=comboBox.getSelectedIndex();
						String s=rooms[i];
						PreparedStatement st1=(PreparedStatement)c.prepareStatement("delete from customer where roomno=?");
						st1.setString(1,s);
						boolean b2=st1.execute();
						
						dispose();
						Payment_Method.main(null);
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
					}
					}
					
					else
					{
						JOptionPane.showMessageDialog(null,"*****You have not selected any room*****\n");
					}
				} 
				else 
				{
					Lodging1.main(null);
				    // no option
				}
				
			}
		});
		btnNewButton.setBounds(268, 574, 88, 46);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(482, 256, 143, 34);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblCheckout = new JLabel("CHECK - OUT");
		lblCheckout.setBackground(new Color(0, 0, 0));
		lblCheckout.setForeground(new Color(255, 215, 0));
		lblCheckout.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblCheckout.setBounds(209, 37, 163, 59);
		lblCheckout.setOpaque(true);
		contentPane.add(lblCheckout);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Billing1.class.getResource("/images/purse (1).png")));
		lblNewLabel_4.setBounds(0, 0, 153, 126);
		contentPane.add(lblNewLabel_4);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(255, 204, 51));
		label.setBounds(48, 137, 513, 483);
		
		JLabel lblamountIsInclusive = new JLabel("*AMOUNT IS INCLUSIVE OF 18% GST ON THE COST OF THE ROOM ");
		lblamountIsInclusive.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblamountIsInclusive.setBounds(71, 544, 405, 14);
		contentPane.add(lblamountIsInclusive);
		
		label.setOpaque(true);
		
		
		JLabel lblCalculateBill = new JLabel("CALCULATE BILL");
		lblCalculateBill.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblCalculateBill.setBounds(201, 474, 153, 14);
		contentPane.add(lblCalculateBill);
		
		contentPane.add(label);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Main_Page1.main(null);
			}
		});
		label_2.setIcon(new ImageIcon(Billing1.class.getResource("/images/home-black-building-symbol (1).png")));
		label_2.setBounds(512, 26, 77, 85);
		contentPane.add(label_2);
		
		
		
		
		
		

	}
}

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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Emp_Info extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp_Info frame = new Emp_Info();
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
	public Emp_Info() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 725, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEmployeeInformation = new JLabel("");
		lblEmployeeInformation.setIcon(new ImageIcon(Emp_Info.class.getResource("/images/t2.png")));
		lblEmployeeInformation.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblEmployeeInformation.setBounds(115, 16, 501, 93);
		getContentPane().add(lblEmployeeInformation);



		/*table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setFillsViewportHeight(true);
		table.setBounds(20, 498, 673, -375);
		contentPane.add(table);*/
		String employee[][]=new String[20][6];
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<6;j++)
			{
				employee[i][j]=" ";
			}
		}
		int i=0;
		int j=0;
		String head[]= {"NAME","AGE","CONTACT_NUMBER","DESIGNATION","SALARY","EMPLOYEE_NUMBER"};
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");
			PreparedStatement p=(PreparedStatement)c.prepareStatement("select * from lodging_emp");
			ResultSet rs=p.executeQuery();
			p=(PreparedStatement)c.prepareStatement("select * from restro_emp");
			ResultSet rs1=p.executeQuery();
			while(rs.next()) 
			{
				j=0;
				employee[i][j]=rs.getString(1);
				j=1;
				employee[i][j]=Integer.toString(rs.getInt(2));
				j=2;
				employee[i][j]=Long.toString(rs.getLong(4));
				j=3;
				employee[i][j]=rs.getString(5);
				j=4;
				employee[i][j]=Integer.toString(rs.getInt(6));
				j=5;
				employee[i][j]=Integer.toString(rs.getInt(7));
				j=6;
				i++;
			}
			while(rs1.next())
			{
				j=0;
				employee[i][j]=rs1.getString(1);
				j=1;
				employee[i][j]=Integer.toString(rs1.getInt(2));
				j=2;
				employee[i][j]=Long.toString(rs1.getLong(4));
				j=3;
				employee[i][j]=rs1.getString(5);
				j=4;
				employee[i][j]=Integer.toString(rs1.getInt(6));
				j=5;
				employee[i][j]=Integer.toString(rs1.getInt(7));
				j=6;
				i++;
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


		table_1 = new JTable(employee,head);
		table_1.setBackground(new Color(255, 250, 240));
		table_1.setBounds(15, 168, 685, 320);
		contentPane.add(table_1);
		/*table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"NAME", "AGE", "CONTACT_NUMBER", "DESIGNATION", "SALARY"
			}
		));*/
		table_1.getColumnModel().getColumn(1).setPreferredWidth(79);
		table_1.getColumnModel().getColumn(1).setMinWidth(47);
		table_1.getColumnModel().getColumn(1).setMaxWidth(12);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(117);
		table_1.getColumnModel().getColumn(2).setMinWidth(62);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(90);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(88);
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			Main_Page1.main(null);
			dispose();
			}
		});
		label_2.setIcon(new ImageIcon(Emp_Info.class.getResource("/images/home-black-building-symbol (1).png")));
		label_2.setBounds(626, 16, 74, 77);
		contentPane.add(label_2);
		
		JLabel lblName = new JLabel("NAME         AGE     PHONE NO     DESIGNATION      SALARY     EMP_NO");
		lblName.setIcon(new ImageIcon(Emp_Info.class.getResource("/images/Y2.png")));
		lblName.setBackground(new Color(255, 255, 255));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblName.setBounds(15, 125, 685, 36);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("add");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				dispose();
				Emp_Test.main(null);
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Emp_Info.class.getResource("/images/add-participant.png")));
		lblNewLabel.setBounds(140, 504, 118, 116);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("delete");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
								
				dispose();
				Delete_option.main(null);
				
			}		
			
		});
		label.setIcon(new ImageIcon(Emp_Info.class.getResource("/images/delete-all-participants.png")));
		label.setBounds(430, 504, 137, 132);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Add Employee");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 24));
		lblNewLabel_1.setBounds(111, 636, 204, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDeleteEmployee = new JLabel("Delete Employee");
		lblDeleteEmployee.setForeground(Color.WHITE);
		lblDeleteEmployee.setFont(new Font("Georgia", Font.BOLD, 24));
		lblDeleteEmployee.setBounds(391, 636, 230, 40);
		contentPane.add(lblDeleteEmployee);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Admin1.main();
				dispose();
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Emp_Info.class.getResource("/images/back.png")));
		lblNewLabel_2.setBounds(34, 714, 69, 70);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				dispose();	
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(Emp_Info.class.getResource("/images/logout.png")));
		lblNewLabel_3.setBounds(616, 714, 69, 70);
		contentPane.add(lblNewLabel_3);

	}
}

package management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Option extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Option frame = new Option();
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
	public Option() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 446);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Option.class.getResource("/images/rsz_customer.png")));
		label.setBounds(0, 0, 119, 72);
		contentPane.add(label);
		
		JLabel lblSelectTheInformation = new JLabel("SELECT THE INFORMATION REQUIRED");
		lblSelectTheInformation.setForeground(new Color(255, 215, 0));
		lblSelectTheInformation.setBackground(new Color(255, 215, 0));
		lblSelectTheInformation.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSelectTheInformation.setBounds(58, 80, 435, 30);
		contentPane.add(lblSelectTheInformation);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Customers_Store.main(null);
			}
		});
		label_1.setIcon(new ImageIcon(Option.class.getResource("/images/customer-review (1).png")));
		label_1.setBounds(46, 153, 139, 141);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Customer_Info.main(null);
			}
		});
		label_2.setIcon(new ImageIcon(Option.class.getResource("/images/key.png")));
		label_2.setBounds(300, 153, 139, 141);
		contentPane.add(label_2);
		
		JLabel lblAllCustomers = new JLabel("ALL CUSTOMERS");
		lblAllCustomers.setForeground(new Color(255, 215, 0));
		lblAllCustomers.setBackground(new Color(255, 215, 0));
		lblAllCustomers.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblAllCustomers.setBounds(45, 293, 150, 14);
	//	lblAllCustomers.setOpaque(true);
		contentPane.add(lblAllCustomers);
		
		JLabel lblExistingCustomers = new JLabel("EXISTING CUSTOMERS");
		lblExistingCustomers.setForeground(new Color(255, 215, 0));
		lblExistingCustomers.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblExistingCustomers.setBounds(284, 295, 176, 14);
		contentPane.add(lblExistingCustomers);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Main_Page1.main(null);
			}
		});
		label_3.setIcon(new ImageIcon(Option.class.getResource("/images/home-black-building-symbol (1).png")));
		label_3.setBounds(447, 0, 67, 72);
		contentPane.add(label_3);
		
		JLabel lblInformation = new JLabel("INFORMATION");
		lblInformation.setBackground(new Color(0, 0, 0));
		lblInformation.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblInformation.setForeground(new Color(255, 215, 0));
		lblInformation.setBounds(186, 25, 159, 30);
		lblInformation.setOpaque(true);
		contentPane.add(lblInformation);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label_4.setIcon(new ImageIcon(Option.class.getResource("/images/logout.png")));
		label_4.setBounds(447, 333, 67, 63);
		contentPane.add(label_4);
	}
}

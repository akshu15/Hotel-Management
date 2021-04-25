package management;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class Admin1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin1 frame = new Admin1();
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
	public Admin1() {
		setUndecorated(true);
		getContentPane().setBackground(new Color(128, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 722, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		getContentPane().setLayout(null);
		
		JLabel lblAdminPortal = new JLabel(" ADMIN PORTAL");
		lblAdminPortal.setForeground(new Color(255, 215, 0));
		lblAdminPortal.setBackground(new Color(128, 0, 0));
		lblAdminPortal.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblAdminPortal.setBounds(220, 11, 292, 63);
		lblAdminPortal.setOpaque(true);
		getContentPane().add(lblAdminPortal);
		
		JLabel lblWelcomeToAdmin = new JLabel("    WELCOME TO  ");
		lblWelcomeToAdmin.setForeground(new Color(0, 0, 0));
		lblWelcomeToAdmin.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblWelcomeToAdmin.setBackground(new Color(255, 215, 0));
		lblWelcomeToAdmin.setBounds(26, 171, 255, 90);
		lblWelcomeToAdmin.setOpaque(true);
		getContentPane().add(lblWelcomeToAdmin);
		
		JLabel lblAdmin = new JLabel("           ADMIN ");
		lblAdmin.setBackground(new Color(255, 215, 0));
		lblAdmin.setForeground(new Color(0, 0, 0));
		lblAdmin.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblAdmin.setBounds(26, 250, 255, 58);
		lblAdmin.setOpaque(true);
		getContentPane().add(lblAdmin);
		
		JLabel lblPortal = new JLabel("           PORTAL");
		lblPortal.setForeground(new Color(0, 0, 0));
		lblPortal.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblPortal.setBackground(new Color(255, 215, 0));
		lblPortal.setBounds(26, 304, 255, 77);
		lblPortal.setOpaque(true);
		getContentPane().add(lblPortal);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Emp_Info.main(null);
			}
		});
		label_1.setBackground(new Color(255, 215, 0));
		label_1.setIcon(new ImageIcon(Admin1.class.getResource("/images/operator.png")));
		label_1.setBounds(303, 171, 149, 158);
		label_1.setOpaque(true);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Option.main(null);
			}
		});
		label_2.setBackground(new Color(255, 215, 0));
		label_2.setIcon(new ImageIcon(Admin1.class.getResource("/images/rating.png")));
		label_2.setBounds(514, 171, 149, 158);
		label_2.setOpaque(true);
		getContentPane().add(label_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Admin1.class.getResource("/images/admin.png")));
		label.setBounds(10, 0, 136, 128);
		getContentPane().add(label);
		
		JLabel lblEmployee = new JLabel("EMPLOYEE");
		lblEmployee.setForeground(new Color(255, 215, 0));
		lblEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEmployee.setBounds(332, 336, 99, 21);
		getContentPane().add(lblEmployee);
		
		JLabel lblInformation = new JLabel("INFORMATION");
		lblInformation.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblInformation.setForeground(new Color(255, 215, 0));
		lblInformation.setBounds(326, 357, 126, 24);
		getContentPane().add(lblInformation);
		
		JLabel lblCustomer = new JLabel("CUSTOMER");
		lblCustomer.setForeground(new Color(255, 215, 0));
		lblCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblCustomer.setBounds(552, 337, 99, 19);
		getContentPane().add(lblCustomer);
		
		JLabel lblInformation_1 = new JLabel("INFORMATION");
		lblInformation_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblInformation_1.setForeground(new Color(255, 215, 0));
		lblInformation_1.setBounds(536, 364, 115, 14);
		getContentPane().add(lblInformation_1);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 Main_Page1.main(null);
			}
		});
		label_3.setIcon(new ImageIcon(Admin1.class.getResource("/images/home-black-building-symbol (1).png")));
		label_3.setBounds(600, 11, 77, 63);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 Main_Page1.main(null);
			}
		});
		label_4.setIcon(new ImageIcon(Admin1.class.getResource("/images/logout.png")));
		label_4.setBounds(614, 446, 63, 68);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 Main_Page1.main(null);
			}
		});
		label_5.setIcon(new ImageIcon(Admin1.class.getResource("/images/back.png")));
		label_5.setBounds(26, 446, 71, 68);
		getContentPane().add(label_5);
		
	}
}

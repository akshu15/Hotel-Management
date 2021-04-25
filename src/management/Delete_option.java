package management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Delete_option extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_option frame = new Delete_option();
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
	public Delete_option() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 582);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRemoveEmployee = new JLabel("REMOVE EMPLOYEE");
		lblRemoveEmployee.setForeground(new Color(255, 215, 0));
		lblRemoveEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblRemoveEmployee.setBounds(161, 52, 289, 41);
		contentPane.add(lblRemoveEmployee);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Delete_option.class.getResource("/images/user (1).png")));
		label.setBounds(0, 0, 139, 139);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("---------------------------------------------");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_1.setForeground(new Color(255, 215, 0));
		label_1.setBounds(161, 86, 270, 7);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("----------------------------------------------");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_2.setForeground(new Color(255, 215, 0));
		label_2.setBounds(161, 47, 270, 7);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Delete_Emp2.main(null);
			}
		});
		label_3.setIcon(new ImageIcon(Delete_option.class.getResource("/images/waiter (2).png")));
		
		label_3.setBounds(73, 213, 128, 130);
		
		contentPane.add(label_3);
		
		JLabel lblRestaurant = new JLabel("   RESTAURANT");
		lblRestaurant.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblRestaurant.setForeground(Color.BLACK);
		lblRestaurant.setBounds(73, 354, 139, 15);
		contentPane.add(lblRestaurant);
		
		JLabel lblEmployee = new JLabel("EMPLOYEE");
		lblEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblEmployee.setForeground(Color.BLACK);
		lblEmployee.setBounds(94, 372, 98, 14);
		contentPane.add(lblEmployee);
		
		JLabel label_5 = new JLabel("");
		label_5.setBackground(new Color(255, 204, 51));
		label_5.setBounds(36, 170, 483, 252);
		label_5.setOpaque(true);
		
		JLabel label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Delete_Emp.main(null);
			}
		});
		label_6.setIcon(new ImageIcon(Delete_option.class.getResource("/images/receptionist (1).png")));
		label_6.setBounds(352, 213, 128, 139);
		contentPane.add(label_6);
		
		JLabel lblLodging = new JLabel("   LODGING");
		lblLodging.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblLodging.setBounds(362, 354, 102, 14);
		contentPane.add(lblLodging);
		
		JLabel lblEmployee_1 = new JLabel("EMPLOYEE");
		lblEmployee_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblEmployee_1.setBounds(369, 372, 98, 14);
		contentPane.add(lblEmployee_1);
		
		contentPane.add(label_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 Main_Page1.main(null);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Delete_option.class.getResource("/images/home-black-building-symbol (1).png")));
		lblNewLabel.setBounds(485, 24, 74, 69);
		contentPane.add(lblNewLabel);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Emp_Info.main(null);
			}
		});
		label_4.setIcon(new ImageIcon(Delete_option.class.getResource("/images/back.png")));
		label_4.setBounds(27, 454, 74, 64);
		contentPane.add(label_4);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label_7.setIcon(new ImageIcon(Delete_option.class.getResource("/images/logout.png")));
		label_7.setBounds(450, 454, 74, 69);
		contentPane.add(label_7);
		
		
		
		
		
		
		
	}
}

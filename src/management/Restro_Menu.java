package management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class Restro_Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restro_Menu frame = new Restro_Menu();
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
	public Restro_Menu() {
		setUndecorated(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 475, 402);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTajRestaurant = new JLabel("TAJ RESTAURANT");
		lblTajRestaurant.setBackground(Color.PINK);
		lblTajRestaurant.setForeground(Color.BLACK);
		lblTajRestaurant.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTajRestaurant.setBounds(134, 11, 284, 52);
		getContentPane().add(lblTajRestaurant);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblMenu.setBounds(155, 74, 98, 33);
		getContentPane().add(lblMenu);
		
		JCheckBox chckbxBreakfastSet = new JCheckBox("BREAKFAST BUFFET              RS 500");
		chckbxBreakfastSet.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chckbxBreakfastSet.setBounds(34, 127, 352, 33);
		getContentPane().add(chckbxBreakfastSet);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("LUNCH BUFFET                       RS 800");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chckbxNewCheckBox.setBounds(34, 179, 352, 33);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("DINNER BUFFET                    RS 1000");
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		chckbxNewCheckBox_1.setBounds(34, 228, 352, 33);
		getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("New check item");
		checkBoxMenuItem.setBounds(38, 127, 129, 22);
		getContentPane().add(checkBoxMenuItem);
		
		JButton btnNext = new JButton("NEXT    --->");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Restro_Billing.main(null);
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNext.setBounds(264, 301, 173, 37);
		getContentPane().add(btnNext);
		
		JButton btnNewButton = new JButton("<---    BACK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				User.main(null);
				
			}
		});
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
			}
		});*/
		
		
		
		
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnNewButton.setBounds(34, 301, 173, 37);
		Component add = getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Restro_Menu.class.getResource("/images/TAJ_EXOTICA_RESORT_&_SPA_Bardez.jpg")));
		label.setBounds(0, 0, 98, 107);
		getContentPane().add(label);
		/*
		JLabel lblBack = new JLabel("Back");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		lblBack.setBounds(79, 317, 46, 14);
		getContentPane().add(lblBack);*/

	}

}

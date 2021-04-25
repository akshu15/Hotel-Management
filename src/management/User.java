package management;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;

public class User extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		setUndecorated(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLodging = new JButton("");
		btnLodging.setIcon(new ImageIcon(User.class.getResource("/images/lodging.png")));
		btnLodging.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			Lodging1.main(null);
			}
		});
		btnLodging.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnLodging.setBounds(94, 325, 191, 163);
		getContentPane().add(btnLodging);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(User.class.getResource("/images/menu.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Restro_Billing.main(null);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton.setBounds(358, 325, 181, 163);
		getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(User.class.getResource("/images/l2.jpg")));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Employee_Login.main(null);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack.setBounds(612, 325, 191, 163);
		contentPane.add(btnBack);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Main_Page1.main(null);
				dispose();
			}
		});
		label_1.setIcon(new ImageIcon(User.class.getResource("/images/home-black-building-symbol (1).png")));
		label_1.setBounds(836, 16, 77, 63);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(User.class.getResource("/images/2.png")));
		lblNewLabel.setBounds(0, 16, 913, 239);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Employee_Login.main(null);
				dispose();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(User.class.getResource("/images/back.png")));
		lblNewLabel_1.setBounds(40, 517, 69, 67);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(User.class.getResource("/images/logout.png")));
		lblNewLabel_2.setBounds(803, 511, 69, 63);
		contentPane.add(lblNewLabel_2);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		

		
	}
}

package management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import java.awt.SystemColor;
import java.awt.BorderLayout;



public class Main_Page1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Page1 frame = new Main_Page1();
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
	public Main_Page1() {
		setUndecorated(true);
		getContentPane().setBackground(new Color(128, 0, 0));
		getContentPane().setForeground(Color.PINK);
		setBounds(100, 100, 709, 607);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 11, 94, 83);
		label_1.setIcon(new ImageIcon(Main_Page1.class.getResource("/images/rsz_logo1_1.jpg")));
		getContentPane().add(label_1);
		
		JButton btnUser = new JButton("");
		btnUser.setIcon(new ImageIcon(Main_Page1.class.getResource("/images/rsz_mans.png")));
		btnUser.setBounds(105, 433, 141, 124);
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Employee_Login.main(null);
				setVisible(false);
		
			}

		});
		btnUser.setOpaque(false);
		btnUser.setContentAreaFilled(false);
		btnUser.setBorderPainted(false);
		
		btnUser.setForeground(Color.BLACK);
		btnUser.setBackground(SystemColor.inactiveCaptionBorder);
		btnUser.setFont(new Font("Times New Roman", Font.BOLD, 20));
		getContentPane().add(btnUser);
		
		JButton btnAdmin = new JButton("");
		btnAdmin.setIcon(new ImageIcon(Main_Page1.class.getResource("/images/rsz_admin.png")));
		btnAdmin.setBounds(291, 433, 141, 124);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Admin_Login.main(null);
				setVisible(false);
			}
		});
		
		btnAdmin.setOpaque(false);
		btnAdmin.setContentAreaFilled(false);
		btnAdmin.setBorderPainted(false);
		
		btnAdmin.setBackground(Color.WHITE);
		btnAdmin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		getContentPane().add(btnAdmin);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(SystemColor.activeCaption);
		label_2.setBounds(0, -11, 719, 420);
		label_2.setIcon(new ImageIcon(Main_Page1.class.getResource("/images/image-2018-08-19.png")));
		
		JLabel lblNewLabel = new JLabel("THE ATLANTIS");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 58));
		lblNewLabel.setBounds(161, 11, 444, 65);
		lblNewLabel.setOpaque(true);
		getContentPane().add(lblNewLabel);
		
		JLabel lblHapiness = new JLabel("Happiness Guaranteed");
		lblHapiness.setForeground(new Color(255, 255, 0));
		lblHapiness.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblHapiness.setBounds(257, 75, 255, 46);
		
		Font font = lblHapiness.getFont();
		Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblHapiness.setFont(font.deriveFont(attributes));

		
		getContentPane().add(lblHapiness);
		
		getContentPane().add(label_2);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setForeground(new Color(0, 255, 255));
		lblUser.setFont(new Font("Arial", Font.BOLD, 20));
		lblUser.setBounds(148, 420, 72, 20);
		getContentPane().add(lblUser);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setForeground(Color.CYAN);
		lblAdmin.setFont(new Font("Arial", Font.BOLD, 20));
		lblAdmin.setBounds(339, 420, 72, 20);
		getContentPane().add(lblAdmin);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label.setIcon(new ImageIcon(Main_Page1.class.getResource("/images/exit (4).png")));
		label.setBounds(495, 420, 153, 163);
		getContentPane().add(label);
		
		

	}
}

package management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pay frame = new Pay();
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
	public Pay() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Main_Page1.main(null);
				dispose();
			}
		});
		label_1.setIcon(new ImageIcon(Pay.class.getResource("/images/home-black-building-symbol (1).png")));
		label_1.setBounds(516, 16, 69, 64);
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				 JOptionPane.showMessageDialog(null,"*** THANK YOU ***");
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Pay.class.getResource("/images/card1.png")));
		lblNewLabel.setBounds(71, 204, 163, 148);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				JOptionPane.showMessageDialog(null,"*** THANK YOU ***");
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(Pay.class.getResource("/images/cash.png")));
		lblNewLabel_1.setBounds(345, 204, 163, 148);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Akshata Singh\\Desktop\\cc1.png"));
		lblNewLabel_2.setBounds(41, 185, 497, 185);
		lblNewLabel_2.setOpaque(true);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PAYMENT");
		lblNewLabel_3.setIcon(new ImageIcon(Pay.class.getResource("/images/PAY2.png")));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Georgia", Font.PLAIN, 47));
		lblNewLabel_3.setBounds(15, 16, 312, 101);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				User.main(null);
				dispose();
				
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(Pay.class.getResource("/images/back.png")));
		lblNewLabel_4.setBounds(25, 420, 69, 64);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				dispose();
				
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon(Pay.class.getResource("/images/logout.png")));
		lblNewLabel_5.setBounds(490, 420, 69, 64);
		contentPane.add(lblNewLabel_5);

	}
}

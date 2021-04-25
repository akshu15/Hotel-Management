package management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Payment_Method extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment_Method frame = new Payment_Method();
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
	public Payment_Method() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 467);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPaymentMethod = new JLabel("PAYMENT METHOD");
		lblPaymentMethod.setForeground(new Color(255, 215, 0));
		lblPaymentMethod.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblPaymentMethod.setBounds(162, 30, 184, 41);
		contentPane.add(lblPaymentMethod);
		
		JLabel label = new JLabel("---------------------------------");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label.setForeground(new Color(255, 215, 0));
		label.setBounds(147, 57, 199, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("--------------------------------");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		label_1.setForeground(new Color(255, 215, 0));
		label_1.setBounds(147, 30, 199, 14);
		contentPane.add(label_1);
		
		JLabel lblPleaseSelectThe = new JLabel("PLEASE SELECT THE PAYMENT METHOD");
		lblPleaseSelectThe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPleaseSelectThe.setForeground(new Color(255, 215, 0));
		lblPleaseSelectThe.setBounds(83, 98, 422, 22);
		contentPane.add(lblPleaseSelectThe);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"THANKYOU FOR THE PAYMENT\n ");
				dispose();
				Main_Page1.main(null);
			}
		});
		label_2.setIcon(new ImageIcon(Payment_Method.class.getResource("/images/mastercard (1).png")));
		label_2.setBounds(29, 169, 139, 137);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"THANKYOU FOR THE PAYMENT\n ");
				dispose();
				Main_Page1.main(null);
			}
		});
		label_3.setIcon(new ImageIcon(Payment_Method.class.getResource("/images/cash (2).png")));
		label_3.setBounds(366, 169, 139, 137);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"THANKYOU FOR THE PAYMENT\n ");
				dispose();
				Main_Page1.main(null);
				dispose();
			}
		});
		label_4.setIcon(new ImageIcon(Payment_Method.class.getResource("/images/visa (2).png")));
		label_4.setBounds(193, 169, 148, 137);
		contentPane.add(label_4);
		
		JLabel lblYouCannotGo = new JLabel("YOU CANNOT GO BACK FROM THIS PAGE");
		lblYouCannotGo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblYouCannotGo.setForeground(new Color(255, 215, 0));
		lblYouCannotGo.setBounds(58, 358, 404, 22);
		contentPane.add(lblYouCannotGo);
	}
}

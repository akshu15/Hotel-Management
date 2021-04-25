package management;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;

public class Lodging1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lodging1 frame = new Lodging1();
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
	public Lodging1() {
		setUndecorated(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 655, 657);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Lodging1.class.getResource("/images/68350136.jpg")));
		label.setBounds(0, 0, 646, 317);
		
		JLabel lblLodging = new JLabel("       LODGING");
		lblLodging.setBackground(new Color(0, 0, 0));
		lblLodging.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblLodging.setForeground(new Color(255, 215, 0));
		lblLodging.setBounds(224, 14, 242, 39);
		lblLodging.setOpaque(true);
		contentPane.add(lblLodging);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				 Main_Page1.main(null);
			}
		});
		label_1.setIcon(new ImageIcon(Lodging1.class.getResource("/images/home-black-building-symbol (1).png")));
		label_1.setBackground(new Color(128, 0, 0));
		label_1.setBounds(582, 0, 64, 64);
		label_1.setOpaque(true);
		contentPane.add(label_1);
		
		contentPane.add(label);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setDragMode(1);
		desktopPane.setBounds(72, 543, 315, -210);
		contentPane.add(desktopPane);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Customer_Info.main(null);
			}
		});
		label_2.setBackground(new Color(0, 0, 0));
		label_2.setIcon(new ImageIcon(Lodging1.class.getResource("/images/check-in.png")));
		label_2.setBounds(100, 360, 128, 137);
		label_2.setOpaque(true);
		contentPane.add(label_2);
		
		JLabel lblCheckIn = new JLabel("CHECK - IN");
		lblCheckIn.setForeground(new Color(255, 215, 0));
		lblCheckIn.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblCheckIn.setBounds(111, 494, 118, 22);
		contentPane.add(lblCheckIn);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Billing1.main(null);
			}
		});
		label_3.setBackground(new Color(0, 0, 0));
		label_3.setIcon(new ImageIcon(Lodging1.class.getResource("/images/check-out.png")));
		label_3.setBounds(405, 360, 128, 137);
		label_3.setOpaque(true);
		contentPane.add(label_3);
		
		JLabel lblCheckOut = new JLabel("CHECK - OUT");
		lblCheckOut.setForeground(new Color(255, 215, 0));
		lblCheckOut.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblCheckOut.setBounds(405, 494, 141, 22);
		contentPane.add(lblCheckOut);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		label_4.setIcon(new ImageIcon(Lodging1.class.getResource("/images/logout.png")));
		label_4.setBounds(570, 543, 66, 64);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				User.main(null);
			}
		});
		label_5.setIcon(new ImageIcon(Lodging1.class.getResource("/images/back.png")));
		label_5.setBounds(24, 543, 64, 64);
		contentPane.add(label_5);
		
		/*JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Lodging1.class.getResource("/images/home-black-building-symbol (1).png")));
		label_1.setBackground(new Color(0, 0, 0));
		label_1.setBounds(589, 0, 57, 39);
		label_1.setOpaque(true);
		contentPane.add(label_1);*/
		
		/*JLabel lblLodging = new JLabel("LODGING");
		lblLodging.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblLodging.setForeground(new Color(255, 215, 0));
		lblLodging.setBounds(246, 0, 141, 65);
		contentPane.add(lblLodging);*/
	}
}

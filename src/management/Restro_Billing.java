package management;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Restro_Billing extends JFrame {

	private JPanel contentPane;
	private JRadioButton r1,r2,r3;
	private JTextField textField;
	int num=0;
	String a="";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restro_Billing frame = new Restro_Billing();
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
	public Restro_Billing() {
		setUndecorated(true);
		getContentPane().setBackground(new Color(128, 0, 0));
		setBounds(100, 100, 700, 700);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Total:");
		lblNewLabel_3.setForeground(new Color(255, 215, 0));
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(220, 511, 82, 26);
		getContentPane().add(lblNewLabel_3);
		
		JLabel l2 = new JLabel("Rs.0");
		l2.setForeground(new Color(0, 0, 0));
		l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		l2.setBounds(340, 508, 82, 26);
		getContentPane().add(l2);
		
		JButton btnPayment = new JButton("PAYMENT");
		btnPayment.setForeground(new Color(255, 255, 255));
		btnPayment.setFont(new Font("Times New Roman", Font.BOLD, 23));
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						dispose();
				
				Payment_Method.main(null);
			}
		});
		btnPayment.setBackground(new Color(0, 0, 0));
		btnPayment.setBounds(247, 578, 160, 44);
		getContentPane().add(btnPayment);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setForeground(new Color(255, 255, 240));
		textField.setBackground(new Color(0, 0, 0));
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		textField.setBounds(400, 165, 56, 38);
		textField.getText();
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		JRadioButton r1 = new JRadioButton("BREAKFAST BUFFET             Rs.500");
		r1.setBackground(new Color(255, 215, 0));
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		           if(r1.isSelected())
		           {
		        	   r2.setSelected(false);
		        	   r3.setSelected(false);
		        	   a=textField.getText();
		        	   num=Integer.parseInt(a);
		        	   
		        	   if((Integer.parseInt(textField.getText()))==0)
						{
							JOptionPane.showMessageDialog(null,"***ENTER THE NUMBER OF PEOPLE***");
						}
		        	   else
		        	   {
		        		   
		        	   
		        	   try
		        	  {
		        	   System.out.println();
		        	   String abc=l2.getText();
				    	String str="\n\t\t  HOTEL ATLANTIS" + "\t\t\t\t\t\tHappiness Gauranteed" + "\t\t\t\t\t\t\t\t\t\t\t\t\t"  +"BREAKFAST BUFFET : Rs. "+ (num*500)+"\t\t\t\t\t\t\t\t\t\t\t\t\t"+ "Number of people : "+num;
				    	
				        // attach a file to FileWriter 
				        FileWriter fw=new FileWriter("C:\\Users\\Asmita\\Desktop\\HM2\\restro_bill.txt"); 
				  
				        // read character wise from string and write 
				        // into FileWriter 
				        for (int i = 0; i < str.length(); i++) 
				            fw.write(str.charAt(i)); 
				  
				        //close the file 
				        fw.close(); 
				        
				       
		        	  }
		        	   
		        	  catch(Exception e1)
						{
							e1.printStackTrace();
						}
		        	   }
		        	   
		           }
					
					l2.setText("Rs."+(500*num));
					
				
			}
		});
		r1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		r1.setBounds(52, 225, 370, 31);
		getContentPane().add(r1);
		
		r2 = new JRadioButton("LUNCH BUFFET                      Rs.800");
		r2.setBackground(new Color(255, 215, 0));
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(r2.isSelected())
		           {
		        	   r1.setSelected(false);
		        	   r3.setSelected(false);
		        	   a=textField.getText();
		        	   num=Integer.parseInt(a);
		        	   
		        	   
		        	   if((Integer.parseInt(textField.getText()))==0)
						{
							JOptionPane.showMessageDialog(null,"***ENTER THE NUMBER OF PEOPLE***");
						}
		        	   else
		        	   {
		        	   
		        	   try
			        	  {
			        	   System.out.println();
					    	String str="\n\t\t  HOTEL ATLANTIS" + "\t\t\t\t\t\tHappiness Gauranteed" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t"  +"LUNCH BUFFET : Rs. " +(800*num)+ "\t\t\t\t\t\t\t\t\t\t\t\t"+"Number of people : "+num;
					    	
					        // attach a file to FileWriter 
					        FileWriter fw=new FileWriter("C:\\Users\\Asmita\\Desktop\\HM2\\restro_bill.txt"); 
					  
					        // read character wise from string and write 
					        // into FileWriter 
					        for (int i = 0; i < str.length(); i++) 
					            fw.write(str.charAt(i)); 
					  
					        //close the file 
					        fw.close(); 
			        	  }
			        	  catch(Exception e1)
							{
								e1.printStackTrace();
							}
		        	   }
		        	   
		           }
				
				l2.setText("Rs."+(800*num));
			}
		});
		r2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		r2.setBounds(52, 303, 370, 31);
		getContentPane().add(r2);
		
		r3 = new JRadioButton("DINNER BUFFET                     Rs.1000");
		r3.setBackground(new Color(255, 215, 0));
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//dispose();
				if(r3.isSelected())
		           {
		        	   r1.setSelected(false);
		        	   r2.setSelected(false);
		        	   a=textField.getText();
		        	   num=Integer.parseInt(a);
		        	   
		        	   
		        	   if((Integer.parseInt(textField.getText()))==0)
						{
							JOptionPane.showMessageDialog(null,"***ENTER THE NUMBER OF PEOPLE***");
						}
		        	   else
		        	   {
		        	   try
			        	  {
			        	   System.out.println();
					    	String str="\n\t\t  HOTEL ATLANTIS" + "\t\t\t\t\t\tHappiness Gauranteed" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t"  +"DINNER BUFFET : Rs. "+(1000*num)+"\t\t\t\t\t\t\t\t\t\t\t"+"Number of people : "+num;
					    	
					        // attach a file to FileWriter 
					        FileWriter fw=new FileWriter("C:\\Users\\Asmita\\Desktop\\HM2\\restro_bill.txt"); 
					  
					        // read character wise from string and write 
					        // into FileWriter 
					        for (int i = 0; i < str.length(); i++) 
					            fw.write(str.charAt(i)); 
					  
					        //close the file 
					        fw.close(); 
			        	  }
			        	  catch(Exception e1)
							{
								e1.printStackTrace();
							}
		        	   }
		           }
				
				//l1.setText("Rs."+1000);
				l2.setText("Rs."+(1000*num));
			}
		});
		
	
		r3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		r3.setBounds(52, 385, 370, 31);
		getContentPane().add(r3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Main_Page1.main(null);
				dispose();
				
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(Restro_Billing.class.getResource("/images/home-black-building-symbol (1).png")));
		lblNewLabel_4.setBounds(609, 0, 69, 65);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Restro_Billing.class.getResource("/images/h2.png")));
		lblNewLabel_7.setBounds(0, 0, 678, 154);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Restro_Billing.class.getResource("/images/n1.png")));
		lblNewLabel.setBounds(453, 207, 196, 165);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				User.main(null);
				dispose();
				
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon(Restro_Billing.class.getResource("/images/back.png")));
		lblNewLabel_6.setBounds(10, 578, 69, 77);
		getContentPane().add(lblNewLabel_6);
		
		JLabel label = new JLabel("New label");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				dispose();
				
			}
		});
		label.setIcon(new ImageIcon(Restro_Billing.class.getResource("/images/logout.png")));
		label.setBounds(609, 578, 69, 77);
		getContentPane().add(label);
		
		JLabel lblEnterTheNumber = new JLabel("Enter the number of people");
		lblEnterTheNumber.setForeground(new Color(255, 215, 0));
		lblEnterTheNumber.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterTheNumber.setBounds(111, 168, 238, 33);
		getContentPane().add(lblEnterTheNumber);
		
		
	}
}

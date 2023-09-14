package reto0;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class index extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(index.class.getResource("/reto0/media/G32.png")));
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				File root_folder = new File("./G3Domotica/");
				 File app_folder = new File("./G3Domotica/logs/calefaccion");
				 File reg_folder = new File("./G3Domotica/logs/alarmas");
				 
				 if (!root_folder.isDirectory()){
			        	root_folder.mkdirs();
			        }
			        if (!reg_folder.isDirectory()){
			        	reg_folder.mkdirs();
			        }
			        if (!app_folder.isDirectory()){
			            app_folder.mkdirs();
			        }
			     if(login.idioma==true) {
			    	 btnNewButton_1.setText("EU");
			    	 lblNewLabel.setText("DOMOTICA");
			     } else {
			    	 btnNewButton_1.setText("ES");
			    	 lblNewLabel.setText("DOMOTIKA");
			     }
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 372, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 244, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 337, 356, 130);
		contentPane.add(panel);
		panel.setLayout(null);

		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		        calefaccion c = new calefaccion();
		        c.setVisible(true); 
		        dispose(); 
		    }
		});
		btnNewButton.setIcon(new ImageIcon(index.class.getResource("/reto0/media/calentador (1).png")));
		btnNewButton.setMaximumSize(new Dimension(70, 20));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setVerifyInputWhenFocusTarget(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(0, 0, 175, 128);
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alarmas a = new alarmas();
		        a.setVisible(true); 
		        dispose(); 
				
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(index.class.getResource("/reto0/media/emergencia.png")));
		btnNewButton_3.setVerifyInputWhenFocusTarget(false);
		btnNewButton_3.setRequestFocusEnabled(false);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBounds(181, 0, 175, 128);
		panel.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(175, 0, 5, 130);
		panel.add(panel_2);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 332, 356, 5);
		contentPane.add(panel_1);
		
		lblNewLabel = new JLabel("DOMOTICA");
		lblNewLabel.setForeground(new Color(78, 78, 78));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(42, 73, 272, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FPTXURDINAGA");
		lblNewLabel_1.setForeground(new Color(78, 78, 78));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 33));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(42, 121, 272, 49);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(index.class.getResource("/reto0/media/Logo_Home3 (1).png")));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setRequestFocusEnabled(false);
		btnNewButton_2.setVerifyInputWhenFocusTarget(false);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setBounds(64, 175, 220, 100);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(294, 10, 54, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setForeground(new Color(237, 244, 250));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton_1.getText().equals("EU")) {
					btnNewButton_1.setText("ES");
					login.idioma=false;
					lblNewLabel.setText("DOMOTIKA");
					
				} else {
					btnNewButton_1.setText("EU");
					login.idioma=true;
					lblNewLabel.setText("DOMOTICA");

				}
				
				
			}
		});
	}
}

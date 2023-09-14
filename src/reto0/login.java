package reto0;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import bean.calefa;
import bean.users;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.Toolkit;


public class login extends JFrame {

	private JPanel contentPane;

	private JTextField txtErabil;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField txtPasahitza;
	ArrayList<users> aru = new ArrayList<>();
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	public static boolean idioma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/reto0/media/G32.png")));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				if(lblNewLabel.getText().equals("¡Hola!")) {
					btnNewButton_1.setText("EU");
					idioma=true;
				} else {
					btnNewButton_1.setText("ES");
					idioma=false;
				}
				System.out.println(idioma);
				
				try {
					FileInputStream fis = new FileInputStream ("./G3Domotica/users.dat");
					ObjectInputStream ois=new ObjectInputStream (fis);
					//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
					
					users u2=(users)ois.readObject();
					aru.add(u2);
					for (int i=0; u2 != null;i++) {
						 // Procesar el objeto
		                // Leer el siguiente objeto
		                u2 = (users) ois.readObject();
		                aru.add(u2);
		                
					}
					
					ois.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					////e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					////e1.printStackTrace();

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					////e1.printStackTrace();
				}
				if (aru.size()==0) {
					
					users u1 = new users("admin","123","Administratzaile");
					FileOutputStream fos;
					aru.add(u1);
					try {
						fos = new FileOutputStream ("./G3Domotica/users.dat");
						ObjectOutputStream oos=new ObjectOutputStream(fos);
						//idatzi fitxategian
						oos.writeObject(u1);
						//fitxategia itxi
						oos.close();
					} catch (IOException ioe) {
						// TODO Auto-generated catch block
						//ioe.printStackTrace();
					}
				}
			}
		});
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 242, 387);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 244, 250));
		contentPane.setForeground(new Color(237, 244, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel() {
			 protected void paintComponent(Graphics g) {
			        
			    
		}
		};
		panel.setOpaque(false);
		panel.setBackground(new Color(237, 244, 250));
		panel.setBounds(0, -31, 249, 405);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBackground(new Color(78, 78, 78));
		lblNewLabel_1.setBounds(64, 157, 96, 13);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(78, 78, 78));
		
		lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setBackground(new Color(78, 78, 78));
		lblNewLabel_2.setBounds(64, 208, 85, 13);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(78, 78, 78));
		
		
		
		txtPasahitza = new JPasswordField();
		txtPasahitza.setBounds(64, 227, 96, 19);
		panel.add(txtPasahitza);
		
		txtErabil = new JTextField();
		txtErabil.setAutoscrolls(false);
		txtErabil.setBounds(64, 176, 96, 19);
		panel.add(txtErabil);
		txtErabil.setColumns(10);
		
		
		
		//Logeatzeko botoia
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.setBounds(64, 278, 96, 21);
		panel.add(btnNewButton);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(237, 244, 250));
		
		lblNewLabel = new JLabel("¡Hola!");
		lblNewLabel.setBounds(60, 59, 115, 80);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(78, 78, 78));
		lblNewLabel.setForeground(new Color(78, 78, 78));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFocusTraversalKeysEnabled(false);
		btnNewButton_1.setForeground(new Color(237, 244, 250));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton_1.getText().equals("EU")) {
					btnNewButton_1.setText("ES");
					idioma=false;
					btnNewButton.setText("Saioa Hasi");
					lblNewLabel.setText("Kaixo!");
					lblNewLabel_1.setText("Erabiltzailea:");
					lblNewLabel_2.setText("Pasahitza:");
					
				} else {
					btnNewButton_1.setText("EU");
					idioma=true;
					btnNewButton.setText("Iniciar Sesión");
					lblNewLabel.setText("¡Hola!");
					lblNewLabel_1.setText("Usuario:");
					lblNewLabel_2.setText("Contraseña:");
				}
				
				
			}
		});
		btnNewButton_1.setBounds(166, 43, 54, 21);
		panel.add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtErabil.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Ezin da hutsik egon erabiltzailea", "Err",JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (txtPasahitza.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Ezin da hutsik egon pasahitza", "Err",JOptionPane.ERROR_MESSAGE);
					return;
				}
				String use=txtErabil.getText();
				String pas=txtPasahitza.getText();
				
				for (int i=0;i<aru.size();i++) {
					if(aru.get(i).getUser().equals(use) && aru.get(i).getPass().equals(pas)) {
						System.out.println("Sartuta");
						txtErabil.setText("");
						txtPasahitza.setText("");
						index in = new index();
						in.setVisible(true);
						dispose();
						//Erabiltzaile desberdinen bistak
						logs.log.logLogin("Administratzailea logeatu da.");
						
						return;
					}
				}
				JOptionPane.showMessageDialog(null,"Datu baliogabeak", "Err",JOptionPane.ERROR_MESSAGE);


				
				
			}
		});
	}
}

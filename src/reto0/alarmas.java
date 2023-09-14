package reto0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class alarmas extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_2_1;
	private JPanel panel_2_1_1;
	private JButton btnNewButton_6;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private int boton1;
	private int boton2;
	private int boton3;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alarmas frame = new alarmas();
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
	public alarmas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(alarmas.class.getResource("/reto0/media/G32.png")));
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				Random numAleatorio = new Random();
				boton1 = numAleatorio.nextInt(1-0+1) + 1;
				boton2 = numAleatorio.nextInt(1-0+1) + 1;
				boton3 = numAleatorio.nextInt(1-0+1) + 1;
				if(login.idioma==true) {
					btnNewButton_6.setText("EU");
					btnNewButton_2.setText("EMERGENCIAS");
			    	 btnNewButton_3.setText("DESCONECTAR");
			    	 lblNewLabel_1.setText("- Alarma 1:");
			    	 lblNewLabel_1_1.setText("- Alarma 2:");
			    	 lblNewLabel_1_1_1.setText("- Alarma 3:");
				}else {
					btnNewButton_6.setText("ES");
					btnNewButton_2.setText("LARRIALDIAK");
			    	 btnNewButton_3.setText("DESKONEKTATU");
			    	 lblNewLabel_1.setText("- 1.Alarma:");
			    	 lblNewLabel_1_1.setText("- 2.Alarma:");
			    	 lblNewLabel_1_1_1.setText("- 3.Alarma:");
				}
				
				if(boton1==1) {
					if(login.idioma==true) {
						lblNewLabel_5.setText("ENCENDIDO");
					} else {
						lblNewLabel_5.setText("PIZTUTA");
					}
					panel_2_1.setBackground(new Color(0, 128, 128));
				} else {
					if(login.idioma==true) {
						lblNewLabel_5.setText("APAGADO");
					} else {
						lblNewLabel_5.setText("AMATUTA");
					}
					panel_2_1.setBackground(new Color(255, 0, 0));
					
				}
				if(boton2==1) {
					if(login.idioma==true) {
						lblNewLabel_6.setText("ENCENDIDO");
					} else {
						lblNewLabel_6.setText("PIZTUTA");
					}
					panel_2.setBackground(new Color(0, 128, 128));
				} else {
					if(login.idioma==true) {
						lblNewLabel_6.setText("APAGADO");
					} else {
						lblNewLabel_6.setText("AMATUTA");
					}
					panel_2.setBackground(new Color(255, 0, 0));
				}
				if(boton3==1) {
					if(login.idioma==true) {
						lblNewLabel_7.setText("ENCENDIDO");
					} else {
						lblNewLabel_7.setText("PIZTUTA");
					}
					panel_2_1_1.setBackground(new Color(0, 128, 128));
				} else {
					if(login.idioma==true) {
						lblNewLabel_7.setText("APAGADO");
					} else {
						lblNewLabel_7.setText("AMATUTA");
						
						
					}
					panel_2_1_1.setBackground(new Color(255, 0, 0));

				}
				
				
				if(lblNewLabel_5.getText().equals("ENCENDIDO") || lblNewLabel_6.getText().equals("ENCENDIDO") || lblNewLabel_7.getText().equals("ENCENDIDO") || lblNewLabel_5.getText().equals("PIZTUTA") || lblNewLabel_6.getText().equals("PIZTUTA") || lblNewLabel_7.getText().equals("PIZTUTA")) {
					panel_3.setVisible(true);
					if(login.idioma==true) {
						JOptionPane.showMessageDialog(null, "La alarma esta encendida, comprueba la veracidad o llama!!");

					} else {
						JOptionPane.showMessageDialog(null, "Alarma piztuta dago, konprobatu edo deitu!!");
					}
					logs.log.logAlarma("La alarma esta encendida");
				}
				
				

			}
		});
		setResizable(false);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 372, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 244, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(336, 65, 52, 206);
		contentPane.add(panel);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(173, 219, 16, 15);
		contentPane.add(panel_2);
		
		panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(255, 0, 0));
		panel_2_1.setBounds(39, 129, 16, 15);
		contentPane.add(panel_2_1);
		
		panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(255, 0, 0));
		panel_2_1_1.setBounds(309, 129, 16, 15);
		contentPane.add(panel_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setBounds(58, 129, 16, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3");
		lblNewLabel_3.setBounds(298, 129, 16, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2");
		lblNewLabel_4.setBounds(178, 202, 16, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(alarmas.class.getResource("/reto0/media/alarma.png")));
		btnNewButton.setBounds(-32, 65, 398, 206);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("ALARMAS:");
		lblNewLabel.setForeground(new Color(78, 78, 78));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(23, 296, 298, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(23, 309, 58, 1);
		contentPane.add(panel_1);
		
		lblNewLabel_1 = new JLabel("- Alarma 1:");
		lblNewLabel_1.setForeground(new Color(78, 78, 78));
		lblNewLabel_1.setBounds(23, 332, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("- Alarma 2:");
		lblNewLabel_1_1.setForeground(new Color(78, 78, 78));
		lblNewLabel_1_1.setBounds(23, 357, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_1_1_1 = new JLabel("- Alarma 3:");
		lblNewLabel_1_1_1.setForeground(new Color(78, 78, 78));
		lblNewLabel_1_1_1.setBounds(23, 382, 69, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index i = new index();
				i.setVisible(true);
				dispose(); 
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(alarmas.class.getResource("/reto0/media/flecha-izquierda (2) (1).png")));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(10, 11, 43, 43);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(new Color(78, 78, 78));
		lblNewLabel_5.setBounds(85, 333, 75, 13);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setForeground(new Color(78, 78, 78));
		lblNewLabel_6.setBounds(85, 358, 85, 13);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setForeground(new Color(78, 78, 78));
		lblNewLabel_7.setBounds(85, 383, 75, 13);
		contentPane.add(lblNewLabel_7);
		
		panel_3 = new JPanel();
		panel_3.setOpaque(false);
		panel_3.setVisible(false);
		panel_3.setBounds(178, 320, 188, 92);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		btnNewButton_2 = new JButton("EMERGENCIAS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.idioma==false) {
					JOptionPane.showMessageDialog(null, "Larrialdiak deitzen...");

				} else {
					JOptionPane.showMessageDialog(null, "Llamando a Emergencias...");
				}
				logs.log.logAlarma("Has llamado a emergencias");
			}
		});
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(237, 244, 250));
		btnNewButton_2.setBounds(10, 10, 150, 21);
		panel_3.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("DESCONECTAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(boton1==1 || boton2==1 || boton3==1) {
					boton1=2;
					boton2=2;
					boton3=2;
					panel_2_1.setBackground(new Color(255,0,0));
					
					panel_2.setBackground(new Color(255,0,0));
					panel_2_1_1.setBackground(new Color(255,0,0));
					if(login.idioma==false) {
						JOptionPane.showMessageDialog(null, "Alarma amatu da.");
						lblNewLabel_7.setText("AMATUTA");
						lblNewLabel_6.setText("AMATUTA");
						lblNewLabel_5.setText("AMATUTA");

					} else {
						lblNewLabel_7.setText("APAGADO");
						lblNewLabel_6.setText("APAGADO");
						lblNewLabel_5.setText("APAGADO");
						JOptionPane.showMessageDialog(null, "Se ha apagado la alarma.");
					}
					logs.log.logAlarma("Se ha apagado la alarma.");
				}
			}
		});
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setForeground(new Color(237, 244, 250));
		btnNewButton_3.setBounds(10, 41, 150, 21);
		panel_3.add(btnNewButton_3);
		
		btnNewButton_6 = new JButton("");
		contentPane.add(btnNewButton_6);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setFocusTraversalKeysEnabled(false);
		btnNewButton_6.setForeground(new Color(237, 244, 250));
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBackground(new Color(0, 0, 0));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton_6.getText().equals("ES")) {
					login.idioma=true;
					btnNewButton_6.setText("EU");
			    	 btnNewButton_2.setText("EMERGENCIAS");
			    	 btnNewButton_3.setText("DESCONECTAR");
			    	 lblNewLabel_1.setText("- Alarma 1:");
			    	 lblNewLabel_1_1.setText("- Alarma 2:");
			    	 lblNewLabel_1_1_1.setText("- Alarma 3:");
			    	 if(lblNewLabel_5.getText().equals("PIZTUTA")){
			    		 lblNewLabel_5.setText("ENCENDIDO");
			    	 }
			    	 if(lblNewLabel_5.getText().equals("AMATUTA")){
			    		 lblNewLabel_5.setText("APAGADO");
			    	 }
			    	 if(lblNewLabel_6.getText().equals("PIZTUTA")){
			    		 lblNewLabel_6.setText("ENCENDIDO");
			    	 }
			    	 if(lblNewLabel_6.getText().equals("AMATUTA")){
			    		 lblNewLabel_6.setText("APAGADO");
			    	 }
			    	 if(lblNewLabel_7.getText().equals("PIZTUTA")){
			    		 lblNewLabel_7.setText("ENCENDIDO");
			    	 }
			    	 if(lblNewLabel_7.getText().equals("AMATUTA")){
			    		 lblNewLabel_7.setText("APAGADO");
			    	 }

			     } else {
			    	 login.idioma=false;
			    	 btnNewButton_6.setText("ES");
			    	 btnNewButton_2.setText("LARRIALDIAK");
			    	 btnNewButton_3.setText("DESKONEKTATU");
			    	 lblNewLabel_1.setText("- 1.Alarma:");
			    	 lblNewLabel_1_1.setText("- 2.Alarma:");
			    	 lblNewLabel_1_1_1.setText("- 3.Alarma:");
			    	 if(lblNewLabel_5.getText().equals("ENCENDIDO")){
			    		 lblNewLabel_5.setText("PIZTUTA");
			    	 }
			    	 if(lblNewLabel_5.getText().equals("APAGADO")){
			    		 lblNewLabel_5.setText("AMATUTA");
			    	 }
			    	 if(lblNewLabel_6.getText().equals("ENCENDIDO")){
			    		 lblNewLabel_6.setText("PIZTUTA");
			    	 }
			    	 if(lblNewLabel_6.getText().equals("APAGADO")){
			    		 lblNewLabel_6.setText("AMATUTA");
			    	 }
			    	 if(lblNewLabel_7.getText().equals("ENCENDIDO")){
			    		 lblNewLabel_7.setText("PIZTUTA");
			    	 }
			    	 if(lblNewLabel_7.getText().equals("APAGADO")){
			    		 lblNewLabel_7.setText("AMATUTA");
			    	 }
				}
				
				
			}
		});
		btnNewButton_6.setBounds(294, 10, 54, 21);
		

		
		
		
		
	}
}

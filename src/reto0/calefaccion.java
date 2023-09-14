package reto0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.calefa;


import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class calefaccion extends JFrame {

	private JPanel contentPane;
	ArrayList<calefa> cal = new ArrayList<>();

	private JButton calefaccion_1;
	private JButton calefaccion_2;
	private JButton calefaccion_3;
	private JButton calefaccion_4;
	private JButton calefaccion_5;
	private JButton calefaccion_6;
	private JButton btnNewButton_6;
	private JLabel Tempe;
	private JLabel nomCal;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calefaccion frame = new calefaccion();
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
	public calefaccion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(calefaccion.class.getResource("/reto0/media/G32.png")));
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {

				try {
					FileInputStream fis = new FileInputStream ("./G3Domotica/calefacciones.dat");
					ObjectInputStream ois=new ObjectInputStream (fis);
					//irakurritako bytak konplexu klaseko datuak bihurtzen ditu
					
					calefa u2=(calefa)ois.readObject();
					cal.add(u2);
					for (int i=0; u2 != null;i++) {
						 // Procesar el objeto
		                // Leer el siguiente objeto
		                u2 = (calefa) ois.readObject();
		                cal.add(u2);
		                
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
				
					if(cal.get(0).isEncendido()==true) {
						calefaccion_1.setBackground(Color.GREEN);
					} else {
						calefaccion_1.setBackground(Color.red);
					}
					if(cal.get(1).isEncendido()==true) {
						calefaccion_2.setBackground(Color.GREEN);
					} else {
						calefaccion_2.setBackground(Color.red);
					}
					if(cal.get(2).isEncendido()==true) {
						calefaccion_3.setBackground(Color.GREEN);
					} else {
						calefaccion_3.setBackground(Color.red);
					}
					if(cal.get(3).isEncendido()==true) {
						calefaccion_4.setBackground(Color.GREEN);
					} else {
						calefaccion_4.setBackground(Color.red);
					}
					if(cal.get(4).isEncendido()==true) {
						calefaccion_5.setBackground(Color.GREEN);
					} else {
						calefaccion_5.setBackground(Color.red);
					}
					if(cal.get(5).isEncendido()==true) {
						calefaccion_6.setBackground(Color.GREEN);
					} else {
						calefaccion_6.setBackground(Color.red);
					}
					if(cal.size()==0) {
						for (int i=1;i<=6;i++) {
							calefa c = new calefa("CALEFACCION"+i);
							cal.add(c);
							System.out.println(c.getNom().toString());
						}
					}
					if(login.idioma==true) {
						btnNewButton_6.setText("EU");
				    	 btnNewButton_1.setText("TODAS");
				    	 nomCal.setText("CALEFACCIONES:");
				    	 Tempe.setText("Temperatura:");
				     } else {
				    	 btnNewButton_6.setText("ES");
				    	 btnNewButton_1.setText("GUZTIAK");
				    	 nomCal.setText("BEROGAILUAK:");
				    	 Tempe.setText("Tenperatura:");
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
		

		
		
		
		calefaccion_1 = new JButton("");
		calefaccion_1.setBackground(new Color(255, 0, 0));
		calefaccion_1.setFocusTraversalPolicyProvider(true);
		calefaccion_1.setFocusPainted(false);
		calefaccion_1.setBorderPainted(false);
		calefaccion_1.setBounds(41, 85, 11, 29);
		contentPane.add(calefaccion_1);
		
		calefaccion_2 = new JButton("");
		calefaccion_2.setBackground(new Color(255, 0, 0));
		calefaccion_2.setRequestFocusEnabled(false);
		calefaccion_2.setBorderPainted(false);
		calefaccion_2.setBounds(110, 85, 11, 29);
		contentPane.add(calefaccion_2);
		
		calefaccion_3 = new JButton("");
		calefaccion_3.setBackground(new Color(255, 0, 0));
		calefaccion_3.setRequestFocusEnabled(false);
		calefaccion_3.setFocusable(false);
		calefaccion_3.setBorderPainted(false);
		calefaccion_3.setBounds(197, 87, 12, 29);
		contentPane.add(calefaccion_3);
		
		calefaccion_4 = new JButton("");
		calefaccion_4.setBackground(new Color(255, 0, 0));
		calefaccion_4.setRequestFocusEnabled(false);
		calefaccion_4.setFocusable(false);
		calefaccion_4.setBorderPainted(false);
		calefaccion_4.setBounds(255, 87, 12, 29);
		contentPane.add(calefaccion_4);
		
		calefaccion_5 = new JButton("");
		calefaccion_5.setBackground(new Color(255, 0, 0));
		calefaccion_5.setRequestFocusEnabled(false);
		calefaccion_5.setFocusable(false);
		calefaccion_5.setBorderPainted(false);
		calefaccion_5.setBounds(41, 150, 11, 29);
		contentPane.add(calefaccion_5);
		
		calefaccion_6 = new JButton("");
		calefaccion_6.setBackground(new Color(255, 0, 0));
		calefaccion_6.setRequestFocusEnabled(false);
		calefaccion_6.setFocusable(false);
		calefaccion_6.setBorderPainted(false);
		calefaccion_6.setBounds(255, 150, 11, 29);
		contentPane.add(calefaccion_6);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(calefaccion.class.getResource("/reto0/media/calefaccion.png")));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setVerifyInputWhenFocusTarget(false);
		btnNewButton.setBounds(-19, 65, 375, 206);
		contentPane.add(btnNewButton);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(336, 65, 52, 206);
		contentPane.add(panel);
		

		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBounds(10, 286, 318, 154);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		nomCal = new JLabel("CALEFACCIONES:");
		nomCal.setBackground(new Color(78, 78, 78));
		nomCal.setFont(new Font("Tahoma", Font.BOLD, 11));
		nomCal.setBounds(10, 11, 105, 19);
		panel_1.add(nomCal);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(10, 27, 93, 1);
		panel_1.add(panel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 0, 0));
		comboBox.setForeground(new Color(237, 244, 250));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
		comboBox.setBounds(90, 41, 42, 22);
		panel_1.add(comboBox);
		
		Tempe = new JLabel("Temperatura:");
		Tempe.setBackground(new Color(78, 78, 78));
		Tempe.setBounds(10, 41, 84, 22);
		panel_1.add(Tempe);
		
		JButton btnNewButton_2 = new JButton("ON");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(237, 244, 250));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));

		btnNewButton_2.setBounds(10, 85, 65, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("OFF");
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.setForeground(new Color(237, 244, 250));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3.setBounds(78, 85, 65, 23);
		panel_1.add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("TODAS");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(237, 244, 250));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.idioma==true) {
					nomCal.setText("CALEFACCIONES:");
				} else {
					nomCal.setText("BEROGAILUAK:");
				}
				
				comboBox.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setBounds(193, 9, 115, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index i = new index();
				i.setVisible(true);
				dispose(); 
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(calefaccion.class.getResource("/reto0/media/flecha-izquierda (2) (1).png")));
		btnNewButton_4.setVerifyInputWhenFocusTarget(false);
		btnNewButton_4.setOpaque(false);
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBounds(10, 11, 43, 43);
		contentPane.add(btnNewButton_4);
		
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
			    	 btnNewButton_1.setText("TODAS");
			    	 nomCal.setText("CALEFACCIONES:");
			    	 Tempe.setText("Temperatura:");
			     } else {
			    	 login.idioma=false;
			    	 btnNewButton_6.setText("ES");
			    	 btnNewButton_1.setText("GUZTIAK");
			    	 nomCal.setText("BEROGAILUAK:");
			    	 Tempe.setText("Tenperatura:");
				}
				
				
			}
		});
		btnNewButton_6.setBounds(294, 10, 54, 21);
		
		calefaccion_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.idioma==true) {
					nomCal.setText("CALEFACCIÓN 1:");
				} else {
					nomCal.setText("BEROGAILU 1:");
				}
				int numeroDeseado = cal.get(0).getTempe();

	            for (int i = 0; i < comboBox.getItemCount(); i++) {
	                int numeroComboBox = Integer.valueOf(comboBox.getItemAt(i).toString()); 
	                if (numeroComboBox == numeroDeseado) {
	                    comboBox.setSelectedIndex(i);
	                    return;
	                }
	            }
			}
		});
		calefaccion_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.idioma==true) {
					nomCal.setText("CALEFACCIÓN 2:");
				} else {
					nomCal.setText("BEROGAILU 2:");
				}
				int numeroDeseado = cal.get(1).getTempe();

	            for (int i = 0; i < comboBox.getItemCount(); i++) {
	                int numeroComboBox = Integer.valueOf(comboBox.getItemAt(i).toString()); 
	                if (numeroComboBox == numeroDeseado) {
	                    comboBox.setSelectedIndex(i);
	                    return;
	                }
	            }
			}
		});
		calefaccion_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.idioma==true) {
					nomCal.setText("CALEFACCIÓN 3:");
				} else {
					nomCal.setText("BEROGAILU 3:");
				}
				int numeroDeseado = cal.get(2).getTempe();

	            for (int i = 0; i < comboBox.getItemCount(); i++) {
	                int numeroComboBox = Integer.valueOf(comboBox.getItemAt(i).toString()); 
	                if (numeroComboBox == numeroDeseado) {
	                    comboBox.setSelectedIndex(i);
	                    return;
	                }
	            }
			}
		});
		calefaccion_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.idioma==true) {
					nomCal.setText("CALEFACCIÓN 4:");
				} else {
					nomCal.setText("BEROGAILU 4:");
				}
				int numeroDeseado = cal.get(3).getTempe();

	            for (int i = 0; i < comboBox.getItemCount(); i++) {
	                int numeroComboBox = Integer.valueOf(comboBox.getItemAt(i).toString()); 
	                if (numeroComboBox == numeroDeseado) {
	                    comboBox.setSelectedIndex(i);
	                    return;
	                }
	            }
			}
		});
		calefaccion_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.idioma==true) {
					nomCal.setText("CALEFACCIÓN 5:");
				} else {
					nomCal.setText("BEROGAILU 5:");
				}
				int numeroDeseado = cal.get(4).getTempe();

	            for (int i = 0; i < comboBox.getItemCount(); i++) {
	                int numeroComboBox = Integer.valueOf(comboBox.getItemAt(i).toString()); 
	                if (numeroComboBox == numeroDeseado) {
	                    comboBox.setSelectedIndex(i);
	                    return;
	                }
	            }
			}
		});
		calefaccion_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.idioma==true) {
					nomCal.setText("CALEFACCIÓN 6:");
				} else {
					nomCal.setText("BEROGAILU 6:");
				}
				
				int numeroDeseado = cal.get(5).getTempe();

	            for (int i = 0; i < comboBox.getItemCount(); i++) {
	                int numeroComboBox = Integer.valueOf(comboBox.getItemAt(i).toString()); 
	                if (numeroComboBox == numeroDeseado) {
	                    comboBox.setSelectedIndex(i);
	                    return;
	                }
	            }
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomCal.getText().equals("CALEFACCIONES:") || nomCal.getText().equals("BEROGAILUAK:")) {
					calefaccion_1.setBackground(Color.green);
					
					calefaccion_2.setBackground(Color.green);
					calefaccion_3.setBackground(Color.green);
					calefaccion_4.setBackground(Color.green);
					calefaccion_5.setBackground(Color.green);
					calefaccion_6.setBackground(Color.green);
					for(int i=0;i<cal.size();i++) {
						cal.get(i).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(i).setEncendido(true);
					}
					if(login.idioma==true) {
						JOptionPane.showMessageDialog(null, "Todas las calefacciones han cambiado sus temperaturas a "+comboBox.getSelectedItem().toString());
					} else {
						JOptionPane.showMessageDialog(null, "Berogailu guztien tenperatura igo da "+comboBox.getSelectedItem().toString()+" gradutara.");
					}
					
					logs.log.logCal("Todas las calefacciones han cambiado sus temperaturas a "+comboBox.getSelectedItem().toString());
				}
				
				if(nomCal.getText().equals("CALEFACCIÓN 1:") || nomCal.getText().equals("BEROGAILU 1:")) {
					if(calefaccion_1.getBackground().equals(Color.green)) {
						cal.get(0).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(0).setEncendido(true);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La temperatura de la calefaccion 1 ha sido cambiada a "+comboBox.getSelectedItem().toString());
						} else {
							JOptionPane.showMessageDialog(null, "1.Berogailuaren tenperatura igo da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La temperatura de la calefaccion 1 ha sido cambiada a "+comboBox.getSelectedItem().toString());
					} else {
						cal.get(0).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(0).setEncendido(true);
						calefaccion_1.setBackground(Color.green);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefaccion 1 ha sido encendida a "+comboBox.getSelectedItem().toString()+" grados");
						} else {
							JOptionPane.showMessageDialog(null, "1.Berogailuaren piztu da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La calefaccion 1 ha sido encendida a"+comboBox.getSelectedItem().toString()+" grados.");
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 2:") || nomCal.getText().equals("BEROGAILU 2:")) {
					if(calefaccion_2.getBackground().equals(Color.green)) {
						cal.get(1).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(1).setEncendido(true);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La temperatura de la calefaccion 2 ha sido cambiada a "+comboBox.getSelectedItem().toString());
						} else {
							JOptionPane.showMessageDialog(null, "2.Berogailuaren tenperatura igo da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La temperatura de la calefaccion 2 ha sido cambiada a "+comboBox.getSelectedItem().toString());
					} else {
						cal.get(1).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(1).setEncendido(true);
						calefaccion_2.setBackground(Color.green);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefaccion 2 ha sido encendida a "+comboBox.getSelectedItem().toString()+" grados");
						} else {
							JOptionPane.showMessageDialog(null, "2.Berogailuaren piztu da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La calefaccion 2 ha sido encendida a"+comboBox.getSelectedItem().toString()+" grados.");
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 3:") || nomCal.getText().equals("BEROGAILU 3:")) {
					if(calefaccion_3.getBackground().equals(Color.green)) {
						cal.get(2).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(2).setEncendido(true);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La temperatura de la calefaccion 3 ha sido cambiada a "+comboBox.getSelectedItem().toString());
						} else {
							JOptionPane.showMessageDialog(null, "3.Berogailuaren tenperatura igo da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La temperatura de la calefaccion 3 ha sido cambiada a "+comboBox.getSelectedItem().toString());
					} else {
						cal.get(2).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(2).setEncendido(true);
						calefaccion_3.setBackground(Color.green);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefaccion 3 ha sido encendida a "+comboBox.getSelectedItem().toString()+" grados");
						} else {
							JOptionPane.showMessageDialog(null, "3.Berogailuaren piztu da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La calefaccion 3 ha sido encendida a"+comboBox.getSelectedItem().toString()+" grados.");
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 4:") || nomCal.getText().equals("BEROGAILU 4:")) {
					if(calefaccion_4.getBackground().equals(Color.green)) {
						cal.get(3).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(3).setEncendido(true);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La temperatura de la calefaccion 4 ha sido cambiada a "+comboBox.getSelectedItem().toString());
						} else {
							JOptionPane.showMessageDialog(null, "4.Berogailuaren tenperatura igo da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La temperatura de la calefaccion 4 ha sido cambiada a "+comboBox.getSelectedItem().toString());
					} else {
						cal.get(3).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(3).setEncendido(true);
						calefaccion_4.setBackground(Color.green);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefaccion 4 ha sido encendida a "+comboBox.getSelectedItem().toString()+" grados");
						} else {
							JOptionPane.showMessageDialog(null, "4.Berogailuaren piztu da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La calefaccion 4 ha sido encendida a"+comboBox.getSelectedItem().toString()+" grados.");
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 5:") || nomCal.getText().equals("BEROGAILU 5:")) {
					if(calefaccion_5.getBackground().equals(Color.green)) {
						cal.get(4).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(4).setEncendido(true);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La temperatura de la calefaccion 5 ha sido cambiada a "+comboBox.getSelectedItem().toString());
						} else {
							JOptionPane.showMessageDialog(null, "5.Berogailuaren tenperatura igo da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La temperatura de la calefaccion 5 ha sido cambiada a "+comboBox.getSelectedItem().toString());
					} else {
						cal.get(4).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(4).setEncendido(true);
						calefaccion_5.setBackground(Color.green);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefaccion 5 ha sido encendida a "+comboBox.getSelectedItem().toString()+" grados");
						} else {
							JOptionPane.showMessageDialog(null, "5.Berogailuaren piztu da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La calefaccion 5 ha sido encendida a"+comboBox.getSelectedItem().toString()+" grados.");
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 6:") || nomCal.getText().equals("BEROGAILU 6:")) {
					if(calefaccion_6.getBackground().equals(Color.green)) {
						cal.get(5).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(5).setEncendido(true);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La temperatura de la calefaccion 6 ha sido cambiada a "+comboBox.getSelectedItem().toString());
						} else {
							JOptionPane.showMessageDialog(null, "6.Berogailuaren tenperatura igo da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La temperatura de la calefaccion 6 ha sido cambiada a "+comboBox.getSelectedItem().toString());
					} else {
						cal.get(5).setTempe(Integer.valueOf(comboBox.getSelectedItem().toString()));
						cal.get(5).setEncendido(true);
						calefaccion_6.setBackground(Color.green);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefaccion 6 ha sido encendida a "+comboBox.getSelectedItem().toString()+" grados");
						} else {
							JOptionPane.showMessageDialog(null, "6.Berogailuaren piztu da "+comboBox.getSelectedItem().toString()+" gradutara.");
						}
						logs.log.logCal("La calefaccion 6 ha sido encendida a"+comboBox.getSelectedItem().toString()+" grados.");
					}
				}
				try {
					FileOutputStream fos = new FileOutputStream ("./G3Domotica/calefacciones.dat", false);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					//idatzi fitxategian
					for (int i = 0; i < cal.size(); i++) {
						oos.writeObject(cal.get(i));
						
						System.out.println(cal.get(i));
					}
					//fitxategia itxi
					oos.close();
					
				} catch (IOException ioe) {
					// TODO Auto-generated catch block
					ioe.printStackTrace();
				}
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nomCal.getText().equals("CALEFACCIONES:") || nomCal.getText().equals("BEROGAILUAK:")) {
					calefaccion_1.setBackground(Color.red);
					
					calefaccion_2.setBackground(Color.red);
					calefaccion_3.setBackground(Color.red);
					calefaccion_4.setBackground(Color.red);
					calefaccion_5.setBackground(Color.red);
					calefaccion_6.setBackground(Color.red);
					for(int i=0;i<6;i++) {
						cal.get(i).setTempe(0);
						cal.get(i).setEncendido(false);
					}
					logs.log.logCal("Todas las calefacciones han sido apagadas.");
					if(login.idioma==true) {
						JOptionPane.showMessageDialog(null, "Todas las calefacciones han sido apagadas.");
					} else {
						JOptionPane.showMessageDialog(null, "Berogailu guztiak piztu dira.");
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 1:") || nomCal.getText().equals("BEROGAILU 1:")) {
					if(calefaccion_1.getBackground().equals(Color.green)) {
						cal.get(0).setTempe(0);
						cal.get(0).setEncendido(false);
						calefaccion_1.setBackground(Color.red);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción 1 ha sido apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "1.Berogailu piztu da.");
						}
						logs.log.logCal("La calefacción 1 ha sido apagada.");
					} else {
						cal.get(0).setTempe(0);
						cal.get(0).setEncendido(false);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción ya esta apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "Berogailu piztuta dago.");
						}
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 2:") || nomCal.getText().equals("BEROGAILU 2:")) {
					if(calefaccion_2.getBackground().equals(Color.green)) {
						cal.get(1).setTempe(0);
						cal.get(1).setEncendido(false);
						calefaccion_2.setBackground(Color.red);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción 2 ha sido apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "2.Berogailu piztu da.");
						}
						logs.log.logCal("La calefacción 2 ha sido apagada.");
					} else {
						cal.get(1).setTempe(0);
						cal.get(1).setEncendido(false);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción ya esta apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "Berogailu piztuta dago.");
						}
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 3:") || nomCal.getText().equals("BEROGAILU 3:")) {
					if(calefaccion_3.getBackground().equals(Color.green)) {
						cal.get(2).setTempe(0);
						cal.get(2).setEncendido(false);
						calefaccion_3.setBackground(Color.red);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción 3 ha sido apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "3.Berogailu piztu da.");
						}
						logs.log.logCal("La calefacción 3 ha sido apagada.");
					} else {
						cal.get(2).setTempe(0);
						cal.get(2).setEncendido(false);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción ya esta apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "Berogailu piztuta dago.");
						}
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 4:") || nomCal.getText().equals("BEROGAILU 4:")) {
					if(calefaccion_4.getBackground().equals(Color.green)) {
						cal.get(3).setTempe(0);
						cal.get(3).setEncendido(false);
						calefaccion_4.setBackground(Color.red);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción 4 ha sido apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "4.Berogailu piztu da.");
						}
						logs.log.logCal("La calefacción 4 ha sido apagada.");
					} else {
						cal.get(3).setTempe(0);
						cal.get(3).setEncendido(false);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción ya esta apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "Berogailu piztuta dago.");
						}
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 5:") || nomCal.getText().equals("BEROGAILU 5:")) {
					if(calefaccion_5.getBackground().equals(Color.green)) {
						cal.get(4).setTempe(0);
						cal.get(4).setEncendido(false);
						calefaccion_5.setBackground(Color.red);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción 5 ha sido apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "5.Berogailu piztu da.");
						}
						logs.log.logCal("La calefacción 5 ha sido apagada.");
					} else {
						cal.get(4).setTempe(0);
						cal.get(4).setEncendido(false);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción ya esta apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "Berogailu piztuta dago.");
						}
					}
				}
				if(nomCal.getText().equals("CALEFACCIÓN 6:") || nomCal.getText().equals("BEROGAILU 6:")) {
					if(calefaccion_6.getBackground().equals(Color.green)) {
						cal.get(5).setTempe(0);
						cal.get(5).setEncendido(false);
						calefaccion_6.setBackground(Color.red);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción 6 ha sido apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "6.Berogailu piztu da.");
						}
						logs.log.logCal("La calefacción 6 ha sido apagada.");
					} else {
						cal.get(5).setTempe(0);
						cal.get(5).setEncendido(false);
						if(login.idioma==true) {
							JOptionPane.showMessageDialog(null, "La calefacción ya esta apagada.");
						} else {
							JOptionPane.showMessageDialog(null, "Berogailu piztuta dago.");
						}
						
					}
				}
				try {
					FileOutputStream fos = new FileOutputStream ("./G3Domotica/calefacciones.dat", false);
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					//idatzi fitxategian
					for (int i = 0; i < cal.size(); i++) {
						oos.writeObject(cal.get(i));
						
						System.out.println(cal.get(i));
					}
					//fitxategia itxi
					oos.close();
					
				} catch (IOException ioe) {
					// TODO Auto-generated catch block
					ioe.printStackTrace();
				}
			}
			
		});
		
	}
}

package interfazVersionMelanie;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.image.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaDeJuego {

	private JFrame frame;
	private ImageIcon X;
	private ImageIcon O;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaDeJuego window = new PantallaDeJuego();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaDeJuego() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { //frame del fondo principal
		frame = new JFrame();
		frame.setBounds(680, 130, 600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.getContentPane().setBackground(Color.magenta); cambia color solido background
		frame.getContentPane().setLayout(null);
		
		
		X = new ImageIcon(PantallaDeJuego.class.getResource("/imagenesDelFondo/X.png"));
		O = new ImageIcon(PantallaDeJuego.class.getResource("/imagenesDelFondo/O.png"));
		
		JLabel panel1 = new JLabel("");
		panel1.setBounds(89, 170, 123, 124);	
		frame.getContentPane().add(panel1);
		panel1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel1.setIcon(X);
				panel1.setHorizontalAlignment(SwingConstants.CENTER);
				panel1.setHorizontalTextPosition(SwingConstants.CENTER);
				panel1.setVisible(true);
			}
		});
		
		JLabel panel5 = new JLabel("");
		panel5.setBounds(233, 313, 123, 124);
		frame.getContentPane().add(panel5);
		panel5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				panel5.setIcon(O);
				panel5.setHorizontalAlignment(SwingConstants.CENTER);
				panel5.setHorizontalTextPosition(SwingConstants.CENTER);
				panel5.setVisible(true);
			}
		});
		
		JLabel panel8 = new JLabel("");
		panel8.setBounds(233, 459, 123, 118);
		frame.getContentPane().add(panel8);
		panel8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				panel8.setIcon(X);
				panel8.setHorizontalAlignment(SwingConstants.CENTER);
				panel8.setHorizontalTextPosition(SwingConstants.CENTER);
				panel8.setVisible(true);
			}
		});
		
		JLabel Tablero = new JLabel(""); //TABLERO
		Tablero.setBounds(89, 170, 410, 410);
		Tablero.setIcon(new ImageIcon(interfazVersionMelanie.PantallaDeJuego.class.getResource("/imagenesDelFondo/layout1.png")));
		frame.getContentPane().add(Tablero);
		
		
	}
	
}

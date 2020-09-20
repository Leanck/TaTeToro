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

import control.Juego;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaDeJuego {

	private JFrame frame;
	
	

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
		Juego juego = new Juego();
		frame = new JFrame();
		frame.setBounds(680, 130, 600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.getContentPane().setBackground(Color.magenta); cambia color solido background
		frame.getContentPane().setLayout(null);
		
		
		
		
		JLabel Tablero = new JLabel(""); //TABLERO
		Tablero.setBounds(89, 170, 410, 410);
		Tablero.setIcon(new ImageIcon(interfazVersionMelanie.PantallaDeJuego.class.getResource("/imagenesDelFondo/layout1.png")));
		frame.getContentPane().add(Tablero);
		
		
		JLabel panel1 = new JLabel("");
		panel1.setBounds(89, 170, 123, 124);
		frame.getContentPane().add(panel1);
		
		
		panel1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel1.setIcon(juego.colocarSimbolo());
				juego.agregarJugada(1);
				panel1.setHorizontalAlignment(SwingConstants.CENTER);
				panel1.setHorizontalTextPosition(SwingConstants.CENTER);
				juego.jugadaGanadora();
				juego.cambiarTurno();
				
			}
		});
		
		
		
		
		JLabel panel2 = new JLabel("");
		panel2.setBounds(232, 170, 123, 124);
		frame.getContentPane().add(panel2);
		
		panel2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel2.setIcon(juego.colocarSimbolo());
				juego.agregarJugada(2);
				panel2.setHorizontalAlignment(SwingConstants.CENTER);
				panel2.setHorizontalTextPosition(SwingConstants.CENTER);
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		
		JLabel panel3 = new JLabel("");
		panel3.setBounds(376, 170, 123, 124);
		frame.getContentPane().add(panel3);
		
		panel3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel3.setIcon(juego.colocarSimbolo());
				juego.agregarJugada(3);
				panel3.setHorizontalAlignment(SwingConstants.CENTER);
				panel3.setHorizontalTextPosition(SwingConstants.CENTER);
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		
		JLabel panel4 = new JLabel("");
		panel4.setBounds(89, 314, 123, 124);
		frame.getContentPane().add(panel4);
		
		panel4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel4.setIcon(juego.colocarSimbolo());
				juego.agregarJugada(4);
				panel4.setHorizontalAlignment(SwingConstants.CENTER);
				panel4.setHorizontalTextPosition(SwingConstants.CENTER);
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		
		JLabel panel5 = new JLabel("");
		panel5.setBounds(232, 314, 123, 124);
		frame.getContentPane().add(panel5);
		
		panel5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel5.setIcon(juego.colocarSimbolo());
				juego.agregarJugada(5);
				panel5.setHorizontalAlignment(SwingConstants.CENTER);
				panel5.setHorizontalTextPosition(SwingConstants.CENTER);
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		
		JLabel panel6 = new JLabel("");
		panel6.setBounds(376, 314, 123, 124);
		frame.getContentPane().add(panel6);
		
		panel6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel6.setIcon(juego.colocarSimbolo());
				juego.agregarJugada(6);
				panel6.setHorizontalAlignment(SwingConstants.CENTER);
				panel6.setHorizontalTextPosition(SwingConstants.CENTER);
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		
		JLabel panel7 = new JLabel("");
		panel7.setBounds(89, 456, 123, 124);
		frame.getContentPane().add(panel7);
		
		panel7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel7.setIcon(juego.colocarSimbolo());
				juego.agregarJugada(7);
				panel7.setHorizontalAlignment(SwingConstants.CENTER);
				panel7.setHorizontalTextPosition(SwingConstants.CENTER);
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		
		JLabel panel8 = new JLabel("");
		panel8.setBounds(232, 456, 123, 124);
		frame.getContentPane().add(panel8);
		
		panel8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel8.setIcon(juego.colocarSimbolo());
				juego.agregarJugada(8);
				panel8.setHorizontalAlignment(SwingConstants.CENTER);
				panel8.setHorizontalTextPosition(SwingConstants.CENTER);
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		
		JLabel panel9 = new JLabel("");
		panel9.setBounds(376, 456, 123, 124);
		frame.getContentPane().add(panel9);
		
		panel9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//panel1.setIcon(new ImageIcon(PantallaPrincipal.class.getResource("/imagenesDelFondo/X.png")));
				panel9.setIcon(juego.colocarSimbolo());
				juego.agregarJugada(9);
				panel9.setHorizontalAlignment(SwingConstants.CENTER);
				panel9.setHorizontalTextPosition(SwingConstants.CENTER);
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		
		
	}
}

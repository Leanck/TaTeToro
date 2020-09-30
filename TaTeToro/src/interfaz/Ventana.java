package interfaz;

import java.awt.image.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;

import control.Juego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana {

	private JFrame frame;
	private JFrame frame2;
	private ImageIcon X;
	private ImageIcon O;
	private ImageIcon mesa;
	private boolean seleccionado1;
	private boolean seleccionado2;
	private boolean seleccionado3;
	private boolean seleccionado4;
	private boolean seleccionado5;
	private boolean seleccionado6;
	private boolean seleccionado7;
	private boolean seleccionado8;
	private boolean seleccionado9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
					
					Ventana gameOver = new Ventana();
					gameOver.frame2.setVisible(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();	
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { //frame del fondo principal
		Juego juego = new Juego();
		//ventana de fin de juego-------------------------
		frame2 = new JFrame();
		frame2.setBounds(680, 130, 600, 700);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		//Ventana de juego--------------------------------
		frame = new JFrame();
		seleccionado1 = false;
		frame.setBounds(680, 130, 600, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		X = new ImageIcon("recursos/X.png");
		O = new ImageIcon("recursos/O.png");
		mesa = new ImageIcon("recursos/layout1.png");
		
		JLabel Tablero = new JLabel(""); //TABLERO
		Tablero.setBounds(89, 170, 410, 410);
		Tablero.setIcon(mesa);
		frame.getContentPane().add(Tablero);
		
		
		JLabel panel1 = new JLabel("");
		panel1.setBounds(89, 170, 123, 124);
		frame.getContentPane().add(panel1);
		
		//-----------------------------------------------------------
			
		panel1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado1 == false) {
					if(juego.getTurno() == 'X') {
						panel1.setIcon(X);
					}
					else {
						panel1.setIcon(O);
					}
					juego.agregarJugada(1);
					if(juego.jugadaGanadora()) {
						habilitarVentana2();
					}
					juego.cambiarTurno();	
					seleccionado1 = true;
					}
				}	
		});
		
		//-----------------------------------------------------------
		JLabel panel2 = new JLabel("");
		panel2.setBounds(232, 170, 123, 124);
		frame.getContentPane().add(panel2);
		
		panel2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado2 == false) {
					if(juego.getTurno() == 'X') {
						panel2.setIcon(X);
					}
					else {
						panel2.setIcon(O);
					}
					juego.agregarJugada(2);
					if(juego.jugadaGanadora()) {
						habilitarVentana2();
					}
					juego.cambiarTurno();
					seleccionado2 = true;
				}
			}
		});
		//-----------------------------------------------------------
		JLabel panel3 = new JLabel("");
		panel3.setBounds(376, 170, 123, 124);
		frame.getContentPane().add(panel3);
		
		panel3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado3 == false) {
					if(juego.getTurno() == 'X') {
						panel3.setIcon(X);
					}
					else {
						panel3.setIcon(O);
					}
					juego.agregarJugada(3);
					if(juego.jugadaGanadora()) {
						habilitarVentana2();
					}
					juego.cambiarTurno();
					seleccionado3 = true;
					}
				}
		});
		//-----------------------------------------------------------
		JLabel panel4 = new JLabel("");
		panel4.setBounds(89, 314, 123, 124);
		frame.getContentPane().add(panel4);
		
		panel4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado4 == false) {
					if(juego.getTurno() == 'X') {
						panel4.setIcon(X);
					}
					else {
						panel4.setIcon(O);
					}
					juego.agregarJugada(4);
					if(juego.jugadaGanadora()) {
						habilitarVentana2();
					}
					juego.cambiarTurno();
					seleccionado4 = true;
					}
				}
		});
		//-----------------------------------------------------------
		JLabel panel5 = new JLabel("");
		panel5.setBounds(232, 314, 123, 124);
		frame.getContentPane().add(panel5);
		
		panel5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado5 == false) {
					if(juego.getTurno() == 'X') {
						panel5.setIcon(X);
					}
					else {
						panel5.setIcon(O);
					}
					juego.agregarJugada(5);
					if(juego.jugadaGanadora()) {
						habilitarVentana2();
					}
					juego.cambiarTurno();
					seleccionado5 = true;
					}
				}
				
		});
		//-----------------------------------------------------------
		JLabel panel6 = new JLabel("");
		panel6.setBounds(376, 314, 123, 124);
		frame.getContentPane().add(panel6);
		
		panel6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado6 == false) {
					if(juego.getTurno() == 'X') {
						panel6.setIcon(X);
					}
					else {
						panel6.setIcon(O);
					}
					juego.agregarJugada(6);
					if(juego.jugadaGanadora()) {
						habilitarVentana2();
					}
					juego.cambiarTurno();
					seleccionado6 = true;
				}
				
			}
		});
		//-----------------------------------------------------------
		JLabel panel7 = new JLabel("");
		panel7.setBounds(89, 456, 123, 124);
		frame.getContentPane().add(panel7);
		
		panel7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado7 == false) {
					if(juego.getTurno() == 'X') {
						panel7.setIcon(X);
					}
					else {
						panel7.setIcon(O);
					}
					juego.agregarJugada(7);
					if(juego.jugadaGanadora()) {
						habilitarVentana2();
					}
					juego.cambiarTurno();
					seleccionado7 = true;
				}	
			}
				
		});
		//-----------------------------------------------------------
		JLabel panel8 = new JLabel("");
		panel8.setBounds(232, 456, 123, 124);
		frame.getContentPane().add(panel8);
		
		panel8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado8 == false) {
					if(juego.getTurno() == 'X') {
						panel8.setIcon(X);
					}
					else {
						panel8.setIcon(O);
					}
					juego.agregarJugada(8);
					if(juego.jugadaGanadora()) {
						habilitarVentana2();
					}
					juego.cambiarTurno();
					seleccionado8 = true;
					}
				}
		});
		//-----------------------------------------------------------
		JLabel panel9 = new JLabel("");
		panel9.setBounds(376, 456, 123, 124);
		frame.getContentPane().add(panel9);
		
		panel9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado9 == false) {
					if(juego.getTurno() == 'X') {
						panel9.setIcon(X);
					}
					else {
						panel9.setIcon(O);
					}
					juego.agregarJugada(9);
					if(juego.jugadaGanadora()) {
						habilitarVentana2();
					}
					juego.cambiarTurno();
					seleccionado9 = true;
					}
				}
	    });
		//------------------------------------------------
		JButton Reiniciar = new JButton("REINICIAR");
		Reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					juego.vaciarJugadas();
					panel1.setIcon(null);
					panel2.setIcon(null);
					panel3.setIcon(null);
					panel4.setIcon(null);
					panel5.setIcon(null);
					panel6.setIcon(null);
					panel7.setIcon(null);
					panel8.setIcon(null);
					panel9.setIcon(null);	
					seleccionado1 = false;
					seleccionado2 = false;
					seleccionado3 = false;
					seleccionado4 = false;
					seleccionado5 = false;
					seleccionado6 = false;
					seleccionado7 = false;
					seleccionado8 = false;
					seleccionado9 = false;
					habilitarVentana1();
			}
			});
		Reiniciar.setFont(new Font("High Tower Text", Font.PLAIN, 15));
		Reiniciar.setBounds(231, 489, 120, 60);
		frame2.getContentPane().add(Reiniciar);
		//------------------------------------------------
	}
	public void habilitarVentana2() {
		frame2.setVisible(true);
		//frame.setVisible(false);
	}
	public void habilitarVentana1() {
		frame2.setVisible(false);
		frame.setVisible(true);
	}
}

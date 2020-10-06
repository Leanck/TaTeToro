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

	private final int ANCHO_VENTANA = 800;
	private final int ALTO_VENTANA = 600;
	private int ANCHO_PANTALLA;
	private int ALTO_PANTALLA;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
		initialize();	
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { //frame del fondo principal
		Juego juego = new Juego();
		Images images = new Images();
		//Ventana de juego--------------------------------
		frame = new JFrame();
		ANCHO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		ALTO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		frame.setBounds((ANCHO_PANTALLA/2)-(ANCHO_VENTANA/2), (ALTO_PANTALLA/2)-(ALTO_VENTANA/2), ANCHO_VENTANA, ALTO_VENTANA);
		//frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		//------------------------------------------------
		JButton boton_jugar = new JButton("Jugar");
		boton_jugar.setIcon(images.iniciar);
		boton_jugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registro r = new Registro(juego, images);
				r.setVisible(true);
				frame.setVisible(false);
			}
		});
		//------------------------------------------------
		boton_jugar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton_jugar.setBounds(315, 300, 160, 70);
		frame.getContentPane().add(boton_jugar);
		
		JButton boton_abandonar = new JButton("Abandonar");
		boton_abandonar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		boton_abandonar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton_abandonar.setBounds(315, 419, 160, 70);
		boton_abandonar.setIcon(images.abandonar2);
		frame.getContentPane().add(boton_abandonar);
		
		JLabel skin = new JLabel("");
		skin.setOpaque(true);
		skin.setBounds(0, 0, 800, 600);
		skin.setIcon(images.ventana);
		frame.getContentPane().add(skin);
		//------------------------------------------------
	}
}

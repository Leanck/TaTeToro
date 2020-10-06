package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Juego;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tablero extends JFrame {

	private final int ANCHO_VENTANA = 800;
	private final int ALTO_VENTANA = 600;
	private int ANCHO_PANTALLA;
	private int ALTO_PANTALLA;
	private JPanel contentPane;
	private Victoria victoria;
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
	/*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero frame = new Tablero();
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
	public Tablero(Juego juego, Images images) {
		//------------------------------------------------------
		victoria = new Victoria(juego, images);
		victoria.setVisible(false);
		//------------------------------------------------------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		ANCHO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		ALTO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setBounds((ANCHO_PANTALLA/2)-(ANCHO_VENTANA/2), (ALTO_PANTALLA/2)-(ALTO_VENTANA/2), ANCHO_VENTANA, ALTO_VENTANA);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tabla = new JLabel("");
		tabla.setBounds(207, 135, 372, 373);
		tabla.setIcon(images.tablero);
		contentPane.add(tabla);
		
		JLabel imagen_jugador_x = new JLabel("");
		imagen_jugador_x.setBorder(new LineBorder(Color.WHITE, 2));
		imagen_jugador_x.setBounds(47, 62, 150, 150);
		contentPane.add(imagen_jugador_x);
		if(images.imagen_jugador_x != null) {
			Icon portrait_x = new ImageIcon(images.imagen_jugador_x.getImage().getScaledInstance(imagen_jugador_x.getWidth(), imagen_jugador_x.getHeight(), Image.SCALE_DEFAULT));
			imagen_jugador_x.setIcon(portrait_x);
		}
		
		JLabel imagen_jugador_o = new JLabel("");
		imagen_jugador_o.setBorder(new LineBorder(Color.WHITE, 2));
		imagen_jugador_o.setBounds(590, 62, 150, 150);
		contentPane.add(imagen_jugador_o);
		if(images.imagen_jugador_o != null) {
			Icon portrait_o = new ImageIcon(images.imagen_jugador_o.getImage().getScaledInstance(imagen_jugador_o.getWidth(), imagen_jugador_o.getHeight(), Image.SCALE_DEFAULT));
			imagen_jugador_o.setIcon(portrait_o);
		}
			
		JLabel nombre_jugador_x = new JLabel(juego.getNombreJugadorX());
		nombre_jugador_x.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nombre_jugador_x.setBounds(47, 25, 150, 26);
		contentPane.add(nombre_jugador_x);
		
		JLabel nombre_jugador_o = new JLabel(juego.getNombreJugadorO());
		nombre_jugador_o.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nombre_jugador_o.setBounds(590, 25, 150, 26);
		contentPane.add(nombre_jugador_o);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(324, 40, 29, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(441, 40, 29, 52);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblNewLabel_2.setBounds(382, 57, 36, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(209, 135, 372, 372);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		//------------------------------------------------------------------------
		JLabel panel1 = new JLabel("");
		panel1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado1 == false) {
					if(juego.getTurno() == 'X') {
						panel1.setIcon(images.x);
					}
					else {
						panel1.setIcon(images.o);
					}
					juego.agregarJugada(1);
					if(juego.jugadaGanadora()) {
						cambiarVentana();
					}
					juego.cambiarTurno();	
					seleccionado1 = true;
					}
				}	
		});
		panel.add(panel1);
		//------------------------------------------------------------------------
		JLabel panel2 = new JLabel("");
		panel2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado2 == false) {
					if(juego.getTurno() == 'X') {
						panel2.setIcon(images.x);
					}
					else {
						panel2.setIcon(images.o);
					}
					juego.agregarJugada(2);
					if(juego.jugadaGanadora()) {
						cambiarVentana();
					}
					juego.cambiarTurno();	
					seleccionado2 = true;
					}
				}	
		});
		panel.add(panel2);
		//------------------------------------------------------------------------
		JLabel panel3 = new JLabel("");
		panel3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado3 == false) {
					if(juego.getTurno() == 'X') {
						panel3.setIcon(images.x);
					}
					else {
						panel3.setIcon(images.o);
					}
					juego.agregarJugada(3);
					if(juego.jugadaGanadora()) {
						cambiarVentana();
					}
					juego.cambiarTurno();	
					seleccionado3 = true;
					}
				}	
		});
		panel.add(panel3);
		//------------------------------------------------------------------------
		JLabel panel4 = new JLabel("");
		panel4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado4 == false) {
					if(juego.getTurno() == 'X') {
						panel4.setIcon(images.x);
					}
					else {
						panel4.setIcon(images.o);
					}
					juego.agregarJugada(4);
					if(juego.jugadaGanadora()) {
						cambiarVentana();
					}
					juego.cambiarTurno();	
					seleccionado4 = true;
					}
				}	
		});
		panel.add(panel4);
		//------------------------------------------------------------------------
		JLabel panel5 = new JLabel("");
		panel5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado5 == false) {
					if(juego.getTurno() == 'X') {
						panel5.setIcon(images.x);
					}
					else {
						panel5.setIcon(images.o);
					}
					juego.agregarJugada(5);
					if(juego.jugadaGanadora()) {
						cambiarVentana();
					}
					juego.cambiarTurno();	
					seleccionado5 = true;
					}
				}	
		});
		panel.add(panel5);
		//------------------------------------------------------------------------
		JLabel panel6 = new JLabel("");
		panel6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado6 == false) {
					if(juego.getTurno() == 'X') {
						panel6.setIcon(images.x);
					}
					else {
						panel6.setIcon(images.o);
					}
					juego.agregarJugada(6);
					if(juego.jugadaGanadora()) {
						cambiarVentana();
					}
					juego.cambiarTurno();	
					seleccionado6 = true;
					}
				}	
		});
		panel.add(panel6);
		//------------------------------------------------------------------------
		JLabel panel7 = new JLabel("");
		panel7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado7 == false) {
					if(juego.getTurno() == 'X') {
						panel7.setIcon(images.x);
					}
					else {
						panel7.setIcon(images.o);
					}
					juego.agregarJugada(7);
					if(juego.jugadaGanadora()) {
						cambiarVentana();
					}
					juego.cambiarTurno();	
					seleccionado7 = true;
					}
				}	
		});
		panel.add(panel7);
		//------------------------------------------------------------------------
		JLabel panel8 = new JLabel("");
		panel8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado8 == false) {
					if(juego.getTurno() == 'X') {
						panel8.setIcon(images.x);
					}
					else {
						panel8.setIcon(images.o);
					}
					juego.agregarJugada(8);
					if(juego.jugadaGanadora()) {
						cambiarVentana();
					}
					juego.cambiarTurno();	
					seleccionado8 = true;
					}
				}	
		});
		panel.add(panel8);
		//------------------------------------------------------------------------
		JLabel panel9 = new JLabel("");
		panel9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (Juego.isHabilitado() && seleccionado9 == false) {
					if(juego.getTurno() == 'X') {
						panel9.setIcon(images.x);
					}
					else {
						panel9.setIcon(images.o);
					}
					juego.agregarJugada(9);
					if(juego.jugadaGanadora()) {
						cambiarVentana();
					}
					juego.cambiarTurno();	
					seleccionado9 = true;
					}
				}	
		});
		panel.add(panel9);
		//------------------------------------------------------------------------
		
		JButton boton_abandonar = new JButton("New button");
		boton_abandonar.setIcon(images.abandonar);
		boton_abandonar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		boton_abandonar.setBounds(640, 489, 100, 40);
		
		contentPane.add(boton_abandonar);
		
		JLabel skin_principal = new JLabel("");
		skin_principal.setBounds(0, 0, 800, 600);
		skin_principal.setIcon(images.ventana);
		contentPane.add(skin_principal);
		
	}
	
	private void cambiarVentana() {
		System.out.println("hola");
		victoria.setVisible(true);
		//dispose();
	} 
}

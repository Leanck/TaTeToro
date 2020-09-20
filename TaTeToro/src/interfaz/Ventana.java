package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import control.Juego;

import java.awt.SystemColor;

public class Ventana {

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
	private void initialize() {
		Juego juego = new Juego();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel tablero = new JPanel();
		tablero.setBounds(165, 11, 250, 250);
		frame.getContentPane().add(tablero);
		tablero.setLayout(new GridLayout(3, 3, 0, 0));
		//------------------------------------------------------------------------
		//Primera fila------------------------------------------------------------
		JPanel primeraFila = new JPanel();
		primeraFila.setBackground(SystemColor.menu);
		tablero.add(primeraFila);
		primeraFila.setLayout(null);
		//------------------------------------------------------------------------
		JButton boton1 = new JButton("1");
		JButton boton2 = new JButton("2");
		JButton boton3 = new JButton("3");
		//------------------------------------------------------------------------
		boton1.setForeground(SystemColor.controlHighlight);
		boton2.setForeground(SystemColor.controlHighlight);
		boton3.setForeground(SystemColor.controlHighlight);
		//------------------------------------------------------------------------
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 60));
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 60));
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 60));
		//------------------------------------------------------------------------
		boton1.setBounds(0, 0, 83, 83);
		boton2.setBounds(83, 0, 83, 83);
		boton3.setBounds(166, 0, 83, 83);
		//------------------------------------------------------------------------
		primeraFila.add(boton1);
		primeraFila.add(boton2);
		primeraFila.add(boton3);
		//------------------------------------------------------------------------
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton1.setEnabled(false);
				juego.agregarJugada(boton1.getText().charAt(0));
				boton1.setText(juego.colocarSimboloDeJugador());
				juego.jugadaGanadora();
				juego.cambiarTurno();
				JOptionPane.showMessageDialog(null,"Hola ,soy un ventana!");
			}
		});
		//------------------------------------------------------------------------
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton2.setEnabled(false);
				juego.agregarJugada(boton2.getText().charAt(0));
				boton2.setText(juego.colocarSimboloDeJugador());
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		//------------------------------------------------------------------------
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton3.setEnabled(false);
				juego.agregarJugada(boton3.getText().charAt(0));
				boton3.setText(juego.colocarSimboloDeJugador());
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		//------------------------------------------------------------------------
		//Segunda fila------------------------------------------------------------
		JPanel segundaFila = new JPanel();
		tablero.add(segundaFila);
		segundaFila.setLayout(null);
		//------------------------------------------------------------------------
		JButton boton4 = new JButton("4");
		JButton boton5 = new JButton("5");
		JButton boton6 = new JButton("6");
		//------------------------------------------------------------------------
		boton4.setForeground(SystemColor.controlHighlight);
		boton5.setForeground(SystemColor.controlHighlight);
		boton6.setForeground(SystemColor.controlHighlight);
		//------------------------------------------------------------------------
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 60));
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 60));
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 60));
		//------------------------------------------------------------------------
		boton4.setBounds(0, 0, 83, 83);
		boton5.setBounds(83, 0, 83, 83);
		boton6.setBounds(166, 0, 83, 83);
		//------------------------------------------------------------------------
		segundaFila.add(boton4);
		segundaFila.add(boton5);
		segundaFila.add(boton6);
		//------------------------------------------------------------------------
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton4.setEnabled(false);
				juego.agregarJugada(boton4.getText().charAt(0));
				boton4.setText(juego.colocarSimboloDeJugador());
				juego.jugadaGanadora();
				juego.cambiarTurno();
				
			}
		});
		//------------------------------------------------------------------------
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton5.setEnabled(false);
				juego.agregarJugada(boton5.getText().charAt(0));
				boton5.setText(juego.colocarSimboloDeJugador());
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		//------------------------------------------------------------------------
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton6.setEnabled(false);
				juego.agregarJugada(boton6.getText().charAt(0));
				boton6.setText(juego.colocarSimboloDeJugador());
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		//------------------------------------------------------------------------
		//Tercera fila------------------------------------------------------------
		JPanel terceraFila = new JPanel();
		tablero.add(terceraFila);
		terceraFila.setLayout(null);
		//------------------------------------------------------------------------
		JButton boton8 = new JButton("8");
		JButton boton9 = new JButton("9");
		JButton boton7 = new JButton("7");
		//------------------------------------------------------------------------
		boton7.setForeground(SystemColor.controlHighlight);
		boton8.setForeground(SystemColor.controlHighlight);
		boton9.setForeground(SystemColor.controlHighlight);
		//------------------------------------------------------------------------
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 60));
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 60));
		boton9.setFont(new Font("Tahoma", Font.PLAIN, 60));
		//------------------------------------------------------------------------
		boton8.setBounds(83, 0, 83, 83);
		boton9.setBounds(166, 0, 83, 83);
		boton7.setBounds(0, 0, 83, 83);
		//------------------------------------------------------------------------
		terceraFila.add(boton8);
		terceraFila.add(boton9);
		terceraFila.add(boton7);
		//------------------------------------------------------------------------
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton8.setEnabled(false);
				juego.agregarJugada(boton8.getText().charAt(0));
				boton8.setText(juego.colocarSimboloDeJugador());
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		//------------------------------------------------------------------------
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton9.setEnabled(false);
				juego.agregarJugada(boton9.getText().charAt(0));
				boton9.setText(juego.colocarSimboloDeJugador());
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		//------------------------------------------------------------------------
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton7.setEnabled(false);
				juego.agregarJugada(boton7.getText().charAt(0));
				boton7.setText(juego.colocarSimboloDeJugador());
				juego.jugadaGanadora();
				juego.cambiarTurno();
			}
		});
		//------------------------------------------------------------------------
		//Reiniciar---------------------------------------------------------------
		JButton Reiniciar = new JButton("Reiniciar");
		Reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton1.setEnabled(true);boton1.setText("1");
				boton2.setEnabled(true);boton2.setText("2");
				boton3.setEnabled(true);boton3.setText("3");
				boton4.setEnabled(true);boton4.setText("4");
				boton5.setEnabled(true);boton5.setText("5");
				boton6.setEnabled(true);boton6.setText("6");
				boton7.setEnabled(true);boton7.setText("7");
				boton8.setEnabled(true);boton8.setText("8");
				boton9.setEnabled(true);boton9.setText("9");
				//juego.mostrarJugadas();
				juego.vaciarJugadas();
			}
		});
		Reiniciar.setBounds(32, 203, 89, 23);
		frame.getContentPane().add(Reiniciar);
		
		
	}
}

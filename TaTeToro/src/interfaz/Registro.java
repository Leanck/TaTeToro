package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import control.Juego;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

	private final int ANCHO_VENTANA = 800;
	private final int ALTO_VENTANA = 600;
	private int ANCHO_PANTALLA;
	private int ALTO_PANTALLA;
	private JPanel contentPane;
	private JTextField nombre_jugador_x;
	private JTextField nombre_jugador_o;
	public File file;
	public static JFileChooser fc = new JFileChooser();

	/**
	 * Launch the application.
	 */
	/*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro(juego);
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
	public Registro(Juego juego, Images images) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		
		ANCHO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		ALTO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setBounds((ANCHO_PANTALLA/2)-(ANCHO_VENTANA/2), (ALTO_PANTALLA/2)-(ALTO_VENTANA/2), ANCHO_VENTANA, ALTO_VENTANA);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imagen_jugador_x = new JLabel("");
		imagen_jugador_x.setBorder(new LineBorder(Color.WHITE, 3));
		imagen_jugador_x.setBounds(60, 67, 180, 180);
		contentPane.add(imagen_jugador_x);
		
		JLabel imagen_jugador_o = new JLabel("");
		imagen_jugador_o.setBorder(new LineBorder(Color.WHITE, 3));
		imagen_jugador_o.setBounds(60, 280, 180, 180);
		contentPane.add(imagen_jugador_o);
		
		JLabel mensaje_2 = new JLabel("Jugador X:");
		mensaje_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		mensaje_2.setBounds(250, 86, 89, 26);
		contentPane.add(mensaje_2);
		
		JLabel mensaje_3 = new JLabel("Jugador O:");
		mensaje_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		mensaje_3.setBounds(250, 293, 89, 26);
		contentPane.add(mensaje_3);
		
		nombre_jugador_x = new JTextField();
		nombre_jugador_x.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nombre_jugador_x.setBounds(250, 133, 195, 26);
		contentPane.add(nombre_jugador_x);
		nombre_jugador_x.setColumns(10);
		
		nombre_jugador_o = new JTextField();
		nombre_jugador_o.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nombre_jugador_o.setColumns(10);
		nombre_jugador_o.setBounds(250, 330, 195, 26);
		contentPane.add(nombre_jugador_o);
		
		JButton boton_guardar_x = new JButton("Guardar");
		boton_guardar_x.setFont(new Font("Tahoma", Font.PLAIN, 17));
		boton_guardar_x.setBounds(455, 126, 90, 40);
		boton_guardar_x.setIcon(images.guardar);
		contentPane.add(boton_guardar_x);
		
		JButton boton_guardar_o = new JButton("Guardar");
		boton_guardar_o.setFont(new Font("Tahoma", Font.PLAIN, 17));
		boton_guardar_o.setBounds(455, 323, 90, 40);
		boton_guardar_o.setIcon(images.guardar);
		contentPane.add(boton_guardar_o);
		
		JButton elegir_imagen_x = new JButton("Elegir imagen desde el ordenador");
		elegir_imagen_x.setFont(new Font("Tahoma", Font.PLAIN, 17));
		elegir_imagen_x.setBounds(555, 126, 160, 40);
		elegir_imagen_x.setIcon(images.elegir);
		contentPane.add(elegir_imagen_x);
		
		JButton elegir_imagen_o = new JButton("Elegir imagen desde el ordenador");
		elegir_imagen_o.setFont(new Font("Tahoma", Font.PLAIN, 17));
		elegir_imagen_o.setBounds(555, 323, 160, 40);
		elegir_imagen_o.setIcon(images.elegir);
		contentPane.add(elegir_imagen_o);
		
		JButton boton_comenzar = new JButton("Comenzar a jugar!");
		boton_comenzar.setEnabled(false);
		boton_comenzar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		boton_comenzar.setBounds(305, 476, 180, 40);
		boton_comenzar.setIcon(images.jugar);
		contentPane.add(boton_comenzar);
		
		JLabel mensaje_4 = new JLabel("Los jugadores no estan listos!");
		mensaje_4.setForeground(Color.RED);
		mensaje_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		mensaje_4.setBounds(228, 21, 344, 36);
		contentPane.add(mensaje_4);
		
		JButton boton_abandonar = new JButton("New button");
		boton_abandonar.setBounds(634, 479, 100, 40);
		boton_abandonar.setIcon(images.abandonar);
		contentPane.add(boton_abandonar);
		
		JLabel skin = new JLabel("");
		skin.setOpaque(true);
		skin.setBounds(0, 0, 800, 600);
		skin.setIcon(images.ventana);
		contentPane.add(skin);
		//----------------------------------------------------------------
		boton_guardar_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				juego.NombrarJugadorX(nombre_jugador_x.getText());
				if(!juego.getNombreJugadorX().isEmpty() && !juego.getNombreJugadorO().isEmpty()) {
					boton_comenzar.setEnabled(true);
					mensaje_4.setText("Los jugadores ya estan listos!");
					mensaje_4.setForeground(Color.BLUE);
				}
				boton_guardar_x.setEnabled(false);
				nombre_jugador_x.setEnabled(false);
			}
		});
		//----------------------------------------------------------------
		boton_guardar_o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				juego.NombrarJugadorO(nombre_jugador_o.getText());
				if(!juego.getNombreJugadorX().isEmpty() && !juego.getNombreJugadorO().isEmpty()) {
					boton_comenzar.setEnabled(true);
					mensaje_4.setText("Los jugadores ya estan listos!");
					mensaje_4.setForeground(Color.BLUE);
				}
				boton_guardar_o.setEnabled(false);
				nombre_jugador_o.setEnabled(false);
			}
		});
		//----------------------------------------------------------------
		elegir_imagen_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resultado;
				resultado = fc.showOpenDialog(null);
				
				if(fc.APPROVE_OPTION == resultado) {
					file = fc.getSelectedFile();
					try {
						images.setImagenJugadorX(file.toString());
						ImageIcon icon = new ImageIcon(file.toString());
						Icon icono = new ImageIcon(icon.getImage().getScaledInstance(imagen_jugador_x.getWidth(), imagen_jugador_x.getHeight(), Image.SCALE_DEFAULT));
						imagen_jugador_x.setText(null);
						imagen_jugador_x.setIcon(icono);
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "No se puede abrir el archivo");
					}
				}
			}
		});
		//----------------------------------------------------------------
		elegir_imagen_o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resultado;
				resultado = fc.showOpenDialog(null);
				
				if(fc.APPROVE_OPTION == resultado) {
					file = fc.getSelectedFile();
					try {
						images.setImagenJugadorO(file.toString());
						ImageIcon icon = new ImageIcon(file.toString());
						Icon icono = new ImageIcon(icon.getImage().getScaledInstance(imagen_jugador_o.getWidth(), imagen_jugador_o.getHeight(), Image.SCALE_DEFAULT));
						imagen_jugador_o.setText(null);
						imagen_jugador_o.setIcon(icono);
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "No se puede abrir el archivo");
					}
				}
			}
		});
		//----------------------------------------------------------------
		boton_comenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tablero t = new Tablero(juego, images);
				t.setVisible(true);
				//contentPane.setVisible(false);
				dispose();
			}
		});
		//----------------------------------------------------------------
		boton_abandonar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
}

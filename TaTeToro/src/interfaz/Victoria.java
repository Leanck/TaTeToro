package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Juego;

public class Victoria extends JFrame {

	private final int ANCHO_VENTANA = 400;
	private final int ALTO_VENTANA = 300;
	private int ANCHO_PANTALLA;
	private int ALTO_PANTALLA;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*/
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Victoria frame = new Victoria();
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
	public Victoria(Juego juego, Images images) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ANCHO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
		ALTO_PANTALLA = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
		setBounds((ANCHO_PANTALLA/2)-(ANCHO_VENTANA/2), (ALTO_PANTALLA/2)-(ALTO_VENTANA/2), ANCHO_VENTANA, ALTO_VENTANA);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}

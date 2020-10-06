package interfaz;

import javax.swing.ImageIcon;

public class Images {
	
	public ImageIcon x;
	public ImageIcon o;
	public ImageIcon tablero;
	public ImageIcon ventana;
	public ImageIcon nobody;
	public ImageIcon guardar;
	public ImageIcon abandonar;
	public ImageIcon abandonar2;
	public ImageIcon elegir;
	public ImageIcon jugar;
	public ImageIcon iniciar;
	public ImageIcon imagen_jugador_x;
	public ImageIcon imagen_jugador_o;
	
	public Images() {
		x = new ImageIcon("recursos/X.png");
		o = new ImageIcon("recursos/O.png");
		tablero = new ImageIcon("recursos/tablero_madera.png");
		ventana = new ImageIcon("recursos/ventana_madera.png");
		nobody = new ImageIcon("recursos/nobody.png");
		guardar = new ImageIcon("recursos/boton_guardar.png");
		abandonar = new ImageIcon("recursos/boton_abandonar.png");	
		abandonar2 = new ImageIcon("recursos/boton_abandonar2.png");	
		elegir = new ImageIcon("recursos/boton_elegir.png");	
		jugar = new ImageIcon("recursos/boton_jugar.png");	
		iniciar = new ImageIcon("recursos/boton_iniciar.png");	
		
	}
	public void setImagenJugadorX(String path) {
		imagen_jugador_x = new ImageIcon(path);
	}
	public void setImagenJugadorO(String path) {
		imagen_jugador_o = new ImageIcon(path);
	}

}

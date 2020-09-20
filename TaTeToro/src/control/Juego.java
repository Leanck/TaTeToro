package control;

import java.awt.Color;
import java.util.Random;

public class Juego {
	private char turno;
	private char[][] tablero;
	private boolean habilitado;
	
	public Juego() {
		turno = 'X';
		habilitado = true;
		tablero = new char[3][3];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				tablero[i][j]= ' '; 
				
			}
			
		}
		tablero[0][0]='1';
		tablero[0][1]='2';
		tablero[0][2]='3';
		tablero[1][0]='4';
		tablero[1][1]='5';
		tablero[1][2]='6';
		tablero[2][0]='7';
		tablero[2][1]='8';
		tablero[2][2]='9';
		}
	//-----------------------------------------------------------
	public void cambiarTurno() {
		if(turno == 'X') {
			turno = 'O';
			System.out.println(habilitado);
		}
		else {
			turno = 'X';
			System.out.println(habilitado);
		}
	}
	//-----------------------------------------------------------
	public String colocarSimboloDeJugador() {
		if(turno == 'X') {
			return "X";
		}
		else {
			return "O";
		}
		
	}
	//-----------------------------------------------------------
	public Color colorDeJugador() {
		if(turno == 'X') {
			return Color.RED;
		}
		else {
			return Color.BLUE;
		}
	}
	//-----------------------------------------------------------
	public void agregarJugada(char txt) {
		if(txt=='1' && habilitado==true) {
			if(turno == 'X') {
				tablero[0][0] = 'X';
			}
			else {
				tablero[0][0] = 'O';
			}
		}
		if(txt=='2' && habilitado==true) {
			if(turno == 'X') {
				tablero[0][1] = 'X';
			}
			else {
				tablero[0][1] = 'O';
			}
		}
		if(txt=='3' && habilitado==true) {
			if(turno == 'X') {
				tablero[0][2] = 'X';
			}
			else {
				tablero[0][2] = 'O';
			}
		}
		if(txt=='4' && habilitado==true) {
			if(turno == 'X') {
				tablero[1][0] = 'X';
			}
			else {
				tablero[1][0] = 'O';
			}
		}
		if(txt=='5' && habilitado==true) {
			if(turno == 'X') {
				tablero[1][1] = 'X';
			}
			else {
				tablero[1][1] = 'O';
			}
		}
		if(txt=='6' && habilitado==true) {
			if(turno == 'X') {
				tablero[1][2] = 'X';
			}
			else {
				tablero[1][2] = 'X';
			}
		}
		if(txt=='7' && habilitado==true) {
			if(turno == 'X') {
				tablero[2][0] = 'X';
			}
			else {
				tablero[2][0] = 'O';
			}
		}
		if(txt=='8' && habilitado==true) {
			if(turno == 'X') {
				tablero[2][1] = 'X';
			}
			else {
				tablero[2][1] = 'O';
			}
		}
		if(txt=='9' && habilitado==true) {
			if(turno == 'X') {
				tablero[2][2] = 'X';
			}
			else {
				tablero[2][2] = 'O';
			}
		}
	}
	//-----------------------------------------------------------
	public void jugadaGanadora() {
		if ( tablero[0][0]==tablero[0][1]&& tablero[0][1]==tablero[0][2]||
			 tablero[1][0]==tablero[1][1]&& tablero[1][1]==tablero[1][2]||
			 tablero[2][0]==tablero[2][1]&& tablero[2][1]==tablero[2][2]||
			 tablero[0][0]==tablero[1][1]&& tablero[1][1]==tablero[2][2]||
			 tablero[0][2]==tablero[1][1]&& tablero[1][1]==tablero[2][0]||
			 tablero[0][0]==tablero[1][0]&& tablero[1][0]==tablero[2][0]||
			 tablero[0][1]==tablero[1][1]&& tablero[1][1]==tablero[2][1]||
			 tablero[0][2]==tablero[1][2]&& tablero[1][2]==tablero[2][2]||
			 tablero[0][1]==tablero[1][2]&& tablero[1][2]==tablero[2][0]||
			 tablero[0][0]==tablero[1][2]&& tablero[1][2]==tablero[2][1]||
			 tablero[0][1]==tablero[1][0]&& tablero[1][0]==tablero[2][2]||
			 tablero[0][2]==tablero[1][0]&& tablero[1][0]==tablero[2][1] )
			 
		 {
			if(turno == 'X') {
				System.out.println("gano X");
				habilitado=false;
			}
			else {
				System.out.println("gano O");
				habilitado=false;
			}
		}
	}	
	
	//-----------------------------------------------------------
	public void vaciarJugadas() {
		tablero[0][0] = '1';
		tablero[0][1] = '2';
		tablero[0][2] = '3';
		tablero[1][0] = '4';
		tablero[1][1] = '5';
		tablero[1][2] = '6';
		tablero[2][0] = '7';
		tablero[2][1] = '8';
		tablero[2][2] = '9';
		habilitado=true;
	}

}

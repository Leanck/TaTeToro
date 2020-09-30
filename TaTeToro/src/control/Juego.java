package control;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;

import interfaz.Ventana;

public class Juego {
	private static char turno;
	private char[][] tablero;
	private static boolean habilitado;
	
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
	public void agregarJugada(int num) {
		if(num==1 && habilitado==true) {
			if(turno == 'X') {
				tablero[0][0] = 'X';	
			}
			else {
				tablero[0][0] = 'O';
			}
		}
		if(num==2 && habilitado==true) {
			if(turno == 'X') {
				tablero[0][1] = 'X';
			}
			else {
				tablero[0][1] = 'O';
			}
		}
		if(num==3 && habilitado==true) {
			if(turno == 'X') {
				tablero[0][2] = 'X';
			}
			else {
				tablero[0][2] = 'O';
			}
		}
		if(num==4 && habilitado==true) {
			if(turno == 'X') {
				tablero[1][0] = 'X';
			}
			else {
				tablero[1][0] = 'O';
			}
		}
		if(num==5 && habilitado==true) {
			if(turno == 'X') {
				tablero[1][1] = 'X';
			}
			else {
				tablero[1][1] = 'O';
			}
		}
		if(num==6 && habilitado==true) {
			if(turno == 'X') {
				tablero[1][2] = 'X';
			}
			else {
				tablero[1][2] = 'X';
			}
		}
		if(num==7 && habilitado==true) {
			if(turno == 'X') {
				tablero[2][0] = 'X';
			}
			else {
				tablero[2][0] = 'O';
			}
		}
		if(num==8 && habilitado==true) {
			if(turno == 'X') {
				tablero[2][1] = 'X';
			}
			else {
				tablero[2][1] = 'O';
			}
		}
		if(num==9 && habilitado==true) {
			if(turno == 'X') {
				tablero[2][2] = 'X';
			}
			else {
				tablero[2][2] = 'O';
			}
		}
	}
	//-----------------------------------------------------------
	public boolean listaGanadoras() 
    {
        if(tablero[0][0]==tablero[0][1]&& tablero[0][1]==tablero[0][2] ||
           tablero[1][0]==tablero[1][1]&& tablero[1][1]==tablero[1][2] ||
           tablero[2][0]==tablero[2][1]&& tablero[2][1]==tablero[2][2] ||
           tablero[0][0]==tablero[1][1]&& tablero[1][1]==tablero[2][2] ||
           tablero[0][2]==tablero[1][1]&& tablero[1][1]==tablero[2][0] ||
           tablero[0][0]==tablero[1][0]&& tablero[1][0]==tablero[2][0] ||
           tablero[0][1]==tablero[1][1]&& tablero[1][1]==tablero[2][1] ||
           tablero[0][2]==tablero[1][2]&& tablero[1][2]==tablero[2][2] ||
           tablero[0][1]==tablero[1][2]&& tablero[1][2]==tablero[2][0] ||
           tablero[0][0]==tablero[1][2]&& tablero[1][2]==tablero[2][1] ||
           tablero[0][1]==tablero[1][0]&& tablero[1][0]==tablero[2][2] ||
           tablero[0][2]==tablero[1][0]&& tablero[1][0]==tablero[2][1] ) 
        {
            return true;
        }

        else
        {
            return false;
        }
    }
	
	public boolean jugadaGanadora() {
        if (listaGanadoras()) 
        {
            return true;
        }
        else 
        {
            return false;
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
	
	public char getTurno() {
		return turno;
	}
	
	public static boolean isHabilitado() {
		return habilitado;
	}
	
	

	
}

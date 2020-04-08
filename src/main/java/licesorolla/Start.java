package main.java.licesorolla;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Baraja baraja = new Baraja();
		Tablero tablero = new Tablero();
		tablero.repartir(baraja.sacarCartas(54),54);
		baraja.barajaVacia();
		tablero.mostrar();
		
		
	}
	
	public static int moverColumna(String texto) {
		int numero = 0;
		boolean comprobar = false;
		
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println(texto);
			comprobar = teclado.hasNextInt();
			
			if(comprobar) {
				
				numero = teclado.nextInt();
				if(numero < 0) {
					comprobar = false;
				}
			}
		}while(!comprobar);
		return numero;
	}

}

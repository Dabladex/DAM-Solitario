package main.java.licesorolla;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Baraja baraja = new Baraja();
		Tablero tablero = new Tablero();
		ArrayList<String> palos = new ArrayList<>();
		int contador = 0;
		int columnaInicial = 0;
		int columnaDestino = 0;
		int cantidadMover = 0;
		
		for(int i = 8; i > 0; i--) {
			
			palos.add("-");
		}

		
		 tablero.repartir(baraja.sacarCartas(54), 54); baraja.barajaVacia();
		 tablero.mostrar(palos);
		

		
		  do {
		  
		  if
		  (sacarNuevaCarta("¿Desea sacar nuevas cartas del mazo").equalsIgnoreCase("SI"
		  )) { tablero.repartir(baraja.sacarCartas(10), 10); baraja.barajaVacia();
		  tablero.mostrar(palos); }
		  
		  columnaInicial = pedirEnteros("¿De que columna quieres mover?") - 1;
		  
		  columnaDestino = pedirEnteros("¿A que columna la quieres mover?") - 1;
		  
		  cantidadMover = pedirEnteros("¿Cuantas cartas?");
		  
		  tablero.moverCarta(columnaInicial, columnaDestino, cantidadMover);
		  baraja.barajaVacia();
		  tablero.mostrar(palos);
		  
		  contador++;
		  
		  } while (contador < 900);
		 

		
	}

	public static String sacarNuevaCarta(String texto) {

		boolean comprobar = false;
		String palabra = "";

		do {

			Scanner sc = new Scanner(System.in);
			System.out.println(texto);

			comprobar = sc.hasNextInt();

			if (!comprobar) {

				palabra = sc.nextLine();
			}

		} while (comprobar);

		return palabra;

	}

	public static int pedirEnteros(String texto) {
		int numero = 0;
		boolean comprobar = false;

		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println(texto);
			comprobar = teclado.hasNextInt();

			if (comprobar) {

				numero = teclado.nextInt();
				if (numero < 0) {
					comprobar = false;
				}
			}
		} while (!comprobar);
		return numero;
	}

}

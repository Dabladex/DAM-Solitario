package main.java.licesorolla;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		
		  Baraja baraja = new Baraja(); Tablero tablero = new Tablero(); int contador =
		  0; int columnaInicial = 0; int columnaDestino = 0; int cantidadMover = 0;
		  
		  tablero.repartir(baraja.sacarCartas(54), 54); baraja.barajaVacia();
		  tablero.mostrar();
		 
		  do {
		  
		  if
		  (sacarNuevaCarta("¿Desea sacar nuevas cartas del mazo").equalsIgnoreCase("SI"
		  )) { tablero.repartir(baraja.sacarCartas(10), 10); baraja.barajaVacia();
		  tablero.mostrar(); }
		  
		  columnaInicial = pedirEnteros("¿De que columna quieres mover?");
		  
		  columnaDestino = pedirEnteros("¿A que columna la quieres mover?");
		  
		  cantidadMover = pedirEnteros("¿Cuantas cartas?");
		  
		  tablero.moverCarta(columnaInicial, columnaDestino, cantidadMover);
		  baraja.barajaVacia(); tablero.mostrar();
		  
		  contador++;
		  
		  } while (contador < 20);
		 

		/*boolean palo = false;
		ArrayList<Integer> cartas = new ArrayList();

		cartas.add(2);
		cartas.add(3);

		for (int i = 13; i > 0; i--) {

			cartas.add(i);

		}
		
		int ultCarta = cartas.get(cartas.size()-1);
		for (int i = 1; i < 13; i++) {
			
			if(ultCarta + 1 == cartas.get(cartas.size()-i)) {
				
				System.out.println("bien");
				
			}

			
		}*/


	}

	public static String sacarNuevaCarta(String texto) {
		Scanner sc = new Scanner(System.in);
		System.out.println(texto);

		return sc.nextLine();

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

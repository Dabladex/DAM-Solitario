package main.java.licesorolla;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		
		Baraja baraja = new Baraja();
		Tablero tablero = new Tablero();
		tablero.repartir(baraja.sacarCartas(54),54);
		baraja.barajaVacia();
		tablero.mostrar();
		
	}

}

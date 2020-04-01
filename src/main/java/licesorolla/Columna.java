package main.java.licesorolla;

import java.util.ArrayList;

public class Columna {

	private ArrayList<Carta> cartas = new ArrayList<Carta>();

	public Columna() {

	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public void agregarCarta(Carta carta) {

		cartas.add(carta);

	}

	/*public void mostrarCartas() {

			System.out.println(cartas.get().getValorCarta() + " * ");

	}*/

}

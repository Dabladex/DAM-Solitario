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

	public boolean boltearCarta(int posicion) {

		if (cartas.indexOf(cartas.get(posicion)) == cartas.size() - 1) {

			cartas.get(posicion).setBolteada(true);

		}

		return cartas.get(posicion).isBolteada();
	}

	public void mostrarCartas(int posicion, int posicion2) {

		int contador = 0;

		if (posicion < cartas.size()) {

			if (boltearCarta(posicion)) {

				if (posicion2 == 9) {

					System.out.println("-"+cartas.get(posicion).getValorCarta());

				} else {

					System.out.print("-"+cartas.get(posicion).getValorCarta() + " * ");

				}

			} else {
				
				if (posicion2 == 9) {

					System.out.println("--");

				} else {

					System.out.print("--" + " * ");

				}

			}

		}else {

			if (posicion2 == 9) {

				System.out.println("()");

			} else {

				System.out.print("()" + " * ");

			}

		}

	}

}

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

	public int ultimaCarta() {

		return cartas.get(cartas.size() - 1).getValorCarta();
	}

	public void borrarCarta(int posicion) {

		cartas.remove(posicion);

	}

	public boolean boltearCarta(int posicion) {

		if (cartas.indexOf(cartas.get(posicion)) == cartas.size() - 1) {

			cartas.get(posicion).setBolteada(true);

		}

		return cartas.get(posicion).isBolteada();
	}

	public Carta sacarCarta(int pos) {

		return cartas.get(cartas.size() - pos);

	}

	public boolean movimientoPosible(int cantidad) {
		boolean mover = true;
		int i = 1;

		while ((mover) && (i < cantidad)) {

			if (cartas.get(cartas.size() - i).isBolteada()) {

				if (cartas.get(cartas.size() - i - 1).getValorCarta() - 1 == cartas.get(cartas.size() - i)
						.getValorCarta()) {

				}

			} else {

				mover = false;
			}

			i++;
		}

		if (!cartas.get(cartas.size() - i).isBolteada()) {

			mover = false;
		}

		return mover;
	}

	public void mostrarCartas(int posicion, int posicion2) {

		int contador = 0;

		if (posicion < cartas.size()) {

			if (boltearCarta(posicion)) {

				if (cartas.get(posicion).getValorCarta() < 10) {

					if (posicion2 == 9) {

						System.out.println("-" + cartas.get(posicion).getValorCarta());

					} else {

						System.out.print("-" + cartas.get(posicion).getValorCarta() + " * ");

					}

				} else {

					if (posicion2 == 9) {

						System.out.println(cartas.get(posicion).getValorCarta());

					} else {

						System.out.print(cartas.get(posicion).getValorCarta() + " * ");

					}

				}

			} else {

				if (posicion2 == 9) {

					System.out.println("--");

				} else {

					System.out.print("--" + " * ");

				}

			}

		} else {

			if (posicion2 == 9) {

				System.out.println("()");

			} else {

				System.out.print("()" + " * ");

			}

		}

	}

}

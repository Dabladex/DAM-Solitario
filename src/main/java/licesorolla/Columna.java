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

	public void boltearCarta(int posicion) {

		if (posicion == cartas.size() - 1) {

			cartas.get(posicion).setBolteada(true);

		}

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

	public boolean paloCompleto() {
		boolean palo = true;
		int i = 1;

		if (cartas.size() >= 13) {

			while (i < 13) {

				if (cartas.get(cartas.size() - i).isBolteada()) {

					if (cartas.get(cartas.size() - i - 1).getValorCarta() - 1 == cartas.get(cartas.size() - i)
							.getValorCarta()) {

					}

				} else {

					palo = false;
				}

				i++;
			}

			if (!cartas.get(cartas.size() - i).isBolteada()) {

				palo = false;
			}

		}else {
			
			palo = false;
			
		}
		
		return palo;
	}

	public void mostrarCartas(int posicion, int posicion2) {

		int contador = 0;

		if (posicion < cartas.size()) {

			if (posicion2 == 9) {

				System.out.println(cartas.get(posicion).toString());
			} else {

				System.out.print(cartas.get(posicion).toString());
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

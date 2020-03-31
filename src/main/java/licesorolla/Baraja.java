package main.java.licesorolla;

import java.util.ArrayList;

public class Baraja {
	
	private ArrayList<Carta> baraja = new ArrayList<Carta>();
	
	public Baraja() {
		generarBaraja();
		barajar();
	}

	public ArrayList<Carta> getBaraja() {
		return baraja;
	}

	public void setBaraja(ArrayList<Carta> baraja) {
		this.baraja = baraja;
	}


	private void generarBaraja() {

		for (int i = 0; i < 8; i++) {
			for (numeroCarta num : numeroCarta.values()) {
				baraja.add(new Carta(num));
			}
		}

	}
	
	private void barajar() {
		
		ArrayList<Carta> barajaOr = new ArrayList();
		int numeroAle = 0;
		while(baraja.size()!=0) {

			numeroAle = (int) (Math.random() * baraja.size());
			barajaOr.add(baraja.get(numeroAle));
			baraja.remove(numeroAle);

		}
		
		while(barajaOr.size()!=0) {
			baraja.add(barajaOr.get(0));
			barajaOr.remove(0);

		}

	}
	
public static void mostrar(ArrayList<Carta> baraja) {
		
		
		for(int i = 0; i < baraja.size(); i++) {
			
			System.out.println(baraja.get(i).getValorCarta());
		}
		
	}

}

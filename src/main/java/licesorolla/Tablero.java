package main.java.licesorolla;

import java.util.ArrayList;

public class Tablero {

	private ArrayList<Columna> columnas = new ArrayList<Columna>();

	public Tablero() {

		crearColumnas();

	}

	public ArrayList<Columna> getColumnas() {
		return columnas;
	}

	public void setColumnas(ArrayList<Columna> columnas) {
		this.columnas = columnas;
	}

	public void crearColumnas() {

		for (int i = 0; i < 10; i++) {

			columnas.add(new Columna());
		}

	}
	
	public void repartir(ArrayList<Carta> primerasCartas) {

		for (int i = 0; i < 54; i++) {
			int columna =  i % 10;
			columnas.get(columna).agregarCarta(primerasCartas.get(i));

		}
	}
	
/*public void mostrar() {
		
		for(int i = 0; i < columnas.size(); i++) {
			
			columnas.get(i).mostrarCartas();
			
		}
		
	}*/

}

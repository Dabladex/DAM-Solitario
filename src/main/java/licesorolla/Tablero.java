package main.java.licesorolla;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Columna> tablero = new ArrayList<Columna>();

	public Tablero(ArrayList<Columna> columnas) {
		this.tablero = columnas;
	}

	public ArrayList<Columna> getColumnas() {
		return tablero;
	}

	public void setColumnas(ArrayList<Columna> columnas) {
		this.tablero = columnas;
	}
	
	

}

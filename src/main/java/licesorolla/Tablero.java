package main.java.licesorolla;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Columna> tablero = new ArrayList<Columna>();

	public Tablero() {
		crearColumnas();
	}

	public ArrayList<Columna> getColumnas() {
		return tablero;
	}

	public void setColumnas(ArrayList<Columna> columnas) {
		this.tablero = columnas;
	}
	
	private void crearColumnas() {
		
		for(int i = 0; i < 10; i++) {
			
			tablero.add(new Columna());
		}
		
	}

}

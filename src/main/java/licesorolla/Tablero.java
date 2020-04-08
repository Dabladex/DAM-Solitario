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

	public void repartir(ArrayList<Carta> primerasCartas, int cantidad) {

		for (int i = 0; i < cantidad; i++) {
			int columna = i % 10;
			columnas.get(columna).agregarCarta(primerasCartas.get(i));

		}
	}

	public void mostrar() {


		for (int i = 0; i < columnaMasGrande(); i++) {
			
			for(int j = 0; j < columnas.size();j++) {
				
				columnas.get(j).mostrarCartas(i,j);
				
			}
			
		}

	}
	public int columnaMasGrande() {
		int max=0;

		for (int i = 0; i < columnas.size(); i++) {
			
			if(max < columnas.get(i).getCartas().size()){
				
				max = columnas.get(i).getCartas().size();
			}
			
		}
		return max;
	}
	
	
	public void moverCarta(int columnaIni, int columnaDes, int cantidad) {
		
		
		while(cantidad > 0){
			
			columnas.get(columnaDes).agregarCarta(columnas.get(columnaIni).sacarCarta(cantidad));
			columnas.get(columnaIni).borrarCarta(columnas.get(columnaIni).getCartas().size()-cantidad);
			cantidad--;
		}
		
	}
	

}

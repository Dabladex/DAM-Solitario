package main.java.licesorolla;

public class Carta {
	//Falta poner toString
	private numeroCarta num;
	private int valorCarta;
	private boolean bolteada;
	
	public Carta(numeroCarta num) {
		this.num = num;
		this.bolteada = false;
		valorCarta();
	}

	public numeroCarta getNum() {
		return num;
	}

	public void setNum(numeroCarta num) {
		this.num = num;
	}

	public int getValorCarta() {
		return valorCarta;
	}

	public void setValorCarta(int valorCarta) {
		this.valorCarta = valorCarta;
	}
	
	public boolean isBolteada() {
		return bolteada;
	}

	public void setBolteada(boolean bolteada) {
		this.bolteada = bolteada;
	}

	public void valorCarta() {

		switch (num) {

		case uno:

			this.valorCarta = 1;

			break;
			
		case dos:

			this.valorCarta = 2;

			break;

		case tres:

			this.valorCarta = 3;
			
			break;
			
		case cuatro:

			this.valorCarta = 4;

			break;
		case cinco:

			this.valorCarta = 5;

			break;

		case seis:

			this.valorCarta = 6;

			break;
			
		case siete:

			this.valorCarta = 7;

			break;
		case ocho:

			this.valorCarta = 8;

			break;
		case nueve:

			this.valorCarta = 9;

			break;
		case diez:

			this.valorCarta = 10;

			break;
			
		case J:

			this.valorCarta = 11;

			break;
			
		case Q:

			this.valorCarta = 12;

			break;
			
		case K:

			this.valorCarta = 13;

			break;

		}
		
	}

}

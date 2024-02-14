package model;

public class EntiteReservable {
	private CalendrierAnnuel calendrier;
	private int numero;
	public EntiteReservable(int numero) {
		super();
		calendrier = new CalendrierAnnuel();
		this.numero = numero;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}

package model;

public class ReservationRestaurant extends Reservation {
	private int jour;
	private int mois;
	private int nb_service;
	private int nb_table;
	public ReservationRestaurant(int jour, int mois, int nb_service, int nb_table) {
		super();
		this.jour= jour;
		this.mois=mois;
		this.nb_service = nb_service;
		this.nb_table = nb_table;
	}
	public String toString() {
		if (nb_service==1) {
			return "Le "+jour+"/"+mois+"\nTable "+nb_table+" pour le premier service.";
		}
		return "Le "+jour+"/"+mois+"\nTable "+nb_table+" pour le deuxieme service.";
	}
	
}

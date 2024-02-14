package model;

public class ReservationSpectacle extends Reservation {
	private int jour;
	private int mois;
	private int nb_zone;
	private int nb_chaise;
	public ReservationSpectacle(int jour, int mois, int nb_zone, int nb_chaise) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.nb_zone = nb_zone;
		this.nb_chaise = nb_chaise;
	}
	public String toString() {
		return "Le "+jour+"/"+mois+"\n Zone no"+nb_zone+" au chaise no"+nb_chaise+".";
	}
}

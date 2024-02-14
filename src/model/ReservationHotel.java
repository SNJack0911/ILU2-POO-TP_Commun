package model;

public class ReservationHotel extends Reservation {
	private int jour;
	private int mois;
	private int nb_lit_simple;
	private int nb_lit_double;
	private int nb_chambre;
	public ReservationHotel(int jour, int mois, int nb_lit_simple, int nb_lit_double, int nb_chambre) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.nb_lit_simple = nb_lit_simple;
		this.nb_lit_double = nb_lit_double;
		this.nb_chambre = nb_chambre;
	}
	public String toString() {
		return "Le "+jour+"/"+mois+"\n Chambre no"+nb_chambre+" avec "+nb_lit_simple+" lit simple et "+nb_lit_double+" nb lit double.";
	}
	
	
}

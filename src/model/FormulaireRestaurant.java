package model;

public class FormulaireRestaurant extends Formulaire {
	private int jour;
	private int mois;
	private int nb_personne;
	private int nb_service;
	private int identificationEntite;
	public FormulaireRestaurant(int jour, int mois, int nb_personne, int nb_service) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.nb_personne = nb_personne;
		this.nb_service = nb_service;
		this.identificationEntite=0;
	}
	public int getJour() {
		return jour;
	}
	public int getMois() {
		return mois;
	}
	public int getNumService() {
		return nb_service;
	}
	public int getNombrePersonnes() {
		return nb_personne;
	}
	public int getIdentificationEntite() {
		return identificationEntite;
	}
	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}
	
	
	
	
}

package model;

public class CalendrierAnnuel {

	private String[] nom = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Aout","Septembre","Octobre","Novembre","Decembre"}; 
	private int[] taille= {31,28,31,30,31,30,31,31,30,31,30,31};
	private Mois[] calendrier= new Mois[12];
	public CalendrierAnnuel() {
		calendrier[0]= new Mois(nom[0],taille[0]);
		calendrier[1]= new Mois(nom[1],taille[1]);
		calendrier[2]= new Mois(nom[2],taille[2]);
		calendrier[3]= new Mois(nom[3],taille[3]);
		calendrier[4]= new Mois(nom[4],taille[4]);
		calendrier[5]= new Mois(nom[5],taille[5]);
		calendrier[6]= new Mois(nom[6],taille[6]);
		calendrier[7]= new Mois(nom[7],taille[7]);
		calendrier[8]= new Mois(nom[8],taille[8]);
		calendrier[9]= new Mois(nom[9],taille[9]);
		calendrier[10]= new Mois(nom[10],taille[10]);
		calendrier[11]= new Mois(nom[11],taille[11]);
	}
	public boolean estLibre(int jour,int mois) {
		return calendrier[mois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour,int mois) {
		boolean libre =  calendrier[mois-1].estLibre(jour);
		if(libre) {
			calendrier[mois-1].reserver(jour);
		}
		return libre;
	}
	
//////////////////////Classe Interne ///////////////////////
	private static class Mois{
		private String nom;
		private boolean[] jours;
		public Mois(String nom, int nbjours) {
			this.nom= nom;
			jours= new boolean[nbjours];
			for (int i =0;i<nbjours;i++) {
				jours[i]=true;
			}
		}
		private boolean estLibre(int jour){
			return jours[jour-1];
		}
		private void reserver(int jour){
			System.out.println(estLibre(jour));
			if (!estLibre(jour)) {
				throw new IllegalStateException("Date is already reserved");
			}else {
				jours[jour-1]=false;
			}
		}
		
	}
}

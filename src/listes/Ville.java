package listes;

import java.util.Objects;

/**
 * 
 */
public class Ville {
	private String nom;
	private int nbHabitants;
	
	/**
	 * 
	 */
	public Ville(){
		this.nom = null;
		this.nbHabitants = 0;
		
	}
	/**
	 * 
	 * @param nom
	 * @param habitants
	 * @param continent
	 */
	public Ville(String nom, int habitants){
		this.nom = nom;
		this.nbHabitants = habitants;
		
	}
	//
	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}
	/**
	 * 
	 * @param nbHabitants
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	public String toString() {
		return this.nom+" "+this.nbHabitants;
	}
	/**
	 * 
	 */
	@Override
	public boolean equals(Object object) {
		
		if(!(object instanceof Ville)) {
			return false;
		}
		Ville autre = (Ville)object;
		return Objects.equals(this.nom, autre.getNom()) && Objects.equals(this.nbHabitants, autre.getNbHabitants());
	}
}

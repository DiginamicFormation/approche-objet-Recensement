package fr.diginamic.jdr.classe;
//
//import fr.diginamic.jdr.classe.Creature;
import fr.diginamic.jdr.classe.tirageAleatoire;
//
public class Gobelin extends Creature{
	//
	private int force;
	private int pv;
	//
	public Gobelin(){
		//force entre 5 et 10=D6+4, pv entre 10 et 15=D10+9
		super(0,0);
		tirageAleatoire ta = new tirageAleatoire();
		this.force = (ta.D6()+4);
		ta = new tirageAleatoire();
		this.pv = (ta.D6()+9);
	}
	//
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}
	//
	public String toString() {
		return "Gobelin: \n force: "+this.force+" pv: "+this.pv;
	}
}

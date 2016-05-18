package mcs.type;

public class OP implements DTYPE {

	private DTYPE retour;
	private DTYPE droite;
	
	public int getTaille() {
		return retour.getTaille();
	}

	public DTYPE getRetour(){
		return retour;
	}
	
	public DTYPE getDroite(){
		return droite;
	}
	
	public String getNom() {
		return "operateur";
	}

	public OP(DTYPE t,DTYPE l){
		retour = t;
		droite = l;
	}
	
	public boolean compareTo(DTYPE autre) {
		return false;
	}
}

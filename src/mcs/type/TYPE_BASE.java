package mcs.type;

public class TYPE_BASE implements DTYPE {

	private int taille;
	private String nom;
	
	public int getTaille() {
		return taille;
	}

	@Override
	public String getNom() {
		return nom;
	}

	public TYPE_BASE(int t, String n){
		taille = t;
		nom = n;
	}
	
	@Override
	public boolean compareTo(DTYPE autre) {
		// TODO Auto-generated method stub
		return false;
	}

}

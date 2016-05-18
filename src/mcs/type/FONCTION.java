package mcs.type;

public class FONCTION implements DTYPE {

	private DTYPE retour;
	private LCHAMPS lchamps;
	
	public int getTaille() {
		return retour.getTaille();
	}

	public DTYPE getRetour(){
		return retour;
	}
	
	public LCHAMPS getChamps(){
		return lchamps;
	}
	
	public String getNom() {
		return "fonction";
	}

	public FONCTION(DTYPE t,LCHAMPS l){
		retour = t;
		lchamps = l;
	}
	
	public FONCTION(){
		super();
	}
	
	public boolean compareTo(DTYPE autre) {
		return false;
	}

	public LTYPES getTypes() {
		LTYPES lt = new LTYPES();
		for (CHAMP c : lchamps){
			lt.add(c.getType());
		}
		return lt;
	}
}

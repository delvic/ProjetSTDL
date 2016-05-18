package mcs.type;

public class STRUCT implements DTYPE {

	private LCHAMPS champs;
	
	public int getTaille() {
		return champs.getTaille();
	}

	public String getNom() {
		return "struct";
	}
	
	public LCHAMPS getChamps(){
		return champs;
	}

	public STRUCT(){
		super();
	}
	
	public STRUCT(LCHAMPS l){
		champs = l;
	}
	
	public boolean compareTo(DTYPE autre) {
		return false;
	}

	public LTYPES getTypes() {
		LTYPES lt = new LTYPES();
		for (CHAMP c : champs){
			lt.add(c.getType());
		}
		return lt;
	}
}

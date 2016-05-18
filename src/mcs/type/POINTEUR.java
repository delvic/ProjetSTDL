package mcs.type;

public class POINTEUR implements DTYPE {

    private DTYPE type;
	
	public int getTaille() {
		return 1;
	}

	public String getNom() {
		return "pointeur";
	}
	
	public DTYPE getTypePointe(){
		return type;
	}
	
	public POINTEUR(DTYPE t){
		type = t;
	}
	
    public POINTEUR(){
    	super();
    }
	
	public boolean compareTo(DTYPE autre) {
		// TODO Auto-generated method stub
		return false;
	}

}

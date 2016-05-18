package mcs.type;

public class CHAMP {
  private int dep;
  private String nom;
  private DTYPE type;
  
  public int getDep() {
	return dep;
  }

  public String getNom() {
	return nom;
  }
  
  public DTYPE getType() {
	return type;
  }

  public CHAMP(int d,String n,DTYPE t){
	  dep = d;
	  nom = n;
	  type = t;
  }
  
  
}

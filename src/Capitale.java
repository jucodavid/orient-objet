
class Capitale extends Ville {
	private String monument;
	
	public Capitale(){
		super();
		monument ="aucun";
	}
	
	public Capitale(String nom, int hab, String pays, String monument){
		super(nom, hab, pays);
		this.monument = monument;
	}
	
	//ACCESSEURS
	
	public String getMonument(){
		return monument;
	}
	
	//MUTATEURS
	
	public void setMonument(String pMonument){
		monument = pMonument;
	}
	
	public String description(){
		String str = super.description() + "\n \t ==> " + this.monument + " en est un monument";
		return str;
	}

	public String toString(){
		  String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
		  return str;
		  }

}

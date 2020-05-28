
public class Ville {
	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char catégorie;
	public static int nbreInstances = 0;
	protected static int nbreInstancesBis = 0;
	
	public Ville(){
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
		this.setCatégorie();
		nbreInstances++;
		nbreInstancesBis++;
	}
	
	public Ville(String pNom, int pNbre, String pPays) throws NombreHabitantException, NomVilleException {

		System.out.println("Création d'une ville : " +pNom+ " ...");
		System.out.println("Paramétrée !");

		if(pNbre < 0)
			throw new NombreHabitantException(pNbre);
		if(pNom.length() < 3)
			throw new NomVilleException("Le nom de la ville est invalide ! nom = "+pNom);
		else {
			nomVille = pNom;
			nomPays = pPays;
			nbreHabitants = pNbre;
			this.setCatégorie();
			nbreInstances++;
			nbreInstancesBis++;
		}

	}
	
	//ACCESSEURS
	
	public String getNom() {
		return nomVille;
	}
	
	public String getPays() {
		return nomPays;
	}
	
	public int getNbreHabitants() {
		return nbreHabitants;
	}
	
	public char getCatégorie() {
		return catégorie;
	}
	
	public static int getNbreInstancesBis() {
		return nbreInstancesBis;
	}

	//MUTATEURS
	
	public void setNom(String pNom) {
		nomVille = pNom;
	}
	
	public void setPays(String pPays) {
		nomPays = pPays;
	}
	
	public void setHabitants(int pNbre) {
		nbreHabitants = pNbre;
		this.setCatégorie();
	}
	
	//CATÉGORISATEUR
	
	private void  setCatégorie() {
		int bornesSupérieures[] = {0, 1_000, 10_000, 100_000, 500_000, 1_000_000, 5_000_000, 10_000_000};
		char catégories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		int i = 0;
		while(i < bornesSupérieures.length && this.nbreHabitants > bornesSupérieures[i])
			i++;
		
		this.catégorie = catégories[i];
	}
	
	//DESCRIPTIONNEUR
	
	public String description() {
		return this.nomVille+" est une ville de "+this.nomPays+", elle compte : "+this.nbreHabitants+" habitant(s). Elle est donc de catégorie : "+this.catégorie;
	}
	
	//COMPARATEUR
	
	public String comparer(Ville v1) {
		String str = new String();
		
		if (v1.getNbreHabitants() > this.nbreHabitants)
			str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;
		else
			str = this.nomVille+" est une ville plus peuplée que "+v1.getNom();
		return str;
	}

	public String toString(){
		return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "+this.nbreHabitants+" => elle est donc de catégorie : "+this.catégorie;
	}
	
}

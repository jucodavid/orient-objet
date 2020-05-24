
public class MaPremièreClasse {

	public static void main(String[] args) {
		Ville v0 = new Ville();
		Ville v1 = new Ville("LLN", 1_000_000_000, "Belgique");
		Ville v2 = new Ville("Ottignies", 12, "Belgiouique");
		
		System.out.println("\nv0 = "+v0.getNom()+" ville de "+v0.getNbreHabitants()+" Habitants située en "+v0.getPays());
		System.out.println("v1 = "+v1.getNom()+" ville de "+v1.getNbreHabitants()+" Habitants située en "+v1.getPays());
		System.out.println("v2 = "+v2.getNom()+" ville de "+v2.getNbreHabitants()+" Habitants située en "+v2.getPays()+"\n");
		
		System.out.println("Interchangation ...");
		Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		System.out.println("\nv1 = "+v1.getNom()+" ville de "+v1.getNbreHabitants()+" Habitants située en "+v1.getPays());
		System.out.println("v2 = "+v2.getNom()+" ville de "+v2.getNbreHabitants()+" Habitants située en "+v2.getPays()+"\n");
		
		System.out.println("Interchangation des noms ...");
		Ville temp1 = new Ville();
		temp1.setNom(v1.getNom());
		v1.setNom(v2.getNom());
		v2.setNom(temp1.getNom());
		System.out.println("\nv1 = "+v1.getNom()+" ville de "+v1.getNbreHabitants()+" Habitants située en "+v1.getPays());
		System.out.println("v2 = "+v2.getNom()+" ville de "+v2.getNbreHabitants()+" Habitants située en "+v2.getPays()+"\n");
		
		System.out.println("Description ...");
		System.out.println("\n"+v0.description());
		System.out.println(v1.description());
		System.out.println(v2.description()+"\n");
		
		System.out.println("Comparaison ...");
		System.out.println("\n"+v0.comparer(v1));
		System.out.println(v1.comparer(v2));
		System.out.println(v2.comparer(v0)+"\n");
		
		System.out.println(" Le nombre de villes créées est : "+Ville.nbreInstances);
		Capitale cap1 = new Capitale();
		Capitale cap2 = new Capitale("Bruxelles", 100_520_42, "Belgique", "l'Atominum");
		Ville[] tableau = new Ville[6];
		String[] tab = {"Wavre", "Ottignies", "LLN", "Gembloux", "Villers", "Knoek"};
		int[] tab2 = {1234, 5421, 89562, 78554, 68521, 99856};
		
		System.out.println("\n" + cap1.description());
		System.out.println("\n" + cap2.description()+"\n");
		
		for(int i = 0; i < 6; i++){
			if(i < 3) {
				Ville V = new Ville(tab[i], tab2[i], "Belgique");
				tableau[i] = V;
			}
			else{
			Capitale C = new Capitale(tab[i], tab2[i], "Belgique", "La friterie du coin");
			tableau[i] = C;
			}
		}
		
		for(Object obj : tableau)
			System.out.println(obj.toString()+"\n");
	}

}

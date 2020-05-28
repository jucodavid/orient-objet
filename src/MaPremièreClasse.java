
public class MaPremièreClasse {

	public static void main(String[] args) {
		Ville v = null;
		try {
		v = new Ville("LLN", -12000, "Belgique");
		} catch (NombreHabitantException | NomVilleException e2) {
			System.out.println(e2.getMessage());
		} finally {
			if(v== null)
				v= new Ville();
		}
		System.out.println(v.toString());
	}
}

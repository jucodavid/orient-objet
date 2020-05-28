
public class NombreHabitantException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2733578609378650049L;

	public NombreHabitantException() {
		System.out.println("Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !");
	}
	public NombreHabitantException(int nbre) {
		System.out.println("Instanciation avec un nombre d'habitants négatif.");
		System.out.println("\t => " +nbre);
	}
}

package projet;

public class BateauHorsZone {

	public BateauHorsZone (int x, int y, String nomBateau) {
		
		System.out.println("l'élément x ou y de " +  nomBateau + " est hors limite");
		System.out.println("\tx => " + x + "\n\ty => " + y);
	}

	public BateauHorsZone (String  nomBateau) {
		 System.out.println("Le beateau " +  nomBateau + " est hors zone");
	}

}
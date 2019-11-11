package projet;


public class Plateau {
	
	//  Attributs
	
	private int nbLig;
	private int nbCol;
	private char [][] plateau;
	
	//  Constructeur
	
	public Plateau(int l, int c) {
		nbLig = l;
		nbCol = c;
		plateau = new char[nbLig][nbCol];
		
		for(int i=0; i<nbLig; i++) {
			for(int j=0; j<nbCol; j++) {
				plateau[i][j] = 'x';
			}
		}
	}
	
	//  Methode
	
	public void afficheSeparateur(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ---");
		}
		System.out.println();
	}
	
	public void afficherConsole() {
		System.out.println("Touché coulé explose");
		System.out.println();
		afficheSeparateur(nbCol);
		for(int i=0; i<nbLig; i++) {
			for(int j=0; j<nbCol; j++) {
				System.out.print(" | " + plateau[i][j]);
			
			}
			System.out.println(" | ");
			afficheSeparateur(nbCol);
		}
	}

}

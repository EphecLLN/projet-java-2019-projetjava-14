package projet;
import java.util.Random;

/**
 * @author Leveau Arnaud
 * 
 */

public class Plateau {
	
	//  Attributs
	
	private Bateau [] listeBateaux;
	private int nbLig;
	private int nbCol;
	private char [][] plateau;
	public String joueur;
	
	//  Constructeur par défaut
	
	public Plateau() {
		nbLig = 0;
		nbCol = 0;
		plateau = new char[nbLig][nbCol];
		
		for(int x=0; x<nbLig; x++) {
			for(int y=0; y<nbCol; y++) {
				plateau[x][y] = 'x';
			}
		}
	}
	
	//  Constructeur avec paramètres
	
	/**
     * Crée le plateau
     * 
     * @param l , le nombre de lignes
     * @param c , le nombre de colonnes
     */
	
	public Plateau(String joueur, int l, int c) {
		this.joueur = joueur ;
		nbLig = l;
		nbCol = c;
		plateau = new char[nbLig][nbCol];
		// Initialisation des bateaux
	    
		listeBateaux = new Bateau[4];
		
		for(int x=0; x<nbLig; x++) {
			for(int y=0; y<nbCol; y++) {
				
				plateau[x][y] = 'x';
			}
		}
	}
	
	public Bateau[] getListeBateaux() {
		return listeBateaux;
	}

	public void setListeBateaux(Bateau[] listeBateaux) {
		this.listeBateaux = listeBateaux;
	}

	
	//  Methode
	/**
     * Crée le spérateur entre chaque ligne
     * 
     * @param n, nombre de lignes
     */
	
	public void afficheSeparateur(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ---");
		}
		System.out.println();
	}
	
	
	
	/**
     * Affiche en console le plateau
     * 
     *
     */
	
	public void afficherConsole() {
		System.out.println("Touché coulé explose");
		System.out.println();
		afficheSeparateur(nbCol);
		for(int x=0; x<nbLig; x++) {
			for(int y=0; y<nbCol; y++) {
				System.out.print(" | " + plateau[x][y]);
			
			}
			System.out.println(" | ");
			afficheSeparateur(nbCol);
		}
	}
	
	
	public char[][] getPlateau() {
		return plateau;
	}

	public void setPlateau(char[][] plateau) {
		this.plateau = plateau;
	}

	public String getJoueur() {
		return joueur;
	}

	public void setJoueur(String joueur) {
		this.joueur = joueur;
	}

	/**
     * Ajoute un bateau en horizontale et mAj le plateau en console
     * 
     * @param x , la position x de départ du bateau
     * @param y , la position y de départ du bateau
     * @param t , le type de bateau ( taille de celui-ci)
     */
	
	
	public void placerHori(int bx, int by, Bateau b) {
		
		int x  = bx+1;
		int y = by+1;
		
		// si le bateau se trouve sur le grille
		if (bx<0 || by<0 || bx>nbCol || by>nbLig) {
			System.out.println("Erreur le plateau est hors zone de jeu !");
			return;
		}
		// teste si cellule est vide
		for(int i=0; i < b.getPointsVie(); i++ ) {
			if(plateau[by][bx+i]!='x') {
				System.out.println("Erreur un bateau se trouve en ( "+ x +  " ,  " + y + ") ");
				return;
			}
		}
		for(int i=0; i < b.getPointsVie(); i++ ) {
			plateau[by][bx+i] = 'B';
			//afficherConsole();
		}
		
		System.out.println("le Bateau a bien été placé horizontalement en ("+ x + " , " + y +")");
	}
	
	/**
     	* Ajoute un bateau en horizontale et mAj le plateau en console
     * 
     * @param x , la position x de départ du bateau
     * @param y , la position y de départ du bateau
     * @param t , le type de bateau ( taille de celui-ci)
     */
	
		public void placerVerti(int bx, int by, Bateau b) {
		
		int x  = bx+1;
		int y = by+1;
			
		// si le bateau se trouve sur le grille
		if (bx<0 || by<0 || bx>nbCol || by>nbLig) {
			System.out.println("Erreur le plateau est hors zone de jeu !");
			return;
		}
		// teste si cellule est vide
		for(int i=0; i < b.getPointsVie(); i++ ) {
			if(plateau[by+i][bx]!='x') {
				System.out.println("Erreur un bateau se trouve en ( "+ x +  " ,  " + y + ") ");
				return;
			}
		}
		for(int i=0; i < b.getPointsVie(); i++ ) {
			plateau[by+i][bx] = 'B';
			//afficherConsole();
		}
		
		System.out.println("le Bateau a bien été placé verticalement en ("+ x + " , " + y +")");
	}
	
		public void placerBateau(int coordx, int coordy, Bateau bateau, String orientation) {
		
			int x = coordx-1;
			int y = coordy-1;
		
			switch(orientation) {
			case "h" : 
				placerHori(x, y, bateau);
				break;
			case "v" : 
				placerVerti(x, y, bateau);
				break;
			default : 
				
		
			}
		}
}

package projet;
import java.util.Random;

public class Plateau {
	
	//  Attributs
	
	private int nbLig;
	private int nbCol;
	private char [][] plateau;
	
	//  Constructeur
	
	/**
     * Crée le plateau
     * 
     * @param l , le nombre de lignes
     * @param c , le nombre de colonnes
     */
	
	public Plateau(int l, int c) {
		nbLig = l;
		nbCol = c;
		plateau = new char[nbLig][nbCol];
		
		for(int x=0; x<nbLig; x++) {
			for(int y=0; y<nbCol; y++) {
				plateau[x][y] = 'x';
			}
		}
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
	
	
	/**
     * Ajoute un bateau en horizontale et mAj le plateau en console
     * 
     * @param x , la position x de départ du bateau
     * @param y , la position y de départ du bateau
     * @param t , le type de bateau ( taille de celui-ci)
     */
	
	public void placerHori(int x, int y, int t) {
		x = x-1;
		y = y-1;
		
		
		// si le bateau se trouve sur le grille
		if (x<0 || y<0 || x>nbCol || y>nbLig) {
			System.out.print("Erreur le plateau est hors zone de jeu !");
			return;
		}
		// teste si cellule est vide
		for(int i=0; i<t; i++ ) {
			if(plateau[x][y+i]!='x') {
				System.out.print("Erreur un bateau se trouve déja à cet endroit !");
				return;
			}
		}
		for(int i=0; i<t; i++ ) {
			plateau[x][y+i] = 'B';
			afficherConsole();
		}
	}
	
	/**
     * Ajoute un bateau en horizontale et mAj le plateau en console
     * 
     * @param x , la position x de départ du bateau
     * @param y , la position y de départ du bateau
     * @param t , le type de bateau ( taille de celui-ci)
     */
	
	public void placerVerti(int x, int y, int t) {
		x = x-1;
		y = y-1;
		
		
		// si le bateau se trouve sur le grille
		if (x<0 || y<0 || x>nbCol || y>nbLig) {
			System.out.print("Erreur le plateau est hors zone de jeu !");
			return;
		}
		// teste si cellule est vide
		for(int i=0; i<t; i++ ) {
			if(plateau[x+i][y]!='x') {
				System.out.print("Erreur un bateau se trouve déja à cet endroit !");
				return;
			}
		}
		for(int i=0; i<t; i++ ) {
			plateau[x+i][y] = 'B';
			afficherConsole();
		}
	}
	

}

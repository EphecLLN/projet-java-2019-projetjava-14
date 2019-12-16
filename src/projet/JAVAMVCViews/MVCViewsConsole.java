package projet.JAVAMVCViews;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import projet.JavaMVCControllers.MVCControllers;
import projet.JavaMVCControllers.Plateau;


public class MVCViewsConsole extends Plateau {
		
	//  Methode
	/**
     * Cr�� le sp�parateur entre chaque ligne
     * 
     * @param n, nombre de lignes
     */
	public static void afficheSeparateur(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ���");
		}
		System.out.println();
	}
	public static void afficheSeparateurHaut() {
		System.out.println("   ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
	}
	public static void afficheSeparateur() {
			System.out.println("   ├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
	}
	public static void afficheSeparateurBas(int n) {
		
		System.out.println((n<9)? "   ├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤": "   └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘" );
		
	}
	
	public static void numeroCase(int  n) {
		for (int i = 0; i <n; i++) {
			System.out.print("  " + (i + 1) + " ");
		}
		System.out.println();
	}
	
	public static String sep(int  n, int y) {

		return (n<9)?" | ":(y==0)?"| ":" | ";
	}
	
	static void afficherConsole(Plateau plateau) {
		System.out.println("Touché coulé explosé");
		System.out.println();
		numeroCase(nbCol);
		afficheSeparateurHaut();
		for(int x=0; x<nbLig; x++) {
			System.out.print((x+1) + " ");
			for(int y=0; y<nbCol; y++) {
				System.out.print(sep(x,y) + plateau.getPlateau()[x][y]);
			
			}
			System.out.println(" |");
			afficheSeparateurBas(x);
		}
	}
	
	
	
	/**
     * Ajoute un bateau en horizontale et mAj le plateau en console
     * 
     * @param x , la position x de départ du bateau
     * @param y , la position y de départ du bateau
     * @param t , le type de bateau ( taille de celui-ci)
     */
	
	
	public static void placerHori(int bx, int by, MVCControllers b, Plateau plateau) {
		
		int x  = bx+1;
		int y = by+1;
		
		// si le bateau se trouve sur le grille
		if (bx<0 || by<0 || bx>nbCol || by>nbLig) {
			System.out.println("Erreur le plateau est hors zone de jeu !");
			return;
		}
		// teste si cellule est vide
		for(int i=0; i < b.getPointsVie(); i++ ) {
			if(plateau.getPlateau()[by][bx+i]!='x') {
				System.out.println("Erreur un bateau se trouve en ( "+ x +  " ,  " + y + ") ");
				return;
			}
		}
		for(int i=0; i < b.getPointsVie(); i++ ) {
			plateau.getPlateau()[by][bx+i] = 'B';
			afficherConsole(plateau);
		}
		
		System.out.println("le Bateau "+ b.nomBateau +" a bien été placé horizontalement en ("+ x + " , " + y +")");
	}
	
	/**
     	* Ajoute un bateau en horizontale et mAj le plateau en console
     * 
     * @param x , la position x de d�part du bateau
     * @param y , la position y de d�part du bateau
     * @param t , le type de bateau ( taille de celui-ci)
     */
	
		public static void placerVerti(int bx, int by, MVCControllers b, Plateau plateau) {
		
		int x  = bx+1;
		int y = by+1;
			
		// si le bateau se trouve sur le grille
		if (bx<0 || by<0 || bx>nbCol || by>nbLig) {
			System.out.println("Erreur le plateau est hors zone de jeu !");
			return;
		}
		// teste si cellule est vide
		for(int i=0; i < b.getPointsVie(); i++ ) {
			if(plateau.getPlateau()[by+i][bx]!='x') {
				System.out.println("Erreur un bateau se trouve en ( "+ x +  " ,  " + y + ") ");
				return;
			}
		}
		for(int i=0; i < b.getPointsVie(); i++ ) {
			plateau.getPlateau()[by+i][bx] = 'B';
		}
		int v = plateau.getPointsVie();
		int newV = v+b.getPointsVie();
		plateau.setPointsVie(newV);
		afficherConsole(plateau);
		System.out.println("points vie : "+ newV);
		System.out.println("le Bateau "+ b.nomBateau +" a bien été placé verticalement en ("+ x + " , " + y +")");
	}
	
	//test tire en une coord(x,y)
	/*
	Shoots.feu(1, 1, listePlateaux[1]);
	listePlateaux[1].afficherConsole();
	Shoots.superFeu(2, 2, listePlateaux[1]);
	listePlateaux[1].afficherConsole(); 
	*/
}

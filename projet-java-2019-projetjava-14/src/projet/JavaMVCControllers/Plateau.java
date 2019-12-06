package projet.JavaMVCControllers;
import java.util.Random;

import projet.JAVAMVCViews.MVCViewsConsole;


public class Plateau {
	
	//  Attributs
	
	protected static MVCControllers [] listeBateaux;
	protected static int nbLig;
	protected static int nbCol;
	protected static char [][] plateau;
	public String joueur;
	
	//  Constructeur par d√©faut
	
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
	
	//  Constructeur avec paramamËtres
	
	/**
     * CrÈÈ le plateau
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
	    
		listeBateaux = new MVCControllers[4];
		
		for(int x=0; x<nbLig; x++) {
			for(int y=0; y<nbCol; y++) {
				
				plateau[x][y] = 'x';
			}
		}
	}
	
	public MVCControllers[] getListeBateaux() {
		return listeBateaux;
	}

	public void setListeBateaux(MVCControllers[] listeBateaux) {
		Plateau.listeBateaux = listeBateaux;
	}
		
	//Affiche en console le plateau
	public char[][] getPlateau() {
		return plateau;
	}

	public void setPlateau(char[][] plateau) {
		Plateau.plateau = plateau;
	}

	public String getJoueur() {
		return joueur;
	}

	public void setJoueur(String joueur) {
		this.joueur = joueur;
	}


	
		public static void placerBateau(int coordx, int coordy, MVCControllers bateau, String orientation, Plateau plateau) {
		
			int x = coordx-1;
			int y = coordy-1;
		
			switch(orientation) {
			case "h" : 
				MVCViewsConsole.placerHori(x, y, bateau, plateau);
				break;
			case "v" : 
				MVCViewsConsole.placerVerti(x, y, bateau, plateau);
				break;
			default : 
				
		
			}
		}
}

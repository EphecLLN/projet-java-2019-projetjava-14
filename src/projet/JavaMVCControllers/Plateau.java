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
	public int pointsVie;
	
	//  Constructeur par défaut
	

	public Plateau() {
		nbLig = 0;
		nbCol = 0;
		plateau = new char[nbLig][nbCol];
		pointsVie = 0;
		
		for(int x=0; x<nbLig; x++) {
			for(int y=0; y<nbCol; y++) {
				plateau[x][y] = 'x';
			}
		}
	}
	
	//  Constructeur avec paramam�tres
	
	/**
     * Cr�� le plateau
     * 
     * @param l , le nombre de lignes
     * @param c , le nombre de colonnes
     */
	
	public Plateau(String joueur, int l, int c, int v) {
		this.joueur = joueur ;
		this.pointsVie = v ;
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

	public int getPointsVie() {
		return pointsVie;
	}

	public void setPointsVie(int pointsVie) {
		this.pointsVie = pointsVie;
	}

	public void perdu() {
		if(this.getPointsVie()<0) {
			System.out.println("vous avez perdu !!");
		}
		
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

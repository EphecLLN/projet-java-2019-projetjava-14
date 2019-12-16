package projet.JavaMVCModels;

import projet.JavaMVCControllers.Plateau;

public class Shoots {
	
	/**
     * feu en poqition [x][y]
     * 
     * @param x , la position x cible
     * @param y , la position y cible
     * @param joueur , le plateau du joueur
     */
	
	public static void feu(int x, int y, Plateau joueur) {
		
		x = x-1;
		y = y-1;
		char [][] coord = joueur.getPlateau();
				
		if( coord[y][x] == 'B') {
		
			coord[y][x] = 'T';
			System.out.println("Touché en "+ x +" : " + y);
			return;
		}
		else {
			coord[y][x] = 'O' ;
			System.out.println("Il n'y a pas de bateau dans cette position");
		return;
			
		}
	}
	
	/**
     * feu en croix autour de la poqition [x][y]
     * 
     * @param x , la position x cible
     * @param y , la position y cible
     * @param joueur , le plateau du joueur
     */

	public static void superFeu(int x, int y, Plateau joueur) {
	
		x = x-1;
		y = y-1;
		int [][] listeCoord = { {x,y},{x-1,y},{x+1,y},{x,y-1},{x,y+1} };
		char [][] coord = joueur.getPlateau();
			
		for(int a=0; a<listeCoord.length; a++) {
			
			if( coord[listeCoord[a][1]][listeCoord[a][0]] == 'B') {
				
				coord[listeCoord[a][1]][listeCoord[a][0]] = 'T';
				System.out.println("Touch� en "+ x +" : " + y);
				
			}
			else {
				coord[listeCoord[a][1]][listeCoord[a][0]] = 'O' ;
				System.out.println("Il n'y a pas de bateau � cette position");
			
				
			}
		
		}
	}

}


package projet;
import java.util.Observer;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Leveau Arnaud
 * 
 */

public class Partie {
	
	public Partie(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Initialisation des plateaux
		Plateau [] listePlateaux = new Plateau[2];
		
		listePlateaux[0] = new Plateau("joueur 1", 10, 10);
		listePlateaux[1] = new Plateau("joueur 2", 10, 10);
		
		// Initialisation des bateaux
	    
				Bateau [] listeBateaux = new Bateau[4];
				
				listeBateaux[0] = new Bateau("sous-marins", 1);
				listeBateaux[1] = new Bateau("torpilleurs", 2);
				listeBateaux[2] = new Bateau("croiseurs", 3);
				listeBateaux[3] = new Bateau("cuirassé", 4);
				
				System.out.println("initialisation des bateaux \n");
		
		
		// ajout nom des joueurs
	    for(int p =0 ;p < listePlateaux.length ; p++) {
	    	int j = p+1;
	    	System.out.println("introduire nom joueur "+ j);
	    	String joueur = sc.next();
	    	listePlateaux[p].setJoueur(joueur);
	    	listePlateaux[p].setListeBateaux(listeBateaux);
	   	}
		
		
		for(int i=0; i < listeBateaux.length ; i++) {
			System.out.println(listeBateaux[i].toString());
		}
		System.out.println();
		
		// Ajout des bateaux dans les plateaux respectifs des joeurs
		
		for(int i=0; i < listePlateaux.length ; i++) {
			System.out.println("\n" + listePlateaux[i].getJoueur() + "\n");
			for(int b=0; b < listePlateaux[i].getListeBateaux().length ; b++) {
				int coord [] = new int [2];
				boolean badInput = true;
				
				System.out.println("\n"+listePlateaux[i].getListeBateaux()[b].toString());
				
				System.out.println("introduire l'orientation v/h");
				String orientation = sc.next();
				
			    for(int c =0 ;c <coord.length ; c++) {
			    	String coordV = c == 0? "x" : "y" ;
			    	
			    	do {
			    		try {
			    			System.out.print("introduire coordonnée "+coordV);
			    			
			    			coord[c] = sc.nextInt();
			    			if (0 < coord[c]) {
			    				badInput = false;
			    			} else badInput = true;
			    		} catch (InputMismatchException e) {
			    			System.out.println("Entrez une coordonnée comprise entre 0 et 10 !");
			    		}
			    		sc.nextLine();
			    	} while (badInput);
			   	}
			    
				listePlateaux[i].placerBateau(coord[0],coord[1],listePlateaux[i].getListeBateaux()[b] ,orientation);
				
				
			}
			System.out.println("\n" + listePlateaux[i].getJoueur() + "\n");
			listePlateaux[i].afficherConsole();
		}
		//test tire en une coord(x,y)
		Shoots.feu(1, 1, listePlateaux[1]);
		listePlateaux[1].afficherConsole();
		Shoots.superFeu(2, 2, listePlateaux[1]);
		listePlateaux[1].afficherConsole();

	}
	
}

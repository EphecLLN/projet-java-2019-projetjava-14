package projet.JAVAMVCViews;

import java.util.InputMismatchException;
import java.util.Scanner;

import projet.JavaMVCControllers.MVCControllers;
import projet.JavaMVCControllers.Plateau;
import projet.JavaMVCModels.MVCModel;

public class GamePlay {
	
public static void gamePlay() {
	  
		Scanner sc = new Scanner(System.in);
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
		    			System.out.print("introduire coordonnée entre 1 et 10 sur "+coordV);
		    			
		    			coord[c] = sc.nextInt();
		    			if (0 < coord[c]) {
		    				badInput = false;
		    			} else badInput = true;
		    		} catch (InputMismatchException e) {
		    			System.out.println("Entrez une coordonnée comprise entre 1 et 10 !");
		    		}
		    		sc.nextLine();
		    	} while (badInput);
		   	}
		    
		    MVCViewsConsole.placerBateau(coord[0],coord[1],listePlateaux[i].getListeBateaux()[b] ,orientation, listePlateaux[i]);
						
		}
		System.out.println("\n" + listePlateaux[i].getJoueur() + "\n");
		MVCViewsConsole.afficherConsole(listePlateaux[i]);
	}
	}
	

}

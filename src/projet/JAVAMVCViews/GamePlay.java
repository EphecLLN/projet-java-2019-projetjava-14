package projet.JAVAMVCViews;

import java.util.InputMismatchException;
import java.util.Scanner;

import projet.JavaMVCControllers.MVCControllers;
import projet.JavaMVCControllers.Plateau;
import projet.JavaMVCModels.Shoots;

public class GamePlay {
	
	public GamePlay(String[] args) {
		
		Plateau [] listePlateaux = new Plateau[2];
				
				listePlateaux[0] = new Plateau("joueur 1", 10, 10, 0);
				listePlateaux[1] = new Plateau("joueur 2", 10, 10, 0 );
				
				// Initialisation des bateaux
			    
						MVCControllers [] listeBateaux = new MVCControllers[4];
						
						listeBateaux[0] = new MVCControllers("sous-marins", 1);
						listeBateaux[1] = new MVCControllers("torpilleurs", 2);
						listeBateaux[2] = new MVCControllers("croiseurs", 3);
						listeBateaux[3] = new MVCControllers("cuirassé", 4);
			
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
		
		System.out.println("\n Joueur : " + listePlateaux[i].getJoueur());
		MVCViewsConsole.afficherConsole(listePlateaux[i]);
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
		    
		    MVCViewsConsole.placerBateau(coord[1],coord[0],listePlateaux[i].getListeBateaux()[b] ,orientation, listePlateaux[i]);
						
		}
		System.out.println("\n Plateau du joueur : " + listePlateaux[i].getJoueur()+" est complet");
		MVCViewsConsole.afficherConsole(listePlateaux[i]);
	}
	
}
	

}

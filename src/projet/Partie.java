package projet;

import java.util.Scanner;

public class Partie {
	
	public Partie(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Plateau [] listePlateaux = new Plateau[2];
		
		listePlateaux[0] = new Plateau("joueur 1", 10, 10);
		listePlateaux[1] = new Plateau("joueur 2", 10, 10);
		
		Bateau [] listeBateaux = new Bateau[5];
		
		listeBateaux[0] = new Bateau("a", 1);
		listeBateaux[1] = new Bateau("b", 2);
		listeBateaux[2] = new Bateau("c", 3);
		listeBateaux[3] = new Bateau("d", 4);
		listeBateaux[4] = new Bateau("e", 5);
		
		System.out.println("initialisation des bateaux \n");
		
		for(int i=0; i < listeBateaux.length ; i++) {
			System.out.println(listeBateaux[i].toString());
		}
		
		System.out.println();
		
		int c=0;
	
		for(int i=0; i < listePlateaux.length ; i++) {
		
			while(++c < listeBateaux.length) {
				
				System.out.println("introduire type de bateau");
				String bateau = sc.nextLine();
				System.out.println("introduire l'orientation v/h");
				String orientation = sc.nextLine();
				System.out.println("introduire coordonné x");
				int coordx = sc.nextInt();
				System.out.println("introduire coordoné y");
				int coordy = sc.nextInt();
				
				listePlateaux[i].placerBateau(coordx,coordy,bateau,orientation);
				// ajoute un bateau verti
				//listePlateaux[i].placerVerti(1,2,3);
				// tire en 1,2
				//p1.feu(1,2);
				System.out.println("\n" + listePlateaux[i].getJoueur() + "\n");
				listePlateaux[i].afficherConsole();
			}
		}
	}
	
}

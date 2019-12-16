package projet.JavaMVCModels;

import projet.JavaMVCControllers.*;

public class MVCModel {
	
	public MVCModel(String[] args) {
		
		// Initialisation des plateaux
		Plateau [] listePlateaux = new Plateau[2];
		
		listePlateaux[0] = new Plateau("joueur 1", 10, 10, 0);
		listePlateaux[1] = new Plateau("joueur 2", 10, 10, 0);
		
		// Initialisation des bateaux
	    
				MVCControllers [] listeBateaux = new MVCControllers[4];
				
				listeBateaux[0] = new MVCControllers("sous-marins", 1);
				listeBateaux[1] = new MVCControllers("torpilleurs", 2);
				listeBateaux[2] = new MVCControllers("croiseurs", 3);
				listeBateaux[3] = new MVCControllers("cuirass�", 4);
				
				//System.out.println("initialisation des bateaux \n");	
	}
}

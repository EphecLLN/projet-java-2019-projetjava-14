package projet;

public class bonus {
public void feu(int x, int y) {
		
		x = x-1;
		y = y-1;
		
		char positionCroix[] =new char[5];
		
		positionCroix[0] = plateau[x][y];
		positionCroix[1] = plateau[x-1][y];
		positionCroix[3] = plateau[x][y-1];
		positionCroix[4] = plateau[x+1][y];
		positionCroix[5] = plateau[x][y+1];
		
		for (int i=0 ; i< positionCroix.length; i++) {		
				
			if( positionCroix[i] == 'B') {
			
				positionCroix[i] = 'T';
				System.out.print("Touché en "+ x +" : " + y);
				afficherConsole();
				return;
			}
			else {
				plateau[x][y] = 'R' ;
				System.out.print("Il n'y a pas de bateau à cette position");
				afficherConsole();
			return;
			
			}
		}
		
	}

}
}

package projet;

public class Shoots {
	
public static void feu(int x, int y, Plateau joueur) {
	System.out.println("test");
		
		x = x-1;
		y = y-1;
		char coord = joueur.getPlateau()[y][x];
				
			if( coord == 'B') {
			
				coord = 'T';
				System.out.print("Touch� en "+ x +" : " + y);
				return;
			}
			else {
				coord = 'O' ;
				System.out.print("Il n'y a pas de bateau � cette position");
			return;
			
			}
}

}


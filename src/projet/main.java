package projet;

import java.util.*;

public class main {

		public static void main(String[] args) {
			Plateau p1 = new Plateau(10, 10);
			p1.afficherConsole();
			// ajoute un bateau hori
			p1.placerHori(1,3,4);
			// ajoute un bateau verti
			p1.placerVerti(1,2,3);
		}
}

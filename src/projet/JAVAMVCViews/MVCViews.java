package projet.JAVAMVCViews;

public class MVCViews {
	
	public static void afficheSeparateur(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ---");
		}
		System.out.println();
	}
	public static void afficheSeparateurHaut() {
		System.out.println("    ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
	}
	public static void afficheSeparateur() {
			System.out.println("    ├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
	}
	public static void afficheSeparateurBas() {
		System.out.println("    └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
	}
	
	public static void numeroCase(int  n) {
		for (int i = 0; i <n; i++) {
			System.out.print("  " + (i + 1) + " ");
		}
		System.out.println();
	}	
}

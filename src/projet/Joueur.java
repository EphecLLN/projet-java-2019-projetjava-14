package projet;

public class Joueur {
	
	protected String name;
	protected int score;
	
	public Joueur(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public String getName() {
		return name;
	}
}

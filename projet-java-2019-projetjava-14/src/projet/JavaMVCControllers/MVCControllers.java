package projet.JavaMVCControllers;


public class MVCControllers {
	
	//  Attributs
	
	public String nomBateau;
	public int pointsVie;
	private int x ;
	private int y ;
	private boolean coule;
	
	
	//  Constructeur par défaut
	
	public MVCControllers(String nomBateau,
		    int pointsVie) {
	
	this.nomBateau = nomBateau;
	this.pointsVie = pointsVie;
	this.coule = false;
	this.x = 0;
	this.y = 0;
	
	
	}
	
	public String toString() {
		   return "Pour le bateau " + this.nomBateau + " avec " + this.pointsVie + " points de vie";
		}

	// getter setter

	public String getNomBateau() {
		return nomBateau;
	}


	public void setNomBateau(String nomBateau) {
		this.nomBateau = nomBateau;
	}


	public int getPointsVie() {
		return pointsVie;
	}


	public void setPointsVie(int pointsVie) {
		this.pointsVie = pointsVie;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public boolean isCoule() {
		return coule;
	}


	public void setCoule(boolean coule) {
		this.coule = coule;
	}

	public void BateauHorsZone (int x, int y, String nomBateau) {
	
	System.out.println("l'élément x ou y de " +  nomBateau + " est hors limite");
	System.out.println("\tx => " + x + "\n\ty => " + y);
	}

	public void BateauHorsZone (String  nomBateau) {
	 System.out.println("Le beateau " +  nomBateau + " est hors zone");
	}
}



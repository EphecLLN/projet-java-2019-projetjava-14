package projet;

/**
 * @author Leveau Arnaud
 * 
 */

public class Bateau {
	
	//  Attributs
	
	public String nomBateau;
	public int pointsVie;
	private int x ;
	private int y ;
	private boolean coule;
	
	
	//  Constructeur par défaut
	
	public Bateau(String nomBateau,
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
		control();
	}


	public int getPointsVie() {
		return pointsVie;
	}


	public void setPointsVie(int pointsVie) {
		this.pointsVie = pointsVie;
		control();
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
		control();
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
		control();
	}


	public boolean isCoule() {
		return coule;
	}


	public void setCoule(boolean coule) {
		this.coule = coule;
		control();
	}
}

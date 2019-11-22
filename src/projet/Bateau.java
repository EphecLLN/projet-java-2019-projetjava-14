package projet;

public class Bateau {
	
	//  Attributs
	
	private String nomBateau;
	private int pointsVie;
	private int x ;
	private int y ;
	private boolean coule;
	
	
	//  Constructeur par défaut
	
	public Bateau(String nomBateau,
		    int pointsVie) {
	
	this.nomBateau = nomBateau;
	this.pointsVie = pointsVie;
	this.coule = false;
	
	/*if( x < 0 || y < 0 || x > 10 || y > 10 ) {
		throw new BateauHorsZone(x, y, nomBateau);
	}
	else {
		
		if(this.orientation == Orientation.HORIZONTAL && x+pointsVie > 10 ) {
			throw new BateauHorsZone(nomBateau);
		}
		else if(this.orientation == Orientation.VERTICAL && y+pointsVie > 10 ) {
			throw new BateauHorsZone(nomBateau);
		}
		else {
			this.x = x;
			this.y = y;
			this.coule = false;
		}
	}
	
	// vérifie si le bateau est coulé
	
		public boolean verifieBateauCoule() {
			
			
			if(this.pointsVie == 0) {
				this.coule = true;
				return true;
			}
			else
				return false;
					
		}*/
}
	
	public String toString() {
		   return this.nomBateau + " avec " + this.pointsVie + " points de vie";
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


	public Orientation getOrientation() {
		return orientation;
	}


	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
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
}

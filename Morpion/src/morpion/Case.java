package morpion;

public class Case {

	int nbCases;
	boolean isDispo;
	Symbole symbol;
	
	public Case() {
		this.symbol = Symbole.VIDE;
		isDispo = true;
	}

	public int getNbCases() {
		return nbCases;
	}

	public void setNbCases(int nbCases) {
		this.nbCases = nbCases;
	}

	public boolean isDispo() {
		return isDispo;
	}

	public void setDispo(boolean isDispo) {
		this.isDispo = isDispo;
	}

	public Symbole getSymbol() {
		return this.symbol;
	}
	
	public void add(Symbole symbol) throws Exception {
		if (this.isDispo == false) {
			throw new Exception("la case n'est pas dispo");
		}
		else {
			this.symbol = symbol;
			this.isDispo = false;
		}
	}
}

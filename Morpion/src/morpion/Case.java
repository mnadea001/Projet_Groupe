package morpion;

public class Case {

	int nbCases;
	boolean isDispo;
	String symbol;
	
	public Case() {
		this.symbol = " ";
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

}

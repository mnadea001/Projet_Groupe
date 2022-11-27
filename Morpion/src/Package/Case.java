package Package;

public class Case {
	
	int nbCases;
	boolean isDispo;
	
	
	
	public Case(int nbCases, boolean isDispo) {
		this.nbCases = nbCases;
		this.isDispo = isDispo;
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

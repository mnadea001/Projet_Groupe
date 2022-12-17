package morpion;

public enum Symbole {

	VIDE(" "),
	ROND("O"), 
	CROIX("X");
	
	String symboleString ; 
	
	Symbole(String symbole) {
		symboleString = symbole ; 
	}

}

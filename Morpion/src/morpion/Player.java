package morpion;

public class Player {

	String username;
	boolean isPlaying;
	boolean isWinner;
	Symbole symbole;

	public Player() {
		this.username = "John Doe";
	}
	
	public Player(String name) {
		this.username = name;
	}
	
	public Player(String name, Symbole symbole) {
		this.username = name;
		this.symbole = symbole;
	}

	public Object getUsername() {
		return username;
	}

	public Object getSymbole() {
		return symbole;
	}

}

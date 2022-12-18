package morpion;

import java.util.Scanner;

public class Game {
	public Player player1;
	public Player player2;
	Player currentPlayer;
	Board board;
	Rules rules = new Rules();
	
	public Game() {
		System.out.println("Morpion");
		System.out.println("Player1 Entrez votre nom : ");
		Scanner playerScanner = new Scanner(System.in);
		String player1Nom = playerScanner.nextLine();
		System.out.println("Choisissez un symbol X ou O puis appuyez sur entrée");
		String player1Symbole = playerScanner.nextLine();
		Symbole symbolPlayer1 = Symbole.ROND.symboleString == player1Symbole ? Symbole.ROND : Symbole.CROIX;
		player1 = new Player(player1Nom, symbolPlayer1);
		System.out.println("Player2 Entrez votre nom : ");
		String player2Nom = playerScanner.nextLine();
		Symbole symbolPlayer2 = player1.symbole == Symbole.ROND ? Symbole.CROIX : Symbole.ROND;
		player2 = new Player(player2Nom, symbolPlayer2);
		
		board = new Board();
		
		currentPlayer = player1;
		while(true) {
			Boolean isRoundOK = runRound(currentPlayer);
			if(!isRoundOK) {
				System.out.println("la case est déjà occupée, veuillez recommencer.");
				continue;
			}
			board.show();
			Boolean isItAWin = rules.checkVictory(board);
			if (isItAWin) {
				congrats(currentPlayer);
				break;
			}
			currentPlayer = currentPlayer == player1 ? player2 : player1;
		}
		playerScanner.close();
	}
	
	public Boolean runRound(Player player) {
		System.out.println(player.getUsername() + " à vous de jouer : ");
		System.out.println("Entrez la lettre correspondant à la ligne puis le numéro de la colonne");
		Scanner playerRound = new Scanner(System.in);
		String playerChoice = playerRound.nextLine();
		String ligne = playerChoice.split("")[0].toLowerCase();
		int colonne = Integer.parseInt(playerChoice.split("")[1]);
		
		Boolean isCaseFilled = board.fillCase(ligne, colonne-1, player.symbole);
		return isCaseFilled;
	}

	public void congrats(Player player) {
		System.out.println("Félicitations "+player.username);
	}
}

package morpion;

import java.util.ArrayList;
import java.util.Arrays;

public class Rules {
	private Boolean checkLine(Case[] arr) {
		for(Case c : arr) {
			if(c.getSymbol() == Symbole.VIDE) return false;
		}
		return arr[0].getSymbol().symboleString == arr[1].getSymbol().symboleString && arr[0].getSymbol().symboleString == arr[2].getSymbol().symboleString && arr[1].getSymbol().symboleString == arr[2].getSymbol().symboleString;
	}
	
	private Boolean checkColumns(ArrayList<Case> col) {
		for(Case c : col) {
			if(c.getSymbol() == Symbole.VIDE) return false;
		}
		return col.get(0).getSymbol() == col.get(1).getSymbol() && col.get(0).getSymbol() == col.get(2).getSymbol() && col.get(1).getSymbol() == col.get(2).getSymbol();
	}
	
	private Boolean checkOneDiag(Symbole[] diag) {
		for(Symbole s : diag) {
			if(s == Symbole.VIDE) return false;
		}
		return diag[0] == diag[1] && diag[1] == diag[2] && diag[0] == diag[2];
	}
	
	private Boolean checkDiags(Board board) {
		Symbole diag1[] = {Symbole.VIDE, Symbole.VIDE, Symbole.VIDE};
		Symbole diag2[] = {Symbole.VIDE, Symbole.VIDE, Symbole.VIDE};
		for(int i=0; i<3; i++) {
			diag1[i] = board.lines[i][i].getSymbol();
		}
		
		for(int i=2; i>0; i--) {
			diag2[i] = board.lines[i][i].getSymbol();
		}
		
		return checkOneDiag(diag1) || checkOneDiag(diag2);
	}

	public Boolean checkVictory(Board board) {
		ArrayList<Case> col1 = new ArrayList<Case>();
		ArrayList<Case> col2 = new ArrayList<Case>();
		ArrayList<Case> col3 = new ArrayList<Case>();
		ArrayList<ArrayList<Case>> columns = new ArrayList<ArrayList<Case>>(Arrays.asList(col1, col2, col3));
		for(Case[] line : board.lines) {
			Boolean checkLine = checkLine(line);
			if(checkLine) return true;
			for(int i=0; i<3; i++) {
				columns.get(i).add(line[i]);
			}
		}
		for(ArrayList<Case> col : columns) {
			Boolean checkColumns = checkColumns(col);
			if(checkColumns) return true;
		}
		Boolean checkDiags = checkDiags(board);
		if(checkDiags) return true;
		return false;
	}
}

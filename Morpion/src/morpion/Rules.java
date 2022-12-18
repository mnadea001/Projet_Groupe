package morpion;

import java.util.ArrayList;
import java.util.Arrays;

public class Rules {
	private Boolean checkLine(Case[] arr) {
		return arr[0].getSymbol() == arr[1].getSymbol() && arr[0].getSymbol() == arr[2].getSymbol() && arr[1].getSymbol() == arr[2].getSymbol();
	}
	
	private Boolean checkColumns(ArrayList<Case> col) {
		return null;
	}

	public Boolean checkVictory(Board board) {
		ArrayList<Case> col1 = new ArrayList<Case>();
		ArrayList<Case> col2 = new ArrayList<Case>();
		ArrayList<Case> col3 = new ArrayList<Case>();
		ArrayList<ArrayList<Case>> columns = new ArrayList<ArrayList<Case>>(Arrays.asList(col1, col2, col3));
		for(Case[] line : board.lines) {
			Boolean checkLine = checkLine(line);
			if(!checkLine) return false;
			for(int i=0; i<3; i++) {
				columns.get(i).add(line[i]);
			}
		}
		return true;
	}
}

package morpion;

public class Board {

	Case case1 = new Case();
	Case case2 = new Case();
	Case case3 = new Case();
	Case case4 = new Case();
	Case case5 = new Case();
	Case case6 = new Case();
	Case case7 = new Case();
	Case case8 = new Case();
	Case case9 = new Case();
	
	public void show() {
		String s1 = ("  1   2   3\n");
		String s2 = ("A "+case1.getSymbol().symboleString+" | "+case2.getSymbol().symboleString+" | "+case3.getSymbol().symboleString+"\n");
		String s3 = ("B "+case4.getSymbol().symboleString+" | "+case5.getSymbol().symboleString+" | "+case6.getSymbol().symboleString+"\n");
		String s4 = ("C "+case7.getSymbol().symboleString+" | "+case8.getSymbol().symboleString+" | "+case9.getSymbol().symboleString+"\n");
		
		System.out.println(s1+s2+s3+s4);
	}

}

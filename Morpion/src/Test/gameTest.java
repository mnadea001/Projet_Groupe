package Test;

import org.junit.jupiter.api.Test;

import morpion.Game;

public class gameTest {
	@Test
	public void initiationTest() {
		Game g = Game();
		
		assertTrue(g.player1.symbole != g.player2.symbole);
	}
}

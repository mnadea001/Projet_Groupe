package Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import morpion.Game;

public class gameTest {
	@Test
	public void initiationTest() {
		Game g = new Game();
		
		assertTrue(g.player1.symbole != g.player2.symbole);
	}
}

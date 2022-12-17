package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import morpion.Player;
import morpion.Symbole;

public class PlayerTest {
	
	@Test
	public void declaration() {
		Player p = new Player();
		
		assertEquals("John Doe", p.getUsername());
		
		Player p1 = new Player("Arnaud");
		
		assertEquals("Arnaud", p1.getUsername());
		
		Player p2 = new Player("Arnaud", Symbole.CROIX);
		
		assertEquals("Arnaud", p2.getUsername());
		assertEquals(Symbole.CROIX, p2.getSymbole());
	}

}

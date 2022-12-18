package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import morpion.Case;
import morpion.Symbole;

public class CaseTest {
	
	@Test
	public void testAdd() {
		Case c = new Case();
		
		assertEquals(" ", c.getSymbol());
		assertEquals(true, c.isDispo());
		
		try {
			c.add(Symbole.CROIX);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertEquals("X", c.getSymbol());
		assertEquals(false, c.isDispo());
		
	}
}

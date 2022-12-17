package Test;

import org.junit.jupiter.api.Test;

import morpion.Case;

public class CaseTest {
	
	@Test
	public void testAdd() {
		Case c = new Case();
		
		assertEquals(" ", c.getSymbol());
		assertEquals(true, c.isDispo());
		
		c.add("X");
		
		assertEquals("X", c.getSymbol());
		assertEquals(false, c.isDispo());
		
	}
}

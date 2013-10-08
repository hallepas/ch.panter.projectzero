package ch.panter.junit.gettingstarted;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ch.panter.jmock.gettingstarted.FirstJUnit;


public class FirstJUnitTest {

	private FirstJUnit firstJUnit;
	
	@Before
	public void init() {
		this.firstJUnit = new FirstJUnit();
	}

	@After
	public void clear() {
		this.firstJUnit = null;
	}
	
	
	@Test
	public void testIsEmpty() {
		assertTrue(this.firstJUnit.isEmpty(""));
		assertTrue(this.firstJUnit.isEmpty(null));
		assertFalse(this.firstJUnit.isEmpty("hallo"));
	}

	@Test
	public void testCapitalize() {
		assertEquals("Hallo", this.firstJUnit.capitalize("hallo"));
		assertEquals("Hallo", this.firstJUnit.capitalize("HALLO"));
		assertEquals("123abc", this.firstJUnit.capitalize("123ABC"));
		assertEquals("123abc", this.firstJUnit.capitalize("123abc"));
	}

	@Test
	public void testReverse() {
		assertEquals("tseT rehcaf-3 niE", this.firstJUnit.reverse("Ein 3-facher Test"));
	}

	@Test
	public void testJoin() {
		assertEquals("a b c", this.firstJUnit.join("a", "b", "c"));
		assertEquals("a b c d e", this.firstJUnit.join("a", "b", "c", "d", "e"));
	}

}

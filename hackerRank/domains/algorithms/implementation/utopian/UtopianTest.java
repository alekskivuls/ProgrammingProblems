package hackerRank.domains.algorithms.implementation.utopian;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtopianTest {

	@Test
	public void testGrowTree() {
		assertEquals("No growth", 1, Utopian.growTree(0));
		assertEquals("One Spring", 2, Utopian.growTree(1));
		assertEquals("One Summer", 3, Utopian.growTree(2));
		assertEquals("Sample1", 7, Utopian.growTree(4));
	}

}

package hackerRank.domains.algorithms.implementation.sherlock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SherlockTest {

	@Test
	public void testFindDecentNum() {
		assertEquals("1", "-1", Sherlock.findDecentNum(1));
		assertEquals("3", "555", Sherlock.findDecentNum(3));
		assertEquals("5", "33333", Sherlock.findDecentNum(5));
		assertEquals("8", "55533333", Sherlock.findDecentNum(8));
		assertEquals("11", "55555533333", Sherlock.findDecentNum(11));
	}

}

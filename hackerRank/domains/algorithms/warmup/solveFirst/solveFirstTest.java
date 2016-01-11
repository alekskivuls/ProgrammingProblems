package hackerRank.domains.algorithms.warmup.solveFirst;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class solveFirstTest {

	@Test
	public void testSum() {
		assertEquals("Sample1", solveFirst.sum(2, 3), 5);

		assertEquals("a == b", solveFirst.sum(2, 2), 4);
		assertEquals("a > b", solveFirst.sum(5, 1), 6);
		assertEquals("b < a", solveFirst.sum(0, 3), 3);
		assertEquals("Negative", solveFirst.sum(-4, -1), -5);
	}

}

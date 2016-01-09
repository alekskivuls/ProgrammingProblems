package hackerRank.contests.thirtyDaysOfCode.day9Recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionTest {

	@Test
	public void testGcd() {
		assertEquals("Sample1", Recursion.gcd(5, 1), 1);

		assertEquals("a == b", Recursion.gcd(2, 2), 2);
		assertEquals("a > b", Recursion.gcd(9, 3), 3);
		assertEquals("a < b", Recursion.gcd(2, 10), 2);
	}

}

package hackerRank.domains.algorithms.implementation.findDigits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindDigitsTest {

	@Test
	public void testCountDivisibleDigits() {
		assertEquals("Sample1", 2, FindDigits.countDivisibleDigits("12"));
		assertEquals("Sample1", 3, FindDigits.countDivisibleDigits("1012"));
	}

}

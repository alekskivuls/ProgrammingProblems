package hackerRank.contests.thirtyDaysOfCode.day2Arithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticTest {

	private int output; // common variable used across individual tests

	@Test
	public void testCalculateMealPrice() {
		output = Arithmetic.calculateMealPrice(12.00, 20, 8);
		assertEquals("Sample0", output, 15);

		output = Arithmetic.calculateMealPrice(15.50, 15, 10);
		assertEquals("Sample1", output, 19);

		output = Arithmetic.calculateMealPrice(0, 5, 10);
		assertEquals("ZeroPrice", output, 0);

		output = Arithmetic.calculateMealPrice(10, 0, 5);
		assertEquals("ZeroTip", output, 11);

		output = Arithmetic.calculateMealPrice(10, 5, 0);
		assertEquals("ZeroTax", output, 11);
	}

}

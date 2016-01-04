package hackerRank.contests.thirtyDaysOfCode.day3IfElse;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IfElseTest {

	@Test
	public void testIsWeird() {
		assertTrue("Sample1", IfElse.isWeird(3));
		assertFalse("Sample2", IfElse.isWeird(24));

		assertTrue("Odd", IfElse.isWeird(3));

		assertFalse("Even between 2 and 5 (inc)", IfElse.isWeird(2));
		assertFalse("Even between 2 and 5 (inc)", IfElse.isWeird(4));

		assertTrue("Even between 6 and 20 (inc)", IfElse.isWeird(6));
		assertTrue("Even between 6 and 20 (inc)", IfElse.isWeird(20));

		assertFalse("Even greater than 20", IfElse.isWeird(22));
	}

}

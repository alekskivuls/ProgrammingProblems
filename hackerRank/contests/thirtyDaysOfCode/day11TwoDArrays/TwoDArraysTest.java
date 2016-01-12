package hackerRank.contests.thirtyDaysOfCode.day11TwoDArrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoDArraysTest {

	@Test
	public void testMaxHourglassSum() {
		int[][] arr = new int[][] { { 1, 1, 1, 0, 0, 0, },
				{ 0, 1, 0, 0, 0, 0, }, { 1, 1, 1, 0, 0, 0, },
				{ 0, 0, 2, 4, 4, 0, }, { 0, 0, 0, 2, 0, 0, },
				{ 0, 0, 1, 2, 4, 0, } };
		assertEquals("Sample1", TwoDArrays.maxHourglassSum(arr), 19);
	}

}

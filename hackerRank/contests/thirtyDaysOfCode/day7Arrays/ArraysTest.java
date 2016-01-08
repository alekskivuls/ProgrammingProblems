package hackerRank.contests.thirtyDaysOfCode.day7Arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void testReverseArray() {
		int[] arr = new int[] { 1, 4, 3, 2 };
		Arrays.reverseArray(arr);
		assertArrayEquals("Sample1", arr, new int[] { 2, 3, 4, 1 });
	}

}

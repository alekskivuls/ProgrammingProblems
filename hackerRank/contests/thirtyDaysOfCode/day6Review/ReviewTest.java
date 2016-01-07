package hackerRank.contests.thirtyDaysOfCode.day6Review;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReviewTest {

	@Test
	public void testBuildPyramid() {
		String result = "     #\n" + "    ##\n" + "   ###\n" + "  ####\n"
				+ " #####\n" + "######";
		assertEquals("Sample1", result, Review.buildPyramid(6));
	}

}

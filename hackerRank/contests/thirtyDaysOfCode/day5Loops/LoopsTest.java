package hackerRank.contests.thirtyDaysOfCode.day5Loops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LoopsTest {

	@Test
	public void testProduceSummation() {
		assertEquals("Sample1", Loops.produceSummation(5, 3, 5),
				"8 14 26 50 98");
		assertEquals("Sample1", Loops.produceSummation(0, 2, 10),
				"2 6 14 30 62 126 254 510 1022 2046");

		assertEquals("Sample2", Loops.produceSummation(3, 3, 3), "6 12 24");
		assertEquals("Sample2", Loops.produceSummation(0, 0, 5), "0 0 0 0 0");
		assertEquals("Sample2", Loops.produceSummation(6, 6, 10),
				"12 24 48 96 192 384 768 1536 3072 6144");
	}

}

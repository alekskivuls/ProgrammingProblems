package hackerRank.contests.thirtyDaysOfCode.day1DataTypes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDataTypes {

	private String output; // common variable used across individual tests

	@Test
	public void testDetermineType() {
		output = DataTypes.determineType("\"test\"");
		assertEquals("String", "Referenced : String", output);

		output = DataTypes.determineType("'a'");
		assertEquals("Character", "Primitive : char", output);

		output = DataTypes.determineType("1.0");
		assertEquals("Double", "Primitive : double", output);

		output = DataTypes.determineType("true");
		assertEquals("Boolean", "Primitive : boolean", output);
		output = DataTypes.determineType("false");
		assertEquals("Boolean", "Primitive : boolean", output);

		output = DataTypes.determineType("1");
		assertEquals("Integer", "Primitive : int", output);
	}

}

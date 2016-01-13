package hackerRank.domains.algorithms.implementation.gridSearch;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GridSearchTest {

	@Test
	public void testGridSearch() {
		ArrayList<String> text = new ArrayList<String>();
		text.add("7283455864");
		text.add("6731158619");
		text.add("8988242643");
		text.add("3830589324");
		text.add("2229505813");
		text.add("5633845374");
		text.add("6473530293");
		text.add("7053106601");
		text.add("0834282956");
		text.add("4607924137");
		ArrayList<String> pattern = new ArrayList<String>();
		pattern.add("9505");
		pattern.add("3845");
		pattern.add("3530");
		assertEquals("Sample1", true, GridSearch.gridSearch(text, pattern));
	}

}

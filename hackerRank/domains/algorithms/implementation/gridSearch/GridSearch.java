package hackerRank.domains.algorithms.implementation.gridSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class GridSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCases; i++) {
			ArrayList<String> lines = new ArrayList<String>();
			int numRows = Integer.parseInt(in.nextLine().split(" ")[0]);
			for (int j = 0; j < numRows; j++) {
				lines.add(in.nextLine());
			}

			ArrayList<String> searchLines = new ArrayList<String>();
			numRows = Integer.parseInt(in.nextLine().split(" ")[0]);
			for (int j = 0; j < numRows; j++) {
				searchLines.add(in.nextLine());
			}

			if (gridSearch(lines, searchLines))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	/**
	 * Search utilizing String indexOf to avoid own implementation of search for
	 * individual characters, which searches for box of pattern inside the text
	 * 
	 * @param text
	 *            Text to search on
	 * @param pattern
	 *            Pattern to search for in text
	 * @return True if pattern is found in text
	 */
	public static boolean gridSearch(ArrayList<String> text,
			ArrayList<String> pattern) {
		int index, offset = 0;
		for (int i = 0; i < text.size();) {
			// Get the index of the first line of the pattern
			// Offset utilized for lines containing more than one instance
			index = text.get(i).indexOf(pattern.get(0), offset);

			if (index != -1) { // First line of pattern found
				int j = 1;
				for (; j < pattern.size(); j++) { // Loop through pattern lines
					// Check if the second line is equal to the substring of the
					// text line at the same index as the index of the initial
					// finding
					if (!text.get(i + j)
							.substring(index, index + pattern.get(0).length())
							.equals(pattern.get(j))) {
						// If not found add to offset to continue searching on
						// same line
						// If offset longer than line than reset offset and go
						// to next line
						if (index + 1 > text.get(0).length()) {
							offset = 0;
							i++;
						} else
							offset = index + 1;
						break;
					}
				}
				// If end of pattern is reached full pattern is found
				if (j == pattern.size())
					return true;
			} else { // First line of pattern not found go to next line in text
				i++;
				offset = 0;
			}
		}
		return false;
	}

}

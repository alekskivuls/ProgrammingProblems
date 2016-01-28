package hackerRank.domains.algorithms.strings.pangrams;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {
	final static int NUM_CHARS_IN_ALPHABET = 27;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine().toLowerCase();
		Set<Character> set = new HashSet<Character>();
		for (char c : line.toCharArray()) {
			set.add(c);
		}

		if (set.size() == NUM_CHARS_IN_ALPHABET) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}
}

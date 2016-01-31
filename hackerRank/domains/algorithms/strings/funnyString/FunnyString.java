package hackerRank.domains.algorithms.strings.funnyString;

import java.util.Scanner;

public class FunnyString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCases; i++) {
			if (isFunny(in.nextLine())) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
	}

	public static boolean isFunny(String string) {
		char[] line = string.toCharArray();
		for (int j = 1; j < line.length / 2 + 1; j++) {
			if (Math.abs(line[j] - line[j - 1]) != Math.abs(line[line.length - j] - line[line.length - j - 1])) {
				return false;
			}
		}
		return true;
	}
}

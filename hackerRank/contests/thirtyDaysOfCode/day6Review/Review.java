package hackerRank.contests.thirtyDaysOfCode.day6Review;

import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			System.out.println(buildPyramid(scan.nextInt()));
		}
		scan.close();
	}

	public static String buildPyramid(int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (num - j - i > 1)
					result += " ";
				else
					result += "#";
			}
			result += "\n";
		}
		return result.substring(0, result.length() - 1);
	}
}

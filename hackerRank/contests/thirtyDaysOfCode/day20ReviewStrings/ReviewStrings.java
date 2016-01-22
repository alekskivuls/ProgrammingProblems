package hackerRank.contests.thirtyDaysOfCode.day20ReviewStrings;

import java.util.Scanner;

public class ReviewStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] line = {};
		if (in.hasNextLine())
			line = in.nextLine().replaceAll("[^A-Za-z]+", " ").split(" ");

		int length = line.length;
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < line.length; i++) {
			if (line[i].equals(""))
				length--;
			else
				result.append(line[i] + "\n");
		}

		System.out.println(length);
		System.out.println(result.toString().trim());
	}
}

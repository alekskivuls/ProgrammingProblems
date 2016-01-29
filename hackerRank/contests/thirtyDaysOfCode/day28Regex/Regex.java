package hackerRank.contests.thirtyDaysOfCode.day28Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCases; i++) {
			try {
				Pattern.compile(in.nextLine());
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}
	}
}
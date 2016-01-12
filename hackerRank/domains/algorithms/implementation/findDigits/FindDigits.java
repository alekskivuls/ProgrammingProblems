package hackerRank.domains.algorithms.implementation.findDigits;

import java.util.Scanner;

public class FindDigits {

	final static int NUM_DIGITS = 10;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCases; i++) {
			System.out.println(countDivisibleDigits(in.nextLine()));
		}
	}

	public static int countDivisibleDigits(String line) {
		long num = Long.parseLong(line);
		int count = 0;
		for (int i = 1; i < NUM_DIGITS; i++) {
			if (num % i == 0) {
				int lineLength = line.length();
				// Strings are immutable not ideal if done many times
				line = line.replaceAll(String.valueOf(i), "");
				count += lineLength - line.length();
			}
		}
		return count;
	}
}

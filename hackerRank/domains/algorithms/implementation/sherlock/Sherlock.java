package hackerRank.domains.algorithms.implementation.sherlock;

import java.util.Scanner;

public class Sherlock {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int i = 0; i < numCases; i++) {
			System.out.println(findDecentNum(in.nextInt()));
		}
	}

	/**
	 * Method to generate a maximized Decent Numbers which have three
	 * properties. #1. Its digits can only be 3's and/or 5's. #2. The number of
	 * 3's it contains is divisible by 5. #3. The number of 5's it contains is
	 * divisible by 3.
	 * 
	 * @param numDigits
	 *            Number of digits for Decent Number to contain
	 * @return Decent Number generated, -1 if none exist.
	 */
	public static String findDecentNum(int numDigits) {
		int num1 = 3, num2 = 5;
		StringBuilder result = new StringBuilder("");
		// Put as many of larger num (num2) as we can
		int tempDigits = numDigits;
		for (int i = 0; i < num1; i++) {
			if (tempDigits % num1 == 0 && tempDigits > 0)
				for (int j = 0; j < tempDigits / num1; j++) {
					// Could generalize by looping to add
					result.append("555");
					numDigits -= num1;
				}
			tempDigits -= num2;
		}
		// Fill the remaining digits with the smaller num if possible
		if (numDigits % num2 == 0 && numDigits != 0)
			for (int i = 0; i < numDigits / num2; i++)
				// Could generalize by looping to add
				result.append("33333");
		if (result.length() == 0)
			return "-1";
		return result.toString();
	}
}

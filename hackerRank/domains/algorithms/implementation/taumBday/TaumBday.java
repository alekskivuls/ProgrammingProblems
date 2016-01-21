package hackerRank.domains.algorithms.implementation.taumBday;

import java.util.Scanner;

public class TaumBday {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int i = 0; i < numCases; i++) {
			int black = in.nextInt();
			int white = in.nextInt();
			int blackCost = in.nextInt();
			int whiteCost = in.nextInt();
			int convertCost = in.nextInt();

			long totalCost = 0;
			if (blackCost > whiteCost + convertCost)
				totalCost += (whiteCost + convertCost) * (long) black;
			else
				totalCost += blackCost * (long) black;

			if (whiteCost > blackCost + convertCost)
				totalCost += (blackCost + convertCost) * (long) white;
			else
				totalCost += whiteCost * (long) white;
			System.out.println(totalCost);
		}
	}
}

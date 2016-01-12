package hackerRank.domains.algorithms.implementation.chocolateFeast;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int i = 0; i < numCases; i++) {
			int money = in.nextInt();
			int price = in.nextInt();
			int tradePrice = in.nextInt();

			int wrappers = money / price;
			int total = wrappers;
			while (wrappers / tradePrice != 0) {
				int traded = wrappers / tradePrice;
				total += traded;
				wrappers -= traded * tradePrice;
				wrappers += traded;
			}
			System.out.println(total);
		}
	}
}

package hackerRank.contests.thirtyDaysOfCode.day2Arithmetic;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		double mealPrice;
		int tipPercentage, taxPercentage;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			mealPrice = Double.parseDouble(scan.nextLine());
			tipPercentage = Integer.parseInt(scan.nextLine());
			taxPercentage = Integer.parseInt(scan.nextLine());
			System.out
					.println(
							"The final price of the meal is $"
									+ calculateMealPrice(mealPrice,
											tipPercentage, taxPercentage)
									+ ".");
		}
	}

	/**
	 * Calculate price of a meal rounded to the nearest whole dollar
	 * 
	 * @param mealPrice
	 *            The price of the meal
	 * @param tipPercentage
	 *            The percentage to tip the meal as a whole number
	 * @param taxPercentage
	 *            The percentage to tax the meal as a whole number
	 * @return The price of the meal with tip and tax included rounded to the
	 *         nearest whole dollar
	 */
	public static int calculateMealPrice(double mealPrice, int tipPercentage,
			int taxPercentage) {
		double tip = mealPrice * tipPercentage / 100;
		double tax = mealPrice * taxPercentage / 100;
		return (int) Math.round(mealPrice + tip + tax);
	}

}

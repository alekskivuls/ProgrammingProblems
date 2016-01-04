package hackerRank.contests.thirtyDaysOfCode.day3IfElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {
			int n = scan.nextInt();
			if (isWeird(n))
				System.out.println("Weird");
			else
				System.out.println("Not Weird");
		}
	}

	public static boolean isWeird(int num) {
		if (num % 2 == 1 || (num >= 6 && num <= 20))
			return true;
		return false;
	}

}

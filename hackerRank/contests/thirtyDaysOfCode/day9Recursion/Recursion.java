package hackerRank.contests.thirtyDaysOfCode.day9Recursion;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();

		System.out.println(gcd(x, y));
	}

	public static int gcd(int a, int b) {
		if (a == b)
			return a;
		else if (a > b)
			return gcd(a - b, b);
		else
			return gcd(a, b - a);
	}

}

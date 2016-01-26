package hackerRank.contests.thirtyDaysOfCode.day25RunTime;

import java.util.Scanner;

public class RunTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int i = 0; i < numCases; i++) {
			System.out.println(isPrime(in.nextInt()) ? "Prime" : "Not prime");
		}
	}

	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

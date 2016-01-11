package hackerRank.contests.thirtyDaysOfCode.day10Binary;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(Integer.toBinaryString(scan.nextInt()));
		}
	}
}

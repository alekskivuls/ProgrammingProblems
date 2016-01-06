package hackerRank.contests.thirtyDaysOfCode.day5Loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, N, lines = scan.nextInt();
		for (int i = 0; i < lines; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			N = scan.nextInt();
			System.out.println(produceSummation(a, b, N));
		}
		scan.close();
	}

	public static String produceSummation(int a, int b, int N) {
		String result = "";
		int sum = a;
		for (int i = 0; i < N; i++) {
			sum += Math.pow(2, i) * b;
			result += sum + " ";
		}
		return result.trim();
	}
}

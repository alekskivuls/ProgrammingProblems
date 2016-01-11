package hackerRank.domains.algorithms.warmup.solveFirst;

import java.util.Scanner;

public class solveFirst {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(sum(a, b));
	}

	static int sum(int a, int b) {
		return a + b;
	}
}

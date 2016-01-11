package hackerRank.domains.algorithms.warmup.plusMinus;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int countPos = 0, countNeg = 0, countZero = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (num > 0)
				countPos++;
			else if (num < 0)
				countNeg++;
			else
				countZero++;
		}
		System.out.printf("%.6f\n", (float) countPos / n);
		System.out.printf("%.6f\n", (float) countNeg / n);
		System.out.printf("%.6f\n", (float) countZero / n);
	}
}

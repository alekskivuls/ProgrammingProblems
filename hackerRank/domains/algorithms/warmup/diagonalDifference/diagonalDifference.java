package hackerRank.domains.algorithms.warmup.diagonalDifference;

import java.util.Scanner;

public class diagonalDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sumDiag = 0, sumRevDiag = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int num = in.nextInt();
				if (i == j)
					sumDiag += num;
				if (i + j == n - 1)
					sumRevDiag += num;
			}
		}
		System.out.println(Math.abs(sumDiag - sumRevDiag));
	}
}

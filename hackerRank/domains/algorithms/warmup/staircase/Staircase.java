package hackerRank.domains.algorithms.warmup.staircase;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String output = "";
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = i; j < n; j++)
				System.out.print("#");
			System.out.println();
		}
	}
}

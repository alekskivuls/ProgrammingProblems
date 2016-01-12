package hackerRank.domains.algorithms.implementation.sherlockSqaures;

import java.util.Scanner;

public class SherlockSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int i = 0; i < numCases; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			double left = Math.sqrt(a);
			double right = Math.sqrt(b);
			if ((int) (left) == left)
				left--;
			System.out.println((int) right - (int) left);
		}
	}
}

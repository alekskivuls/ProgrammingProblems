package hackerRank.domains.algorithms.implementation.utopian;

import java.util.Scanner;

public class Utopian {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int i = 0; i < numCases; i++) {
			System.out.println(growTree(in.nextInt()));
		}
	}

	public static int growTree(int cycles) {
		if (cycles == 0)
			return 1;
		else if (cycles % 2 == 0)
			return growTree(cycles - 1) + 1;
		else
			return growTree(cycles - 1) * 2;
	}
}

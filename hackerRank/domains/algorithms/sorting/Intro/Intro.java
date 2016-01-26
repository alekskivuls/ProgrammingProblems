package hackerRank.domains.algorithms.sorting.Intro;

import java.util.Scanner;

public class Intro {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int search = in.nextInt();
		int numNums = in.nextInt();
		for (int i = 0; i < numNums; i++) {
			if (search == in.nextInt()) {
				System.out.println(i);
				break;
			}
		}
	}
}

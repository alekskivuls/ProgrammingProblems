package hackerRank.domains.algorithms.search;

import java.util.Scanner;

public class SherlockArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int i = 0; i < numCases; i++) {
			int[] arr = new int[in.nextInt()];
			int totalSum = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j] = in.nextInt();
				totalSum += arr[j];
			}

			int leftSum = 0, rightSum = totalSum;
			boolean found = false;
			for (int j = 0; j < arr.length; j++) {
				rightSum -= arr[j];
				if (leftSum == rightSum) {
					found = true;
					break;
				}
				leftSum += arr[j];
			}

			if (!found) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}
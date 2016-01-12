package hackerRank.domains.algorithms.implementation.serviceLane;

import java.util.Scanner;

public class ServiceLane {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int freewayLength = in.nextInt();
		int numCases = in.nextInt();
		int[] arr = new int[freewayLength];

		for (int i = 0; i < freewayLength; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < numCases; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int min = arr[a];
			for (; a <= b; a++) {
				if (arr[a] < min)
					min = arr[a];
			}
			System.out.println(min);
		}
	}
}

package hackerRank.domains.algorithms.implementation.cavityMap;

import java.util.Scanner;

public class CavityMap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = Integer.parseInt(in.nextLine());
		char[][] arr = new char[size][size];

		for (int i = 0; i < size; i++) {
			String line = in.nextLine();
			for (int j = 0; j < size; j++) {
				arr[i][j] = line.charAt(j);
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i > 0 && j > 0 && i < size - 1 && j < size - 1) {
					if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1]
							&& arr[i][j] > arr[i + 1][j]
							&& arr[i][j] > arr[i][j + 1])
						System.out.print("X");
					else
						System.out.print(arr[i][j]);
				} else
					System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}

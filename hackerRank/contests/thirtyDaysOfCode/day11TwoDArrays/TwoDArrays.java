package hackerRank.contests.thirtyDaysOfCode.day11TwoDArrays;

import java.util.Scanner;

public class TwoDArrays {

	final static int SIZE = 6;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] arr = new int[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		System.out.println(maxHourglassSum(arr));
	}

	public static int maxHourglassSum(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[0].length - 2; j++) {
				int sum = 0;
				// Dumb solution
				sum += arr[i][j];
				sum += arr[i][j + 1];
				sum += arr[i][j + 2];
				sum += arr[i + 1][j + 1];
				sum += arr[i + 2][j];
				sum += arr[i + 2][j + 1];
				sum += arr[i + 2][j + 2];
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}

}

package hackerRank.contests.thirtyDaysOfCode.day16Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numNums = in.nextInt();
		int[] arr = new int[numNums];
		for (int i = 0; i < numNums; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);
		int difference = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (difference > Math.abs(arr[i - 1] - arr[i]))
				difference = Math.abs(arr[i - 1] - arr[i]);
		}

		String result = "";
		for (int i = 1; i < arr.length; i++) {
			if (difference == Math.abs(arr[i - 1] - arr[i]))
				result += arr[i - 1] + " " + arr[i] + " ";
		}
		System.out.println(result.trim());
	}
}
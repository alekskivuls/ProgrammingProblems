package hackerRank.contests.thirtyDaysOfCode.day7Arrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}

		reverseArray(arr);
		String result = "";
		for (int i : arr)
			result += i + " ";
		System.out.println(result.trim());
	}

	public static int[] reverseArray(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}

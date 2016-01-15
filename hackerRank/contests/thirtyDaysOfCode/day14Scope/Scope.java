package hackerRank.contests.thirtyDaysOfCode.day14Scope;

import java.util.Arrays;
import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	// Add your code here editable
	public Difference(int[] arr) {
		elements = arr;
	}

	public void computeDifference() {
		Arrays.sort(elements);
		if (elements.length == 0)
			maximumDifference = 0;
		else
			maximumDifference = elements[elements.length - 1] - elements[0];
	}

} // End of Difference Class end editable

public class Scope {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Difference D = new Difference(a);

		D.computeDifference();

		System.out.print(D.maximumDifference);
	}
}
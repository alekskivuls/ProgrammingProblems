package hackerRank.domains.algorithms.implementation.manasaStones;

import java.util.Scanner;

public class ManasaStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int i = 0; i < numCases; i++) {
			int numStones = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();

			// Swap a and b if a > b
			if (a > b) {
				int temp = b;
				b = a;
				a = temp;
			}

			int sum = 0;
			// If there is more than one stone set sum. Subtract one from
			// numStones since first stone is zero
			if (numStones > 0)
				sum = a * (numStones - 1);

			if (a == b)
				System.out.println(sum);
			else {
				String result = "";
				for (int j = 0; j < numStones; j++) {
					result += sum + " ";
					sum -= a;
					sum += b;
				}
				System.out.println(result.trim());
			}
		}
	}
}

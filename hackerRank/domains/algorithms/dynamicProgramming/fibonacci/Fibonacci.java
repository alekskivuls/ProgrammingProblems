package hackerRank.domains.algorithms.dynamicProgramming.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger a = new BigInteger(in.next());
		BigInteger b = new BigInteger(in.next());
		int n = in.nextInt();

		BigInteger c;
		for (int i = 0; i < n - 2; i++) {
			c = (b.multiply(b)).add(a);
			a = b;
			b = c;
		}

		System.out.println(b);
	}
}

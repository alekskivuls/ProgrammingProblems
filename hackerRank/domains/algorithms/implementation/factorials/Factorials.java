package hackerRank.domains.algorithms.implementation.factorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(factorial(num).toString());
	}

	public static BigInteger factorial(int num) {
		BigInteger result = new BigInteger(Integer.toString(num));
		for (int i = num - 1; i > 0; i--) {
			result = result.multiply(new BigInteger(Integer.toString(i)));
		}
		return result;
	}
}

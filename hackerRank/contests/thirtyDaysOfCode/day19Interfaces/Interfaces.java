package hackerRank.contests.thirtyDaysOfCode.day19Interfaces;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

// Write your code here
class Calculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int sum = n;
		for (int i = 1; i < n / 2 + 1; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}

}

// End editable code
public class Interfaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: AdvancedArithmetic\n" + sum);
	}
}

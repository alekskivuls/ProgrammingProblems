package hackerRank.domains.algorithms.implementation.libraryFine;

import java.util.Scanner;

public class LibraryFine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int returnDay = in.nextInt();
		int returnMo = in.nextInt();
		int returnYr = in.nextInt();

		int dueDay = in.nextInt();
		int dueMo = in.nextInt();
		int dueYr = in.nextInt();

		System.out.println(calculateFine(returnDay, returnMo, returnYr, dueDay,
				dueMo, dueYr));
	}

	public static int calculateFine(int returnDay, int returnMo, int returnYr,
			int dueDay, int dueMo, int dueYr) {
		if (returnYr > dueYr)
			return 10000;
		if (returnYr == dueYr && returnMo > dueMo)
			return 500 * (returnMo - dueMo);
		if (returnYr == dueYr && returnMo == dueMo && returnDay > dueDay)
			return 15 * (returnDay - dueDay);
		return 0;
	}
}

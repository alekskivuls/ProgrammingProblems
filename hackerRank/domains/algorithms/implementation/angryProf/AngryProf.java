package hackerRank.domains.algorithms.implementation.angryProf;

import java.util.Scanner;

public class AngryProf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		for (int i = 0; i < numCases; i++) {
			int numStudents = in.nextInt();
			int numCancel = in.nextInt();
			int countEarly = 0;
			for (int j = 0; j < numStudents; j++) {
				if (in.nextInt() <= 0)
					countEarly++;
			}
			if (countEarly < numCancel)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

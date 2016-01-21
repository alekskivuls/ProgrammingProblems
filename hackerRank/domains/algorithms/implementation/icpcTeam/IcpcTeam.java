package hackerRank.domains.algorithms.implementation.icpcTeam;

import java.math.BigInteger;
import java.util.Scanner;

public class IcpcTeam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] line = in.nextLine().split(" ");
		int numPeople = Integer.parseInt(line[0]);
		int numTopics = Integer.parseInt(line[1]);

		BigInteger[] peopleTopics = new BigInteger[numPeople];
		for (int i = 0; i < numPeople; i++) {
			peopleTopics[i] = new BigInteger(in.nextLine(), 2);
		}

		int max = 0;
		int numMaxTopicsTeams = 0;
		for (int i = 0; i < numPeople; i++) {
			for (int j = i + 1; j < numPeople; j++) {
				int count = (peopleTopics[i].or(peopleTopics[j])).bitCount();
				if (count > max) {
					max = count;
					numMaxTopicsTeams = 1;
				} else if (count == max) {
					numMaxTopicsTeams++;
				}
			}
		}

		System.out.println(max);
		System.out.println(numMaxTopicsTeams);

	}
}

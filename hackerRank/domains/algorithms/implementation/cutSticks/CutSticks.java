package hackerRank.domains.algorithms.implementation.cutSticks;

import java.util.ArrayList;
import java.util.Scanner;

public class CutSticks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCases = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numCases; i++) {
			list.add(in.nextInt());
		}

		while (list.size() != 0) {
			System.out.println(list.size());
			int cutSize = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) < cutSize)
					cutSize = list.get(i);
			}
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) - cutSize);
			}
			for (int i = 0; i < list.size();) {
				if (list.get(i) <= 0)
					list.remove(i);
				else
					i++;
			}
		}
	}
}

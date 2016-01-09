package hackerRank.contests.thirtyDaysOfCode.day8Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			String name = scan.nextLine();
			String num = scan.nextLine();
			map.put(name, num);
		}

		while (scan.hasNextLine()) {
			String name = scan.nextLine();
			String num = map.get(name);
			if (num == null)
				System.out.println("Not found");
			else
				System.out.println(name + "=" + num);
		}
	}

}

package hackerRank.domains.algorithms.implementation.timeWords;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TimeWords {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");

		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "quarter");
		// already half way might as well just finish rather than optimize
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eightteen");
		map.put(19, "nineteen");

		map.put(20, "twenty");
		map.put(21, "twenty one");
		map.put(22, "twenty two");
		map.put(23, "twenty three");
		map.put(24, "twenty four");
		map.put(25, "twenty five");
		map.put(26, "twenty six");
		map.put(27, "twenty seven");
		map.put(28, "twenty eight");
		map.put(29, "twenty nine");
		map.put(30, "half");

		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int min = in.nextInt();

		String timeString = "";
		if (min > 30) {
			min = 60 - min;
			timeString += " to ";
			hour++;
		} else {
			timeString += " past ";
		}

		if (min == 0) {
			timeString = map.get(hour) + " o' clock";
		} else if (min == 1)
			timeString = map.get(min) + " minute" + timeString + map.get(hour);
		else
			timeString = map.get(min) + " minutes" + timeString + map.get(hour);

		System.out.println(timeString);
	}
}

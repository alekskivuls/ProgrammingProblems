package hackerRank.contests.thirtyDaysOfCode.day1DataTypes;

import java.util.Scanner;

public class DataTypes {

	// Since the problem doesn't want to use std input store it as a string.
	final static String input = "5.3" + "\n" + "'a'" + "\n" + "false" + "\n"
			+ "100" + "\n" + "\"I am a code monkey\"" + "\n" + "true" + "\n"
			+ "17.3" + "\n" + "'c'" + "\n" + "\"derp\"";

	public static void main(String[] args) {
		String line;
		Scanner scan = new Scanner(input);
		while (scan.hasNextLine()) {
			line = scan.nextLine();
			System.out.println(determineType(line));
		}
		scan.close();
	}

	public static String determineType(String string) {
		String result = "";
		if (string.contains("\""))
			result = "Referenced : String";
		else if (string.contains("'"))
			result = "Primitive : char";
		else if (string.contains("."))
			result = "Primitive : double";
		else if (string.contains("true") || string.contains("false"))
			result = "Primitive : boolean";
		else
			result = "Primitive : int";
		return result;
	}
}

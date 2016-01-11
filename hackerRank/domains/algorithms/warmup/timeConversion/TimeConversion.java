package hackerRank.domains.algorithms.warmup.timeConversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		DateFormat readFormat = new SimpleDateFormat("hh:mm:ssaa");
		DateFormat writeFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = null;
		try {
			date = readFormat.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (date != null) {
			String formattedDate = writeFormat.format(date);
			System.out.println(formattedDate);
		}

	}
}

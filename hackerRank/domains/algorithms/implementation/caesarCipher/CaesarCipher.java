package hackerRank.domains.algorithms.implementation.caesarCipher;

import java.util.Scanner;

public class CaesarCipher {
	final static int LETTERS_IN_ALPHABET = 26;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.nextLine();
		char[] arr = in.nextLine().toCharArray();
		int rotation = Integer.parseInt(in.nextLine());
		for (char c : arr)
			System.out.print(rotateLetter(c, rotation));
	}

	public static char rotateLetter(char c, int rotation) {
		if (c > 64 && c <= 90) {
			c = (char) (c + rotation % LETTERS_IN_ALPHABET);
			if (c > 90)
				return c -= LETTERS_IN_ALPHABET;
		}
		if (c > 96 && c <= 122) {
			c = (char) (c + rotation % LETTERS_IN_ALPHABET);
			if (c > 122)
				return c -= LETTERS_IN_ALPHABET;
		}
		return c;
	}
}
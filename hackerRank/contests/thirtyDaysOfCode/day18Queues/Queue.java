package hackerRank.contests.thirtyDaysOfCode.day18Queues;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Queue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// read the string s.
		String s = sc.nextLine();

		// create the Palindrome class object p.
		Palindrome p = new Palindrome();
		char arr[] = s.toCharArray();// Converting string to a character array
		// push all the characters of string s to stack.
		for (char c : arr) {
			p.pushCharacter(c);
		}

		// enqueue all the characters of string s to queue.
		for (char c : arr) {
			p.enqueueCharacter(c);
		}

		boolean f = true;

		// pop the top character from stack.
		// dequeue the first character from queue.
		// compare both the characters.
		for (int i = 0; i < s.length(); i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				f = false;
				break;
			}
		}

		// finally print whether string s is palindrome or not.
		if (f) {
			System.out.println("The word, " + s + ", is a palindrome.");
		} else {
			System.out.println("The word, " + s + ", is not a palindrome.");
		}
	}
}

class Palindrome {
	// Write your code here
	LinkedList<Character> queue;
	Stack<Character> stack;

	public Palindrome() {
		queue = new LinkedList<Character>();
		stack = new Stack<Character>();
	}

	public void pushCharacter(char c) {
		stack.push(c);

	}

	public char popCharacter() {
		return stack.pop();
	}

	public void enqueueCharacter(char c) {
		queue.add(c);
	}

	public char dequeueCharacter() {
		return queue.removeFirst();
	}
}

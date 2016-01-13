package hackerRank.contests.thirtyDaysOfCode.day12Inheritance;

import java.util.Scanner;

//Start Unmodifiable code
class Student {
	protected String firstName;
	protected String lastName;
	int phone;

	Student(String fname, String lname, int p) {
		firstName = fname;
		lastName = lname;
		phone = p;

	}

	public void display() {// display the details of the student
		System.out.println("First Name: " + firstName + "\nLast Name: "
				+ lastName + "\nPhone: " + phone);
	}

}
// End Unmodifiable code

class Grade extends Student {
	private int score;

	Grade(String fname, String lname, int p, int score) {
		super(fname, lname, p);
		this.score = score;
	}

	public String calculate() {
		if (score >= 90 && score <= 100)
			return "O";
		if (score >= 75 && score < 90)
			return "E";
		if (score >= 60 && score < 75)
			return "A";
		if (score >= 40 && score < 60)
			return "B";
		return "D";

	}

}

// Start Unmodifiable code
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		int phone = sc.nextInt();
		int score = sc.nextInt();
		Student stu = new Grade(firstName, lastName, phone, score);
		stu.display();
		Grade g = (Grade) stu;
		System.out.println("Grade: " + g.calculate());

	}
}

// End Unmodifiable code
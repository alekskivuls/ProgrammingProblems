package hackerRank.contests.thirtyDaysOfCode.dat21Generics;

import java.lang.reflect.Method;

class Printer { // Write code here

	public <T> void printArray(T[] array) {
		for (T t : array) {
			System.out.println(t);
		}
	}

} // Code ends here

public class Generics {

	public static void main(String args[]) {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		int count = 0;
		for (Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();
			if (name.equals("printArray"))
				count++;
		}

		if (count > 1)
			System.out.println("Method overloading is not allowed!");
		assert count == 1;

	}
}
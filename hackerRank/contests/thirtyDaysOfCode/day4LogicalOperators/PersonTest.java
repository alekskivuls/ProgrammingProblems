package hackerRank.contests.thirtyDaysOfCode.day4LogicalOperators;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

	@Test
	public void testPerson() throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		Person person = new Person(-1);
		assertEquals("This person is not valid, setting age to 0.",
				outContent.toString().trim());
		final Field field = person.getClass().getDeclaredField("age");
		field.setAccessible(true);
		assertEquals("Negative age", field.get(person), 0);

		person = new Person(5);
		assertEquals("This person is not valid, setting age to 0.",
				outContent.toString().trim());
		assertEquals("Negative age", field.get(person), 5);
	}

	@Test
	public void testAmIOld() {
		Person person = new Person(0);
		person.amIOld();
		assertEquals("Age 0", "You are young.", outContent.toString().trim());
		outContent.reset();

		person = new Person(5);
		person.amIOld();
		assertEquals("Young person", "You are young.",
				outContent.toString().trim());
		outContent.reset();

		person = new Person(12);
		person.amIOld();
		assertEquals("Age less than 13", "You are young.",
				outContent.toString().trim());
		outContent.reset();

		person = new Person(13);
		person.amIOld();
		assertEquals("Age greator or equal than 13", "You are a teenager.",
				outContent.toString().trim());
		outContent.reset();

		person = new Person(16);
		person.amIOld();
		assertEquals("Teenager", "You are a teenager.",
				outContent.toString().trim());
		outContent.reset();

		person = new Person(17);
		person.amIOld();
		assertEquals("Age less than 18", "You are a teenager.",
				outContent.toString().trim());
		outContent.reset();

		person = new Person(18);
		person.amIOld();
		assertEquals("Age greator or equal than 18", "You are old.",
				outContent.toString().trim());
		outContent.reset();

		person = new Person(26);
		person.amIOld();
		assertEquals("Old person", "You are old.",
				outContent.toString().trim());
		outContent.reset();
	}

	@Test
	public void testYearPasses() throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		Person person = new Person(0);
		person.yearPasses();
		final Field field = person.getClass().getDeclaredField("age");
		field.setAccessible(true);
		assertEquals("Increment", field.get(person), 1);
	}

}

package hackerRank.domains.algorithms.implementation.caesarCipher;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaesarCipherTest {

	@Test
	public void testRotateLetter() {
		assertEquals("Lowercase", 'a', CaesarCipher.rotateLetter('z', 1));
		assertEquals("Uppercase", 'B', CaesarCipher.rotateLetter('Z', 2));
		assertEquals("Symbol", '-', CaesarCipher.rotateLetter('-', 1));
	}

}

/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import main.Game;
import main.Algo;

/**
 * @author valentin
 *
 */
public class TestGame {

	private static Game game;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		game = new Game();
	}

	/**
	 * Test method for {@link main.Game#displayLetterE()}.
	 */
	@Test
	public void testDisplayLetterE() {
		//get response user
		String response = game.displayLetterE();
		
		//get good response
		String[] params = game.generate(4, 5, "E", game.getPattern1());
		String goodResponse = Algo.textToAscii(params);
		
		//test
		assertEquals("Test fail for display letter E", response, goodResponse);
	}

	/**
	 * Test method for {@link main.Game#displayManhattan()}.
	 */
	@Test
	public void testDisplayManhattan() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.Game#displayManhattanWithLowerCase()}.
	 */
	@Test
	public void testDisplayManhattanWithLowerCase() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.Game#displayManhattanWithNoLetter()}.
	 */
	@Test
	public void testDisplayManhattanWithNoLetter() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link main.Game#displayManhattanWithOtherPattern()}.
	 */
	@Test
	public void testDisplayManhattanWithOtherPattern() {
		fail("Not yet implemented");
	}

}

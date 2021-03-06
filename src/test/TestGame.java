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
	 * Generate a new game before tests
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		game = new Game();
	}

	/**
	 * Test method for {@link main.Game#displayLetterE()}. 
	 * Verify if response is equals to goodResponse
	 * 
     * @Param Integer L
     * @Param Integer H
     * @Param String Word
     * @Param PatternManager pattern
     * 
     */
	@Test
	public void testDisplayLetterE() {
		//get response user
		String response = game.displayLetterE();
		
		//get good response
		String[] params = game.generate(4, 5, "E", game.getPattern1());
		String goodResponse = Algo.textToAscii(params);
		
		//test
		assertEquals("Test failed for display letter E", response, goodResponse);
	}

	/**
	 * Test method for {@link main.Game#displayManhattan()}.
	 * Verify if response is equals to goodResponse
	 * 
	 * @Param Integer L
     * @Param Integer H
     * @Param String Word
     * @Param PatternManager pattern
	 */
	@Test
	public void testDisplayManhattan() {
		String response = game.displayManhattan();
		
		String[] params = game.generate(4, 5, "MANHATTAN", game.getPattern1());
		String goodResponse = Algo.textToAscii(params);
		
		assertEquals("Test failed for display MANHATTAN", response, goodResponse);
	}

	/**
	 * Test method for {@link main.Game#displayManhattanWithLowerCase()}.
	 * Verify if response is equals to goodResponse
	 * 
	 * @Param Integer L
     * @Param Integer H
     * @Param String Word
     * @Param PatternManager pattern
	 */
	@Test
	public void testDisplayManhattanWithLowerCase() {
		String response = game.displayManhattanWithLowerCase();
		
		String[] params = game.generate(4, 5, "ManhAtTan", game.getPattern1());
		String goodResponse = Algo.textToAscii(params);
		
		assertEquals("Test failed for display ManhattanWithLowerCase", response, goodResponse);
	}

	/**
	 * Test method for {@link main.Game#displayManhattanWithNoLetter()}.
	 * Verify if response is equals to goodResponse
	 * 
	 * @Param Integer L
     * @Param Integer H
     * @Param String Word
     * @Param PatternManager pattern
	 */
	@Test
	public void testDisplayManhattanWithNoLetter() {
		String response = game.displayManhattanWithNoLetter();
		
		String[] params = game.generate(4, 5, "M@NH@TT@N", game.getPattern1());
		String goodResponse = Algo.textToAscii(params);
		
		assertEquals ("Test failed for display ManhattanWithNoLetter", response, goodResponse);
	}

	/**
	 * Test method for {@link main.Game#displayManhattanWithOtherPattern()}.
	 * Verify if response is equals to goodResponse
	 * 
	 * @Param Integer L
     * @Param Integer H
     * @Param String Word
     * @Param PatternManager pattern
	 */
	@Test
	public void testDisplayManhattanWithOtherPattern() {
		String response = game.displayManhattanWithOtherPattern();
		
		String[] params = game.generate(20, 11, "MANHATTAN",game.getPattern2());
		String goodResponse = Algo.textToAscii(params);
		
		assertEquals ("Test failed for display ManhattanWithOtherPattern", response, goodResponse);
		
	}

}

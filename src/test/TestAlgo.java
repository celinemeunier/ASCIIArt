/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.javafaker.Faker;
import static org.junit.Assert.*;

import main.Algo;
import main.Game;
import main.User;

/**
 * @author valentin
 *
 */
public class TestAlgo {

	private static Faker faker;
	private static Game game;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		faker = new Faker();
		game = new Game();
	}
	
	/**
	 * Verify if with rand word is correct display
	 * 
	 * @Param Integer L
     * @Param Integer H
     * @Param String Word
     * @Param PatternManager pattern
	 */
	@Test
	public void testWithWordRand() {
		String word = faker.words().get(1);
		String[] params = game.generate(4, 5, word, game.getPattern1());
		String response1 = Algo.textToAscii(params);
		String response2 = User.soluce(params);
		
		assertEquals("Error no word correct", response1, response2);
	}
	
	/**
	 * Verify if with rand word is correct display
	 * with other pattern
	 * @Param Integer L
     * @Param Integer H
     * @Param String Word
     * @Param PatternManager pattern
	 */
	@Test
	public void testWithWordRandWithOtherPattern() {
		String word = faker.words().get(1);
		String[] params = game.generate(20, 11, word, game.getPattern2());
		String response1 = Algo.textToAscii(params);
		String response2 = User.soluce(params);
		
		assertEquals("Error no word correct", response1, response2);
	}

}

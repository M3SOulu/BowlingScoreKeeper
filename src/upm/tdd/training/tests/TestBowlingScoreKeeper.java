package upm.tdd.training.tests;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingGame;

public class TestBowlingScoreKeeper {
	BowlingGame game;
	
	@Before
	public void createGame(){
		game = new BowlingGame();
	}

	@Test
	public void testAllStrikesScore() {
		Frame strikeFrame = new Frame(10,0);
	}

}

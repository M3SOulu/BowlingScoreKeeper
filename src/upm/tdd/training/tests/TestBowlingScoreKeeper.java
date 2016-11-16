package upm.tdd.training.tests;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;
import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	BowlingGame game;
	
	@Before
	public void createGame(){
		game = new BowlingGame();
	}

	@Test
	public void testAllStrikesScore() throws BowlingException {
		Frame strikeFrame = new Frame(10,0);
		for(int i=0; i<10; i++) game.addFrame(strikeFrame);
		game.setBonus(10, 10);
		Assert.assertEquals(300, game.score());
	}

}

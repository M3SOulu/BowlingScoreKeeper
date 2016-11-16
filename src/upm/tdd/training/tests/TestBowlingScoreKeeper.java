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
		for(int i=0; i<11; i++) game.addFrame(strikeFrame);
		Assert.assertEquals(300, game.score());
	}
	
	@Test
	public void testAllZerosScore() throws BowlingException {
		Frame zeroFrame = new Frame(0,0);
		for(int i=0; i<1; i++) game.addFrame(zeroFrame);
		Assert.assertEquals(0, game.score());
	}
	
	@Test (expected = BowlingException.class)
	public void testMoreThanElevenThrowsBowlingException() throws BowlingException{
		Frame f = new Frame(5,5);
		for(int i=0; i<12; i++) game.addFrame(f);
	}

}

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
		for(int i=0; i<10; i++) game.addFrame(zeroFrame);
		Assert.assertEquals(0, game.score());
	}
	
	@Test
	public void testAllOneAndOneScore() throws BowlingException {
		Frame f = new Frame(1,1);
		for(int i=0; i<10; i++) game.addFrame(f);
		Assert.assertEquals(20, game.score());
	}
	
	@Test
	public void testAllOneAndNineScore() throws BowlingException {
		Frame f = new Frame(9,1);
		for(int i=0; i<10; i++) game.addFrame(f);
		game.addFrame(new Frame(1,0));
		Assert.assertEquals(110, game.score());
	}
	
	@Test (expected = BowlingException.class)
	public void testGameNotFinished() throws BowlingException{
		Frame f = new Frame(5,5);
		for(int i=0; i<5; i++) game.addFrame(f);
		game.score();
	}
	
	@Test (expected = BowlingException.class)
	public void testMoreThanElevenThrows() throws BowlingException{
		Frame f = new Frame(5,5);
		for(int i=0; i<12; i++) game.addFrame(f);
	}
	
	@Test (expected = BowlingException.class)
	public void testInvalidBonusThrow() throws BowlingException{
		Frame f = new Frame(2,2);
		for(int i=0; i<11; i++) game.addFrame(f);
	}

}

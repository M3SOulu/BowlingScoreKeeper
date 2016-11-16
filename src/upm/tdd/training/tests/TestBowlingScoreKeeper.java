package upm.tdd.training.tests;


import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	@Test
	public void testScoreOfAMatchWithOnlyAFrame() {
		BowlingGame partita1 = new BowlingGame();
		Frame frame1 = new Frame(5,2);
		partita1.addFrame(frame1);
	
		assertEquals(7, partita1.score());
	}
	
	@Test
	public void testScoreAfterAStrike() {
		BowlingGame partita2 = new BowlingGame();
		Frame strike = new Frame(10,0);
		Frame frame1 = new Frame(5,2);
		partita2.addFrame(strike);
		partita2.addFrame(frame1);
		
		assertEquals(17+7, partita2.score());
	}
	
	@Test
	public void testScoreAfterASpare() {
		BowlingGame partita2 = new BowlingGame();
		Frame strike = new Frame(5,5);
		Frame frame1 = new Frame(5,2);
		partita2.addFrame(strike);
		partita2.addFrame(frame1);
	
		assertEquals(15+7, partita2.score());
	}
	

}

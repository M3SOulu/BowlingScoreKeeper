package upm.tdd.training.tests;


import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	@Test
	public void testScoreOfAMatchWithOnlyAFrame() {
		BowlingGame partita = new BowlingGame();
		Frame frame1 = new Frame(5,2);
		partita.addFrame(frame1);
	
		
		assertEquals(7, partita.score());
	
	}
	
	@Test
	public void testScoreAfterAStrike() {
		BowlingGame partita2 = new BowlingGame();
		Frame strike = new Frame(10,0);
		Frame frame1 = new Frame(5,2);
		partita2.addFrame(frame1);
		partita2.addFrame(strike);
	
		
		assertEquals(17+7, partita2.score());
	
	}
	

}

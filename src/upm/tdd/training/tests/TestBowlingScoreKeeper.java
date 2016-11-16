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
		partita.addFrame(strike);
	
		
		assertEquals(7, partita.score());
		
		
		
		//fail("Not yet implemented");
	}

}

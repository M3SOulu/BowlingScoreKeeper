package upm.tdd.training.tests;


import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	@Test
	public void test() {
		BowlingGame partita = new BowlingGame();
		Frame strike = new Frame(10,0);
		partita.addFrame(strike);
		partita.addFrame(strike);
		partita.addFrame(strike);
		partita.addFrame(strike);
		partita.addFrame(strike);
		
		assertEquals(120, partita.score());
		
		
		
		//fail("Not yet implemented");
	}

}

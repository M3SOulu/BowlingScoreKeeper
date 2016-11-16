package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	static BowlingGame partita;
	static Frame frame;
	@Before
	public void setUp() throws Exception {
		
		partita = new BowlingGame();
		frame = new Frame(10,0);
	}
	
	@Test
	public void tutti_10_score_equals_100() throws BowlingException {
		
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		//partita.addFrame(frame);
		
		assertEquals(300,partita.score());
	}
	
	
	@Test //(expected = BowlingException.class)
	public void test() {
		fail("Not yet implemented");
	}

}

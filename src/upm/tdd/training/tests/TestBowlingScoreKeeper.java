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
	public void set_traccia_equals_133() throws BowlingException {
		
		partita.addFrame(new Frame(1,4));
		partita.addFrame(new Frame(4,5));
		partita.addFrame(new Frame(6,4));
		partita.addFrame(new Frame(5,5));
		partita.addFrame(new Frame(10,0));
		partita.addFrame(new Frame(0,1));
		partita.addFrame(new Frame(7,3));
		partita.addFrame(new Frame(6,4));
		partita.addFrame(new Frame(10,0));
		partita.addFrame(new Frame(2,8));
		partita.addFrame(new Frame(6,0));
		
		assertEquals(133,partita.score());
	}
	@Test
	public void tutti_10_score_equals_300() throws BowlingException {
		
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
		partita.addFrame(frame);

		
		assertEquals(133,partita.score());
	}
	
	
	@Test //(expected = BowlingException.class)
	public void test() {
		fail("Not yet implemented");
	}

}

package upm.tdd.training.tests;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	BowlingGame partita;
	Frame frame;
	@Before
	public static void setUpBeforeClass() throws Exception {
		
		partita = new BowlingGame();
		frame = new Frame(10,0);
	}
	
	@Test
	public void tutti_10_score_equals_100() {
		partita.addFrame(frame);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

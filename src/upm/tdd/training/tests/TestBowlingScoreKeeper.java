package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	Frame[] frameWithoutSpareOrStrike = new Frame[10];
	BowlingGame gameWithoutSpareOrStrike;

	@Before
	public void initializeTestWithoutSpareOrStrike() throws BowlingException {
		gameWithoutSpareOrStrike = new BowlingGame();
		for (int i = 0; i < 10; i++) {
			frameWithoutSpareOrStrike[i] = new Frame(4, 5);
		}
		for (int i = 0; i < frameWithoutSpareOrStrike.length; i++) {
			gameWithoutSpareOrStrike.addFrame(frameWithoutSpareOrStrike[i]);
		}
	}

	@Test
	public void testTotalScoreWithoutSpareOrStrike() throws BowlingException {
		assertEquals(90, gameWithoutSpareOrStrike.score());
	}

	@Before
	public void initializeTestWithSomeSpare() {

	}

}

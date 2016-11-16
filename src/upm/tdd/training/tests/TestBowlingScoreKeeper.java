package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	BowlingGame bowlingGame;

	@Before
	public void setUp() throws Exception {
		bowlingGame = new BowlingGame();
	}

	@Test(expected = BowlingException.class)
	public void invalidThrowBowlingException() throws BowlingException {
		bowlingGame.setBonus(8, 3);
	}

	@Test
	public void maxScoreBowlingGame() throws BowlingException {
		// Arrange
		Frame frame = new Frame(10, 0);
		// Act
		for (int i = 0; i < 10; i++) {
			bowlingGame.addFrame(frame);
		}
		bowlingGame.setBonus(10, 0);
		// Assert
		assertEquals(300, bowlingGame.score());
	}
	
	@Test
	public void minScoreBowlingGame() throws BowlingException {
		// Arrange
		Frame frame = new Frame(0, 0);
		// Act
		for (int i = 0; i < 10; i++) {
			bowlingGame.addFrame(frame);
		}
		// Assert
		assertEquals(0, bowlingGame.score());
	}

	@Test
	public void dBowlingException() throws BowlingException {		
		// Arrange
		Frame frame1 = new Frame(10, 0);
		Frame frame2 = new Frame(6, 3);
		Frame frame3 = new Frame(8, 0);
		// Act
		bowlingGame.addFrame(frame1);
		bowlingGame.addFrame(frame2);
		for (int i = 2; i < 10; i++) {
			bowlingGame.addFrame(frame3);
		}
		bowlingGame.setBonus(10, 0);
		// Assert
		assertEquals(300, bowlingGame.score());
	}

}

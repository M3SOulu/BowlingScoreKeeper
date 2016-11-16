package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingGameException {
	BowlingGame partita = new BowlingGame();

	@Before

	public void setUp() throws BowlingException {

	}

	@Test(expected = BowlingException.class)
	public void eleventhFrameSholudNotAccepted() throws BowlingException {
		// Act
		for (int i = 0; i < 10; i++) {
			partita.addFrame(new Frame(10, 10));
		}
		// Arrange
		Frame frame11;
		// Act
		frame11 = new Frame(1, 4);
		partita.addFrame(frame11);
	}

	@Test(expected = BowlingException.class)
	public void BowlingGameNotInitialized() throws BowlingException {

		partita.score();
	}

}

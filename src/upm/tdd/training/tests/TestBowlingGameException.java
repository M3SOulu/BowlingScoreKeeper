package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.Frame;

public class TestBowlingGameException {

	@Test(expected = BowlingException.class)
	public void eleventhFrameSholudNotAccepted() throws BowlingException {
		// Arrange
		Frame frame11;
		// Act
		frame11 = new Frame(1, 4);
		partita.addFrame(frame11);
	}

}

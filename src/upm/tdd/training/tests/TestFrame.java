package upm.tdd.training.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.Frame;

public class TestFrame {

	@Test
	public void testIsStrike() throws BowlingException {
		Frame frame = new Frame(10,0);
		assertEquals(true, frame.isStrike());
	}
	
	@Test
	public void testIsSpare() throws BowlingException {
		Frame frame = new Frame(5,5);
		assertEquals(true, frame.isSpare());
	}

}

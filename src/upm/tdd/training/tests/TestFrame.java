package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.Frame;

public class TestFrame {

	
	@Test (expected = BowlingException.class)
	public void testInitFrame() throws BowlingException {
		Frame p = new Frame(0,0);
	}

}

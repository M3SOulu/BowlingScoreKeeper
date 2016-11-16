package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.Frame;

public class TestFrame {

	Frame p;
	
	@Before
	public void setUp(){
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionLessThanZero1() throws BowlingException {
		p = new Frame(0,-10);
	}
	
	@Test
	public void testInitFrameExceptionLessThanZero2() throws BowlingException{
		p = new Frame(-3,  1);
	}
}

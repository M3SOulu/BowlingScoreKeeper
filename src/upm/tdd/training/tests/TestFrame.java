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
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionLessThanZero2() throws BowlingException{
		p = new Frame(-3,  1);
	}
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionLessThanZero3() throws BowlingException {
		p = new Frame(-3,-10);
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionMoreThanTen1() throws BowlingException{
		p = new Frame(11,  1);
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionMoreThanTen2() throws BowlingException{
		p = new Frame(5,  19);
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionMoreThanTen3() throws BowlingException{
		p = new Frame(11,  30);
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionScoreMoreThanTen() throws BowlingException{
		p = new Frame(11,  30);
	}
	
	
}

package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
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
		p = new Frame(9,  9);
	}
	
	@Test
	public void testScore() throws BowlingException{
		p = new Frame(8, 1);
		assert(p.score()==9);
	}
	
	@Test
	public void testGameGetScore() throws BowlingException {
		BowlingGame bg = new BowlingGame();
		Frame f1 = new Frame(1,4);
		bg.addFrame(f1);
		Frame f2 = new Frame(4,5);
		bg.addFrame(f2);
		Frame f3 = new Frame(6,4);
		bg.addFrame(f3);
		Frame f4 = new Frame(5,5);
		bg.addFrame(f4);
		Frame f5 = new Frame(10,0);
		bg.addFrame(f5);
		Frame f6 = new Frame(0,1);
		bg.addFrame(f6);
		assert(bg.score()==61);
		
	}
	
	
}

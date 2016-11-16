package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.Frame;

public class TestFrame {

	@Test
	public void testIsLastFrame() throws BowlingException{
		assertEquals( false, new Frame(0, 0).isLastFrame() );
		assertEquals( false, new Frame(0, 0).isLastFrame() );
		assertEquals( false, new Frame(0, 0).isLastFrame() );
		assertEquals( false, new Frame(0, 0).isLastFrame() );
		assertEquals( false, new Frame(0, 0).isLastFrame() );
		assertEquals( false, new Frame(0, 0).isLastFrame() );
		assertEquals( false, new Frame(0, 0).isLastFrame() );
		assertEquals( false, new Frame(0, 0).isLastFrame() );
		assertEquals( false, new Frame(0, 0).isLastFrame() );
		assertEquals( true, new Frame(0, 0).isLastFrame() );
	}
	
	@Test(expected = BowlingException.class)
	public void createInvalidFrame1() throws BowlingException{
		new Frame( 11, 0 );
	}
	
	@Test(expected = BowlingException.class)
	public void createInvalidFrame2() throws BowlingException{
		new Frame( 0, 11 );
	}
	
	@Test(expected = BowlingException.class)
	public void createInvalidFrame3() throws BowlingException{
		new Frame( 11, 11 );
	}
	
	@Test
	public void createValidFrame() throws BowlingException{
		Frame f = new Frame( 0, 0 );
		assertEquals( false, f.isSpare() );
	}
	
	@Test
	public void testIsStrike() throws BowlingException {
		assertEquals( true, new Frame( 10, 0 ).isStrike() );
	}
	
	@Test
	public void testIsNotStrike() throws BowlingException {
		assertEquals( false, new Frame( 5, 5 ).isStrike() );
	}
	
	@Test
	public void testIsSpare() throws BowlingException {
		assertEquals( true, new Frame( 5, 5 ).isSpare() );
	}
	
	@Test
	public void testIsNotSpare() throws BowlingException {
		assertEquals( false, new Frame( 5, 4 ).isSpare() );
	}
	
	@Test
	public void test2Bonus() throws BowlingException {
		assertEquals( 2, new Frame( 10, 0 ).bonus() );
	}
	

}

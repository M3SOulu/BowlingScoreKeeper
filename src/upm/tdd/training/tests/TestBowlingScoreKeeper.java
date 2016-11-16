package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.awt.Frame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;

public class TestBowlingScoreKeeper{
	private upm.tdd.training.Frame spare;
	private upm.tdd.training.Frame strike;
	private upm.tdd.training.Frame frame;
	private upm.tdd.training.Frame last;
	
	@Before
	public void SetUp(){
		frame = new upm.tdd.training.Frame(1, 4); 
	
	}
	
	@Test(expected = Exception.class)
	public void testScore() throws BowlingException {
		//ARRANGE all necessary preconditions and inputs.
		upm.tdd.training.Frame myFrame = new upm.tdd.training.Frame(1, 4);
		//ACT on the object or method under test.
		frame.score();	
		//ASSERT that the expected results have occurred
		assertEquals(5, myFrame.score());
	}
	
	@Test(expected = Exception.class)
	public void testIsStrike() throws BowlingException {
		//ACT on the object or method under test.
		strike.isStrike();	
		//ASSERT that the expected results have occurred
		assertTrue("There is a Strike", false);
	}
	
	@Test(expected = Exception.class)
	public void testIsSpare() throws BowlingException {
		//ACT on the object or method under test.
		spare.isSpare();	
		//ASSERT that the expected results have occurred
		assertTrue("There is a Spare", false);
	}
	
	@Test(expected = Exception.class)
	public void testIsLastFrame() throws BowlingException {
		//ACT on the object or method under test.
		last.isLastFrame();	
		//ASSERT that the expected results have occurred
		assertTrue("There is a Spare", false);
	}
	
	public void test() {
		//fail("Not yet implemented");
	}

}

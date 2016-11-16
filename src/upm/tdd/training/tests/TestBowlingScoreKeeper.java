package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.awt.Frame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;

public class TestBowlingScoreKeeper{
	private upm.tdd.training.Frame firstThrow;
	private upm.tdd.training.Frame secondThrow;
	private upm.tdd.training.Frame score;
	private upm.tdd.training.Frame frame;
	
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
	
	/*@Test(expected = Exception.class)
	public void testIsStrike() throws BowlingException {
		//ARRANGE all necessary preconditions and inputs.
		upm.tdd.training.Frame myFrame = new upm.tdd.training.Frame(1, 4);
		//ACT on the object or method under test.
		frame.score();	
		//ASSERT that the expected results have occurred
		assertEquals(5, myFrame.score());
	}*/
	public void test() {
		//fail("Not yet implemented");
	}

}

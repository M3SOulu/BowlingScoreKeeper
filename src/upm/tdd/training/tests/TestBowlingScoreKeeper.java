package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.awt.Frame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBowlingScoreKeeper {

	@Before
	
	
	@After
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void testScore(){
		//ARRANGE all necessary preconditions and inputs.
		upm.tdd.training.Frame myFrame = new upm.tdd.training.Frame(1, 4);
		//ACT on the object or method under test.
		myFrame.score();	
		//ASSERT that the expected results have occurred
		assertEquals(5, myFrame.score());
	}

}

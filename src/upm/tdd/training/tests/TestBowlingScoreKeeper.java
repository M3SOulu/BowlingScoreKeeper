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
		//arrange
		upm.tdd.training.Frame myFrame = new upm.tdd.training.Frame(1, 4);
		//act
		myFrame.score();	
		//assert
		assertEquals(5, myFrame.score());
	}

}

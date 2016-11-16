package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	private BowlingGame b;
	
	@Before
	public void setUp()
	{
		b = new BowlingGame();
		Frame.resetIdCounting();
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

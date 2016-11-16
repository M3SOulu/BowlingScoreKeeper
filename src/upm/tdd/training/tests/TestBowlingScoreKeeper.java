package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
		
	@Test
	public void test() throws BowlingException {
		BowlingGame test = new BowlingGame();
		BowlingGame test1 = new BowlingGame();
		
		test.addFrame(new Frame(1, 4));
		test.addFrame(new Frame(4, 5));
		test.addFrame(new Frame(6, 4));
		test.addFrame(new Frame(5, 5));
		test.addFrame(new Frame(10, 0));
		test.addFrame(new Frame(0, 1));
		test.addFrame(new Frame(7, 3));
		test.addFrame(new Frame(6, 4));
		test.addFrame(new Frame(10, 0));
		test.addFrame(new Frame(2, 8));
		test.addFrame(new Frame(6, 0));
		
		//
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		test1.addFrame(new Frame(10, 0));
		
		assertEquals(133, test.score());
		assertEquals(300, test1.score());
		
		
	}

}

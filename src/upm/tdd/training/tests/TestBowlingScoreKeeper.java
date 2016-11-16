package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	BowlingGame BowlingGame = null;
	
	@Before
	public void setUp() {
		BowlingGame = new BowlingGame();
	}

	@Test
	public void test() throws BowlingException {
		//Arrage
		Frame frame1 = new Frame(1,4);
		Frame frame2 = new Frame(4,5);
		Frame frame3 = new Frame(6,4);
		Frame frame4 = new Frame(5,5);
		Frame frame5 = new Frame(10,0);
		Frame frame6 = new Frame(0,1);
		Frame frame7 = new Frame(7,3);
		Frame frame8 = new Frame(6,4);
		Frame frame9 = new Frame(10,0);
		Frame frame10 = new Frame(2,8);
		Frame frameBonus = new Frame(6,2);
		
		//Act
		BowlingGame.addFrame(frame1);
		assertEquals(5, BowlingGame.score());
		BowlingGame.addFrame(frame2);
		assertEquals(14, BowlingGame.score());
		BowlingGame.addFrame(frame3);
		assertEquals(29, BowlingGame.score());
		BowlingGame.addFrame(frame4);
		assertEquals(49, BowlingGame.score());
		BowlingGame.addFrame(frame5);
		assertEquals(60, BowlingGame.score());
		BowlingGame.addFrame(frame6);
		assertEquals(61, BowlingGame.score());
		BowlingGame.addFrame(frame7);
		assertEquals(77, BowlingGame.score());
		BowlingGame.addFrame(frame8);
		assertEquals(97, BowlingGame.score());
		BowlingGame.addFrame(frame9);
		assertEquals(117, BowlingGame.score());
		BowlingGame.addFrame(frame10);
		assertEquals(133, BowlingGame.score());
		BowlingGame.addFrame(frameBonus);
		
		//Assert
		assertEquals(133, BowlingGame.score());
		
	}

}

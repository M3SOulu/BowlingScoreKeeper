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
	public void testAddFrame() throws BowlingException {
		Frame frame1 = new Frame(1,4);
		BowlingGame.addFrame(frame1);
		assertEquals(1, BowlingGame.getFrames().size());
	}
	
	@Test
	public void testAddMoreFrame() throws BowlingException {
		Frame frame1 = new Frame(1,4);
		Frame frame2 = new Frame(4,5);
		Frame frame3 = new Frame(6,4);
		
		BowlingGame.addFrame(frame1);
		BowlingGame.addFrame(frame2);
		BowlingGame.addFrame(frame3);
		
		assertEquals(3, BowlingGame.getFrames().size());
	}
	
	@Test
	public void testAddFrameBonus() throws BowlingException {
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
		
		BowlingGame.addFrame(frame1);
		BowlingGame.addFrame(frame2);
		BowlingGame.addFrame(frame3);
		BowlingGame.addFrame(frame4);
		BowlingGame.addFrame(frame5);
		BowlingGame.addFrame(frame6);
		BowlingGame.addFrame(frame7);
		BowlingGame.addFrame(frame8);
		BowlingGame.addFrame(frame9);
		BowlingGame.addFrame(frame10);
		BowlingGame.addFrame(frameBonus);

		
		assertEquals(10, BowlingGame.getFrames().size());
		assertNotEquals(null, BowlingGame.getBonus());
	}

	@Test
	public void testGeme() throws BowlingException {
		//Arrage
		Frame frame1 = new Frame(1,4);
		Frame frame2 = new Frame(4,5);
		Frame frame3 = new Frame(6,4);
		Frame frame4 = new Frame(5,5);
		Frame frame5 = new Frame(10,0);
		Frame frame6 = new Frame(1,0);
		Frame frame7 = new Frame(7,3);
		Frame frame8 = new Frame(6,4);
		Frame frame9 = new Frame(10,0);
		Frame frame10 = new Frame(2,8);
		Frame frameBonus = new Frame(6,2);
		
		//Act
		BowlingGame.addFrame(frame1);
		BowlingGame.addFrame(frame2);
		BowlingGame.addFrame(frame3);
		BowlingGame.addFrame(frame4);
		BowlingGame.addFrame(frame5);
		BowlingGame.addFrame(frame6);
		BowlingGame.addFrame(frame7);
		BowlingGame.addFrame(frame8);
		BowlingGame.addFrame(frame9);
		BowlingGame.addFrame(frame10);
		BowlingGame.addFrame(frameBonus);
		
		//Assert
		assertEquals(133, BowlingGame.score());
		
	}
	
	@Test
	public void testPerfectGeme() throws BowlingException {
		//Arrage
		Frame frame1 = new Frame(10,0);
		Frame frame2 = new Frame(10,0);
		Frame frame3 = new Frame(10,0);
		Frame frame4 = new Frame(10,0);
		Frame frame5 = new Frame(10,0);
		Frame frame6 = new Frame(10,0);
		Frame frame7 = new Frame(10,0);
		Frame frame8 = new Frame(10,0);
		Frame frame9 = new Frame(10,0);
		Frame frame10 = new Frame(10,0);
		Frame frameBonus = new Frame(10,0);
		
		//Act
		BowlingGame.addFrame(frame1);
		BowlingGame.addFrame(frame2);
		BowlingGame.addFrame(frame3);
		BowlingGame.addFrame(frame4);
		BowlingGame.addFrame(frame5);
		BowlingGame.addFrame(frame6);
		BowlingGame.addFrame(frame7);
		BowlingGame.addFrame(frame8);
		BowlingGame.addFrame(frame9);
		BowlingGame.addFrame(frame10);
		BowlingGame.addFrame(frameBonus);
		
		//Assert
		assertEquals(300, BowlingGame.score());
		
	}

}

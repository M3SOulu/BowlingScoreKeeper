package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	
	Frame newFrame;
	BowlingGame newGame;
	
	@Before
	public void setUp() throws BowlingException{
		newFrame = new Frame(8, 1);
		newGame = new BowlingGame();
	}

	@Test
	public void testAddFrame() throws BowlingException {
		//Act
		newGame.addFrame(newFrame);
		int size = newGame.sizeFrames();
		//Assert
		assertEquals(1, size);
	}
	
	@Test
	public void testAddTenFrames() throws BowlingException{
		//Act
		newGame.addFrame(newFrame);
		newGame.addFrame(newFrame);
		newGame.addFrame(newFrame);
		newGame.addFrame(newFrame);
		newGame.addFrame(newFrame);
		newGame.addFrame(newFrame);
		newGame.addFrame(newFrame);
		newGame.addFrame(newFrame);
		newGame.addFrame(newFrame);
		newGame.addFrame(newFrame);
		int size = newGame.sizeFrames();
		//Assert
		assertEquals(10, size);
		
	}

}

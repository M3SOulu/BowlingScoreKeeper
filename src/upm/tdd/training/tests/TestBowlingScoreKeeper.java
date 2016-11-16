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
	public void testAddMaxFrames() throws BowlingException{
		//Act
		newGame.addFrame(newFrame); //frame1
		newGame.addFrame(newFrame); //frame2
		newGame.addFrame(newFrame); //frame3
		newGame.addFrame(newFrame); //frame4
		newGame.addFrame(newFrame); //frame5
		newGame.addFrame(newFrame); //frame6
		newGame.addFrame(newFrame); //frame7
		newGame.addFrame(newFrame); //frame8
		newGame.addFrame(newFrame); //frame9
		newGame.addFrame(newFrame); //frame10
		int size = newGame.sizeFrames();
		//Assert
		assertEquals(10, size);
		
	}
	
	@Test(expected = BowlingException.class)
	public void testAddOverMaxFrames() throws BowlingException{
		//Act
		newGame.addFrame(newFrame); //frame1
		newGame.addFrame(newFrame); //frame2
		newGame.addFrame(newFrame); //frame3
		newGame.addFrame(newFrame); //frame4
		newGame.addFrame(newFrame); //frame5
		newGame.addFrame(newFrame); //frame6
		newGame.addFrame(newFrame); //frame7
		newGame.addFrame(newFrame); //frame8
		newGame.addFrame(newFrame); //frame9
		newGame.addFrame(newFrame); //frame10
		newGame.addFrame(newFrame); //frame11
		int size = newGame.sizeFrames();
		//Assert
		assertEquals(10, size);
		
	}
	
	@Test
	public void testScore() throws BowlingException{
		//Act
		newGame.addFrame(newFrame); 
		newGame.addFrame(newFrame);
		int score = newGame.score();
		//Assert
		assertEquals(18, score);
	}

}

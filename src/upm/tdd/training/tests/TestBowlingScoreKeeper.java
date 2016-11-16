package upm.tdd.training.tests;

import static org.junit.Assert.*;

import upm.tdd.training.Frame;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;

public class TestBowlingScoreKeeper {

	BowlingGame partita = new BowlingGame();


	@Before
	public void setUp() throws BowlingException {
		// Act
		for(int i=0;i<10;i++){
			partita.addFrame(new Frame());
		}

	}

	@Test(expected = BowlingException.class)
	public void testAddEleventhFrame() throws BowlingException {
		// Arrange
		Frame frame11;
		// Act
		frame11 = new Frame(1, 4);
		partita.addFrame(frame11);
	}
	
	
	
	

}

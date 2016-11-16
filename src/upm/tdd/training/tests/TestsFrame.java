package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.Frame;

public class TestsFrame {
	
	

	@Test
	public void testStrike() throws BowlingException {
		//Assign
		Frame newFrame = new Frame(10, 1);
		//Act
		boolean ris = newFrame.isStrike();
		//Assert
		assertTrue(ris);
		
	}
	
	@Test
	public void testIsNotStrike() throws BowlingException {
		//Assign
		Frame newFrame = new Frame(9, 1);
		//Act
		boolean ris = newFrame.isStrike();
		//Assert
		assertEquals(false, ris);
		
	}
	
	@Test
	public void testSpare() throws BowlingException{
		//Assign
		Frame newFrame = new Frame(9, 1);
		//Act
		boolean ris = newFrame.isSpare();
		//Assert
		assertTrue(ris);
	}
	
	@Test
	public void testIsNotSpare() throws BowlingException{
		//Assign
		Frame newFrame = new Frame(10, 1);
		//Act
		boolean ris = newFrame.isSpare();
		//Assert
		assertEquals(false, ris);
	}
	
	@Test
	public void testBonusStrike() throws BowlingException{
		//Assign
		Frame newFrame = new Frame(10, 1);
		//Act
		int bonus = newFrame.bonus();
		//Assert
		assertEquals(1, bonus);
	}
	
	@Test
	public void testScore() throws BowlingException{
		//Assign
		Frame newFrame = new Frame(8, 1);
		//Act
		int score = newFrame.score();
		//Assert
		assertEquals(9, score);
	}


}

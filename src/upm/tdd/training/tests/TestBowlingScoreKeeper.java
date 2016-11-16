package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	private BowlingGame b;

	@Before
	public void setUp() throws BowlingException
	{
		Frame.resetIdCounting();

		b = new BowlingGame();
	}
	
	public void TesScore()
	{
		
	}

}

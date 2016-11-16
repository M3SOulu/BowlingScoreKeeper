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
	
	@Test
	public void TesSimpleScore() throws BowlingException
	{
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		
		assertEquals(30, b.score());
	}
	
	@Test
	public void TesBonusStripeScore() throws BowlingException
	{
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 5, 5 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		
		assertEquals(38, b.score());
	}
	
	@Test
	public void TesBonusStrikeScore() throws BowlingException
	{
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 10, 0 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		
		assertEquals(40, b.score());
	}
	
	@Test
	public void TesBonusScore() throws BowlingException
	{
		b.addFrame( new Frame( 1, 4 )  );
		b.addFrame( new Frame( 4, 5 )  );
		b.addFrame( new Frame( 6, 4 )  );
		b.addFrame( new Frame( 5, 5 )  );
		b.addFrame( new Frame( 10, 0 )  );
		b.addFrame( new Frame( 0, 1 )  );
		b.addFrame( new Frame( 7, 3 )  );
		b.addFrame( new Frame( 6, 4 )  );
		b.addFrame( new Frame( 10, 0 )  );
		b.addFrame( new Frame( 2, 1 )  );
		
		assertEquals(120, b.score());
	}

	
	
}

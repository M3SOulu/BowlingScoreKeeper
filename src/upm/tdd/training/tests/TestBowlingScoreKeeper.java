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
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
	}
	

	@Test
	public void testCorrectAddFrame() throws BowlingException {
		Frame f = new Frame( 1, 2 );
		b.addFrame( f  );
		assertEquals( true, f.isLastFrame() );
	}
	
	@Test(expected = BowlingException.class)
	public void testNotCorrectAddFrame() throws BowlingException {
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
	}
	
	@Test
	public void testIsNextFrameBonusStrike() throws BowlingException {
		b.addFrame( new Frame( 10, 0 )  );
		assertEquals(true, b.isNextFrameBonus());
	}
	
	@Test
	public void testIsNextFrameBonusSpire() throws BowlingException {
		b.addFrame( new Frame( 5, 5 )  );
		assertEquals(true, b.isNextFrameBonus());
	}
	
	@Test
	public void testIsNotNextFrameBonus() throws BowlingException {
		b.addFrame( new Frame( 1, 2 )  );
		assertEquals(false, b.isNextFrameBonus());
	}
	
	@Test
	public void testIsNotNextFrameBonus() throws BowlingException {
		b.addFrame( new Frame( 1, 2 )  );
		assertEquals(false, b.isNextFrameBonus());
	}
	

}

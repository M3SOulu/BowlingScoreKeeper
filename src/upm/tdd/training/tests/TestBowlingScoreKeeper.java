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
	public void setUp()
	{
		b = new BowlingGame();
		Frame.resetIdCounting();
	}
	

	@Test
	public void testCorrectAddFrame() throws BowlingException {
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		b.addFrame( new Frame( 1, 2 )  );
		
		Frame f = new Frame( 1, 2 );
		b.addFrame( f  );
		assertEquals( true, f.isLastFrame() );
	}
	
	@Test(expected = BowlingException.class)
	public void testNotCorrectAddFrame() throws BowlingException {
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
		b.addFrame( new Frame( 1, 2 )  );
	}

}

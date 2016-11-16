package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.Frame;

public class TestFrame {

	@Test
	public void testIsStrike() {
		assertEquals( true, new Frame( 10, 0 ).isStrike() );
	}
	
	@Test
	public void testIsNotStrike() {
		assertEquals( false, new Frame( 5, 5 ).isStrike() );
	}
	
	@Test
	public void testIsSpare() {
		assertEquals( true, new Frame( 5, 5 ).isSpare() );
	}
	
	@Test
	public void testIsNotSpare() {
		assertEquals( false, new Frame( 5, 4 ).isSpare() );
	}

}

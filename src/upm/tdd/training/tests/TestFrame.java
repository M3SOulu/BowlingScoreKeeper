package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.Frame;

public class TestFrame {

	@Test
	public void testIsStrike() {
		assertEquals(true, new Frame( 10, 0 ).isStrike() );
	}

}

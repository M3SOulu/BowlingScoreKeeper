package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.Frame;

public class TestBowlingException {

	Frame fr1;
	
	@Before
	public void setUp() {
		fr1=new Frame(11,4);
	}
	
	@Test (expected = BowlingException.class)
	public void test_of_exception() throws BowlingException {
		fr1.score();
	}

}

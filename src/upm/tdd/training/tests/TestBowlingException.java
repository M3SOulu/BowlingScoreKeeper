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
		fr1=new Frame(7,4);
	}
	
	@Test (expected = BowlingException.class)
	public void test_of_exception() throws BowlingException {
		fr1.score();
	}
	
	@Test (expected = BowlingException.class)
	public void test_of_exception1() throws BowlingException{
		fr1.setFirstThrow(11);
	}
	
	@Test (expected = BowlingException.class)
	public void test_of_exception2() throws BowlingException{
		fr1.setSecondThrow(11);
	}

}

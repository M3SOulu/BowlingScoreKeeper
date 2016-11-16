package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.Frame;

public class TestFrame {
	Frame fr1;
	Frame fr2;
	Frame fr_spare;
	Frame fr_strike;
	Frame fr_bonus;

	@Before
	public void setUp(){
		fr1=new Frame(5,4);
		fr2=new Frame(7,2);
		fr_spare=new Frame(7,3);
		fr_strike=new Frame(10,0);
		fr_bonus=new Frame(3,6);
	}
	
	@Test
	public void test_of_frame1() throws BowlingException {
		Assert.assertEquals(5, fr1.getFirstThrow());
		Assert.assertEquals(4, fr1.getSecondThrow());
		Assert.assertEquals(9, fr1.score());
		
	}
	
	@Test
	public void test_of_frame2() throws BowlingException {
		Assert.assertEquals(7, fr2.getFirstThrow());
		Assert.assertEquals(2, fr2.getSecondThrow());
		Assert.assertEquals(9, fr2.score());
		
	}
	
	@Test
	public void test_of_strike() throws BowlingException {
		Assert.assertTrue(fr_strike.isStrike());
		Assert.assertEquals(10, fr_strike.getFirstThrow());
		Assert.assertEquals(0, fr_strike.getSecondThrow());
		Assert.assertEquals(19, fr_strike.score()+fr_bonus.score());
		
	}
	
	@Test
	public void test_of_spare() throws BowlingException {
		Assert.assertTrue(fr_spare.isSpare());
		Assert.assertEquals(7, fr_spare.getFirstThrow());
		Assert.assertEquals(3, fr_spare.getSecondThrow());
		Assert.assertEquals(13, fr_spare.score()+fr_bonus.getFirstThrow());
		
	}

}

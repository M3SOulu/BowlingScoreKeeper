package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
	public void test_of_frames() {
		Assert.assertEquals(5, fr1.getFirstThrow());
		Assert.assertEquals(4, fr1.getSecondThrow());
		Assert.assertEquals(9, fr1.score());
		
	}

}

package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	private BowlingGame match1;
	
	@Before
	public void setUp(){
		match1=new BowlingGame();
		for(int i=0;i<10;i++){
			match1.addFrame(new Frame(5,4));
		}
		match1.setBonus(10,10);
	}
	
	@Test
	public void test_of_full_strike() {
		Assert.assertEquals(10, new Frame(10,0).getFirstThrow());
		Assert.assertEquals(90, match1.score());
	}

}

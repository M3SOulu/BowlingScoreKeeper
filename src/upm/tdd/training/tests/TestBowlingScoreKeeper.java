package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	private BowlingGame match1;
	private BowlingGame match2;
	private BowlingGame match3;
	
	@Before
	public void setUp(){
		match1=new BowlingGame();
		for(int i=0;i<10;i++){
			match1.addFrame(new Frame(5,4));
		}
		
		match2=new BowlingGame();
		for(int i=0;i<10;i++){
			match2.addFrame(new Frame(10,0));
		}
		match2.setBonus(10,10);
	}
	
	@Test
	public void test_of_no_strike_spare_test() {
		Assert.assertEquals(90, match1.score());
	}
	
	@Test
	public void test_of_full_strike() {
		Assert.assertEquals(300, match2.score());
	}

}

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
		
		match3=new BowlingGame();
		match3.addFrame(new Frame(1,4));
		match3.addFrame(new Frame(4,5));
		match3.addFrame(new Frame(6,4));
		match3.addFrame(new Frame(5,5));
		match3.addFrame(new Frame(10,0));
		match3.addFrame(new Frame(0,1));
		match3.addFrame(new Frame(7,3));
		match3.addFrame(new Frame(6,4));
		match3.addFrame(new Frame(10,0));
		match3.addFrame(new Frame(2,8));
		
		match3.setBonus(6,0);
	}
	
	@Test
	public void test_of_no_strike_spare_test() {
		Assert.assertEquals(90, match1.score());
	}
	
	@Test
	public void test_of_full_strike() {
		Assert.assertEquals(300, match2.score());
	}
	
	@Test
	public void test_of_example_match(){
		Assert.assertEquals(133, match3.score());
	}

}

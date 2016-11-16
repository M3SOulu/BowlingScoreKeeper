package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

import org.junit.Before;
import org.junit.After;

public class TestBowlingScoreKeeper {
	

	BowlingGame match = new BowlingGame();

	@Before
	public void inizialize() {
		match.addFrame(new Frame(1,4));
		match.addFrame(new Frame(4,5));
		match.addFrame(new Frame(6,4));
		match.addFrame(new Frame(5,5));
		match.addFrame(new Frame(10,0));
		match.addFrame(new Frame(0,1));
		match.addFrame(new Frame(7,3));
		match.addFrame(new Frame(6,4));
		match.addFrame(new Frame(10,0));
		match.addFrame(new Frame(2,8));
	}
	
	@Test
	public void test() {
		assertTrue(match.score() == 133);
		fail("Not yet implemented");
	}
	
	@After
	public void setToNull(){
		
	}

}

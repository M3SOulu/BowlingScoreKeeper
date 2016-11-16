package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

import org.junit.Before;
import org.junit.After;

public class TestBowlingScoreKeeper {
	

	BowlingGame game = new BowlingGame();

	@Before
	public void inizialize() {
		game.addFrame(new Frame(1,4));
		game.addFrame(new Frame(4,5));
		game.addFrame(new Frame(6,4));
		game.addFrame(new Frame(5,5));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(0,1));
		game.addFrame(new Frame(7,3));
		game.addFrame(new Frame(6,4));
		game.addFrame(new Frame(10,0));
		game.addFrame(new Frame(2,8));
	}
	
	@Test
	public void test() {
		assertTrue(game.score() == 133);
	}
	
	@After
	public void clear(){
		game.getFrames().clear();
	}

}

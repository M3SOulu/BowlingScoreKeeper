package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	public BowlingGame game;
	public Frame frame;
	
	@Before
	public void setUp(){
		game = new BowlingGame();
	}
	
	@Test
	public void test() {
		//Act
		frame = new Frame(4,3);
		game.addFrame(frame);
		int score = game.score();
		
		//Assert
		assertTrue("score is 7", score == 7);
	}

}
